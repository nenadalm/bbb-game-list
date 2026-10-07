.PHONY: test
test:
	$(MAKE) -C importer test
	cd web && yarn test:all

.PHONY: fix
fix:
	$(MAKE) -C importer fix
