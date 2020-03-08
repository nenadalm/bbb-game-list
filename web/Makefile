.DEFAULT_GOAL: all

resources/public/css/styles.css: resources/private/css/styles.css
	mkdir -p $(dir $@)
	./node_modules/.bin/css-combine $^ > $@

.PHONY: all
all: resources/public/styles.css
