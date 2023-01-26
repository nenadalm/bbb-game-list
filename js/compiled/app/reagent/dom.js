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
var _STAR_always_update_STAR__orig_val__13977 = reagent.impl.util._STAR_always_update_STAR_;
var _STAR_always_update_STAR__temp_val__13978 = true;
(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__temp_val__13978);

try{var G__13979 = (comp.cljs$core$IFn$_invoke$arity$0 ? comp.cljs$core$IFn$_invoke$arity$0() : comp.call(null));
var G__13980 = container;
var G__13981 = (function (){
var _STAR_always_update_STAR__orig_val__13982 = reagent.impl.util._STAR_always_update_STAR_;
var _STAR_always_update_STAR__temp_val__13983 = false;
(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__temp_val__13983);

try{cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$4(reagent.dom.roots,cljs.core.assoc,container,comp);

reagent.impl.batching.flush_after_render();

if((!((callback == null)))){
return (callback.cljs$core$IFn$_invoke$arity$0 ? callback.cljs$core$IFn$_invoke$arity$0() : callback.call(null));
} else {
return null;
}
}finally {(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__orig_val__13982);
}});
return reagent.dom.global$module$react_dom.render(G__13979,G__13980,G__13981);
}finally {(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__orig_val__13977);
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
var G__13985 = arguments.length;
switch (G__13985) {
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

var vec__13986 = ((cljs.core.fn_QMARK_(callback_or_compiler))?new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [reagent.impl.template.default_compiler,callback_or_compiler], null):new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [callback_or_compiler,cljs.core.cst$kw$callback.cljs$core$IFn$_invoke$arity$1(callback_or_compiler)], null));
var compiler = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13986,(0),null);
var callback = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__13986,(1),null);
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

var seq__13990_14006 = cljs.core.seq(cljs.core.deref(reagent.dom.roots));
var chunk__13991_14007 = null;
var count__13992_14008 = (0);
var i__13993_14009 = (0);
while(true){
if((i__13993_14009 < count__13992_14008)){
var vec__14000_14010 = chunk__13991_14007.cljs$core$IIndexed$_nth$arity$2(null,i__13993_14009);
var container_14011 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__14000_14010,(0),null);
var comp_14012 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__14000_14010,(1),null);
reagent.dom.re_render_component(comp_14012,container_14011);


var G__14013 = seq__13990_14006;
var G__14014 = chunk__13991_14007;
var G__14015 = count__13992_14008;
var G__14016 = (i__13993_14009 + (1));
seq__13990_14006 = G__14013;
chunk__13991_14007 = G__14014;
count__13992_14008 = G__14015;
i__13993_14009 = G__14016;
continue;
} else {
var temp__5753__auto___14017 = cljs.core.seq(seq__13990_14006);
if(temp__5753__auto___14017){
var seq__13990_14018__$1 = temp__5753__auto___14017;
if(cljs.core.chunked_seq_QMARK_(seq__13990_14018__$1)){
var c__4649__auto___14019 = cljs.core.chunk_first(seq__13990_14018__$1);
var G__14020 = cljs.core.chunk_rest(seq__13990_14018__$1);
var G__14021 = c__4649__auto___14019;
var G__14022 = cljs.core.count(c__4649__auto___14019);
var G__14023 = (0);
seq__13990_14006 = G__14020;
chunk__13991_14007 = G__14021;
count__13992_14008 = G__14022;
i__13993_14009 = G__14023;
continue;
} else {
var vec__14003_14024 = cljs.core.first(seq__13990_14018__$1);
var container_14025 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__14003_14024,(0),null);
var comp_14026 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__14003_14024,(1),null);
reagent.dom.re_render_component(comp_14026,container_14025);


var G__14027 = cljs.core.next(seq__13990_14018__$1);
var G__14028 = null;
var G__14029 = (0);
var G__14030 = (0);
seq__13990_14006 = G__14027;
chunk__13991_14007 = G__14028;
count__13992_14008 = G__14029;
i__13993_14009 = G__14030;
continue;
}
} else {
}
}
break;
}

return reagent.impl.batching.flush_after_render();
});
