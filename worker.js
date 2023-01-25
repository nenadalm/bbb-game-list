const urlsToCache = ["","index.html","hp.html","bbb.html","manifest.json","img/icon.svg","js/cljs_base.js?v=f5738001d2589ed24f744732ab637d481c741aac","js/app.js?v=f7c42c88ef34084877faadc4a24eca35ac28e28b","js/hp_app.js?v=2764377d8abbb9f95b62bbd5f02dc988600fa7d7","js/bbb_app.js?v=b1166702bf3cba73cfa26099efcc13baac3d4222","css/styles.css?v=4a14e3c3cc4adb3a5fff7045e03b0f95a6ece59f"];

self.addEventListener('install', event => {
    event.waitUntil(caches.open('resources').then(cache => cache.addAll(urlsToCache)));
});

self.addEventListener('fetch', event => {
    event.respondWith(caches.open('resources')
                      .then(cache => cache.match(event.request))
                      .then(response => response ?? fetch(event.request)));
});

