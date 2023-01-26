// Compiled by ClojureScript 1.10.866 {:static-fns true, :optimize-constants true, :optimizations :advanced}
goog.provide('app.subs');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.core');
re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$app$subs_SLASH_game_DASH_list,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([(function (db,_){
var sort_key = cljs.core.cst$kw$app_SLASH_sort_DASH_key.cljs$core$IFn$_invoke$arity$1(db);
var sort_dir = cljs.core.cst$kw$app_SLASH_sort_DASH_dir.cljs$core$IFn$_invoke$arity$1(db);
var asc_ordered_ids = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$game_DASH_list_SLASH_sorting,sort_key], null));
var ordered_ids = ((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$asc,sort_dir))?asc_ordered_ids:cljs.core.rseq(asc_ordered_ids));
var games = cljs.core.cst$kw$game_DASH_list_SLASH_games.cljs$core$IFn$_invoke$arity$1(db);
var filter_f = (cljs.core.truth_(cljs.core.cst$kw$app$filter_SLASH_only_DASH_new.cljs$core$IFn$_invoke$arity$1(db))?cljs.core.cst$kw$new:cljs.core.constantly(true));
if(cljs.core.truth_(ordered_ids)){
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$3((function (sorted_list,next_game_id){
var game = (games.cljs$core$IFn$_invoke$arity$1 ? games.cljs$core$IFn$_invoke$arity$1(next_game_id) : games.call(null,next_game_id));
if(cljs.core.truth_((filter_f.cljs$core$IFn$_invoke$arity$1 ? filter_f.cljs$core$IFn$_invoke$arity$1(game) : filter_f.call(null,game)))){
return cljs.core.conj.cljs$core$IFn$_invoke$arity$2(sorted_list,game);
} else {
return sorted_list;
}
}),cljs.core.PersistentVector.EMPTY,ordered_ids);
} else {
console.error("Cannot sort games properly.");

return cljs.core.vals(games);
}
})], 0));
re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$app$subs_SLASH_sorting,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([(function (db,_){
return cljs.core.select_keys(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$app_SLASH_sort_DASH_dir,cljs.core.cst$kw$app_SLASH_sort_DASH_key], null));
})], 0));
re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$variadic(cljs.core.cst$kw$app$subs_SLASH_feature_DASH_enabled,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([(function (db,p__13943){
var vec__13944 = p__13943;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13944,(0),null);
var feature = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13944,(1),null);
return cljs.core.boolean$((function (){var G__13947 = cljs.core.cst$kw$app_SLASH_features.cljs$core$IFn$_invoke$arity$1(db);
return (feature.cljs$core$IFn$_invoke$arity$1 ? feature.cljs$core$IFn$_invoke$arity$1(G__13947) : feature.call(null,G__13947));
})());
})], 0));
