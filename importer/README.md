# Importer

Downloads game list from various sites and enriches it with data from https://boardgamegeek.com/

## Import data

First you need to have [cli-tools](https://clojure.org/guides/getting_started#_installation_on_linux) installed. Then run following script to put game data into data.cljs.

```shell
clojure -X app.core/create-data
```

Note that all requests are cached indefinitely and in order to redownload something, cache has to be cleared using:

```shell
rm -rf ./resources/.cache/url/*
```
