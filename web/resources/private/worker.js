const relatedAppVersion = '1'; // prop:relatedAppVersion
const urlsToCache = ["/", "index.html", "js/app.js", "css/styles.css", "img/icon.svg", "manifest.json"]; // prop:urlsToCache
const opaqueUrlsToCache = []; // prop:opaqueUrlsToCache

const cacheKey = `resources.${relatedAppVersion}`;
const opaqueCacheKey = `opaqueResources.${relatedAppVersion}`

function ensureHtmlVersionMatches(cache) {
    return cache.match(new Request('/index.html'))
        .then(response => response.text())
        .then(html => html.match(/<meta name="app-version" content="(.*?)">/)[1])
        .then(version => {
            if (version !== relatedAppVersion) {
                return Promise.reject(`Incorrect index.html version ${version} doesn't match worker.js version ${relatedAppVersion}`);
            }
        })
}

function cacheAll(cacheName, urls) {
    return caches.open(cacheName).then(
        cache => cache.addAll(urls)
            .then(() => ensureHtmlVersionMatches(cache)));
}

function cacheOpaque(cache, url) {
    return fetch(new Request(url, {mode: 'no-cors'}))
        .then(response => cache.put(url, response));
}

function cacheAllOpaque(cacheName, urls) {
    return caches.open(cacheName)
        .then(cache => Promise.all(urls.map(url => cacheOpaque(cache, url))));
}

self.addEventListener('install', event => {
    event.waitUntil(Promise.all([
        cacheAll(cacheKey, urlsToCache),
        cacheAllOpaque(opaqueCacheKey, opaqueUrlsToCache),
    ]));
});

self.addEventListener('activate', event => {
    event.waitUntil(
        caches.keys()
            .then(keys => keys.filter(key => key !== cacheKey && key !== opaqueCacheKey))
            .then(oldKeys => Promise.all(oldKeys.map(key => caches.delete(key))))
    );
});

function responseFromCache(request, cacheName) {
    return caches.open(cacheName).then(cache => cache.match(request));
}

self.addEventListener('fetch', event => {
    event.respondWith(
        Promise.all([
            responseFromCache(event.request, cacheKey),
            responseFromCache(event.request, opaqueCacheKey),
        ])
            .then(([r1, r2]) => r1 ?? r2 ?? fetch(event.request)))
});
