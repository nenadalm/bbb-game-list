const urlsToCache = ["/", "index.html", "js/app.js", "css/styles.css", "img/icon.svg", "manifest.json"]; // prop:urlsToCache
const opaqueUrlsToCache = []; // prop:opaqueUrlsToCache

function cacheAll(cacheName, urls) {
    return caches.open(cacheName).then(cache => cache.addAll(urls));
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
        cacheAll('resources', urlsToCache),
        cacheAllOpaque('opaqueResources', opaqueUrlsToCache),
    ]));
});

function responseFromCache(request, cacheName) {
    return caches.open(cacheName).then(cache => cache.match(request));
}

self.addEventListener('fetch', event => {
    event.respondWith(
        Promise.all([
            responseFromCache(event.request, 'resources'),
            responseFromCache(event.request, 'opaqueResources'),
        ])
            .then(([r1, r2]) => r1 ?? r2 ?? fetch(event.request)))
});
