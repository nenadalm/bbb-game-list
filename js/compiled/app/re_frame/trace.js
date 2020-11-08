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
re_frame.trace.start_trace = (function re_frame$trace$start_trace(p__13421){
var map__13422 = p__13421;
var map__13422__$1 = (((((!((map__13422 == null))))?(((((map__13422.cljs$lang$protocol_mask$partition0$ & (64))) || ((cljs.core.PROTOCOL_SENTINEL === map__13422.cljs$core$ISeq$))))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__13422):map__13422);
var operation = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13422__$1,cljs.core.cst$kw$operation);
var op_type = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13422__$1,cljs.core.cst$kw$op_DASH_type);
var tags = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13422__$1,cljs.core.cst$kw$tags);
var child_of = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13422__$1,cljs.core.cst$kw$child_DASH_of);
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
var seq__13424_13448 = cljs.core.seq(cljs.core.deref(re_frame.trace.trace_cbs));
var chunk__13425_13449 = null;
var count__13426_13450 = (0);
var i__13427_13451 = (0);
while(true){
if((i__13427_13451 < count__13426_13450)){
var vec__13438_13452 = chunk__13425_13449.cljs$core$IIndexed$_nth$arity$2(null,i__13427_13451);
var k_13453 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13438_13452,(0),null);
var cb_13454 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13438_13452,(1),null);
try{var G__13442_13455 = cljs.core.deref(re_frame.trace.traces);
(cb_13454.cljs$core$IFn$_invoke$arity$1 ? cb_13454.cljs$core$IFn$_invoke$arity$1(G__13442_13455) : cb_13454.call(null,G__13442_13455));
}catch (e13441){var e_13456 = e13441;
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["Error thrown from trace cb",k_13453,"while storing",cljs.core.deref(re_frame.trace.traces),e_13456], 0));
}

var G__13457 = seq__13424_13448;
var G__13458 = chunk__13425_13449;
var G__13459 = count__13426_13450;
var G__13460 = (i__13427_13451 + (1));
seq__13424_13448 = G__13457;
chunk__13425_13449 = G__13458;
count__13426_13450 = G__13459;
i__13427_13451 = G__13460;
continue;
} else {
var temp__5735__auto___13461 = cljs.core.seq(seq__13424_13448);
if(temp__5735__auto___13461){
var seq__13424_13462__$1 = temp__5735__auto___13461;
if(cljs.core.chunked_seq_QMARK_(seq__13424_13462__$1)){
var c__4556__auto___13463 = cljs.core.chunk_first(seq__13424_13462__$1);
var G__13464 = cljs.core.chunk_rest(seq__13424_13462__$1);
var G__13465 = c__4556__auto___13463;
var G__13466 = cljs.core.count(c__4556__auto___13463);
var G__13467 = (0);
seq__13424_13448 = G__13464;
chunk__13425_13449 = G__13465;
count__13426_13450 = G__13466;
i__13427_13451 = G__13467;
continue;
} else {
var vec__13443_13468 = cljs.core.first(seq__13424_13462__$1);
var k_13469 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13443_13468,(0),null);
var cb_13470 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13443_13468,(1),null);
try{var G__13447_13471 = cljs.core.deref(re_frame.trace.traces);
(cb_13470.cljs$core$IFn$_invoke$arity$1 ? cb_13470.cljs$core$IFn$_invoke$arity$1(G__13447_13471) : cb_13470.call(null,G__13447_13471));
}catch (e13446){var e_13472 = e13446;
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["Error thrown from trace cb",k_13469,"while storing",cljs.core.deref(re_frame.trace.traces),e_13472], 0));
}

var G__13473 = cljs.core.next(seq__13424_13462__$1);
var G__13474 = null;
var G__13475 = (0);
var G__13476 = (0);
seq__13424_13448 = G__13473;
chunk__13425_13449 = G__13474;
count__13426_13450 = G__13475;
i__13427_13451 = G__13476;
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
