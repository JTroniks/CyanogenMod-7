/*
    This file is part of the WebKit open source project.
    This file has been generated by generate-bindings.pl. DO NOT MODIFY!

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Library General Public
    License as published by the Free Software Foundation; either
    version 2 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Library General Public License for more details.

    You should have received a copy of the GNU Library General Public License
    along with this library; see the file COPYING.LIB.  If not, write to
    the Free Software Foundation, Inc., 59 Temple Place - Suite 330,
    Boston, MA 02111-1307, USA.
*/
#include "config.h"
#include "RuntimeEnabledFeatures.h"
#include "V8Proxy.h"
#include "V8Binding.h"
#include "V8BindingState.h"
#include "V8DOMWrapper.h"
#include "V8IsolatedContext.h"

#undef LOG

#include "HTMLNames.h"
#include "V8HTMLElement.h"
#include "V8HTMLImageElement.h"

namespace WebCore {
namespace HTMLImageElementInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> nameAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.name._get");
    return getElementStringAttr(info, HTMLNames::nameAttr);
  }

  static void nameAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.name._set");
    setElementStringAttr(info, HTMLNames::nameAttr, value);
  }

  static v8::Handle<v8::Value> alignAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.align._get");
    return getElementStringAttr(info, HTMLNames::alignAttr);
  }

  static void alignAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.align._set");
    setElementStringAttr(info, HTMLNames::alignAttr, value);
  }

  static v8::Handle<v8::Value> altAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.alt._get");
    return getElementStringAttr(info, HTMLNames::altAttr);
  }

  static void altAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.alt._set");
    setElementStringAttr(info, HTMLNames::altAttr, value);
  }

  static v8::Handle<v8::Value> borderAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.border._get");
    return getElementStringAttr(info, HTMLNames::borderAttr);
  }

  static void borderAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.border._set");
    setElementStringAttr(info, HTMLNames::borderAttr, value);
  }

  static v8::Handle<v8::Value> heightAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.height._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8::Integer::New(imp->height());
  }

  static void heightAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.height._set");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    int v = toInt32(value);
    imp->setHeight(v);
    return;
  }

  static v8::Handle<v8::Value> hspaceAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.hspace._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8::Integer::New(imp->hspace());
  }

  static void hspaceAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.hspace._set");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    int v = toInt32(value);
    imp->setHspace(v);
    return;
  }

  static v8::Handle<v8::Value> isMapAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.isMap._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8Boolean(imp->isMap());
  }

  static void isMapAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.isMap._set");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    bool v = value->BooleanValue();
    imp->setIsMap(v);
    return;
  }

  static v8::Handle<v8::Value> longDescAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.longDesc._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8String(imp->getURLAttribute(HTMLNames::longdescAttr));
  }

  static void longDescAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.longDesc._set");
    setElementStringAttr(info, HTMLNames::longdescAttr, value);
  }

  static v8::Handle<v8::Value> srcAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.src._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8String(imp->getURLAttribute(HTMLNames::srcAttr));
  }

  static void srcAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.src._set");
    setElementStringAttr(info, HTMLNames::srcAttr, value);
  }

  static v8::Handle<v8::Value> useMapAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.useMap._get");
    return getElementStringAttr(info, HTMLNames::usemapAttr);
  }

  static void useMapAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.useMap._set");
    setElementStringAttr(info, HTMLNames::usemapAttr, value);
  }

  static v8::Handle<v8::Value> vspaceAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.vspace._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8::Integer::New(imp->vspace());
  }

  static void vspaceAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.vspace._set");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    int v = toInt32(value);
    imp->setVspace(v);
    return;
  }

  static v8::Handle<v8::Value> widthAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.width._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8::Integer::New(imp->width());
  }

  static void widthAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.width._set");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    int v = toInt32(value);
    imp->setWidth(v);
    return;
  }

  static v8::Handle<v8::Value> completeAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.complete._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8Boolean(imp->complete());
  }

  static v8::Handle<v8::Value> lowsrcAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.lowsrc._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8String(imp->getURLAttribute(HTMLNames::lowsrcAttr));
  }

  static void lowsrcAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.lowsrc._set");
    setElementStringAttr(info, HTMLNames::lowsrcAttr, value);
  }

  static v8::Handle<v8::Value> naturalHeightAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.naturalHeight._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8::Integer::New(imp->naturalHeight());
  }

  static v8::Handle<v8::Value> naturalWidthAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.naturalWidth._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8::Integer::New(imp->naturalWidth());
  }

  static v8::Handle<v8::Value> xAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.x._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8::Integer::New(imp->x());
  }

  static v8::Handle<v8::Value> yAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLImageElement.y._get");
    HTMLImageElement* imp = V8HTMLImageElement::toNative(info.Holder());
    return v8::Integer::New(imp->y());
  }

} // namespace HTMLImageElementInternal

static const BatchedAttribute HTMLImageElement_attrs[] = {
    {
        // Attribute 'name' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString Reflect')
        "name",
        HTMLImageElementInternal::nameAttrGetter,
        HTMLImageElementInternal::nameAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'align' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString Reflect')
        "align",
        HTMLImageElementInternal::alignAttrGetter,
        HTMLImageElementInternal::alignAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'alt' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString Reflect')
        "alt",
        HTMLImageElementInternal::altAttrGetter,
        HTMLImageElementInternal::altAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'border' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString Reflect')
        "border",
        HTMLImageElementInternal::borderAttrGetter,
        HTMLImageElementInternal::borderAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'height' (Type: 'attribute' ExtAttr: '')
        "height",
        HTMLImageElementInternal::heightAttrGetter,
        HTMLImageElementInternal::heightAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'hspace' (Type: 'attribute' ExtAttr: '')
        "hspace",
        HTMLImageElementInternal::hspaceAttrGetter,
        HTMLImageElementInternal::hspaceAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'isMap' (Type: 'attribute' ExtAttr: '')
        "isMap",
        HTMLImageElementInternal::isMapAttrGetter,
        HTMLImageElementInternal::isMapAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'longDesc' (Type: 'attribute' ExtAttr: 'ReflectURL ConvertNullToNullString')
        "longDesc",
        HTMLImageElementInternal::longDescAttrGetter,
        HTMLImageElementInternal::longDescAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'src' (Type: 'attribute' ExtAttr: 'ReflectURL ConvertNullToNullString')
        "src",
        HTMLImageElementInternal::srcAttrGetter,
        HTMLImageElementInternal::srcAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'useMap' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString Reflect')
        "useMap",
        HTMLImageElementInternal::useMapAttrGetter,
        HTMLImageElementInternal::useMapAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'vspace' (Type: 'attribute' ExtAttr: '')
        "vspace",
        HTMLImageElementInternal::vspaceAttrGetter,
        HTMLImageElementInternal::vspaceAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'width' (Type: 'attribute' ExtAttr: '')
        "width",
        HTMLImageElementInternal::widthAttrGetter,
        HTMLImageElementInternal::widthAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'complete' (Type: 'readonly attribute' ExtAttr: '')
        "complete",
        HTMLImageElementInternal::completeAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'lowsrc' (Type: 'attribute' ExtAttr: 'ReflectURL ConvertNullToNullString')
        "lowsrc",
        HTMLImageElementInternal::lowsrcAttrGetter,
        HTMLImageElementInternal::lowsrcAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'naturalHeight' (Type: 'readonly attribute' ExtAttr: '')
        "naturalHeight",
        HTMLImageElementInternal::naturalHeightAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'naturalWidth' (Type: 'readonly attribute' ExtAttr: '')
        "naturalWidth",
        HTMLImageElementInternal::naturalWidthAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'x' (Type: 'readonly attribute' ExtAttr: '')
        "x",
        HTMLImageElementInternal::xAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'y' (Type: 'readonly attribute' ExtAttr: '')
        "y",
        HTMLImageElementInternal::yAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8HTMLImageElementTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "HTMLImageElement",
      V8HTMLElement::GetTemplate(), V8HTMLImageElement::internalFieldCount,
      HTMLImageElement_attrs, sizeof(HTMLImageElement_attrs)/sizeof(*HTMLImageElement_attrs),
      NULL, 0);
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8HTMLImageElement::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8HTMLImageElement_raw_cache_ = createRawTemplate();
  return V8HTMLImageElement_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8HTMLImageElement::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8HTMLImageElement_cache_ = ConfigureV8HTMLImageElementTemplate(GetRawTemplate());
  return V8HTMLImageElement_cache_;
}

HTMLImageElement* V8HTMLImageElement::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<HTMLImageElement*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8HTMLImageElement::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8HTMLImageElement::wrap(HTMLImageElement* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  if (impl->document()) {
    proxy = V8Proxy::retrieve(impl->document()->frame());
    if (proxy && static_cast<Node*>(impl->document()) == static_cast<Node*>(impl))
      proxy->windowShell()->initContextIfNeeded();
  }

  wrapper = V8DOMWrapper::getWrapper(impl);
  if (!wrapper.IsEmpty())
    return wrapper;

  v8::Handle<v8::Context> context;
  if (proxy)
    context = proxy->context();

  // Enter the node's context and create the wrapper in that context.
  if (!context.IsEmpty())
    context->Enter();
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::HTMLIMAGEELEMENT, impl);
  // Exit the node's context if it was entered.
  if (!context.IsEmpty())
    context->Exit();
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMNodeMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<HTMLImageElement > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(HTMLImageElement* impl) {
  if (!impl)
    return v8::Null();
  return V8HTMLImageElement::wrap(impl);
}
} // namespace WebCore
