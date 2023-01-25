.DEFAULT_GOAL := all

.PHONY: src/app/bbb_data.cljs
src/app/bbb_data.cljs:
	cd ../importer && clojure -X app.core/print-bbb-games > ../web/$@

.PHONY: src/app/hp_data.cljs
src/app/hp_data.cljs:
	cd ../importer && clojure -X app.core/print-hp-games > ../web/$@

resources/public/css/styles.css: resources/private/css/styles.css
	mkdir -p $(dir $@)
	./node_modules/.bin/css-combine $^ > $@

.PHONY: resources/public/js/app.js
resources/public/js/app.js:
	clojure -M -m figwheel.main -bo min

resources/public/manifest.json:
	clojure -M -m build.create-manifest > $@

resources/public/bbb.html: resources/public/js/app.js resources/public/css/styles.css resources/public/manifest.json
	clojure -X build.create-index/print-bbb > $@

resources/public/hp.html: resources/public/js/app.js resources/public/css/styles.css resources/public/manifest.json
	clojure -X build.create-index/print-hp > $@

resources/public/index.html: resources/public/js/app.js resources/public/manifest.json
	clojure -X build.create-index/print-index > $@

resources/public/worker.js: resources/public/index.html resources/public/bbb.html resources/public/hp.html
	clojure -M -m build.create-worker > $@

.PHONY: clean
clean:
	rm -rf resources/public/worker.js \
	  resources/public/manifest.json \
	  resources/public/css \
	  resources/public/js \
	  resources/public/hp.html \
	  resources/public/bbb.html \
	  resources/public/index.html

.PHONY: all
all: resources/public/worker.js
