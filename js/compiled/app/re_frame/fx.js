// Compiled by ClojureScript 1.10.773 {:static-fns true, :optimize-constants true}
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
var _STAR_current_trace_STAR__orig_val__13613 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__13614 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$op_DASH_type,cljs.core.cst$kw$event_SLASH_do_DASH_fx], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__13614);

try{try{var effects = cljs.core.cst$kw$effects.cljs$core$IFn$_invoke$arity$1(context);
var effects_without_db = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(effects,cljs.core.cst$kw$db);
var temp__5735__auto___13649 = cljs.core.cst$kw$db.cljs$core$IFn$_invoke$arity$1(effects);
if(cljs.core.truth_(temp__5735__auto___13649)){
var new_db_13650 = temp__5735__auto___13649;
var fexpr__13615_13651 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,cljs.core.cst$kw$db,false);
(fexpr__13615_13651.cljs$core$IFn$_invoke$arity$1 ? fexpr__13615_13651.cljs$core$IFn$_invoke$arity$1(new_db_13650) : fexpr__13615_13651.call(null,new_db_13650));
} else {
}

var seq__13616 = cljs.core.seq(effects_without_db);
var chunk__13617 = null;
var count__13618 = (0);
var i__13619 = (0);
while(true){
if((i__13619 < count__13618)){
var vec__13626 = chunk__13617.cljs$core$IIndexed$_nth$arity$2(null,i__13619);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13626,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13626,(1),null);
var temp__5733__auto___13652 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13652)){
var effect_fn_13653 = temp__5733__auto___13652;
(effect_fn_13653.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13653.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13653.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13654 = seq__13616;
var G__13655 = chunk__13617;
var G__13656 = count__13618;
var G__13657 = (i__13619 + (1));
seq__13616 = G__13654;
chunk__13617 = G__13655;
count__13618 = G__13656;
i__13619 = G__13657;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13616);
if(temp__5735__auto__){
var seq__13616__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13616__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13616__$1);
var G__13658 = cljs.core.chunk_rest(seq__13616__$1);
var G__13659 = c__4556__auto__;
var G__13660 = cljs.core.count(c__4556__auto__);
var G__13661 = (0);
seq__13616 = G__13658;
chunk__13617 = G__13659;
count__13618 = G__13660;
i__13619 = G__13661;
continue;
} else {
var vec__13629 = cljs.core.first(seq__13616__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13629,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13629,(1),null);
var temp__5733__auto___13662 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13662)){
var effect_fn_13663 = temp__5733__auto___13662;
(effect_fn_13663.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13663.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13663.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13664 = cljs.core.next(seq__13616__$1);
var G__13665 = null;
var G__13666 = (0);
var G__13667 = (0);
seq__13616 = G__13664;
chunk__13617 = G__13665;
count__13618 = G__13666;
i__13619 = G__13667;
continue;
}
} else {
return null;
}
}
break;
}
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__13399__auto___13668 = re_frame.interop.now();
var duration__13400__auto___13669 = (end__13399__auto___13668 - cljs.core.cst$kw$start.cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$duration,duration__13400__auto___13669,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$end,re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__13399__auto___13668);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__13613);
}} else {
var effects = cljs.core.cst$kw$effects.cljs$core$IFn$_invoke$arity$1(context);
var effects_without_db = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(effects,cljs.core.cst$kw$db);
var temp__5735__auto___13670 = cljs.core.cst$kw$db.cljs$core$IFn$_invoke$arity$1(effects);
if(cljs.core.truth_(temp__5735__auto___13670)){
var new_db_13671 = temp__5735__auto___13670;
var fexpr__13632_13672 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,cljs.core.cst$kw$db,false);
(fexpr__13632_13672.cljs$core$IFn$_invoke$arity$1 ? fexpr__13632_13672.cljs$core$IFn$_invoke$arity$1(new_db_13671) : fexpr__13632_13672.call(null,new_db_13671));
} else {
}

var seq__13633 = cljs.core.seq(effects_without_db);
var chunk__13634 = null;
var count__13635 = (0);
var i__13636 = (0);
while(true){
if((i__13636 < count__13635)){
var vec__13643 = chunk__13634.cljs$core$IIndexed$_nth$arity$2(null,i__13636);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13643,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13643,(1),null);
var temp__5733__auto___13673 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13673)){
var effect_fn_13674 = temp__5733__auto___13673;
(effect_fn_13674.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13674.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13674.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13675 = seq__13633;
var G__13676 = chunk__13634;
var G__13677 = count__13635;
var G__13678 = (i__13636 + (1));
seq__13633 = G__13675;
chunk__13634 = G__13676;
count__13635 = G__13677;
i__13636 = G__13678;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13633);
if(temp__5735__auto__){
var seq__13633__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13633__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13633__$1);
var G__13679 = cljs.core.chunk_rest(seq__13633__$1);
var G__13680 = c__4556__auto__;
var G__13681 = cljs.core.count(c__4556__auto__);
var G__13682 = (0);
seq__13633 = G__13679;
chunk__13634 = G__13680;
count__13635 = G__13681;
i__13636 = G__13682;
continue;
} else {
var vec__13646 = cljs.core.first(seq__13633__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13646,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13646,(1),null);
var temp__5733__auto___13683 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13683)){
var effect_fn_13684 = temp__5733__auto___13683;
(effect_fn_13684.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13684.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13684.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13685 = cljs.core.next(seq__13633__$1);
var G__13686 = null;
var G__13687 = (0);
var G__13688 = (0);
seq__13633 = G__13685;
chunk__13634 = G__13686;
count__13635 = G__13687;
i__13636 = G__13688;
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
re_frame.fx.dispatch_later = (function re_frame$fx$dispatch_later(p__13689){
var map__13690 = p__13689;
var map__13690__$1 = (((((!((map__13690 == null))))?(((((map__13690.cljs$lang$protocol_mask$partition0$ & (64))) || ((cljs.core.PROTOCOL_SENTINEL === map__13690.cljs$core$ISeq$))))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__13690):map__13690);
var effect = map__13690__$1;
var ms = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13690__$1,cljs.core.cst$kw$ms);
var dispatch = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13690__$1,cljs.core.cst$kw$dispatch);
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
var seq__13692 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__13693 = null;
var count__13694 = (0);
var i__13695 = (0);
while(true){
if((i__13695 < count__13694)){
var effect = chunk__13693.cljs$core$IIndexed$_nth$arity$2(null,i__13695);
re_frame.fx.dispatch_later(effect);


var G__13696 = seq__13692;
var G__13697 = chunk__13693;
var G__13698 = count__13694;
var G__13699 = (i__13695 + (1));
seq__13692 = G__13696;
chunk__13693 = G__13697;
count__13694 = G__13698;
i__13695 = G__13699;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13692);
if(temp__5735__auto__){
var seq__13692__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13692__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13692__$1);
var G__13700 = cljs.core.chunk_rest(seq__13692__$1);
var G__13701 = c__4556__auto__;
var G__13702 = cljs.core.count(c__4556__auto__);
var G__13703 = (0);
seq__13692 = G__13700;
chunk__13693 = G__13701;
count__13694 = G__13702;
i__13695 = G__13703;
continue;
} else {
var effect = cljs.core.first(seq__13692__$1);
re_frame.fx.dispatch_later(effect);


var G__13704 = cljs.core.next(seq__13692__$1);
var G__13705 = null;
var G__13706 = (0);
var G__13707 = (0);
seq__13692 = G__13704;
chunk__13693 = G__13705;
count__13694 = G__13706;
i__13695 = G__13707;
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
var seq__13708 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,seq_of_effects));
var chunk__13709 = null;
var count__13710 = (0);
var i__13711 = (0);
while(true){
if((i__13711 < count__13710)){
var vec__13718 = chunk__13709.cljs$core$IIndexed$_nth$arity$2(null,i__13711);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13718,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13718,(1),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$db,effect_key)){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect should not contain a :db effect"], 0));
} else {
}

var temp__5733__auto___13724 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13724)){
var effect_fn_13725 = temp__5733__auto___13724;
(effect_fn_13725.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13725.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13725.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: in \":fx\" effect found ",effect_key," which has no associated handler. Ignoring."], 0));
}


var G__13726 = seq__13708;
var G__13727 = chunk__13709;
var G__13728 = count__13710;
var G__13729 = (i__13711 + (1));
seq__13708 = G__13726;
chunk__13709 = G__13727;
count__13710 = G__13728;
i__13711 = G__13729;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13708);
if(temp__5735__auto__){
var seq__13708__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13708__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13708__$1);
var G__13730 = cljs.core.chunk_rest(seq__13708__$1);
var G__13731 = c__4556__auto__;
var G__13732 = cljs.core.count(c__4556__auto__);
var G__13733 = (0);
seq__13708 = G__13730;
chunk__13709 = G__13731;
count__13710 = G__13732;
i__13711 = G__13733;
continue;
} else {
var vec__13721 = cljs.core.first(seq__13708__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13721,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13721,(1),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$db,effect_key)){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect should not contain a :db effect"], 0));
} else {
}

var temp__5733__auto___13734 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13734)){
var effect_fn_13735 = temp__5733__auto___13734;
(effect_fn_13735.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13735.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13735.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: in \":fx\" effect found ",effect_key," which has no associated handler. Ignoring."], 0));
}


var G__13736 = cljs.core.next(seq__13708__$1);
var G__13737 = null;
var G__13738 = (0);
var G__13739 = (0);
seq__13708 = G__13736;
chunk__13709 = G__13737;
count__13710 = G__13738;
i__13711 = G__13739;
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
var seq__13740 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__13741 = null;
var count__13742 = (0);
var i__13743 = (0);
while(true){
if((i__13743 < count__13742)){
var event = chunk__13741.cljs$core$IIndexed$_nth$arity$2(null,i__13743);
re_frame.router.dispatch(event);


var G__13744 = seq__13740;
var G__13745 = chunk__13741;
var G__13746 = count__13742;
var G__13747 = (i__13743 + (1));
seq__13740 = G__13744;
chunk__13741 = G__13745;
count__13742 = G__13746;
i__13743 = G__13747;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13740);
if(temp__5735__auto__){
var seq__13740__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13740__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13740__$1);
var G__13748 = cljs.core.chunk_rest(seq__13740__$1);
var G__13749 = c__4556__auto__;
var G__13750 = cljs.core.count(c__4556__auto__);
var G__13751 = (0);
seq__13740 = G__13748;
chunk__13741 = G__13749;
count__13742 = G__13750;
i__13743 = G__13751;
continue;
} else {
var event = cljs.core.first(seq__13740__$1);
re_frame.router.dispatch(event);


var G__13752 = cljs.core.next(seq__13740__$1);
var G__13753 = null;
var G__13754 = (0);
var G__13755 = (0);
seq__13740 = G__13752;
chunk__13741 = G__13753;
count__13742 = G__13754;
i__13743 = G__13755;
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
var seq__13756 = cljs.core.seq(value);
var chunk__13757 = null;
var count__13758 = (0);
var i__13759 = (0);
while(true){
if((i__13759 < count__13758)){
var event = chunk__13757.cljs$core$IIndexed$_nth$arity$2(null,i__13759);
(clear_event.cljs$core$IFn$_invoke$arity$1 ? clear_event.cljs$core$IFn$_invoke$arity$1(event) : clear_event.call(null,event));


var G__13760 = seq__13756;
var G__13761 = chunk__13757;
var G__13762 = count__13758;
var G__13763 = (i__13759 + (1));
seq__13756 = G__13760;
chunk__13757 = G__13761;
count__13758 = G__13762;
i__13759 = G__13763;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13756);
if(temp__5735__auto__){
var seq__13756__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13756__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13756__$1);
var G__13764 = cljs.core.chunk_rest(seq__13756__$1);
var G__13765 = c__4556__auto__;
var G__13766 = cljs.core.count(c__4556__auto__);
var G__13767 = (0);
seq__13756 = G__13764;
chunk__13757 = G__13765;
count__13758 = G__13766;
i__13759 = G__13767;
continue;
} else {
var event = cljs.core.first(seq__13756__$1);
(clear_event.cljs$core$IFn$_invoke$arity$1 ? clear_event.cljs$core$IFn$_invoke$arity$1(event) : clear_event.call(null,event));


var G__13768 = cljs.core.next(seq__13756__$1);
var G__13769 = null;
var G__13770 = (0);
var G__13771 = (0);
seq__13756 = G__13768;
chunk__13757 = G__13769;
count__13758 = G__13770;
i__13759 = G__13771;
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
