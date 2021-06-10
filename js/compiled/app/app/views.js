// Compiled by ClojureScript 1.10.866 {:static-fns true, :optimize-constants true, :optimizations :advanced}
goog.provide('app.views');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('re_frame.core');
goog.require('goog.string');
goog.require('app.subs');
goog.require('app.events');
goog.require('app.components.icons.views');
app.views.min_players = (function app$views$min_players(data){
return cljs.core.cst$kw$com$boardgamegeek$boardgame_SLASH_min_DASH_players.cljs$core$IFn$_invoke$arity$1(data);
});
app.views.max_players = (function app$views$max_players(data){
return cljs.core.cst$kw$com$boardgamegeek$boardgame_SLASH_max_DASH_players.cljs$core$IFn$_invoke$arity$1(data);
});
app.views.min_play_time = (function app$views$min_play_time(data){
var temp__5753__auto__ = cljs.core.cst$kw$com$boardgamegeek$boardgame_SLASH_min_DASH_play_DASH_time.cljs$core$IFn$_invoke$arity$1(data);
if(cljs.core.truth_(temp__5753__auto__)){
var x = temp__5753__auto__;
return [cljs.core.str.cljs$core$IFn$_invoke$arity$1(x)," min."].join('');
} else {
return null;
}
});
app.views.max_play_time = (function app$views$max_play_time(data){
var temp__5753__auto__ = cljs.core.cst$kw$com$boardgamegeek$boardgame_SLASH_max_DASH_play_DASH_time.cljs$core$IFn$_invoke$arity$1(data);
if(cljs.core.truth_(temp__5753__auto__)){
var x = temp__5753__auto__;
return [cljs.core.str.cljs$core$IFn$_invoke$arity$1(x)," min."].join('');
} else {
return null;
}
});
app.views.thumbnail = (function app$views$thumbnail(data){
var temp__5753__auto__ = cljs.core.cst$kw$com$boardgamegeek$boardgame_SLASH_thumbnail.cljs$core$IFn$_invoke$arity$1(data);
if(cljs.core.truth_(temp__5753__auto__)){
var thumbnail = temp__5753__auto__;
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$img,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$src,thumbnail], null)], null);
} else {
return null;
}
});
app.views.languages = (function app$views$languages(data){
var temp__5753__auto__ = cljs.core.cst$kw$languages.cljs$core$IFn$_invoke$arity$1(data);
if(cljs.core.truth_(temp__5753__auto__)){
var languages = temp__5753__auto__;
return cljs.core.into.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$_LT__GT_,"Languages: "], null),cljs.core.interpose.cljs$core$IFn$_invoke$arity$2(goog.string.unescapeEntities("&nbsp;"),cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (lang){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.components.icons.views.language,lang], null);
}),languages)));
} else {
return null;
}
});
app.views.title = (function app$views$title(data){
var temp__5751__auto__ = cljs.core.cst$kw$com$boardgamegeek$boardgame_SLASH_id.cljs$core$IFn$_invoke$arity$1(data);
if(cljs.core.truth_(temp__5751__auto__)){
var bgg_id = temp__5751__auto__;
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,["https://boardgamegeek.com/boardgame/",cljs.core.str.cljs$core$IFn$_invoke$arity$1(bgg_id)].join('')], null),cljs.core.cst$kw$game_SLASH_name.cljs$core$IFn$_invoke$arity$1(data)], null);
} else {
return cljs.core.cst$kw$game_SLASH_name.cljs$core$IFn$_invoke$arity$1(data);
}
});
app.views.game = (function app$views$game(data){
return new cljs.core.PersistentVector(null, 7, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$tr,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$td,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.thumbnail,data], null)], null),new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$td,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.title,data], null),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$br], null),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$br], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.languages,data], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$td,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.min_players,data], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$td,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.max_players,data], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$td,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.min_play_time,data], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$td,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.max_play_time,data], null)], null)], null);
});
app.views.sortable_th = (function app$views$sortable_th(p__13957){
var map__13958 = p__13957;
var map__13958__$1 = cljs.core.__destructure_map(map__13958);
var text = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13958__$1,cljs.core.cst$kw$text);
var key = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13958__$1,cljs.core.cst$kw$key);
var sorting = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__13958__$1,cljs.core.cst$kw$sorting);
var current_key_sorted = cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(key,cljs.core.cst$kw$app_SLASH_sort_DASH_key.cljs$core$IFn$_invoke$arity$1(sorting));
var next_dir = ((current_key_sorted)?(function (){var G__13960 = cljs.core.cst$kw$app_SLASH_sort_DASH_dir.cljs$core$IFn$_invoke$arity$1(sorting);
var fexpr__13959 = new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$asc,cljs.core.cst$kw$desc,cljs.core.cst$kw$desc,cljs.core.cst$kw$asc,cljs.core.cst$kw$cljs$analyzer_SLASH_analyzed,true], null);
return (fexpr__13959.cljs$core$IFn$_invoke$arity$1 ? fexpr__13959.cljs$core$IFn$_invoke$arity$1(G__13960) : fexpr__13959.call(null,G__13960));
})():cljs.core.cst$kw$asc);
var icon = ((current_key_sorted)?((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$app_SLASH_sort_DASH_dir.cljs$core$IFn$_invoke$arity$1(sorting),cljs.core.cst$kw$asc))?new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.components.icons.views.arrow_up], null):new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.components.icons.views.arrow_down], null)):null);
return new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$th$pointer,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$on_DASH_click,(function (){
return re_frame.core.dispatch(new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$app$events_SLASH_sort_DASH_by,key,next_dir], null));
})], null),text,icon], null);
});
app.views.game_list = (function app$views$game_list(){
var sorting = cljs.core.deref(re_frame.core.subscribe.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$app$subs_SLASH_sorting], null)));
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$table,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$thead,new cljs.core.PersistentVector(null, 7, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$tr,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$th], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.sortable_th,new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$text,"Title",cljs.core.cst$kw$key,cljs.core.cst$kw$game_SLASH_name,cljs.core.cst$kw$sorting,sorting], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.sortable_th,new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$text,"Min players",cljs.core.cst$kw$key,cljs.core.cst$kw$com$boardgamegeek$boardgame_SLASH_min_DASH_players,cljs.core.cst$kw$sorting,sorting], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.sortable_th,new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$text,"Max players",cljs.core.cst$kw$key,cljs.core.cst$kw$com$boardgamegeek$boardgame_SLASH_max_DASH_players,cljs.core.cst$kw$sorting,sorting], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.sortable_th,new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$text,"Min playing time",cljs.core.cst$kw$key,cljs.core.cst$kw$com$boardgamegeek$boardgame_SLASH_min_DASH_play_DASH_time,cljs.core.cst$kw$sorting,sorting], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.sortable_th,new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$text,"Max playing time",cljs.core.cst$kw$key,cljs.core.cst$kw$com$boardgamegeek$boardgame_SLASH_max_DASH_play_DASH_time,cljs.core.cst$kw$sorting,sorting], null)], null)], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$tbody,(function (){var iter__4622__auto__ = (function app$views$game_list_$_iter__13961(s__13962){
return (new cljs.core.LazySeq(null,(function (){
var s__13962__$1 = s__13962;
while(true){
var temp__5753__auto__ = cljs.core.seq(s__13962__$1);
if(temp__5753__auto__){
var s__13962__$2 = temp__5753__auto__;
if(cljs.core.chunked_seq_QMARK_(s__13962__$2)){
var c__4620__auto__ = cljs.core.chunk_first(s__13962__$2);
var size__4621__auto__ = cljs.core.count(c__4620__auto__);
var b__13964 = cljs.core.chunk_buffer(size__4621__auto__);
if((function (){var i__13963 = (0);
while(true){
if((i__13963 < size__4621__auto__)){
var g = cljs.core._nth.cljs$core$IFn$_invoke$arity$2(c__4620__auto__,i__13963);
cljs.core.chunk_append(b__13964,cljs.core.with_meta(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.game,g], null),new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$key,cljs.core.cst$kw$game_SLASH_id.cljs$core$IFn$_invoke$arity$1(g)], null)));

var G__13965 = (i__13963 + (1));
i__13963 = G__13965;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__13964),app$views$game_list_$_iter__13961(cljs.core.chunk_rest(s__13962__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__13964),null);
}
} else {
var g = cljs.core.first(s__13962__$2);
return cljs.core.cons(cljs.core.with_meta(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.game,g], null),new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$key,cljs.core.cst$kw$game_SLASH_id.cljs$core$IFn$_invoke$arity$1(g)], null)),app$views$game_list_$_iter__13961(cljs.core.rest(s__13962__$2)));
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__4622__auto__(cljs.core.deref(re_frame.core.subscribe.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$app$subs_SLASH_game_DASH_list], null))));
})()], null)], null);
});
app.views.app = (function app$views$app(){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$_LT__GT_,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [app.views.game_list], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div$footer,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$p,"You can report bugs and request new features on  ",new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"https://github.com/nenadalm/bbb-game-list/issues/new"], null),"GitHub"], null),"."], null),new cljs.core.PersistentVector(null, 6, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$p,"Listed games are taken from ",new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"http://bohemiaboardsandbrews.com/games/"], null),"bohemiaboardsandbrews.com"], null)," enriched with info from ",new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"https://boardgamegeek.com/"], null),"boardgamegeek.com"], null),"."], null)], null)], null);
});
