// Compiled by ClojureScript 1.10.773 {:static-fns true, :optimize-constants true}
goog.provide('re_frame.subs');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.db');
goog.require('re_frame.interop');
goog.require('re_frame.loggers');
goog.require('re_frame.utils');
goog.require('re_frame.registrar');
goog.require('re_frame.trace');
re_frame.subs.kind = cljs.core.cst$kw$sub;
if(cljs.core.truth_((re_frame.registrar.kinds.cljs$core$IFn$_invoke$arity$1 ? re_frame.registrar.kinds.cljs$core$IFn$_invoke$arity$1(re_frame.subs.kind) : re_frame.registrar.kinds.call(null,re_frame.subs.kind)))){
} else {
throw (new Error("Assert failed: (re-frame.registrar/kinds kind)"));
}
re_frame.subs.query__GT_reaction = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
/**
 * calls `on-dispose` for each cached item, 
 * which will cause the value to be removed from the cache
 */
re_frame.subs.clear_subscription_cache_BANG_ = (function re_frame$subs$clear_subscription_cache_BANG_(){
var seq__13847_13863 = cljs.core.seq(cljs.core.deref(re_frame.subs.query__GT_reaction));
var chunk__13848_13864 = null;
var count__13849_13865 = (0);
var i__13850_13866 = (0);
while(true){
if((i__13850_13866 < count__13849_13865)){
var vec__13857_13867 = chunk__13848_13864.cljs$core$IIndexed$_nth$arity$2(null,i__13850_13866);
var k_13868 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13857_13867,(0),null);
var rxn_13869 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13857_13867,(1),null);
re_frame.interop.dispose_BANG_(rxn_13869);


var G__13870 = seq__13847_13863;
var G__13871 = chunk__13848_13864;
var G__13872 = count__13849_13865;
var G__13873 = (i__13850_13866 + (1));
seq__13847_13863 = G__13870;
chunk__13848_13864 = G__13871;
count__13849_13865 = G__13872;
i__13850_13866 = G__13873;
continue;
} else {
var temp__5735__auto___13874 = cljs.core.seq(seq__13847_13863);
if(temp__5735__auto___13874){
var seq__13847_13875__$1 = temp__5735__auto___13874;
if(cljs.core.chunked_seq_QMARK_(seq__13847_13875__$1)){
var c__4556__auto___13876 = cljs.core.chunk_first(seq__13847_13875__$1);
var G__13877 = cljs.core.chunk_rest(seq__13847_13875__$1);
var G__13878 = c__4556__auto___13876;
var G__13879 = cljs.core.count(c__4556__auto___13876);
var G__13880 = (0);
seq__13847_13863 = G__13877;
chunk__13848_13864 = G__13878;
count__13849_13865 = G__13879;
i__13850_13866 = G__13880;
continue;
} else {
var vec__13860_13881 = cljs.core.first(seq__13847_13875__$1);
var k_13882 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13860_13881,(0),null);
var rxn_13883 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13860_13881,(1),null);
re_frame.interop.dispose_BANG_(rxn_13883);


var G__13884 = cljs.core.next(seq__13847_13875__$1);
var G__13885 = null;
var G__13886 = (0);
var G__13887 = (0);
seq__13847_13863 = G__13884;
chunk__13848_13864 = G__13885;
count__13849_13865 = G__13886;
i__13850_13866 = G__13887;
continue;
}
} else {
}
}
break;
}

if(cljs.core.truth_(cljs.core.not_empty(cljs.core.deref(re_frame.subs.query__GT_reaction)))){
return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: The subscription cache isn't empty after being cleared"], 0));
} else {
return null;
}
});
/**
 * Unregisters all existing subscription handlers
 */
re_frame.subs.clear_all_handlers_BANG_ = (function re_frame$subs$clear_all_handlers_BANG_(){
re_frame.registrar.clear_handlers.cljs$core$IFn$_invoke$arity$1(re_frame.subs.kind);

return re_frame.subs.clear_subscription_cache_BANG_();
});
/**
 * cache the reaction r
 */
re_frame.subs.cache_and_return = (function re_frame$subs$cache_and_return(query_v,dynv,r){
var cache_key = new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [query_v,dynv], null);
re_frame.interop.add_on_dispose_BANG_(r,(function (){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var _STAR_current_trace_STAR__orig_val__13888 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__13889 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$operation,re_frame.utils.first_in_vector(query_v),cljs.core.cst$kw$op_DASH_type,cljs.core.cst$kw$sub_SLASH_dispose,cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$query_DASH_v,query_v,cljs.core.cst$kw$reaction,re_frame.interop.reagent_id(r)], null)], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__13889);

try{try{return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$2(re_frame.subs.query__GT_reaction,(function (query_cache){
if(((cljs.core.contains_QMARK_(query_cache,cache_key)) && ((r === cljs.core.get.cljs$core$IFn$_invoke$arity$2(query_cache,cache_key))))){
return cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(query_cache,cache_key);
} else {
return query_cache;
}
}));
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__13399__auto___13890 = re_frame.interop.now();
var duration__13400__auto___13891 = (end__13399__auto___13890 - cljs.core.cst$kw$start.cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$duration,duration__13400__auto___13891,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$end,re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__13399__auto___13890);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__13888);
}} else {
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$2(re_frame.subs.query__GT_reaction,(function (query_cache){
if(((cljs.core.contains_QMARK_(query_cache,cache_key)) && ((r === cljs.core.get.cljs$core$IFn$_invoke$arity$2(query_cache,cache_key))))){
return cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(query_cache,cache_key);
} else {
return query_cache;
}
}));
}
}));

cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$2(re_frame.subs.query__GT_reaction,(function (query_cache){
if(re_frame.interop.debug_enabled_QMARK_){
if(cljs.core.contains_QMARK_(query_cache,cache_key)){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: Adding a new subscription to the cache while there is an existing subscription in the cache",cache_key], 0));
} else {
}
} else {
}

return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(query_cache,cache_key,r);
}));

if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13892 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$reaction,re_frame.interop.reagent_id(r)], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$reaction,re_frame.interop.reagent_id(r)], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13892);

} else {
}

return r;
});
re_frame.subs.cache_lookup = (function re_frame$subs$cache_lookup(var_args){
var G__13894 = arguments.length;
switch (G__13894) {
case 1:
return re_frame.subs.cache_lookup.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return re_frame.subs.cache_lookup.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(re_frame.subs.cache_lookup.cljs$core$IFn$_invoke$arity$1 = (function (query_v){
return re_frame.subs.cache_lookup.cljs$core$IFn$_invoke$arity$2(query_v,cljs.core.PersistentVector.EMPTY);
}));

(re_frame.subs.cache_lookup.cljs$core$IFn$_invoke$arity$2 = (function (query_v,dyn_v){
return cljs.core.get.cljs$core$IFn$_invoke$arity$2(cljs.core.deref(re_frame.subs.query__GT_reaction),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [query_v,dyn_v], null));
}));

(re_frame.subs.cache_lookup.cljs$lang$maxFixedArity = 2);

re_frame.subs.subscribe = (function re_frame$subs$subscribe(var_args){
var G__13897 = arguments.length;
switch (G__13897) {
case 1:
return re_frame.subs.subscribe.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return re_frame.subs.subscribe.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(re_frame.subs.subscribe.cljs$core$IFn$_invoke$arity$1 = (function (query){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var _STAR_current_trace_STAR__orig_val__13898 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__13899 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$operation,re_frame.utils.first_in_vector(query),cljs.core.cst$kw$op_DASH_type,cljs.core.cst$kw$sub_SLASH_create,cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$query_DASH_v,query], null)], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__13899);

try{try{var temp__5733__auto__ = re_frame.subs.cache_lookup.cljs$core$IFn$_invoke$arity$1(query);
if(cljs.core.truth_(temp__5733__auto__)){
var cached = temp__5733__auto__;
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13909 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$cached_QMARK_,true,cljs.core.cst$kw$reaction,re_frame.interop.reagent_id(cached)], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$cached_QMARK_,true,cljs.core.cst$kw$reaction,re_frame.interop.reagent_id(cached)], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13909);

} else {
}

return cached;
} else {
var query_id = re_frame.utils.first_in_vector(query);
var handler_fn = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$2(re_frame.subs.kind,query_id);
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13910 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$cached_QMARK_,false], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$cached_QMARK_,false], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13910);

} else {
}

if((handler_fn == null)){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13911 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$error,true], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$error,true], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13911);

} else {
}

return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([["re-frame: no subscription handler registered for: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(query_id),". Returning a nil subscription."].join('')], 0));
} else {
return re_frame.subs.cache_and_return(query,cljs.core.PersistentVector.EMPTY,(handler_fn.cljs$core$IFn$_invoke$arity$2 ? handler_fn.cljs$core$IFn$_invoke$arity$2(re_frame.db.app_db,query) : handler_fn.call(null,re_frame.db.app_db,query)));
}
}
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__13399__auto___13912 = re_frame.interop.now();
var duration__13400__auto___13913 = (end__13399__auto___13912 - cljs.core.cst$kw$start.cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$duration,duration__13400__auto___13913,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$end,re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__13399__auto___13912);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__13898);
}} else {
var temp__5733__auto__ = re_frame.subs.cache_lookup.cljs$core$IFn$_invoke$arity$1(query);
if(cljs.core.truth_(temp__5733__auto__)){
var cached = temp__5733__auto__;
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13914 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$cached_QMARK_,true,cljs.core.cst$kw$reaction,re_frame.interop.reagent_id(cached)], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$cached_QMARK_,true,cljs.core.cst$kw$reaction,re_frame.interop.reagent_id(cached)], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13914);

} else {
}

return cached;
} else {
var query_id = re_frame.utils.first_in_vector(query);
var handler_fn = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$2(re_frame.subs.kind,query_id);
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13915 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$cached_QMARK_,false], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$cached_QMARK_,false], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13915);

} else {
}

if((handler_fn == null)){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13916 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$error,true], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$error,true], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13916);

} else {
}

return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([["re-frame: no subscription handler registered for: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(query_id),". Returning a nil subscription."].join('')], 0));
} else {
return re_frame.subs.cache_and_return(query,cljs.core.PersistentVector.EMPTY,(handler_fn.cljs$core$IFn$_invoke$arity$2 ? handler_fn.cljs$core$IFn$_invoke$arity$2(re_frame.db.app_db,query) : handler_fn.call(null,re_frame.db.app_db,query)));
}
}
}
}));

(re_frame.subs.subscribe.cljs$core$IFn$_invoke$arity$2 = (function (query,dynv){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var _STAR_current_trace_STAR__orig_val__13900 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__13901 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$operation,re_frame.utils.first_in_vector(query),cljs.core.cst$kw$op_DASH_type,cljs.core.cst$kw$sub_SLASH_create,cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$query_DASH_v,query,cljs.core.cst$kw$dyn_DASH_v,dynv], null)], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__13901);

try{try{var temp__5733__auto__ = re_frame.subs.cache_lookup.cljs$core$IFn$_invoke$arity$2(query,dynv);
if(cljs.core.truth_(temp__5733__auto__)){
var cached = temp__5733__auto__;
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13917 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$cached_QMARK_,true,cljs.core.cst$kw$reaction,re_frame.interop.reagent_id(cached)], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$cached_QMARK_,true,cljs.core.cst$kw$reaction,re_frame.interop.reagent_id(cached)], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13917);

} else {
}

return cached;
} else {
var query_id = re_frame.utils.first_in_vector(query);
var handler_fn = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$2(re_frame.subs.kind,query_id);
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13918 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$cached_QMARK_,false], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$cached_QMARK_,false], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13918);

} else {
}

if(re_frame.interop.debug_enabled_QMARK_){
var temp__5735__auto___13919 = cljs.core.not_empty(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(re_frame.interop.ratom_QMARK_,dynv));
if(cljs.core.truth_(temp__5735__auto___13919)){
var not_reactive_13920 = temp__5735__auto___13919;
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: your subscription's dynamic parameters that don't implement IReactiveAtom:",not_reactive_13920], 0));
} else {
}
} else {
}

if((handler_fn == null)){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13921 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$error,true], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$error,true], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13921);

} else {
}

return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([["re-frame: no subscription handler registered for: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(query_id),". Returning a nil subscription."].join('')], 0));
} else {
var dyn_vals = re_frame.interop.make_reaction((function (){
return cljs.core.mapv.cljs$core$IFn$_invoke$arity$2(cljs.core.deref,dynv);
}));
var sub = re_frame.interop.make_reaction((function (){
var G__13902 = re_frame.db.app_db;
var G__13903 = query;
var G__13904 = cljs.core.deref(dyn_vals);
return (handler_fn.cljs$core$IFn$_invoke$arity$3 ? handler_fn.cljs$core$IFn$_invoke$arity$3(G__13902,G__13903,G__13904) : handler_fn.call(null,G__13902,G__13903,G__13904));
}));
return re_frame.subs.cache_and_return(query,dynv,re_frame.interop.make_reaction((function (){
return cljs.core.deref(cljs.core.deref(sub));
})));
}
}
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__13399__auto___13922 = re_frame.interop.now();
var duration__13400__auto___13923 = (end__13399__auto___13922 - cljs.core.cst$kw$start.cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$duration,duration__13400__auto___13923,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$end,re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__13399__auto___13922);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__13900);
}} else {
var temp__5733__auto__ = re_frame.subs.cache_lookup.cljs$core$IFn$_invoke$arity$2(query,dynv);
if(cljs.core.truth_(temp__5733__auto__)){
var cached = temp__5733__auto__;
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13924 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$cached_QMARK_,true,cljs.core.cst$kw$reaction,re_frame.interop.reagent_id(cached)], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$cached_QMARK_,true,cljs.core.cst$kw$reaction,re_frame.interop.reagent_id(cached)], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13924);

} else {
}

return cached;
} else {
var query_id = re_frame.utils.first_in_vector(query);
var handler_fn = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$2(re_frame.subs.kind,query_id);
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13925 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$cached_QMARK_,false], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$cached_QMARK_,false], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13925);

} else {
}

if(re_frame.interop.debug_enabled_QMARK_){
var temp__5735__auto___13926 = cljs.core.not_empty(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(re_frame.interop.ratom_QMARK_,dynv));
if(cljs.core.truth_(temp__5735__auto___13926)){
var not_reactive_13927 = temp__5735__auto___13926;
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: your subscription's dynamic parameters that don't implement IReactiveAtom:",not_reactive_13927], 0));
} else {
}
} else {
}

if((handler_fn == null)){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13928 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$error,true], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$error,true], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13928);

} else {
}

return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([["re-frame: no subscription handler registered for: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(query_id),". Returning a nil subscription."].join('')], 0));
} else {
var dyn_vals = re_frame.interop.make_reaction((function (){
return cljs.core.mapv.cljs$core$IFn$_invoke$arity$2(cljs.core.deref,dynv);
}));
var sub = re_frame.interop.make_reaction((function (){
var G__13905 = re_frame.db.app_db;
var G__13906 = query;
var G__13907 = cljs.core.deref(dyn_vals);
return (handler_fn.cljs$core$IFn$_invoke$arity$3 ? handler_fn.cljs$core$IFn$_invoke$arity$3(G__13905,G__13906,G__13907) : handler_fn.call(null,G__13905,G__13906,G__13907));
}));
return re_frame.subs.cache_and_return(query,dynv,re_frame.interop.make_reaction((function (){
return cljs.core.deref(cljs.core.deref(sub));
})));
}
}
}
}));

(re_frame.subs.subscribe.cljs$lang$maxFixedArity = 2);

/**
 * Returns a new version of 'm' in which 'f' has been applied to each value.
 *   (map-vals inc {:a 4, :b 2}) => {:a 5, :b 3}
 */
re_frame.subs.map_vals = (function re_frame$subs$map_vals(f,m){
return cljs.core.into.cljs$core$IFn$_invoke$arity$3(cljs.core.empty(m),cljs.core.map.cljs$core$IFn$_invoke$arity$1((function (p__13929){
var vec__13930 = p__13929;
var k = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13930,(0),null);
var v = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13930,(1),null);
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [k,(f.cljs$core$IFn$_invoke$arity$1 ? f.cljs$core$IFn$_invoke$arity$1(v) : f.call(null,v))], null);
})),m);
});
/**
 * Runs f over signals. Signals may take several
 *   forms, this function handles all of them.
 */
re_frame.subs.map_signals = (function re_frame$subs$map_signals(f,signals){
if(cljs.core.sequential_QMARK_(signals)){
return cljs.core.map.cljs$core$IFn$_invoke$arity$2(f,signals);
} else {
if(cljs.core.map_QMARK_(signals)){
return re_frame.subs.map_vals(f,signals);
} else {
if(re_frame.interop.deref_QMARK_(signals)){
return (f.cljs$core$IFn$_invoke$arity$1 ? f.cljs$core$IFn$_invoke$arity$1(signals) : f.call(null,signals));
} else {
return cljs.core.List.EMPTY;

}
}
}
});
/**
 * Coerces x to a seq if it isn't one already
 */
re_frame.subs.to_seq = (function re_frame$subs$to_seq(x){
if(cljs.core.sequential_QMARK_(x)){
return x;
} else {
return (new cljs.core.List(null,x,null,(1),null));
}
});
re_frame.subs.deref_input_signals = (function re_frame$subs$deref_input_signals(signals,query_id){
var dereffed_signals = re_frame.subs.map_signals(cljs.core.deref,signals);
if(cljs.core.sequential_QMARK_(signals)){
cljs.core.map.cljs$core$IFn$_invoke$arity$2(cljs.core.deref,signals);
} else {
if(cljs.core.map_QMARK_(signals)){
re_frame.subs.map_vals(cljs.core.deref,signals);
} else {
if(re_frame.interop.deref_QMARK_(signals)){
cljs.core.deref(signals);
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: in the reg-sub for",query_id,", the input-signals function returns:",signals], 0));

}
}
}

if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13933 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$input_DASH_signals,cljs.core.doall.cljs$core$IFn$_invoke$arity$1(re_frame.subs.to_seq(re_frame.subs.map_signals(re_frame.interop.reagent_id,signals)))], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$input_DASH_signals,cljs.core.doall.cljs$core$IFn$_invoke$arity$1(re_frame.subs.to_seq(re_frame.subs.map_signals(re_frame.interop.reagent_id,signals)))], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13933);

} else {
}

return dereffed_signals;
});
re_frame.subs.reg_sub = (function re_frame$subs$reg_sub(var_args){
var args__4742__auto__ = [];
var len__4736__auto___13954 = arguments.length;
var i__4737__auto___13955 = (0);
while(true){
if((i__4737__auto___13955 < len__4736__auto___13954)){
args__4742__auto__.push((arguments[i__4737__auto___13955]));

var G__13956 = (i__4737__auto___13955 + (1));
i__4737__auto___13955 = G__13956;
continue;
} else {
}
break;
}

var argseq__4743__auto__ = ((((1) < args__4742__auto__.length))?(new cljs.core.IndexedSeq(args__4742__auto__.slice((1)),(0),null)):null);
return re_frame.subs.reg_sub.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__4743__auto__);
});

(re_frame.subs.reg_sub.cljs$core$IFn$_invoke$arity$variadic = (function (query_id,args){
var computation_fn = cljs.core.last(args);
var input_args = cljs.core.butlast(args);
var err_header = ["re-frame: reg-sub for ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(query_id),", "].join('');
var inputs_fn = (function (){var G__13936 = cljs.core.count(input_args);
switch (G__13936) {
case (0):
return (function() {
var G__13958 = null;
var G__13958__1 = (function (_){
return re_frame.db.app_db;
});
var G__13958__2 = (function (_,___$1){
return re_frame.db.app_db;
});
G__13958 = function(_,___$1){
switch(arguments.length){
case 1:
return G__13958__1.call(this,_);
case 2:
return G__13958__2.call(this,_,___$1);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
G__13958.cljs$core$IFn$_invoke$arity$1 = G__13958__1;
G__13958.cljs$core$IFn$_invoke$arity$2 = G__13958__2;
return G__13958;
})()

break;
case (1):
var f = cljs.core.first(input_args);
if(cljs.core.fn_QMARK_(f)){
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([err_header,"2nd argument expected to be an inputs function, got:",f], 0));
}

return f;

break;
case (2):
var vec__13937 = input_args;
var marker = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13937,(0),null);
var vec = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13937,(1),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$_LT__DASH_,marker)){
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([err_header,"expected :<-, got:",marker], 0));
}

return (function() {
var re_frame$subs$inp_fn = null;
var re_frame$subs$inp_fn__1 = (function (_){
return re_frame.subs.subscribe.cljs$core$IFn$_invoke$arity$1(vec);
});
var re_frame$subs$inp_fn__2 = (function (_,___$1){
return re_frame.subs.subscribe.cljs$core$IFn$_invoke$arity$1(vec);
});
re_frame$subs$inp_fn = function(_,___$1){
switch(arguments.length){
case 1:
return re_frame$subs$inp_fn__1.call(this,_);
case 2:
return re_frame$subs$inp_fn__2.call(this,_,___$1);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
re_frame$subs$inp_fn.cljs$core$IFn$_invoke$arity$1 = re_frame$subs$inp_fn__1;
re_frame$subs$inp_fn.cljs$core$IFn$_invoke$arity$2 = re_frame$subs$inp_fn__2;
return re_frame$subs$inp_fn;
})()

break;
default:
var pairs = cljs.core.partition.cljs$core$IFn$_invoke$arity$2((2),input_args);
var markers = cljs.core.map.cljs$core$IFn$_invoke$arity$2(cljs.core.first,pairs);
var vecs = cljs.core.map.cljs$core$IFn$_invoke$arity$2(cljs.core.last,pairs);
if(((cljs.core.every_QMARK_(new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$_LT__DASH_,null], null), null),markers)) && (cljs.core.every_QMARK_(cljs.core.vector_QMARK_,vecs)))){
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([err_header,"expected pairs of :<- and vectors, got:",pairs], 0));
}

return (function() {
var re_frame$subs$inp_fn = null;
var re_frame$subs$inp_fn__1 = (function (_){
return cljs.core.map.cljs$core$IFn$_invoke$arity$2(re_frame.subs.subscribe,vecs);
});
var re_frame$subs$inp_fn__2 = (function (_,___$1){
return cljs.core.map.cljs$core$IFn$_invoke$arity$2(re_frame.subs.subscribe,vecs);
});
re_frame$subs$inp_fn = function(_,___$1){
switch(arguments.length){
case 1:
return re_frame$subs$inp_fn__1.call(this,_);
case 2:
return re_frame$subs$inp_fn__2.call(this,_,___$1);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
re_frame$subs$inp_fn.cljs$core$IFn$_invoke$arity$1 = re_frame$subs$inp_fn__1;
re_frame$subs$inp_fn.cljs$core$IFn$_invoke$arity$2 = re_frame$subs$inp_fn__2;
return re_frame$subs$inp_fn;
})()

}
})();
return re_frame.registrar.register_handler(re_frame.subs.kind,query_id,(function() {
var re_frame$subs$subs_handler_fn = null;
var re_frame$subs$subs_handler_fn__2 = (function (db,query_vec){
var subscriptions = (inputs_fn.cljs$core$IFn$_invoke$arity$2 ? inputs_fn.cljs$core$IFn$_invoke$arity$2(query_vec,null) : inputs_fn.call(null,query_vec,null));
var reaction_id = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(null);
var reaction = re_frame.interop.make_reaction((function (){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var _STAR_current_trace_STAR__orig_val__13940 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__13941 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$operation,re_frame.utils.first_in_vector(query_vec),cljs.core.cst$kw$op_DASH_type,cljs.core.cst$kw$sub_SLASH_run,cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$query_DASH_v,query_vec,cljs.core.cst$kw$reaction,cljs.core.deref(reaction_id)], null)], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__13941);

try{try{var subscription = (function (){var G__13942 = re_frame.subs.deref_input_signals(subscriptions,query_id);
var G__13943 = query_vec;
return (computation_fn.cljs$core$IFn$_invoke$arity$2 ? computation_fn.cljs$core$IFn$_invoke$arity$2(G__13942,G__13943) : computation_fn.call(null,G__13942,G__13943));
})();
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13959 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$value,subscription], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$value,subscription], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13959);

} else {
}

return subscription;
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__13399__auto___13960 = re_frame.interop.now();
var duration__13400__auto___13961 = (end__13399__auto___13960 - cljs.core.cst$kw$start.cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$duration,duration__13400__auto___13961,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$end,re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__13399__auto___13960);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__13940);
}} else {
var subscription = (function (){var G__13944 = re_frame.subs.deref_input_signals(subscriptions,query_id);
var G__13945 = query_vec;
return (computation_fn.cljs$core$IFn$_invoke$arity$2 ? computation_fn.cljs$core$IFn$_invoke$arity$2(G__13944,G__13945) : computation_fn.call(null,G__13944,G__13945));
})();
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13962 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$value,subscription], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$value,subscription], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13962);

} else {
}

return subscription;
}
}));
cljs.core.reset_BANG_(reaction_id,re_frame.interop.reagent_id(reaction));

return reaction;
});
var re_frame$subs$subs_handler_fn__3 = (function (db,query_vec,dyn_vec){
var subscriptions = (inputs_fn.cljs$core$IFn$_invoke$arity$2 ? inputs_fn.cljs$core$IFn$_invoke$arity$2(query_vec,dyn_vec) : inputs_fn.call(null,query_vec,dyn_vec));
var reaction_id = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(null);
var reaction = re_frame.interop.make_reaction((function (){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var _STAR_current_trace_STAR__orig_val__13946 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__13947 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$operation,re_frame.utils.first_in_vector(query_vec),cljs.core.cst$kw$op_DASH_type,cljs.core.cst$kw$sub_SLASH_run,cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$query_DASH_v,query_vec,cljs.core.cst$kw$dyn_DASH_v,dyn_vec,cljs.core.cst$kw$reaction,cljs.core.deref(reaction_id)], null)], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__13947);

try{try{var subscription = (function (){var G__13948 = re_frame.subs.deref_input_signals(subscriptions,query_id);
var G__13949 = query_vec;
var G__13950 = dyn_vec;
return (computation_fn.cljs$core$IFn$_invoke$arity$3 ? computation_fn.cljs$core$IFn$_invoke$arity$3(G__13948,G__13949,G__13950) : computation_fn.call(null,G__13948,G__13949,G__13950));
})();
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13963 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$value,subscription], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$value,subscription], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13963);

} else {
}

return subscription;
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__13399__auto___13964 = re_frame.interop.now();
var duration__13400__auto___13965 = (end__13399__auto___13964 - cljs.core.cst$kw$start.cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$duration,duration__13400__auto___13965,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$end,re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__13399__auto___13964);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__13946);
}} else {
var subscription = (function (){var G__13951 = re_frame.subs.deref_input_signals(subscriptions,query_id);
var G__13952 = query_vec;
var G__13953 = dyn_vec;
return (computation_fn.cljs$core$IFn$_invoke$arity$3 ? computation_fn.cljs$core$IFn$_invoke$arity$3(G__13951,G__13952,G__13953) : computation_fn.call(null,G__13951,G__13952,G__13953));
})();
if(re_frame.trace.is_trace_enabled_QMARK_()){
var new_trace__13401__auto___13966 = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.update.cljs$core$IFn$_invoke$arity$4(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$tags,cljs.core.merge,cljs.core.cst$kw$tags.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$value,subscription], null)], null))),cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$tags,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$value,subscription], null)], null),cljs.core.cst$kw$tags)], 0));
(re_frame.trace._STAR_current_trace_STAR_ = new_trace__13401__auto___13966);

} else {
}

return subscription;
}
}));
cljs.core.reset_BANG_(reaction_id,re_frame.interop.reagent_id(reaction));

return reaction;
});
re_frame$subs$subs_handler_fn = function(db,query_vec,dyn_vec){
switch(arguments.length){
case 2:
return re_frame$subs$subs_handler_fn__2.call(this,db,query_vec);
case 3:
return re_frame$subs$subs_handler_fn__3.call(this,db,query_vec,dyn_vec);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
re_frame$subs$subs_handler_fn.cljs$core$IFn$_invoke$arity$2 = re_frame$subs$subs_handler_fn__2;
re_frame$subs$subs_handler_fn.cljs$core$IFn$_invoke$arity$3 = re_frame$subs$subs_handler_fn__3;
return re_frame$subs$subs_handler_fn;
})()
);
}));

(re_frame.subs.reg_sub.cljs$lang$maxFixedArity = (1));

/** @this {Function} */
(re_frame.subs.reg_sub.cljs$lang$applyTo = (function (seq13934){
var G__13935 = cljs.core.first(seq13934);
var seq13934__$1 = cljs.core.next(seq13934);
var self__4723__auto__ = this;
return self__4723__auto__.cljs$core$IFn$_invoke$arity$variadic(G__13935,seq13934__$1);
}));

