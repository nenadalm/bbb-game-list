// Compiled by ClojureScript 1.10.597 {:static-fns true, :optimize-constants true}
goog.provide('reagent.dom');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('reagent.impl.util');
goog.require('reagent.impl.template');
goog.require('reagent.impl.batching');
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
var _STAR_always_update_STAR__orig_val__12293 = reagent.impl.util._STAR_always_update_STAR_;
var _STAR_always_update_STAR__temp_val__12294 = true;
(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__temp_val__12294);

try{var G__12295 = (comp.cljs$core$IFn$_invoke$arity$0 ? comp.cljs$core$IFn$_invoke$arity$0() : comp.call(null));
var G__12296 = container;
var G__12297 = (function (){
var _STAR_always_update_STAR__orig_val__12298 = reagent.impl.util._STAR_always_update_STAR_;
var _STAR_always_update_STAR__temp_val__12299 = false;
(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__temp_val__12299);

try{cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$4(reagent.dom.roots,cljs.core.assoc,container,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [comp,container], null));

reagent.impl.batching.flush_after_render();

if((!((callback == null)))){
return (callback.cljs$core$IFn$_invoke$arity$0 ? callback.cljs$core$IFn$_invoke$arity$0() : callback.call(null));
} else {
return null;
}
}finally {(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__orig_val__12298);
}});
return reagent.dom.global$module$react_dom.render(G__12295,G__12296,G__12297);
}finally {(reagent.impl.util._STAR_always_update_STAR_ = _STAR_always_update_STAR__orig_val__12293);
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
var G__12301 = arguments.length;
switch (G__12301) {
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
return reagent.dom.render.cljs$core$IFn$_invoke$arity$3(comp,container,null);
}));

(reagent.dom.render.cljs$core$IFn$_invoke$arity$3 = (function (comp,container,callback){
reagent.ratom.flush_BANG_();

var f = (function (){
return reagent.impl.template.as_element(((cljs.core.fn_QMARK_(comp))?(comp.cljs$core$IFn$_invoke$arity$0 ? comp.cljs$core$IFn$_invoke$arity$0() : comp.call(null)):comp));
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
(reagent.impl.template.find_dom_node = reagent.dom.dom_node);
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

var seq__12303_12307 = cljs.core.seq(cljs.core.vals(cljs.core.deref(reagent.dom.roots)));
var chunk__12304_12308 = null;
var count__12305_12309 = (0);
var i__12306_12310 = (0);
while(true){
if((i__12306_12310 < count__12305_12309)){
var v_12311 = chunk__12304_12308.cljs$core$IIndexed$_nth$arity$2(null,i__12306_12310);
cljs.core.apply.cljs$core$IFn$_invoke$arity$2(reagent.dom.re_render_component,v_12311);


var G__12312 = seq__12303_12307;
var G__12313 = chunk__12304_12308;
var G__12314 = count__12305_12309;
var G__12315 = (i__12306_12310 + (1));
seq__12303_12307 = G__12312;
chunk__12304_12308 = G__12313;
count__12305_12309 = G__12314;
i__12306_12310 = G__12315;
continue;
} else {
var temp__5735__auto___12316 = cljs.core.seq(seq__12303_12307);
if(temp__5735__auto___12316){
var seq__12303_12317__$1 = temp__5735__auto___12316;
if(cljs.core.chunked_seq_QMARK_(seq__12303_12317__$1)){
var c__4609__auto___12318 = cljs.core.chunk_first(seq__12303_12317__$1);
var G__12319 = cljs.core.chunk_rest(seq__12303_12317__$1);
var G__12320 = c__4609__auto___12318;
var G__12321 = cljs.core.count(c__4609__auto___12318);
var G__12322 = (0);
seq__12303_12307 = G__12319;
chunk__12304_12308 = G__12320;
count__12305_12309 = G__12321;
i__12306_12310 = G__12322;
continue;
} else {
var v_12323 = cljs.core.first(seq__12303_12317__$1);
cljs.core.apply.cljs$core$IFn$_invoke$arity$2(reagent.dom.re_render_component,v_12323);


var G__12324 = cljs.core.next(seq__12303_12317__$1);
var G__12325 = null;
var G__12326 = (0);
var G__12327 = (0);
seq__12303_12307 = G__12324;
chunk__12304_12308 = G__12325;
count__12305_12309 = G__12326;
i__12306_12310 = G__12327;
continue;
}
} else {
}
}
break;
}

return reagent.impl.batching.flush_after_render();
});
