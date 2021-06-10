// Compiled by ClojureScript 1.10.866 {:static-fns true, :optimize-constants true, :optimizations :advanced}
goog.provide('app.events');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.core');
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$app$events_SLASH_init,(function (db,p__13943){
var vec__13944 = p__13943;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13944,(0),null);
var game_data = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13944,(1),null);
return cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([db,game_data,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$app_SLASH_sort_DASH_key,cljs.core.cst$kw$game_SLASH_name,cljs.core.cst$kw$app_SLASH_sort_DASH_dir,cljs.core.cst$kw$asc], null)], 0));
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$app$events_SLASH_sort_DASH_by,(function (db,p__13947){
var vec__13948 = p__13947;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13948,(0),null);
var key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13948,(1),null);
var dir = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13948,(2),null);
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(db,cljs.core.cst$kw$app_SLASH_sort_DASH_key,key,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.cst$kw$app_SLASH_sort_DASH_dir,dir], 0));
}));
