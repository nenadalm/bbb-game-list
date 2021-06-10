// Compiled by ClojureScript 1.10.866 {:static-fns true, :optimize-constants true, :optimizations :advanced}
goog.provide('reagent.debug');
goog.require('cljs.core');
goog.require('cljs.core.constants');
reagent.debug.has_console = (typeof console !== 'undefined');
reagent.debug.tracking = false;
if((typeof reagent !== 'undefined') && (typeof reagent.debug !== 'undefined') && (typeof reagent.debug.warnings !== 'undefined')){
} else {
reagent.debug.warnings = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(null);
}
if((typeof reagent !== 'undefined') && (typeof reagent.debug !== 'undefined') && (typeof reagent.debug.track_console !== 'undefined')){
} else {
reagent.debug.track_console = (function (){var o = ({});
(o.warn = (function() { 
var G__12206__delegate = function (args){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(reagent.debug.warnings,cljs.core.update_in,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$warn], null),cljs.core.conj,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.str,args)], 0));
};
var G__12206 = function (var_args){
var args = null;
if (arguments.length > 0) {
var G__12207__i = 0, G__12207__a = new Array(arguments.length -  0);
while (G__12207__i < G__12207__a.length) {G__12207__a[G__12207__i] = arguments[G__12207__i + 0]; ++G__12207__i;}
  args = new cljs.core.IndexedSeq(G__12207__a,0,null);
} 
return G__12206__delegate.call(this,args);};
G__12206.cljs$lang$maxFixedArity = 0;
G__12206.cljs$lang$applyTo = (function (arglist__12208){
var args = cljs.core.seq(arglist__12208);
return G__12206__delegate(args);
});
G__12206.cljs$core$IFn$_invoke$arity$variadic = G__12206__delegate;
return G__12206;
})()
);

(o.error = (function() { 
var G__12209__delegate = function (args){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(reagent.debug.warnings,cljs.core.update_in,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$error], null),cljs.core.conj,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.str,args)], 0));
};
var G__12209 = function (var_args){
var args = null;
if (arguments.length > 0) {
var G__12210__i = 0, G__12210__a = new Array(arguments.length -  0);
while (G__12210__i < G__12210__a.length) {G__12210__a[G__12210__i] = arguments[G__12210__i + 0]; ++G__12210__i;}
  args = new cljs.core.IndexedSeq(G__12210__a,0,null);
} 
return G__12209__delegate.call(this,args);};
G__12209.cljs$lang$maxFixedArity = 0;
G__12209.cljs$lang$applyTo = (function (arglist__12211){
var args = cljs.core.seq(arglist__12211);
return G__12209__delegate(args);
});
G__12209.cljs$core$IFn$_invoke$arity$variadic = G__12209__delegate;
return G__12209;
})()
);

return o;
})();
}
reagent.debug.track_warnings = (function reagent$debug$track_warnings(f){
(reagent.debug.tracking = true);

cljs.core.reset_BANG_(reagent.debug.warnings,null);

(f.cljs$core$IFn$_invoke$arity$0 ? f.cljs$core$IFn$_invoke$arity$0() : f.call(null));

var warns = cljs.core.deref(reagent.debug.warnings);
cljs.core.reset_BANG_(reagent.debug.warnings,null);

(reagent.debug.tracking = false);

return warns;
});
