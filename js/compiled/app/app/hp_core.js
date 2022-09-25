// Compiled by ClojureScript 1.10.866 {:static-fns true, :optimize-constants true, :optimizations :advanced}
goog.provide('app.hp_core');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.core');
goog.require('reagent.dom');
goog.require('app.config');
goog.require('app.views');
goog.require('app.events');
goog.require('app.hp_data');
app.hp_core.dev_setup = (function app$hp_core$dev_setup(){
if(app.config.debug_QMARK_){
return cljs.core.println.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["dev mode"], 0));
} else {
return null;
}
});
app.hp_core.mount_root = (function app$hp_core$mount_root(){
re_frame.core.clear_subscription_cache_BANG_();

return reagent.dom.render.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.app,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$source_DASH_label,"herniprostor.cz",cljs.core.cst$kw$source_DASH_url,"https://www.herniprostor.cz/pujcovna/"], null)], null),document.getElementById("app"));
});
app.hp_core.init = (function app$hp_core$init(){
app.hp_core.dev_setup();

re_frame.core.dispatch_sync(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$app$events_SLASH_init,app.hp_data.game_data], null));

return app.hp_core.mount_root();
});
goog.exportSymbol('app.hp_core.init', app.hp_core.init);
app.hp_core.after_load = (function app$hp_core$after_load(){
return app.hp_core.mount_root();
});
