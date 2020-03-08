// Compiled by ClojureScript 1.10.597 {:static-fns true, :optimize-constants true}
goog.provide('app.subs');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.core');
var G__13457_13459 = cljs.core.cst$kw$app$subs_SLASH_game_DASH_list;
var G__13458_13460 = (function (db,_){
var sort_key = cljs.core.cst$kw$app_SLASH_sort_DASH_key.cljs$core$IFn$_invoke$arity$1(db);
var sort_dir = cljs.core.cst$kw$app_SLASH_sort_DASH_dir.cljs$core$IFn$_invoke$arity$1(db);
var asc_ordered_ids = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$game_DASH_list_SLASH_sorting,sort_key], null));
var ordered_ids = ((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$asc,sort_dir))?asc_ordered_ids:cljs.core.rseq(asc_ordered_ids));
var games = cljs.core.cst$kw$game_DASH_list_SLASH_games.cljs$core$IFn$_invoke$arity$1(db);
if(cljs.core.truth_(ordered_ids)){
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$3((function (sorted_list,next_game_id){
return cljs.core.conj.cljs$core$IFn$_invoke$arity$2(sorted_list,(games.cljs$core$IFn$_invoke$arity$1 ? games.cljs$core$IFn$_invoke$arity$1(next_game_id) : games.call(null,next_game_id)));
}),cljs.core.PersistentVector.EMPTY,ordered_ids);
} else {
console.error("Cannot sort games properly.");

return cljs.core.vals(games);
}
});
(re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$2 ? re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$2(G__13457_13459,G__13458_13460) : re_frame.core.reg_sub.call(null,G__13457_13459,G__13458_13460));
var G__13461_13463 = cljs.core.cst$kw$app$subs_SLASH_sorting;
var G__13462_13464 = (function (db,_){
return cljs.core.select_keys(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$app_SLASH_sort_DASH_dir,cljs.core.cst$kw$app_SLASH_sort_DASH_key], null));
});
(re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$2 ? re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$2(G__13461_13463,G__13462_13464) : re_frame.core.reg_sub.call(null,G__13461_13463,G__13462_13464));
