// Compiled by ClojureScript 1.10.597 {:static-fns true, :optimize-constants true}
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

/** @define {boolean} */
goog.define("re_frame.trace.trace_enabled_QMARK_",false);
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
if(re_frame.trace.trace_enabled_QMARK_){
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
re_frame.trace.start_trace = (function re_frame$trace$start_trace(p__12915){
var map__12916 = p__12915;
var map__12916__$1 = (((((!((map__12916 == null))))?(((((map__12916.cljs$lang$protocol_mask$partition0$ & (64))) || ((cljs.core.PROTOCOL_SENTINEL === map__12916.cljs$core$ISeq$))))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__12916):map__12916);
var operation = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__12916__$1,cljs.core.cst$kw$operation);
var op_type = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__12916__$1,cljs.core.cst$kw$op_DASH_type);
var tags = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__12916__$1,cljs.core.cst$kw$tags);
var child_of = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__12916__$1,cljs.core.cst$kw$child_DASH_of);
return new cljs.core.PersistentArrayMap(null, 6, [cljs.core.cst$kw$id,re_frame.trace.next_id(),cljs.core.cst$kw$operation,operation,cljs.core.cst$kw$op_DASH_type,op_type,cljs.core.cst$kw$tags,tags,cljs.core.cst$kw$child_DASH_of,(function (){var or__4185__auto__ = child_of;
if(cljs.core.truth_(or__4185__auto__)){
return or__4185__auto__;
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
var seq__12918_12942 = cljs.core.seq(cljs.core.deref(re_frame.trace.trace_cbs));
var chunk__12919_12943 = null;
var count__12920_12944 = (0);
var i__12921_12945 = (0);
while(true){
if((i__12921_12945 < count__12920_12944)){
var vec__12932_12946 = chunk__12919_12943.cljs$core$IIndexed$_nth$arity$2(null,i__12921_12945);
var k_12947 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12932_12946,(0),null);
var cb_12948 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12932_12946,(1),null);
try{var G__12936_12949 = cljs.core.deref(re_frame.trace.traces);
(cb_12948.cljs$core$IFn$_invoke$arity$1 ? cb_12948.cljs$core$IFn$_invoke$arity$1(G__12936_12949) : cb_12948.call(null,G__12936_12949));
}catch (e12935){var e_12950 = e12935;
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["Error thrown from trace cb",k_12947,"while storing",cljs.core.deref(re_frame.trace.traces),e_12950], 0));
}

var G__12951 = seq__12918_12942;
var G__12952 = chunk__12919_12943;
var G__12953 = count__12920_12944;
var G__12954 = (i__12921_12945 + (1));
seq__12918_12942 = G__12951;
chunk__12919_12943 = G__12952;
count__12920_12944 = G__12953;
i__12921_12945 = G__12954;
continue;
} else {
var temp__5735__auto___12955 = cljs.core.seq(seq__12918_12942);
if(temp__5735__auto___12955){
var seq__12918_12956__$1 = temp__5735__auto___12955;
if(cljs.core.chunked_seq_QMARK_(seq__12918_12956__$1)){
var c__4609__auto___12957 = cljs.core.chunk_first(seq__12918_12956__$1);
var G__12958 = cljs.core.chunk_rest(seq__12918_12956__$1);
var G__12959 = c__4609__auto___12957;
var G__12960 = cljs.core.count(c__4609__auto___12957);
var G__12961 = (0);
seq__12918_12942 = G__12958;
chunk__12919_12943 = G__12959;
count__12920_12944 = G__12960;
i__12921_12945 = G__12961;
continue;
} else {
var vec__12937_12962 = cljs.core.first(seq__12918_12956__$1);
var k_12963 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12937_12962,(0),null);
var cb_12964 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12937_12962,(1),null);
try{var G__12941_12965 = cljs.core.deref(re_frame.trace.traces);
(cb_12964.cljs$core$IFn$_invoke$arity$1 ? cb_12964.cljs$core$IFn$_invoke$arity$1(G__12941_12965) : cb_12964.call(null,G__12941_12965));
}catch (e12940){var e_12966 = e12940;
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["Error thrown from trace cb",k_12963,"while storing",cljs.core.deref(re_frame.trace.traces),e_12966], 0));
}

var G__12967 = cljs.core.next(seq__12918_12956__$1);
var G__12968 = null;
var G__12969 = (0);
var G__12970 = (0);
seq__12918_12942 = G__12967;
chunk__12919_12943 = G__12968;
count__12920_12944 = G__12969;
i__12921_12945 = G__12970;
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
