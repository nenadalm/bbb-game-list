// Compiled by ClojureScript 1.10.597 {:static-fns true, :optimize-constants true}
goog.provide('app.components.icons.views');
goog.require('cljs.core');
goog.require('cljs.core.constants');
app.components.icons.views.arrow_up = (function app$components$icons$views$arrow_up(){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$span$i_DASH_arrow_DASH_up], null);
});
app.components.icons.views.arrow_down = (function app$components$icons$views$arrow_down(){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$span$i_DASH_arrow_DASH_down], null);
});
app.components.icons.views.language = (function app$components$icons$views$language(s){
var class$ = (function (){var G__13477 = s;
switch (G__13477) {
case "cz":
return "i-country-cz";

break;
case "en":
return "i-country-us";

break;
case "fr":
return "i-country-fr";

break;
case "pl":
return "i-country-pl";

break;
case "de":
return "i-country-de";

break;
case "it":
return "i-country-it";

break;
case "ne":
return "i-country-ne";

break;
case "ru":
return "i-country-ru";

break;
default:
return null;

}
})();
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$span,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$class,class$,cljs.core.cst$kw$title,s], null),(cljs.core.truth_(class$)?null:s)], null);
});
