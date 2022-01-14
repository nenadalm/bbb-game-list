.DEFAULT_GOAL := all

.PHONY: src/app/data.cljs
src/app/data.cljs:
	cd ../importer && clojure -M -m app.core > ../web/$@

resources/public/css/styles.css: resources/private/css/styles.css
	mkdir -p $(dir $@)
	./node_modules/.bin/css-combine $^ > $@

resources/public/js/app.js:
	clojure -M -m figwheel.main -bo min

resources/public/index.html: resources/public/js/app.js resources/public/css/styles.css
	clojure -M -m build.create-index > $@

.PHONY: clean
clean:
	rm -rf resources/public/css
	rm -rf resources/public/js
	rm -rf resources/public/index.html

.PHONY: all
all: resources/public/index.html
