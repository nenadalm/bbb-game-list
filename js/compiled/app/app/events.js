// Compiled by ClojureScript 1.10.866 {:static-fns true, :optimize-constants true, :optimizations :advanced}
goog.provide('app.events');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.core');
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$app$events_SLASH_init,(function (db,p__13945){
var vec__13946 = p__13945;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13946,(0),null);
var game_data = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13946,(1),null);
return cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([db,game_data,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$app_SLASH_sort_DASH_key,cljs.core.cst$kw$game_SLASH_name,cljs.core.cst$kw$app_SLASH_sort_DASH_dir,cljs.core.cst$kw$asc], null)], 0));
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$app$events_SLASH_sort_DASH_by,(function (db,p__13949){
var vec__13950 = p__13949;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13950,(0),null);
var key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13950,(1),null);
var dir = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13950,(2),null);
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(db,cljs.core.cst$kw$app_SLASH_sort_DASH_key,key,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$app_SLASH_sort_DASH_dir,dir], 0));
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$app$events_SLASH_show_DASH_only_DASH_new,(function (db,p__13953){
var vec__13954 = p__13953;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13954,(0),null);
var only_new = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13954,(1),null);
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(db,cljs.core.cst$kw$app$filter_SLASH_only_DASH_new,only_new);
}));
