// Compiled by ClojureScript 1.10.866 {:static-fns true, :optimize-constants true, :optimizations :advanced}
goog.provide('re_frame.trace');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.interop');
goog.require('re_frame.loggers');
goog.require('goog.functions');
re_frame.trace.id = cljs.core.atom.cljs$core$IFn$_invoke$arity$1((0));
re_frame.trace._STAR_current_trace_STAR_ = null;
re_frame.trace.reset_tracing_BANG_ = (function re_frame$trace$reset_tracing_BANG_(){
return cljs.core.reset_BANG_(re_frame.trace.id,(0));
});

/**
 * @define {boolean}
 */
re_frame.trace.trace_enabled_QMARK_ = goog.define("re_frame.trace.trace_enabled_QMARK_",false);
/**
 * See https://groups.google.com/d/msg/clojurescript/jk43kmYiMhA/IHglVr_TPdgJ for more details
 */
re_frame.trace.is_trace_enabled_QMARK_ = (function re_frame$trace$is_trace_enabled_QMARK_(){
return re_frame.trace.trace_enabled_QMARK_;
});
re_frame.trace.trace_cbs = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
if((typeof re_frame !== 'undefined') && (typeof re_frame.trace !== 'undefined') && (typeof re_frame.trace.traces !== 'undefined')){
} else {
re_frame.trace.traces = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentVector.EMPTY);
}
if((typeof re_frame !== 'undefined') && (typeof re_frame.trace !== 'undefined') && (typeof re_frame.trace.next_delivery !== 'undefined')){
} else {
re_frame.trace.next_delivery = cljs.core.atom.cljs$core$IFn$_invoke$arity$1((0));
}
/**
 * Registers a tracing callback function which will receive a collection of one or more traces.
 *   Will replace an existing callback function if it shares the same key.
 */
re_frame.trace.register_trace_cb = (function re_frame$trace$register_trace_cb(key,f){
if(cljs.core.truth_(re_frame.trace.trace_enabled_QMARK_)){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$4(re_frame.trace.trace_cbs,cljs.core.assoc,key,f);
} else {
return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["Tracing is not enabled. Please set {\"re_frame.trace.trace_enabled_QMARK_\" true} in :closure-defines. See: https://github.com/day8/re-frame-10x#installation."], 0));
}
});
re_frame.trace.remove_trace_cb = (function re_frame$trace$remove_trace_cb(key){
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.trace_cbs,cljs.core.dissoc,key);

return null;
});
re_frame.trace.next_id = (function re_frame$trace$next_id(){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$2(re_frame.trace.id,cljs.core.inc);
});
re_frame.trace.start_trace = (function re_frame$trace$start_trace(p__13296){
var map__13297 = p__13296;
var map__13297__$1 = cljs.core.__destructure_map(map__13297);
var operation = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13297__$1,cljs.core.cst$kw$operation);
var op_type = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13297__$1,cljs.core.cst$kw$op_DASH_type);
var tags = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13297__$1,cljs.core.cst$kw$tags);
var child_of = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13297__$1,cljs.core.cst$kw$child_DASH_of);
return new cljs.core.PersistentArrayMap(null, 6, [cljs.core.cst$kw$id,re_frame.trace.next_id(),cljs.core.cst$kw$operation,operation,cljs.core.cst$kw$op_DASH_type,op_type,cljs.core.cst$kw$tags,tags,cljs.core.cst$kw$child_DASH_of,(function (){var or__4223__auto__ = child_of;
if(cljs.core.truth_(or__4223__auto__)){
return or__4223__auto__;
} else {
return cljs.core.cst$kw$id.cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_);
}
})(),cljs.core.cst$kw$start,re_frame.interop.now()], null);
});
re_frame.trace.debounce_time = (50);
re_frame.trace.debounce = (function re_frame$trace$debounce(f,interval){
return goog.functions.debounce(f,interval);
});
re_frame.trace.schedule_debounce = re_frame.trace.debounce((function re_frame$trace$tracing_cb_debounced(){
var seq__13298_13322 = cljs.core.seq(cljs.core.deref(re_frame.trace.trace_cbs));
var chunk__13299_13323 = null;
var count__13300_13324 = (0);
var i__13301_13325 = (0);
while(true){
if((i__13301_13325 < count__13300_13324)){
var vec__13312_13326 = chunk__13299_13323.cljs$core$IIndexed$_nth$arity$2(null,i__13301_13325);
var k_13327 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13312_13326,(0),null);
var cb_13328 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13312_13326,(1),null);
try{var G__13316_13329 = cljs.core.deref(re_frame.trace.traces);
(cb_13328.cljs$core$IFn$_invoke$arity$1 ? cb_13328.cljs$core$IFn$_invoke$arity$1(G__13316_13329) : cb_13328.call(null,G__13316_13329));
}catch (e13315){var e_13330 = e13315;
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["Error thrown from trace cb",k_13327,"while storing",cljs.core.deref(re_frame.trace.traces),e_13330], 0));
}

var G__13331 = seq__13298_13322;
var G__13332 = chunk__13299_13323;
var G__13333 = count__13300_13324;
var G__13334 = (i__13301_13325 + (1));
seq__13298_13322 = G__13331;
chunk__13299_13323 = G__13332;
count__13300_13324 = G__13333;
i__13301_13325 = G__13334;
continue;
} else {
var temp__5753__auto___13335 = cljs.core.seq(seq__13298_13322);
if(temp__5753__auto___13335){
var seq__13298_13336__$1 = temp__5753__auto___13335;
if(cljs.core.chunked_seq_QMARK_(seq__13298_13336__$1)){
var c__4649__auto___13337 = cljs.core.chunk_first(seq__13298_13336__$1);
var G__13338 = cljs.core.chunk_rest(seq__13298_13336__$1);
var G__13339 = c__4649__auto___13337;
var G__13340 = cljs.core.count(c__4649__auto___13337);
var G__13341 = (0);
seq__13298_13322 = G__13338;
chunk__13299_13323 = G__13339;
count__13300_13324 = G__13340;
i__13301_13325 = G__13341;
continue;
} else {
var vec__13317_13342 = cljs.core.first(seq__13298_13336__$1);
var k_13343 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13317_13342,(0),null);
var cb_13344 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13317_13342,(1),null);
try{var G__13321_13345 = cljs.core.deref(re_frame.trace.traces);
(cb_13344.cljs$core$IFn$_invoke$arity$1 ? cb_13344.cljs$core$IFn$_invoke$arity$1(G__13321_13345) : cb_13344.call(null,G__13321_13345));
}catch (e13320){var e_13346 = e13320;
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["Error thrown from trace cb",k_13343,"while storing",cljs.core.deref(re_frame.trace.traces),e_13346], 0));
}

var G__13347 = cljs.core.next(seq__13298_13336__$1);
var G__13348 = null;
var G__13349 = (0);
var G__13350 = (0);
seq__13298_13322 = G__13347;
chunk__13299_13323 = G__13348;
count__13300_13324 = G__13349;
i__13301_13325 = G__13350;
continue;
}
} else {
}
}
break;
}

return cljs.core.reset_BANG_(re_frame.trace.traces,cljs.core.PersistentVector.EMPTY);
}),re_frame.trace.debounce_time);
re_frame.trace.run_tracing_callbacks_BANG_ = (function re_frame$trace$run_tracing_callbacks_BANG_(now){
if(((cljs.core.deref(re_frame.trace.next_delivery) - (25)) < now)){
(re_frame.trace.schedule_debounce.cljs$core$IFn$_invoke$arity$0 ? re_frame.trace.schedule_debounce.cljs$core$IFn$_invoke$arity$0() : re_frame.trace.schedule_debounce.call(null));

return cljs.core.reset_BANG_(re_frame.trace.next_delivery,(now + re_frame.trace.debounce_time));
} else {
return null;
}
});
