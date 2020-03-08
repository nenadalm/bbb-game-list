// Compiled by ClojureScript 1.10.597 {:static-fns true, :optimize-constants true}
goog.provide('re_frame.fx');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.router');
goog.require('re_frame.db');
goog.require('re_frame.interceptor');
goog.require('re_frame.interop');
goog.require('re_frame.events');
goog.require('re_frame.registrar');
goog.require('re_frame.loggers');
goog.require('re_frame.trace');
re_frame.fx.kind = cljs.core.cst$kw$fx;
if(cljs.core.truth_((re_frame.registrar.kinds.cljs$core$IFn$_invoke$arity$1 ? re_frame.registrar.kinds.cljs$core$IFn$_invoke$arity$1(re_frame.fx.kind) : re_frame.registrar.kinds.call(null,re_frame.fx.kind)))){
} else {
throw (new Error("Assert failed: (re-frame.registrar/kinds kind)"));
}
/**
 * Register the given effect `handler` for the given `id`.
 * 
 *   `id` is keyword, often namespaced.
 *   `handler` is a side-effecting function which takes a single argument and whose return
 *   value is ignored.
 * 
 *   Example Use
 *   -----------
 * 
 *   First, registration ... associate `:effect2` with a handler.
 * 
 *   (reg-fx
 *   :effect2
 *   (fn [value]
 *      ... do something side-effect-y))
 * 
 *   Then, later, if an event handler were to return this effects map ...
 * 
 *   {...
 * :effect2  [1 2]}
 * 
 * ... then the `handler` `fn` we registered previously, using `reg-fx`, will be
 * called with an argument of `[1 2]`.
 */
re_frame.fx.reg_fx = (function re_frame$fx$reg_fx(id,handler){
return re_frame.registrar.register_handler(re_frame.fx.kind,id,handler);
});
/**
 * An interceptor whose `:after` actions the contents of `:effects`. As a result,
 *   this interceptor is Domino 3.
 * 
 *   This interceptor is silently added (by reg-event-db etc) to the front of
 *   interceptor chains for all events.
 * 
 *   For each key in `:effects` (a map), it calls the registered `effects handler`
 *   (see `reg-fx` for registration of effect handlers).
 * 
 *   So, if `:effects` was:
 *    {:dispatch  [:hello 42]
 *     :db        {...}
 *     :undo      "set flag"}
 * 
 *   it will call the registered effect handlers for each of the map's keys:
 *   `:dispatch`, `:undo` and `:db`. When calling each handler, provides the map
 *   value for that key - so in the example above the effect handler for :dispatch
 *   will be given one arg `[:hello 42]`.
 * 
 *   You cannot rely on the ordering in which effects are executed.
 */
re_frame.fx.do_fx = re_frame.interceptor.__GT_interceptor.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$id,cljs.core.cst$kw$do_DASH_fx,cljs.core.cst$kw$after,(function re_frame$fx$do_fx_after(context){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var _STAR_current_trace_STAR__orig_val__13076 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__13077 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$op_DASH_type,cljs.core.cst$kw$event_SLASH_do_DASH_fx], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__13077);

try{try{var seq__13078 = cljs.core.seq(cljs.core.cst$kw$effects.cljs$core$IFn$_invoke$arity$1(context));
var chunk__13079 = null;
var count__13080 = (0);
var i__13081 = (0);
while(true){
if((i__13081 < count__13080)){
var vec__13088 = chunk__13079.cljs$core$IIndexed$_nth$arity$2(null,i__13081);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13088,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13088,(1),null);
var temp__5733__auto___13110 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13110)){
var effect_fn_13111 = temp__5733__auto___13110;
(effect_fn_13111.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13111.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13111.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13112 = seq__13078;
var G__13113 = chunk__13079;
var G__13114 = count__13080;
var G__13115 = (i__13081 + (1));
seq__13078 = G__13112;
chunk__13079 = G__13113;
count__13080 = G__13114;
i__13081 = G__13115;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13078);
if(temp__5735__auto__){
var seq__13078__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13078__$1)){
var c__4609__auto__ = cljs.core.chunk_first(seq__13078__$1);
var G__13116 = cljs.core.chunk_rest(seq__13078__$1);
var G__13117 = c__4609__auto__;
var G__13118 = cljs.core.count(c__4609__auto__);
var G__13119 = (0);
seq__13078 = G__13116;
chunk__13079 = G__13117;
count__13080 = G__13118;
i__13081 = G__13119;
continue;
} else {
var vec__13091 = cljs.core.first(seq__13078__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13091,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13091,(1),null);
var temp__5733__auto___13120 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13120)){
var effect_fn_13121 = temp__5733__auto___13120;
(effect_fn_13121.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13121.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13121.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13122 = cljs.core.next(seq__13078__$1);
var G__13123 = null;
var G__13124 = (0);
var G__13125 = (0);
seq__13078 = G__13122;
chunk__13079 = G__13123;
count__13080 = G__13124;
i__13081 = G__13125;
continue;
}
} else {
return null;
}
}
break;
}
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__12893__auto___13126 = re_frame.interop.now();
var duration__12894__auto___13127 = (end__12893__auto___13126 - cljs.core.cst$kw$start.cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$duration,duration__12894__auto___13127,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$end,re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__12893__auto___13126);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__13076);
}} else {
var seq__13094 = cljs.core.seq(cljs.core.cst$kw$effects.cljs$core$IFn$_invoke$arity$1(context));
var chunk__13095 = null;
var count__13096 = (0);
var i__13097 = (0);
while(true){
if((i__13097 < count__13096)){
var vec__13104 = chunk__13095.cljs$core$IIndexed$_nth$arity$2(null,i__13097);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13104,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13104,(1),null);
var temp__5733__auto___13128 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13128)){
var effect_fn_13129 = temp__5733__auto___13128;
(effect_fn_13129.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13129.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13129.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13130 = seq__13094;
var G__13131 = chunk__13095;
var G__13132 = count__13096;
var G__13133 = (i__13097 + (1));
seq__13094 = G__13130;
chunk__13095 = G__13131;
count__13096 = G__13132;
i__13097 = G__13133;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13094);
if(temp__5735__auto__){
var seq__13094__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13094__$1)){
var c__4609__auto__ = cljs.core.chunk_first(seq__13094__$1);
var G__13134 = cljs.core.chunk_rest(seq__13094__$1);
var G__13135 = c__4609__auto__;
var G__13136 = cljs.core.count(c__4609__auto__);
var G__13137 = (0);
seq__13094 = G__13134;
chunk__13095 = G__13135;
count__13096 = G__13136;
i__13097 = G__13137;
continue;
} else {
var vec__13107 = cljs.core.first(seq__13094__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13107,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13107,(1),null);
var temp__5733__auto___13138 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13138)){
var effect_fn_13139 = temp__5733__auto___13138;
(effect_fn_13139.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13139.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13139.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13140 = cljs.core.next(seq__13094__$1);
var G__13141 = null;
var G__13142 = (0);
var G__13143 = (0);
seq__13094 = G__13140;
chunk__13095 = G__13141;
count__13096 = G__13142;
i__13097 = G__13143;
continue;
}
} else {
return null;
}
}
break;
}
}
})], 0));
re_frame.fx.reg_fx(cljs.core.cst$kw$dispatch_DASH_later,(function (value){
var seq__13144 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__13145 = null;
var count__13146 = (0);
var i__13147 = (0);
while(true){
if((i__13147 < count__13146)){
var map__13152 = chunk__13145.cljs$core$IIndexed$_nth$arity$2(null,i__13147);
var map__13152__$1 = (((((!((map__13152 == null))))?(((((map__13152.cljs$lang$protocol_mask$partition0$ & (64))) || ((cljs.core.PROTOCOL_SENTINEL === map__13152.cljs$core$ISeq$))))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__13152):map__13152);
var effect = map__13152__$1;
var ms = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13152__$1,cljs.core.cst$kw$ms);
var dispatch = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13152__$1,cljs.core.cst$kw$dispatch);
if(((cljs.core.empty_QMARK_(dispatch)) || ((!(typeof ms === 'number'))))){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: ignoring bad :dispatch-later value:",effect], 0));
} else {
re_frame.interop.set_timeout_BANG_(((function (seq__13144,chunk__13145,count__13146,i__13147,map__13152,map__13152__$1,effect,ms,dispatch){
return (function (){
return re_frame.router.dispatch(dispatch);
});})(seq__13144,chunk__13145,count__13146,i__13147,map__13152,map__13152__$1,effect,ms,dispatch))
,ms);
}


var G__13156 = seq__13144;
var G__13157 = chunk__13145;
var G__13158 = count__13146;
var G__13159 = (i__13147 + (1));
seq__13144 = G__13156;
chunk__13145 = G__13157;
count__13146 = G__13158;
i__13147 = G__13159;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13144);
if(temp__5735__auto__){
var seq__13144__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13144__$1)){
var c__4609__auto__ = cljs.core.chunk_first(seq__13144__$1);
var G__13160 = cljs.core.chunk_rest(seq__13144__$1);
var G__13161 = c__4609__auto__;
var G__13162 = cljs.core.count(c__4609__auto__);
var G__13163 = (0);
seq__13144 = G__13160;
chunk__13145 = G__13161;
count__13146 = G__13162;
i__13147 = G__13163;
continue;
} else {
var map__13154 = cljs.core.first(seq__13144__$1);
var map__13154__$1 = (((((!((map__13154 == null))))?(((((map__13154.cljs$lang$protocol_mask$partition0$ & (64))) || ((cljs.core.PROTOCOL_SENTINEL === map__13154.cljs$core$ISeq$))))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__13154):map__13154);
var effect = map__13154__$1;
var ms = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13154__$1,cljs.core.cst$kw$ms);
var dispatch = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13154__$1,cljs.core.cst$kw$dispatch);
if(((cljs.core.empty_QMARK_(dispatch)) || ((!(typeof ms === 'number'))))){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: ignoring bad :dispatch-later value:",effect], 0));
} else {
re_frame.interop.set_timeout_BANG_(((function (seq__13144,chunk__13145,count__13146,i__13147,map__13154,map__13154__$1,effect,ms,dispatch,seq__13144__$1,temp__5735__auto__){
return (function (){
return re_frame.router.dispatch(dispatch);
});})(seq__13144,chunk__13145,count__13146,i__13147,map__13154,map__13154__$1,effect,ms,dispatch,seq__13144__$1,temp__5735__auto__))
,ms);
}


var G__13164 = cljs.core.next(seq__13144__$1);
var G__13165 = null;
var G__13166 = (0);
var G__13167 = (0);
seq__13144 = G__13164;
chunk__13145 = G__13165;
count__13146 = G__13166;
i__13147 = G__13167;
continue;
}
} else {
return null;
}
}
break;
}
}));
re_frame.fx.reg_fx(cljs.core.cst$kw$dispatch,(function (value){
if((!(cljs.core.vector_QMARK_(value)))){
return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: ignoring bad :dispatch value. Expected a vector, but got:",value], 0));
} else {
return re_frame.router.dispatch(value);
}
}));
re_frame.fx.reg_fx(cljs.core.cst$kw$dispatch_DASH_n,(function (value){
if((!(cljs.core.sequential_QMARK_(value)))){
return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: ignoring bad :dispatch-n value. Expected a collection, but got:",value], 0));
} else {
var seq__13168 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__13169 = null;
var count__13170 = (0);
var i__13171 = (0);
while(true){
if((i__13171 < count__13170)){
var event = chunk__13169.cljs$core$IIndexed$_nth$arity$2(null,i__13171);
re_frame.router.dispatch(event);


var G__13172 = seq__13168;
var G__13173 = chunk__13169;
var G__13174 = count__13170;
var G__13175 = (i__13171 + (1));
seq__13168 = G__13172;
chunk__13169 = G__13173;
count__13170 = G__13174;
i__13171 = G__13175;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13168);
if(temp__5735__auto__){
var seq__13168__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13168__$1)){
var c__4609__auto__ = cljs.core.chunk_first(seq__13168__$1);
var G__13176 = cljs.core.chunk_rest(seq__13168__$1);
var G__13177 = c__4609__auto__;
var G__13178 = cljs.core.count(c__4609__auto__);
var G__13179 = (0);
seq__13168 = G__13176;
chunk__13169 = G__13177;
count__13170 = G__13178;
i__13171 = G__13179;
continue;
} else {
var event = cljs.core.first(seq__13168__$1);
re_frame.router.dispatch(event);


var G__13180 = cljs.core.next(seq__13168__$1);
var G__13181 = null;
var G__13182 = (0);
var G__13183 = (0);
seq__13168 = G__13180;
chunk__13169 = G__13181;
count__13170 = G__13182;
i__13171 = G__13183;
continue;
}
} else {
return null;
}
}
break;
}
}
}));
re_frame.fx.reg_fx(cljs.core.cst$kw$deregister_DASH_event_DASH_handler,(function (value){
var clear_event = cljs.core.partial.cljs$core$IFn$_invoke$arity$2(re_frame.registrar.clear_handlers,re_frame.events.kind);
if(cljs.core.sequential_QMARK_(value)){
var seq__13184 = cljs.core.seq(value);
var chunk__13185 = null;
var count__13186 = (0);
var i__13187 = (0);
while(true){
if((i__13187 < count__13186)){
var event = chunk__13185.cljs$core$IIndexed$_nth$arity$2(null,i__13187);
(clear_event.cljs$core$IFn$_invoke$arity$1 ? clear_event.cljs$core$IFn$_invoke$arity$1(event) : clear_event.call(null,event));


var G__13188 = seq__13184;
var G__13189 = chunk__13185;
var G__13190 = count__13186;
var G__13191 = (i__13187 + (1));
seq__13184 = G__13188;
chunk__13185 = G__13189;
count__13186 = G__13190;
i__13187 = G__13191;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13184);
if(temp__5735__auto__){
var seq__13184__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13184__$1)){
var c__4609__auto__ = cljs.core.chunk_first(seq__13184__$1);
var G__13192 = cljs.core.chunk_rest(seq__13184__$1);
var G__13193 = c__4609__auto__;
var G__13194 = cljs.core.count(c__4609__auto__);
var G__13195 = (0);
seq__13184 = G__13192;
chunk__13185 = G__13193;
count__13186 = G__13194;
i__13187 = G__13195;
continue;
} else {
var event = cljs.core.first(seq__13184__$1);
(clear_event.cljs$core$IFn$_invoke$arity$1 ? clear_event.cljs$core$IFn$_invoke$arity$1(event) : clear_event.call(null,event));


var G__13196 = cljs.core.next(seq__13184__$1);
var G__13197 = null;
var G__13198 = (0);
var G__13199 = (0);
seq__13184 = G__13196;
chunk__13185 = G__13197;
count__13186 = G__13198;
i__13187 = G__13199;
continue;
}
} else {
return null;
}
}
break;
}
} else {
return (clear_event.cljs$core$IFn$_invoke$arity$1 ? clear_event.cljs$core$IFn$_invoke$arity$1(value) : clear_event.call(null,value));
}
}));
re_frame.fx.reg_fx(cljs.core.cst$kw$db,(function (value){
if((!((cljs.core.deref(re_frame.db.app_db) === value)))){
return cljs.core.reset_BANG_(re_frame.db.app_db,value);
} else {
return null;
}
}));
