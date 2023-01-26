// Compiled by ClojureScript 1.10.866 {:static-fns true, :optimize-constants true, :optimizations :advanced}
goog.provide('reagent.dom');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('reagent.impl.util');
goog.require('reagent.impl.template');
goog.require('reagent.impl.input');
goog.require('reagent.impl.batching');
goog.require('reagent.impl.protocols');
goog.require('reagent.ratom');
reagent.dom.global$module$react_dom = goog.global["ReactDOM"];
if((typeof reagent !== 'undefined') && (typeof reagent.dom !== 'undefined') && (typeof reagent.dom.roots !== 'undefined')){
} else {
reagent.dom.roots = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
}
reagent.dom.unmount_comp = (function reagent$dom$unmount_comp(container){
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(reagent.dom.roots,cljs.core.dissoc,container);

return reagent.dom.global$module$react_dom.unmountComponentAtNode(container);
});
reagent.dom.render_comp = (function reagent$dom$render_comp(comp,container,callback){
var _STAR_always_update_STAR__orig_val__13982 = reagent.impl.util._STAR_always_update_STAR_;
var _STAR_always_update_STAR__temp_val__13983 = true;
(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__temp_val__13983);

try{var G__13984 = (comp.cljs$core$IFn$_invoke$arity$0 ? comp.cljs$core$IFn$_invoke$arity$0() : comp.call(null));
var G__13985 = container;
var G__13986 = (function (){
var _STAR_always_update_STAR__orig_val__13987 = reagent.impl.util._STAR_always_update_STAR_;
var _STAR_always_update_STAR__temp_val__13988 = false;
(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__temp_val__13988);

try{cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$4(reagent.dom.roots,cljs.core.assoc,container,comp);

reagent.impl.batching.flush_after_render();

if((!((callback == null)))){
return (callback.cljs$core$IFn$_invoke$arity$0 ? callback.cljs$core$IFn$_invoke$arity$0() : callback.call(null));
} else {
return null;
}
}finally {(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__orig_val__13987);
}});
return reagent.dom.global$module$react_dom.render(G__13984,G__13985,G__13986);
}finally {(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__orig_val__13982);
}});
reagent.dom.re_render_component = (function reagent$dom$re_render_component(comp,container){
return reagent.dom.render_comp(comp,container,null);
});
/**
 * Render a Reagent component into the DOM. The first argument may be
 *   either a vector (using Reagent's Hiccup syntax), or a React element.
 *   The second argument should be a DOM node.
 * 
 *   Optionally takes a callback that is called when the component is in place.
 * 
 *   Returns the mounted component instance.
 */
reagent.dom.render = (function reagent$dom$render(var_args){
var G__13990 = arguments.length;
switch (G__13990) {
case 2:
return reagent.dom.render.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
case 3:
return reagent.dom.render.cljs$core$IFn$_invoke$arity$3((arguments[(0)]),(arguments[(1)]),(arguments[(2)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(reagent.dom.render.cljs$core$IFn$_invoke$arity$2 = (function (comp,container){
return reagent.dom.render.cljs$core$IFn$_invoke$arity$3(comp,container,reagent.impl.template.default_compiler);
}));

(reagent.dom.render.cljs$core$IFn$_invoke$arity$3 = (function (comp,container,callback_or_compiler){
reagent.ratom.flush_BANG_();

var vec__13991 = ((cljs.core.fn_QMARK_(callback_or_compiler))?new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [reagent.impl.template.default_compiler,callback_or_compiler], null):new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [callback_or_compiler,cljs.core.cst$kw$callback.cljs$core$IFn$_invoke$arity$1(callback_or_compiler)], null));
var compiler = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13991,(0),null);
var callback = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13991,(1),null);
var f = (function (){
return reagent.impl.protocols.as_element(compiler,((cljs.core.fn_QMARK_(comp))?(comp.cljs$core$IFn$_invoke$arity$0 ? comp.cljs$core$IFn$_invoke$arity$0() : comp.call(null)):comp));
});
return reagent.dom.render_comp(f,container,callback);
}));

(reagent.dom.render.cljs$lang$maxFixedArity = 3);

/**
 * Remove a component from the given DOM node.
 */
reagent.dom.unmount_component_at_node = (function reagent$dom$unmount_component_at_node(container){
return reagent.dom.unmount_comp(container);
});
/**
 * Returns the root DOM node of a mounted component.
 */
reagent.dom.dom_node = (function reagent$dom$dom_node(this$){
return reagent.dom.global$module$react_dom.findDOMNode(this$);
});
/**
 * Force re-rendering of all mounted Reagent components. This is
 *   probably only useful in a development environment, when you want to
 *   update components in response to some dynamic changes to code.
 * 
 *   Note that force-update-all may not update root components. This
 *   happens if a component 'foo' is mounted with `(render [foo])` (since
 *   functions are passed by value, and not by reference, in
 *   ClojureScript). To get around this you'll have to introduce a layer
 *   of indirection, for example by using `(render [#'foo])` instead.
 */
reagent.dom.force_update_all = (function reagent$dom$force_update_all(){
reagent.ratom.flush_BANG_();

var seq__13995_14011 = cljs.core.seq(cljs.core.deref(reagent.dom.roots));
var chunk__13996_14012 = null;
var count__13997_14013 = (0);
var i__13998_14014 = (0);
while(true){
if((i__13998_14014 < count__13997_14013)){
var vec__14005_14015 = chunk__13996_14012.cljs$core$IIndexed$_nth$arity$2(null,i__13998_14014);
var container_14016 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__14005_14015,(0),null);
var comp_14017 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__14005_14015,(1),null);
reagent.dom.re_render_component(comp_14017,container_14016);


var G__14018 = seq__13995_14011;
var G__14019 = chunk__13996_14012;
var G__14020 = count__13997_14013;
var G__14021 = (i__13998_14014 + (1));
seq__13995_14011 = G__14018;
chunk__13996_14012 = G__14019;
count__13997_14013 = G__14020;
i__13998_14014 = G__14021;
continue;
} else {
var temp__5753__auto___14022 = cljs.core.seq(seq__13995_14011);
if(temp__5753__auto___14022){
var seq__13995_14023__$1 = temp__5753__auto___14022;
if(cljs.core.chunked_seq_QMARK_(seq__13995_14023__$1)){
var c__4649__auto___14024 = cljs.core.chunk_first(seq__13995_14023__$1);
var G__14025 = cljs.core.chunk_rest(seq__13995_14023__$1);
var G__14026 = c__4649__auto___14024;
var G__14027 = cljs.core.count(c__4649__auto___14024);
var G__14028 = (0);
seq__13995_14011 = G__14025;
chunk__13996_14012 = G__14026;
count__13997_14013 = G__14027;
i__13998_14014 = G__14028;
continue;
} else {
var vec__14008_14029 = cljs.core.first(seq__13995_14023__$1);
var container_14030 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__14008_14029,(0),null);
var comp_14031 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__14008_14029,(1),null);
reagent.dom.re_render_component(comp_14031,container_14030);


var G__14032 = cljs.core.next(seq__13995_14023__$1);
var G__14033 = null;
var G__14034 = (0);
var G__14035 = (0);
seq__13995_14011 = G__14032;
chunk__13996_14012 = G__14033;
count__13997_14013 = G__14034;
i__13998_14014 = G__14035;
continue;
}
} else {
}
}
break;
}

return reagent.impl.batching.flush_after_render();
});
