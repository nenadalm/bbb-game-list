.DEFAULT_GOAL: all

resources/public/css/styles.css: resources/private/css/styles.css
	mkdir -p $(dir $@)
	./node_modules/.bin/css-combine $^ > $@

.PHONY: clean
clean:
	rm -rf resources/public/css
	rm -rf resources/public/js

resources/public/js/app.js:
	clj -m figwheel.main -bo min

.PHONY: all
all: resources/public/styles.css resources/public/js/app.js
