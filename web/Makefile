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

resources/public/bbb.html: resources/public/js/app.js resources/public/css/styles.css
	clojure -X build.create-index/print-bbb > $@

resources/public/hp.html: resources/public/js/app.js resources/public/css/styles.css
	clojure -X build.create-index/print-hp > $@

.PHONY: clean
clean:
	rm -rf resources/public/css
	rm -rf resources/public/js
	rm -rf resources/public/hp.html
	rm -rf resources/public/bbb.html

.PHONY: all
all: resources/public/bbb.html resources/public/hp.html
