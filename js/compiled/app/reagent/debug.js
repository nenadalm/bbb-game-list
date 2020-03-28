// Compiled by ClojureScript 1.10.597 {:static-fns true, :optimize-constants true}
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
var G__11976__delegate = function (args){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(reagent.debug.warnings,cljs.core.update_in,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$warn], null),cljs.core.conj,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.str,args)], 0));
};
var G__11976 = function (var_args){
var args = null;
if (arguments.length > 0) {
var G__11977__i = 0, G__11977__a = new Array(arguments.length -  0);
while (G__11977__i < G__11977__a.length) {G__11977__a[G__11977__i] = arguments[G__11977__i + 0]; ++G__11977__i;}
  args = new cljs.core.IndexedSeq(G__11977__a,0,null);
} 
return G__11976__delegate.call(this,args);};
G__11976.cljs$lang$maxFixedArity = 0;
G__11976.cljs$lang$applyTo = (function (arglist__11978){
var args = cljs.core.seq(arglist__11978);
return G__11976__delegate(args);
});
G__11976.cljs$core$IFn$_invoke$arity$variadic = G__11976__delegate;
return G__11976;
})()
);

(o.error = (function() { 
var G__11979__delegate = function (args){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(reagent.debug.warnings,cljs.core.update_in,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$error], null),cljs.core.conj,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.str,args)], 0));
};
var G__11979 = function (var_args){
var args = null;
if (arguments.length > 0) {
var G__11980__i = 0, G__11980__a = new Array(arguments.length -  0);
while (G__11980__i < G__11980__a.length) {G__11980__a[G__11980__i] = arguments[G__11980__i + 0]; ++G__11980__i;}
  args = new cljs.core.IndexedSeq(G__11980__a,0,null);
} 
return G__11979__delegate.call(this,args);};
G__11979.cljs$lang$maxFixedArity = 0;
G__11979.cljs$lang$applyTo = (function (arglist__11981){
var args = cljs.core.seq(arglist__11981);
return G__11979__delegate(args);
});
G__11979.cljs$core$IFn$_invoke$arity$variadic = G__11979__delegate;
return G__11979;
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
