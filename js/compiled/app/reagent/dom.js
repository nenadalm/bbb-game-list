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
var _STAR_always_update_STAR__orig_val__13970 = reagent.impl.util._STAR_always_update_STAR_;
var _STAR_always_update_STAR__temp_val__13971 = true;
(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__temp_val__13971);

try{var G__13972 = (comp.cljs$core$IFn$_invoke$arity$0 ? comp.cljs$core$IFn$_invoke$arity$0() : comp.call(null));
var G__13973 = container;
var G__13974 = (function (){
var _STAR_always_update_STAR__orig_val__13975 = reagent.impl.util._STAR_always_update_STAR_;
var _STAR_always_update_STAR__temp_val__13976 = false;
(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__temp_val__13976);

try{cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$4(reagent.dom.roots,cljs.core.assoc,container,comp);

reagent.impl.batching.flush_after_render();

if((!((callback == null)))){
return (callback.cljs$core$IFn$_invoke$arity$0 ? callback.cljs$core$IFn$_invoke$arity$0() : callback.call(null));
} else {
return null;
}
}finally {(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__orig_val__13975);
}});
return reagent.dom.global$module$react_dom.render(G__13972,G__13973,G__13974);
}finally {(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__orig_val__13970);
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
var G__13978 = arguments.length;
switch (G__13978) {
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

var vec__13979 = ((cljs.core.fn_QMARK_(callback_or_compiler))?new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [reagent.impl.template.default_compiler,callback_or_compiler], null):new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [callback_or_compiler,cljs.core.cst$kw$callback.cljs$core$IFn$_invoke$arity$1(callback_or_compiler)], null));
var compiler = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13979,(0),null);
var callback = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13979,(1),null);
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

var seq__13983_13999 = cljs.core.seq(cljs.core.deref(reagent.dom.roots));
var chunk__13984_14000 = null;
var count__13985_14001 = (0);
var i__13986_14002 = (0);
while(true){
if((i__13986_14002 < count__13985_14001)){
var vec__13993_14003 = chunk__13984_14000.cljs$core$IIndexed$_nth$arity$2(null,i__13986_14002);
var container_14004 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13993_14003,(0),null);
var comp_14005 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13993_14003,(1),null);
reagent.dom.re_render_component(comp_14005,container_14004);


var G__14006 = seq__13983_13999;
var G__14007 = chunk__13984_14000;
var G__14008 = count__13985_14001;
var G__14009 = (i__13986_14002 + (1));
seq__13983_13999 = G__14006;
chunk__13984_14000 = G__14007;
count__13985_14001 = G__14008;
i__13986_14002 = G__14009;
continue;
} else {
var temp__5753__auto___14010 = cljs.core.seq(seq__13983_13999);
if(temp__5753__auto___14010){
var seq__13983_14011__$1 = temp__5753__auto___14010;
if(cljs.core.chunked_seq_QMARK_(seq__13983_14011__$1)){
var c__4649__auto___14012 = cljs.core.chunk_first(seq__13983_14011__$1);
var G__14013 = cljs.core.chunk_rest(seq__13983_14011__$1);
var G__14014 = c__4649__auto___14012;
var G__14015 = cljs.core.count(c__4649__auto___14012);
var G__14016 = (0);
seq__13983_13999 = G__14013;
chunk__13984_14000 = G__14014;
count__13985_14001 = G__14015;
i__13986_14002 = G__14016;
continue;
} else {
var vec__13996_14017 = cljs.core.first(seq__13983_14011__$1);
var container_14018 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13996_14017,(0),null);
var comp_14019 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13996_14017,(1),null);
reagent.dom.re_render_component(comp_14019,container_14018);


var G__14020 = cljs.core.next(seq__13983_14011__$1);
var G__14021 = null;
var G__14022 = (0);
var G__14023 = (0);
seq__13983_13999 = G__14020;
chunk__13984_14000 = G__14021;
count__13985_14001 = G__14022;
i__13986_14002 = G__14023;
continue;
}
} else {
}
}
break;
}

return reagent.impl.batching.flush_after_render();
});
