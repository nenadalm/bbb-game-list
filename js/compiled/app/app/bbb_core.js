// Compiled by ClojureScript 1.10.866 {:static-fns true, :optimize-constants true, :optimizations :advanced}
goog.provide('app.bbb_core');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.core');
goog.require('reagent.dom');
goog.require('app.config');
goog.require('app.views');
goog.require('app.events');
goog.require('app.bbb_data');
app.bbb_core.dev_setup = (function app$bbb_core$dev_setup(){
if(app.config.debug_QMARK_){
return cljs.core.println.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["dev mode"], 0));
} else {
return null;
}
});
app.bbb_core.mount_root = (function app$bbb_core$mount_root(){
re_frame.core.clear_subscription_cache_BANG_();

return reagent.dom.render.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.app,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$source_DASH_label,"bohemiaboardsandbrews.com",cljs.core.cst$kw$source_DASH_url,"http://bohemiaboardsandbrews.com/games/"], null)], null),document.getElementById("app"));
});
app.bbb_core.init = (function app$bbb_core$init(){
app.bbb_core.dev_setup();

re_frame.core.dispatch_sync(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$app$events_SLASH_init,app.bbb_data.game_data], null));

return app.bbb_core.mount_root();
});
goog.exportSymbol('app.bbb_core.init', app.bbb_core.init);
app.bbb_core.after_load = (function app$bbb_core$after_load(){
return app.bbb_core.mount_root();
});
