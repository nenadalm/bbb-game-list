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
var _STAR_current_trace_STAR__orig_val__13609 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__13610 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$op_DASH_type,cljs.core.cst$kw$event_SLASH_do_DASH_fx], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__13610);

try{try{var effects = cljs.core.cst$kw$effects.cljs$core$IFn$_invoke$arity$1(context);
var effects_without_db = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(effects,cljs.core.cst$kw$db);
var temp__5735__auto___13645 = cljs.core.cst$kw$db.cljs$core$IFn$_invoke$arity$1(effects);
if(cljs.core.truth_(temp__5735__auto___13645)){
var new_db_13646 = temp__5735__auto___13645;
var fexpr__13611_13647 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,cljs.core.cst$kw$db,false);
(fexpr__13611_13647.cljs$core$IFn$_invoke$arity$1 ? fexpr__13611_13647.cljs$core$IFn$_invoke$arity$1(new_db_13646) : fexpr__13611_13647.call(null,new_db_13646));
} else {
}

var seq__13612 = cljs.core.seq(effects_without_db);
var chunk__13613 = null;
var count__13614 = (0);
var i__13615 = (0);
while(true){
if((i__13615 < count__13614)){
var vec__13622 = chunk__13613.cljs$core$IIndexed$_nth$arity$2(null,i__13615);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13622,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13622,(1),null);
var temp__5733__auto___13648 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13648)){
var effect_fn_13649 = temp__5733__auto___13648;
(effect_fn_13649.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13649.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13649.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13650 = seq__13612;
var G__13651 = chunk__13613;
var G__13652 = count__13614;
var G__13653 = (i__13615 + (1));
seq__13612 = G__13650;
chunk__13613 = G__13651;
count__13614 = G__13652;
i__13615 = G__13653;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13612);
if(temp__5735__auto__){
var seq__13612__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13612__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13612__$1);
var G__13654 = cljs.core.chunk_rest(seq__13612__$1);
var G__13655 = c__4556__auto__;
var G__13656 = cljs.core.count(c__4556__auto__);
var G__13657 = (0);
seq__13612 = G__13654;
chunk__13613 = G__13655;
count__13614 = G__13656;
i__13615 = G__13657;
continue;
} else {
var vec__13625 = cljs.core.first(seq__13612__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13625,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13625,(1),null);
var temp__5733__auto___13658 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13658)){
var effect_fn_13659 = temp__5733__auto___13658;
(effect_fn_13659.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13659.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13659.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13660 = cljs.core.next(seq__13612__$1);
var G__13661 = null;
var G__13662 = (0);
var G__13663 = (0);
seq__13612 = G__13660;
chunk__13613 = G__13661;
count__13614 = G__13662;
i__13615 = G__13663;
continue;
}
} else {
return null;
}
}
break;
}
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__13395__auto___13664 = re_frame.interop.now();
var duration__13396__auto___13665 = (end__13395__auto___13664 - cljs.core.cst$kw$start.cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,cljs.core.cst$kw$duration,duration__13396__auto___13665,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$end,re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__13395__auto___13664);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__13609);
}} else {
var effects = cljs.core.cst$kw$effects.cljs$core$IFn$_invoke$arity$1(context);
var effects_without_db = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(effects,cljs.core.cst$kw$db);
var temp__5735__auto___13666 = cljs.core.cst$kw$db.cljs$core$IFn$_invoke$arity$1(effects);
if(cljs.core.truth_(temp__5735__auto___13666)){
var new_db_13667 = temp__5735__auto___13666;
var fexpr__13628_13668 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,cljs.core.cst$kw$db,false);
(fexpr__13628_13668.cljs$core$IFn$_invoke$arity$1 ? fexpr__13628_13668.cljs$core$IFn$_invoke$arity$1(new_db_13667) : fexpr__13628_13668.call(null,new_db_13667));
} else {
}

var seq__13629 = cljs.core.seq(effects_without_db);
var chunk__13630 = null;
var count__13631 = (0);
var i__13632 = (0);
while(true){
if((i__13632 < count__13631)){
var vec__13639 = chunk__13630.cljs$core$IIndexed$_nth$arity$2(null,i__13632);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13639,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13639,(1),null);
var temp__5733__auto___13669 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13669)){
var effect_fn_13670 = temp__5733__auto___13669;
(effect_fn_13670.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13670.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13670.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13671 = seq__13629;
var G__13672 = chunk__13630;
var G__13673 = count__13631;
var G__13674 = (i__13632 + (1));
seq__13629 = G__13671;
chunk__13630 = G__13672;
count__13631 = G__13673;
i__13632 = G__13674;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13629);
if(temp__5735__auto__){
var seq__13629__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13629__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13629__$1);
var G__13675 = cljs.core.chunk_rest(seq__13629__$1);
var G__13676 = c__4556__auto__;
var G__13677 = cljs.core.count(c__4556__auto__);
var G__13678 = (0);
seq__13629 = G__13675;
chunk__13630 = G__13676;
count__13631 = G__13677;
i__13632 = G__13678;
continue;
} else {
var vec__13642 = cljs.core.first(seq__13629__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13642,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13642,(1),null);
var temp__5733__auto___13679 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13679)){
var effect_fn_13680 = temp__5733__auto___13679;
(effect_fn_13680.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13680.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13680.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring."], 0));
}


var G__13681 = cljs.core.next(seq__13629__$1);
var G__13682 = null;
var G__13683 = (0);
var G__13684 = (0);
seq__13629 = G__13681;
chunk__13630 = G__13682;
count__13631 = G__13683;
i__13632 = G__13684;
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
re_frame.fx.dispatch_later = (function re_frame$fx$dispatch_later(p__13685){
var map__13686 = p__13685;
var map__13686__$1 = (((((!((map__13686 == null))))?(((((map__13686.cljs$lang$protocol_mask$partition0$ & (64))) || ((cljs.core.PROTOCOL_SENTINEL === map__13686.cljs$core$ISeq$))))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__13686):map__13686);
var effect = map__13686__$1;
var ms = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13686__$1,cljs.core.cst$kw$ms);
var dispatch = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13686__$1,cljs.core.cst$kw$dispatch);
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
var seq__13688 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__13689 = null;
var count__13690 = (0);
var i__13691 = (0);
while(true){
if((i__13691 < count__13690)){
var effect = chunk__13689.cljs$core$IIndexed$_nth$arity$2(null,i__13691);
re_frame.fx.dispatch_later(effect);


var G__13692 = seq__13688;
var G__13693 = chunk__13689;
var G__13694 = count__13690;
var G__13695 = (i__13691 + (1));
seq__13688 = G__13692;
chunk__13689 = G__13693;
count__13690 = G__13694;
i__13691 = G__13695;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13688);
if(temp__5735__auto__){
var seq__13688__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13688__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13688__$1);
var G__13696 = cljs.core.chunk_rest(seq__13688__$1);
var G__13697 = c__4556__auto__;
var G__13698 = cljs.core.count(c__4556__auto__);
var G__13699 = (0);
seq__13688 = G__13696;
chunk__13689 = G__13697;
count__13690 = G__13698;
i__13691 = G__13699;
continue;
} else {
var effect = cljs.core.first(seq__13688__$1);
re_frame.fx.dispatch_later(effect);


var G__13700 = cljs.core.next(seq__13688__$1);
var G__13701 = null;
var G__13702 = (0);
var G__13703 = (0);
seq__13688 = G__13700;
chunk__13689 = G__13701;
count__13690 = G__13702;
i__13691 = G__13703;
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
var seq__13704 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,seq_of_effects));
var chunk__13705 = null;
var count__13706 = (0);
var i__13707 = (0);
while(true){
if((i__13707 < count__13706)){
var vec__13714 = chunk__13705.cljs$core$IIndexed$_nth$arity$2(null,i__13707);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13714,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13714,(1),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$db,effect_key)){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect should not contain a :db effect"], 0));
} else {
}

var temp__5733__auto___13720 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13720)){
var effect_fn_13721 = temp__5733__auto___13720;
(effect_fn_13721.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13721.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13721.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: in \":fx\" effect found ",effect_key," which has no associated handler. Ignoring."], 0));
}


var G__13722 = seq__13704;
var G__13723 = chunk__13705;
var G__13724 = count__13706;
var G__13725 = (i__13707 + (1));
seq__13704 = G__13722;
chunk__13705 = G__13723;
count__13706 = G__13724;
i__13707 = G__13725;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13704);
if(temp__5735__auto__){
var seq__13704__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13704__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13704__$1);
var G__13726 = cljs.core.chunk_rest(seq__13704__$1);
var G__13727 = c__4556__auto__;
var G__13728 = cljs.core.count(c__4556__auto__);
var G__13729 = (0);
seq__13704 = G__13726;
chunk__13705 = G__13727;
count__13706 = G__13728;
i__13707 = G__13729;
continue;
} else {
var vec__13717 = cljs.core.first(seq__13704__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13717,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13717,(1),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$db,effect_key)){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect should not contain a :db effect"], 0));
} else {
}

var temp__5733__auto___13730 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5733__auto___13730)){
var effect_fn_13731 = temp__5733__auto___13730;
(effect_fn_13731.cljs$core$IFn$_invoke$arity$1 ? effect_fn_13731.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_13731.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$warn,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: in \":fx\" effect found ",effect_key," which has no associated handler. Ignoring."], 0));
}


var G__13732 = cljs.core.next(seq__13704__$1);
var G__13733 = null;
var G__13734 = (0);
var G__13735 = (0);
seq__13704 = G__13732;
chunk__13705 = G__13733;
count__13706 = G__13734;
i__13707 = G__13735;
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
var seq__13736 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__13737 = null;
var count__13738 = (0);
var i__13739 = (0);
while(true){
if((i__13739 < count__13738)){
var event = chunk__13737.cljs$core$IIndexed$_nth$arity$2(null,i__13739);
re_frame.router.dispatch(event);


var G__13740 = seq__13736;
var G__13741 = chunk__13737;
var G__13742 = count__13738;
var G__13743 = (i__13739 + (1));
seq__13736 = G__13740;
chunk__13737 = G__13741;
count__13738 = G__13742;
i__13739 = G__13743;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13736);
if(temp__5735__auto__){
var seq__13736__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13736__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13736__$1);
var G__13744 = cljs.core.chunk_rest(seq__13736__$1);
var G__13745 = c__4556__auto__;
var G__13746 = cljs.core.count(c__4556__auto__);
var G__13747 = (0);
seq__13736 = G__13744;
chunk__13737 = G__13745;
count__13738 = G__13746;
i__13739 = G__13747;
continue;
} else {
var event = cljs.core.first(seq__13736__$1);
re_frame.router.dispatch(event);


var G__13748 = cljs.core.next(seq__13736__$1);
var G__13749 = null;
var G__13750 = (0);
var G__13751 = (0);
seq__13736 = G__13748;
chunk__13737 = G__13749;
count__13738 = G__13750;
i__13739 = G__13751;
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
var seq__13752 = cljs.core.seq(value);
var chunk__13753 = null;
var count__13754 = (0);
var i__13755 = (0);
while(true){
if((i__13755 < count__13754)){
var event = chunk__13753.cljs$core$IIndexed$_nth$arity$2(null,i__13755);
(clear_event.cljs$core$IFn$_invoke$arity$1 ? clear_event.cljs$core$IFn$_invoke$arity$1(event) : clear_event.call(null,event));


var G__13756 = seq__13752;
var G__13757 = chunk__13753;
var G__13758 = count__13754;
var G__13759 = (i__13755 + (1));
seq__13752 = G__13756;
chunk__13753 = G__13757;
count__13754 = G__13758;
i__13755 = G__13759;
continue;
} else {
var temp__5735__auto__ = cljs.core.seq(seq__13752);
if(temp__5735__auto__){
var seq__13752__$1 = temp__5735__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__13752__$1)){
var c__4556__auto__ = cljs.core.chunk_first(seq__13752__$1);
var G__13760 = cljs.core.chunk_rest(seq__13752__$1);
var G__13761 = c__4556__auto__;
var G__13762 = cljs.core.count(c__4556__auto__);
var G__13763 = (0);
seq__13752 = G__13760;
chunk__13753 = G__13761;
count__13754 = G__13762;
i__13755 = G__13763;
continue;
} else {
var event = cljs.core.first(seq__13752__$1);
(clear_event.cljs$core$IFn$_invoke$arity$1 ? clear_event.cljs$core$IFn$_invoke$arity$1(event) : clear_event.call(null,event));


var G__13764 = cljs.core.next(seq__13752__$1);
var G__13765 = null;
var G__13766 = (0);
var G__13767 = (0);
seq__13752 = G__13764;
chunk__13753 = G__13765;
count__13754 = G__13766;
i__13755 = G__13767;
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
