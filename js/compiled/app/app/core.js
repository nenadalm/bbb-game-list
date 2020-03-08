// Compiled by ClojureScript 1.10.597 {:static-fns true, :optimize-constants true}
goog.provide('app.core');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.core');
goog.require('reagent.dom');
goog.require('app.config');
goog.require('app.views');
goog.require('app.events');
goog.require('app.data');
app.core.dev_setup = (function app$core$dev_setup(){
if(app.config.debug_QMARK_){
return cljs.core.println.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["dev mode"], 0));
} else {
return null;
}
});
app.core.mount_root = (function app$core$mount_root(){
(re_frame.core.clear_subscription_cache_BANG_.cljs$core$IFn$_invoke$arity$0 ? re_frame.core.clear_subscription_cache_BANG_.cljs$core$IFn$_invoke$arity$0() : re_frame.core.clear_subscription_cache_BANG_.call(null));

return reagent.dom.render.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.app], null),document.getElementById("app"));
});
app.core.init = (function app$core$init(){
app.core.dev_setup();

var G__13496_13497 = new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$app$events_SLASH_init,app.data.game_data], null);
(re_frame.core.dispatch_sync.cljs$core$IFn$_invoke$arity$1 ? re_frame.core.dispatch_sync.cljs$core$IFn$_invoke$arity$1(G__13496_13497) : re_frame.core.dispatch_sync.call(null,G__13496_13497));

return app.core.mount_root();
});
goog.exportSymbol('app.core.init', app.core.init);
app.core.after_load = (function app$core$after_load(){
return app.core.mount_root();
});
