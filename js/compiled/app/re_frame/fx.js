// Compiled by ClojureScript 1.10.866 {:static-fns true, :optimize-constants true, :optimizations :advanced}
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
 *   You cannot rely on the ordering in which effects are executed, other than that
 *   `:db` is guaranteed to be executed first.
 */
re_frame.fx.do_fx = re_frame.interceptor.__GT_interceptor.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$id,cljs.core.cst$kw$do_DASH_fx,cljs.core.cst$kw$after,(function re_frame$fx$do_fx_after(context){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var _STAR_current_trace_STAR__orig_val__13487 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__13488 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$op_DASH_type,cljs.core.cst$kw$event_SLASH_do_DASH_fx], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__13488);

try{try{var effects = cljs.core.cst$kw$effects.cljs$core$IFn$_invoke$arity$1(context);
var effects_without_db = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(effects,cljs.core.cst$kw$db);
var temp__5753__auto___13523 = cljs.core.cst$kw$db.cljs$core$IFn$_invoke$arity$1(effects);
if(cljs.core.truth_(temp__5753__auto___13523)){
var new_db_13524 = temp__5753__auto___13523;
var fexpr__13489_13525 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,cljs.core.cst$kw$db,false);
(fexpr__13489_13525.cljs$core$IFn$_invoke$arity$1 ? fexpr__13489_13525.cljs$core$IFn$_invoke$arity$1(new_db_13524) : fexpr__13489_13525.call(null,new_db_13524));
} else {
}

var seq__13490 = cljs.core.seq(effects_without_db);
var chunk__13491 = null;
var count__13492 = (0);
var i__13493 = (0);
while(true){
if((i__13493 < count__13492)){
var vec__13500 = chunk__13491.cljs$core$IIndexed$_nth$arity$2(null,i__13493);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13500,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13500,(1),null);
var temp__5751__auto___13526 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5751__auto___13526)){
var effect_fn_13527 = temp__5751__auto___13526;
(effect_fn_13527.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13527.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13527.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13528 = seq__13490;
var G__13529 = chunk__13491;
var G__13530 = count__13492;
var G__13531 = (i__13493 + (1));
seq__13490 = G__13528;
chunk__13491 = G__13529;
count__13492 = G__13530;
i__13493 = G__13531;
continue;
} else {
var temp__5753__auto__ = cljs.core.seq(seq__13490);
if(temp__5753__auto__){
var seq__13490__$1 = temp__5753__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13490__$1)){
var c__4649__auto__ = cljs.core.chunk_first(seq__13490__$1);
var G__13532 = cljs.core.chunk_rest(seq__13490__$1);
var G__13533 = c__4649__auto__;
var G__13534 = cljs.core.count(c__4649__auto__);
var G__13535 = (0);
seq__13490 = G__13532;
chunk__13491 = G__13533;
count__13492 = G__13534;
i__13493 = G__13535;
continue;
} else {
var vec__13503 = cljs.core.first(seq__13490__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13503,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13503,(1),null);
var temp__5751__auto___13536 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5751__auto___13536)){
var effect_fn_13537 = temp__5751__auto___13536;
(effect_fn_13537.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13537.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13537.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13538 = cljs.core.next(seq__13490__$1);
var G__13539 = null;
var G__13540 = (0);
var G__13541 = (0);
seq__13490 = G__13538;
chunk__13491 = G__13539;
count__13492 = G__13540;
i__13493 = G__13541;
continue;
}
} else {
return null;
}
}
break;
}
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__13276__auto___13542 = re_frame.interop.now();
var duration__13277__auto___13543 = (end__13276__auto___13542 - cljs.core.cst$kw$start.cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$duration,duration__13277__auto___13543,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$end,re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__13276__auto___13542);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__13487);
}} else {
var effects = cljs.core.cst$kw$effects.cljs$core$IFn$_invoke$arity$1(context);
var effects_without_db = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(effects,cljs.core.cst$kw$db);
var temp__5753__auto___13544 = cljs.core.cst$kw$db.cljs$core$IFn$_invoke$arity$1(effects);
if(cljs.core.truth_(temp__5753__auto___13544)){
var new_db_13545 = temp__5753__auto___13544;
var fexpr__13506_13546 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,cljs.core.cst$kw$db,false);
(fexpr__13506_13546.cljs$core$IFn$_invoke$arity$1 ? fexpr__13506_13546.cljs$core$IFn$_invoke$arity$1(new_db_13545) : fexpr__13506_13546.call(null,new_db_13545));
} else {
}

var seq__13507 = cljs.core.seq(effects_without_db);
var chunk__13508 = null;
var count__13509 = (0);
var i__13510 = (0);
while(true){
if((i__13510 < count__13509)){
var vec__13517 = chunk__13508.cljs$core$IIndexed$_nth$arity$2(null,i__13510);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13517,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13517,(1),null);
var temp__5751__auto___13547 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5751__auto___13547)){
var effect_fn_13548 = temp__5751__auto___13547;
(effect_fn_13548.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13548.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13548.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13549 = seq__13507;
var G__13550 = chunk__13508;
var G__13551 = count__13509;
var G__13552 = (i__13510 + (1));
seq__13507 = G__13549;
chunk__13508 = G__13550;
count__13509 = G__13551;
i__13510 = G__13552;
continue;
} else {
var temp__5753__auto__ = cljs.core.seq(seq__13507);
if(temp__5753__auto__){
var seq__13507__$1 = temp__5753__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13507__$1)){
var c__4649__auto__ = cljs.core.chunk_first(seq__13507__$1);
var G__13553 = cljs.core.chunk_rest(seq__13507__$1);
var G__13554 = c__4649__auto__;
var G__13555 = cljs.core.count(c__4649__auto__);
var G__13556 = (0);
seq__13507 = G__13553;
chunk__13508 = G__13554;
count__13509 = G__13555;
i__13510 = G__13556;
continue;
} else {
var vec__13520 = cljs.core.first(seq__13507__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13520,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13520,(1),null);
var temp__5751__auto___13557 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5751__auto___13557)){
var effect_fn_13558 = temp__5751__auto___13557;
(effect_fn_13558.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13558.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13558.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13559 = cljs.core.next(seq__13507__$1);
var G__13560 = null;
var G__13561 = (0);
var G__13562 = (0);
seq__13507 = G__13559;
chunk__13508 = G__13560;
count__13509 = G__13561;
i__13510 = G__13562;
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
re_frame.fx.dispatch_later = (function re_frame$fx$dispatch_later(p__13563){
var map__13564 = p__13563;
var map__13564__$1 = cljs.core.__destructure_map(map__13564);
var effect = map__13564__$1;
var ms = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13564__$1,cljs.core.cst$kw$ms);
var dispatch = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13564__$1,cljs.core.cst$kw$dispatch);
if(((cljs.core.empty_QMARK_(dispatch)) || ((!(typeof ms === 'number'))))){
return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: ignoring bad :dispatch-later value:",effect], 0));
} else {
return re_frame.interop.set_timeout_BANG_((function (){
return re_frame.router.dispatch(dispatch);
}),ms);
}
});
re_frame.fx.reg_fx(cljs.core.cst$kw$dispatch_DASH_later,(function (value){
if(cljs.core.map_QMARK_(value)){
return re_frame.fx.dispatch_later(value);
} else {
var seq__13565 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__13566 = null;
var count__13567 = (0);
var i__13568 = (0);
while(true){
if((i__13568 < count__13567)){
var effect = chunk__13566.cljs$core$IIndexed$_nth$arity$2(null,i__13568);
re_frame.fx.dispatch_later(effect);


var G__13569 = seq__13565;
var G__13570 = chunk__13566;
var G__13571 = count__13567;
var G__13572 = (i__13568 + (1));
seq__13565 = G__13569;
chunk__13566 = G__13570;
count__13567 = G__13571;
i__13568 = G__13572;
continue;
} else {
var temp__5753__auto__ = cljs.core.seq(seq__13565);
if(temp__5753__auto__){
var seq__13565__$1 = temp__5753__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13565__$1)){
var c__4649__auto__ = cljs.core.chunk_first(seq__13565__$1);
var G__13573 = cljs.core.chunk_rest(seq__13565__$1);
var G__13574 = c__4649__auto__;
var G__13575 = cljs.core.count(c__4649__auto__);
var G__13576 = (0);
seq__13565 = G__13573;
chunk__13566 = G__13574;
count__13567 = G__13575;
i__13568 = G__13576;
continue;
} else {
var effect = cljs.core.first(seq__13565__$1);
re_frame.fx.dispatch_later(effect);


var G__13577 = cljs.core.next(seq__13565__$1);
var G__13578 = null;
var G__13579 = (0);
var G__13580 = (0);
seq__13565 = G__13577;
chunk__13566 = G__13578;
count__13567 = G__13579;
i__13568 = G__13580;
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
re_frame.fx.reg_fx(cljs.core.cst$kw$fx,(function (seq_of_effects){
if((!(cljs.core.sequential_QMARK_(seq_of_effects)))){
return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$error,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect expects a seq, but was given ",cljs.core.type(seq_of_effects)], 0));
} else {
var seq__13581 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,seq_of_effects));
var chunk__13582 = null;
var count__13583 = (0);
var i__13584 = (0);
while(true){
if((i__13584 < count__13583)){
var vec__13591 = chunk__13582.cljs$core$IIndexed$_nth$arity$2(null,i__13584);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13591,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13591,(1),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$db,effect_key)){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect should not contain a :db effect"], 0));
} else {
}

var temp__5751__auto___13597 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5751__auto___13597)){
var effect_fn_13598 = temp__5751__auto___13597;
(effect_fn_13598.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13598.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13598.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: in \":fx\" effect found ",effect_key," which has no associated handler. Ignoring."], 0));
}


var G__13599 = seq__13581;
var G__13600 = chunk__13582;
var G__13601 = count__13583;
var G__13602 = (i__13584 + (1));
seq__13581 = G__13599;
chunk__13582 = G__13600;
count__13583 = G__13601;
i__13584 = G__13602;
continue;
} else {
var temp__5753__auto__ = cljs.core.seq(seq__13581);
if(temp__5753__auto__){
var seq__13581__$1 = temp__5753__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13581__$1)){
var c__4649__auto__ = cljs.core.chunk_first(seq__13581__$1);
var G__13603 = cljs.core.chunk_rest(seq__13581__$1);
var G__13604 = c__4649__auto__;
var G__13605 = cljs.core.count(c__4649__auto__);
var G__13606 = (0);
seq__13581 = G__13603;
chunk__13582 = G__13604;
count__13583 = G__13605;
i__13584 = G__13606;
continue;
} else {
var vec__13594 = cljs.core.first(seq__13581__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13594,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13594,(1),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$db,effect_key)){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect should not contain a :db effect"], 0));
} else {
}

var temp__5751__auto___13607 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5751__auto___13607)){
var effect_fn_13608 = temp__5751__auto___13607;
(effect_fn_13608.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13608.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13608.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: in \":fx\" effect found ",effect_key," which has no associated handler. Ignoring."], 0));
}


var G__13609 = cljs.core.next(seq__13581__$1);
var G__13610 = null;
var G__13611 = (0);
var G__13612 = (0);
seq__13581 = G__13609;
chunk__13582 = G__13610;
count__13583 = G__13611;
i__13584 = G__13612;
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
var seq__13613 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__13614 = null;
var count__13615 = (0);
var i__13616 = (0);
while(true){
if((i__13616 < count__13615)){
var event = chunk__13614.cljs$core$IIndexed$_nth$arity$2(null,i__13616);
re_frame.router.dispatch(event);


var G__13617 = seq__13613;
var G__13618 = chunk__13614;
var G__13619 = count__13615;
var G__13620 = (i__13616 + (1));
seq__13613 = G__13617;
chunk__13614 = G__13618;
count__13615 = G__13619;
i__13616 = G__13620;
continue;
} else {
var temp__5753__auto__ = cljs.core.seq(seq__13613);
if(temp__5753__auto__){
var seq__13613__$1 = temp__5753__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13613__$1)){
var c__4649__auto__ = cljs.core.chunk_first(seq__13613__$1);
var G__13621 = cljs.core.chunk_rest(seq__13613__$1);
var G__13622 = c__4649__auto__;
var G__13623 = cljs.core.count(c__4649__auto__);
var G__13624 = (0);
seq__13613 = G__13621;
chunk__13614 = G__13622;
count__13615 = G__13623;
i__13616 = G__13624;
continue;
} else {
var event = cljs.core.first(seq__13613__$1);
re_frame.router.dispatch(event);


var G__13625 = cljs.core.next(seq__13613__$1);
var G__13626 = null;
var G__13627 = (0);
var G__13628 = (0);
seq__13613 = G__13625;
chunk__13614 = G__13626;
count__13615 = G__13627;
i__13616 = G__13628;
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
var seq__13629 = cljs.core.seq(value);
var chunk__13630 = null;
var count__13631 = (0);
var i__13632 = (0);
while(true){
if((i__13632 < count__13631)){
var event = chunk__13630.cljs$core$IIndexed$_nth$arity$2(null,i__13632);
(clear_event.cljs$core$IFn$_invoke$arity$1 ? clear_event.cljs$core$IFn$_invoke$arity$1(event) : clear_event.call(null,event));


var G__13633 = seq__13629;
var G__13634 = chunk__13630;
var G__13635 = count__13631;
var G__13636 = (i__13632 + (1));
seq__13629 = G__13633;
chunk__13630 = G__13634;
count__13631 = G__13635;
i__13632 = G__13636;
continue;
} else {
var temp__5753__auto__ = cljs.core.seq(seq__13629);
if(temp__5753__auto__){
var seq__13629__$1 = temp__5753__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13629__$1)){
var c__4649__auto__ = cljs.core.chunk_first(seq__13629__$1);
var G__13637 = cljs.core.chunk_rest(seq__13629__$1);
var G__13638 = c__4649__auto__;
var G__13639 = cljs.core.count(c__4649__auto__);
var G__13640 = (0);
seq__13629 = G__13637;
chunk__13630 = G__13638;
count__13631 = G__13639;
i__13632 = G__13640;
continue;
} else {
var event = cljs.core.first(seq__13629__$1);
(clear_event.cljs$core$IFn$_invoke$arity$1 ? clear_event.cljs$core$IFn$_invoke$arity$1(event) : clear_event.call(null,event));


var G__13641 = cljs.core.next(seq__13629__$1);
var G__13642 = null;
var G__13643 = (0);
var G__13644 = (0);
seq__13629 = G__13641;
chunk__13630 = G__13642;
count__13631 = G__13643;
i__13632 = G__13644;
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
