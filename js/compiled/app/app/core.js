// Compiled by ClojureScript 1.10.866 {:static-fns true, :optimize-constants true, :optimizations :advanced}
goog.provide('app.core');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('app.config');
app.core.register_worker = (function app$core$register_worker(){
var G__14037 = navigator;
var G__14037__$1 = (((G__14037 == null))?null:G__14037.serviceWorker);
if((G__14037__$1 == null)){
return null;
} else {
return G__14037__$1.register("worker.js");
}
});
app.core.dev_setup = (function app$core$dev_setup(){
if(app.config.debug_QMARK_){
return cljs.core.println.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["dev mode"], 0));
} else {
return null;
}
});
app.core.prod_setup = (function app$core$prod_setup(){
if(app.config.debug_QMARK_){
return null;
} else {
return app.core.register_worker();
}
});
app.core.init = (function app$core$init(){
app.core.dev_setup();

return app.core.prod_setup();
});
goog.exportSymbol('app.core.init', app.core.init);
