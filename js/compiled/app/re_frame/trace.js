// Compiled by ClojureScript 1.10.773 {:static-fns true, :optimize-constants true}
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
re_frame.trace.start_trace = (function re_frame$trace$start_trace(p__13417){
var map__13418 = p__13417;
var map__13418__$1 = (((((!((map__13418 == null))))?(((((map__13418.cljs$lang$protocol_mask$partition0$ & (64))) || ((cljs.core.PROTOCOL_SENTINEL === map__13418.cljs$core$ISeq$))))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__13418):map__13418);
var operation = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13418__$1,cljs.core.cst$kw$operation);
var op_type = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13418__$1,cljs.core.cst$kw$op_DASH_type);
var tags = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13418__$1,cljs.core.cst$kw$tags);
var child_of = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13418__$1,cljs.core.cst$kw$child_DASH_of);
return new cljs.core.PersistentArrayMap(null, 6, [cljs.core.cst$kw$id,re_frame.trace.next_id(),cljs.core.cst$kw$operation,operation,cljs.core.cst$kw$op_DASH_type,op_type,cljs.core.cst$kw$tags,tags,cljs.core.cst$kw$child_DASH_of,(function (){var or__4126__auto__ = child_of;
if(cljs.core.truth_(or__4126__auto__)){
return or__4126__auto__;
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
var seq__13420_13444 = cljs.core.seq(cljs.core.deref(re_frame.trace.trace_cbs));
var chunk__13421_13445 = null;
var count__13422_13446 = (0);
var i__13423_13447 = (0);
while(true){
if((i__13423_13447 < count__13422_13446)){
var vec__13434_13448 = chunk__13421_13445.cljs$core$IIndexed$_nth$arity$2(null,i__13423_13447);
var k_13449 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13434_13448,(0),null);
var cb_13450 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13434_13448,(1),null);
try{var G__13438_13451 = cljs.core.deref(re_frame.trace.traces);
(cb_13450.cljs$core$IFn$_invoke$arity$1 ? cb_13450.cljs$core$IFn$_invoke$arity$1(G__13438_13451) : cb_13450.call(null,G__13438_13451));
}catch (e13437){var e_13452 = e13437;
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["Error thrown from trace cb",k_13449,"while storing",cljs.core.deref(re_frame.trace.traces),e_13452], 0));
}

var G__13453 = seq__13420_13444;
var G__13454 = chunk__13421_13445;
var G__13455 = count__13422_13446;
var G__13456 = (i__13423_13447 + (1));
seq__13420_13444 = G__13453;
chunk__13421_13445 = G__13454;
count__13422_13446 = G__13455;
i__13423_13447 = G__13456;
continue;
} else {
var temp__5735__auto___13457 = cljs.core.seq(seq__13420_13444);
if(temp__5735__auto___13457){
var seq__13420_13458__$1 = temp__5735__auto___13457;
if(cljs.core.chunked_seq_QMARK_(seq__13420_13458__$1)){
var c__4556__auto___13459 = cljs.core.chunk_first(seq__13420_13458__$1);
var G__13460 = cljs.core.chunk_rest(seq__13420_13458__$1);
var G__13461 = c__4556__auto___13459;
var G__13462 = cljs.core.count(c__4556__auto___13459);
var G__13463 = (0);
seq__13420_13444 = G__13460;
chunk__13421_13445 = G__13461;
count__13422_13446 = G__13462;
i__13423_13447 = G__13463;
continue;
} else {
var vec__13439_13464 = cljs.core.first(seq__13420_13458__$1);
var k_13465 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13439_13464,(0),null);
var cb_13466 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13439_13464,(1),null);
try{var G__13443_13467 = cljs.core.deref(re_frame.trace.traces);
(cb_13466.cljs$core$IFn$_invoke$arity$1 ? cb_13466.cljs$core$IFn$_invoke$arity$1(G__13443_13467) : cb_13466.call(null,G__13443_13467));
}catch (e13442){var e_13468 = e13442;
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["Error thrown from trace cb",k_13465,"while storing",cljs.core.deref(re_frame.trace.traces),e_13468], 0));
}

var G__13469 = cljs.core.next(seq__13420_13458__$1);
var G__13470 = null;
var G__13471 = (0);
var G__13472 = (0);
seq__13420_13444 = G__13469;
chunk__13421_13445 = G__13470;
count__13422_13446 = G__13471;
i__13423_13447 = G__13472;
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
