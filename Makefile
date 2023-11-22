.PHONY: test
test:
	$(MAKE) -C importer test
	$(MAKE) -C web test
