// Compiled by ClojureScript 1.10.597 {:static-fns true, :optimize-constants true}
goog.provide('app.events');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.core');
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$app$events_SLASH_init,(function (db,p__13467){
var vec__13468 = p__13467;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13468,(0),null);
var game_data = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13468,(1),null);
return cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([db,game_data,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$app_SLASH_sort_DASH_key,cljs.core.cst$kw$game_SLASH_name,cljs.core.cst$kw$app_SLASH_sort_DASH_dir,cljs.core.cst$kw$asc], null)], 0));
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$app$events_SLASH_sort_DASH_by,(function (db,p__13471){
var vec__13472 = p__13471;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13472,(0),null);
var key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13472,(1),null);
var dir = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13472,(2),null);
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(db,cljs.core.cst$kw$app_SLASH_sort_DASH_key,key,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$app_SLASH_sort_DASH_dir,dir], 0));
}));
