.DEFAULT_GOAL := all

.PHONY: game-data
game-data:
	cd ../importer && clojure -X app.core/create-data

resources/public/css/styles.css: resources/private/css/styles.css
	mkdir -p $(dir $@)
	./node_modules/.bin/css-combine $^ > $@

node_modules: yarn.lock
	yarn install

.PHONY: resources/public/js/app.js
resources/public/js/app.js: node_modules
	yarn release

resources/public/manifest.json:
	clojure -M -m build.create-manifest > $@

resources/public/index.html: resources/public/js/app.js resources/public/css/styles.css resources/public/manifest.json
	clojure -X build.create-index/execute

resources/public/worker.js: resources/public/index.html
	clojure -M -m build.create-worker > $@

.PHONY: clean
clean:
	rm -rf resources/public/worker.js \
	  resources/public/manifest.json \
	  resources/public/css \
	  resources/public/js \
	  resources/public/*.html

.PHONY: all
all: resources/public/worker.js

.PHONY: test
test:
	clojure -M:cljfmt check
	clojure -M:clj-kondo
