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

#include "ExceptionCode.h"
#include "V8Collection.h"
#include "V8HTMLElement.h"
#include "V8HTMLFormElement.h"
#include "V8HTMLOptionsCollection.h"
#include "V8HTMLSelectElement.h"
#include "V8Node.h"
#include "V8ValidityState.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace HTMLSelectElementInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> typeAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.type._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return v8String(imp->type());
  }

  static v8::Handle<v8::Value> selectedIndexAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.selectedIndex._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return v8::Integer::New(imp->selectedIndex());
  }

  static void selectedIndexAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.selectedIndex._set");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    int v = toInt32(value);
    imp->setSelectedIndex(v);
    return;
  }

  static v8::Handle<v8::Value> valueAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.value._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return v8String(imp->value());
  }

  static void valueAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.value._set");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setValue(v);
    return;
  }

  static v8::Handle<v8::Value> lengthAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.length._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return v8::Integer::NewFromUnsigned(imp->length());
  }

  static void lengthAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.length._set");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    unsigned v = toInt32(value);
    ExceptionCode ec = 0;
    imp->setLength(v, ec);
    if (UNLIKELY(ec))
        V8Proxy::setDOMException(ec);
    return;
  }

  static v8::Handle<v8::Value> formAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.form._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return toV8(imp->form());
  }

  static v8::Handle<v8::Value> validityAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.validity._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return toV8(imp->validity());
  }

  static v8::Handle<v8::Value> willValidateAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.willValidate._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return v8Boolean(imp->willValidate());
  }

  static v8::Handle<v8::Value> validationMessageAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.validationMessage._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return v8String(imp->validationMessage());
  }

  static v8::Handle<v8::Value> optionsAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.options._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return toV8(imp->options());
  }

  static v8::Handle<v8::Value> disabledAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.disabled._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return v8Boolean(imp->disabled());
  }

  static void disabledAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.disabled._set");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    bool v = value->BooleanValue();
    imp->setDisabled(v);
    return;
  }

  static v8::Handle<v8::Value> autofocusAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.autofocus._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return v8Boolean(imp->autofocus());
  }

  static void autofocusAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.autofocus._set");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    bool v = value->BooleanValue();
    imp->setAutofocus(v);
    return;
  }

  static v8::Handle<v8::Value> multipleAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.multiple._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return v8Boolean(imp->multiple());
  }

  static void multipleAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.multiple._set");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    bool v = value->BooleanValue();
    imp->setMultiple(v);
    return;
  }

  static v8::Handle<v8::Value> nameAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.name._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return v8String(imp->name());
  }

  static void nameAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.name._set");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setName(v);
    return;
  }

  static v8::Handle<v8::Value> sizeAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.size._get");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    return v8::Integer::New(imp->size());
  }

  static void sizeAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLSelectElement.size._set");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(info.Holder());
    int v = toInt32(value);
    imp->setSize(v);
    return;
  }

  static v8::Handle<v8::Value> checkValidityCallback(const v8::Arguments& args) {
    INC_STATS("DOM.HTMLSelectElement.checkValidity");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(args.Holder());
    return v8Boolean(imp->checkValidity());
  }

  static v8::Handle<v8::Value> setCustomValidityCallback(const v8::Arguments& args) {
    INC_STATS("DOM.HTMLSelectElement.setCustomValidity");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(args.Holder());
    V8Parameter<WithUndefinedOrNullCheck> error = args[0];
    imp->setCustomValidity(error);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> addCallback(const v8::Arguments& args) {
    INC_STATS("DOM.HTMLSelectElement.add");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    HTMLElement* element = V8HTMLElement::HasInstance(args[0]) ? V8HTMLElement::toNative(v8::Handle<v8::Object>::Cast(args[0])) : 0;
    HTMLElement* before = V8HTMLElement::HasInstance(args[1]) ? V8HTMLElement::toNative(v8::Handle<v8::Object>::Cast(args[1])) : 0;
    imp->add(element, before, ec);
    if (UNLIKELY(ec)) goto fail;
    return v8::Handle<v8::Value>();
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> itemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.HTMLSelectElement.item");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    int index = toInt32(args[0]);
    if (UNLIKELY(index < 0)) {
      ec = INDEX_SIZE_ERR;
      goto fail;
    }
    return toV8(imp->item(index));
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> namedItemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.HTMLSelectElement.namedItem");
    HTMLSelectElement* imp = V8HTMLSelectElement::toNative(args.Holder());
    V8Parameter<> name = args[0];
    return toV8(imp->namedItem(name));
  }

} // namespace HTMLSelectElementInternal

static const BatchedAttribute HTMLSelectElement_attrs[] = {
    {
        // Attribute 'type' (Type: 'readonly attribute' ExtAttr: '')
        "type",
        HTMLSelectElementInternal::typeAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'selectedIndex' (Type: 'attribute' ExtAttr: '')
        "selectedIndex",
        HTMLSelectElementInternal::selectedIndexAttrGetter,
        HTMLSelectElementInternal::selectedIndexAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'value' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "value",
        HTMLSelectElementInternal::valueAttrGetter,
        HTMLSelectElementInternal::valueAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'length' (Type: 'attribute' ExtAttr: '')
        "length",
        HTMLSelectElementInternal::lengthAttrGetter,
        HTMLSelectElementInternal::lengthAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'form' (Type: 'readonly attribute' ExtAttr: '')
        "form",
        HTMLSelectElementInternal::formAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'validity' (Type: 'readonly attribute' ExtAttr: '')
        "validity",
        HTMLSelectElementInternal::validityAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'willValidate' (Type: 'readonly attribute' ExtAttr: '')
        "willValidate",
        HTMLSelectElementInternal::willValidateAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'validationMessage' (Type: 'readonly attribute' ExtAttr: '')
        "validationMessage",
        HTMLSelectElementInternal::validationMessageAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'options' (Type: 'readonly attribute' ExtAttr: '')
        "options",
        HTMLSelectElementInternal::optionsAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'disabled' (Type: 'attribute' ExtAttr: '')
        "disabled",
        HTMLSelectElementInternal::disabledAttrGetter,
        HTMLSelectElementInternal::disabledAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'autofocus' (Type: 'attribute' ExtAttr: '')
        "autofocus",
        HTMLSelectElementInternal::autofocusAttrGetter,
        HTMLSelectElementInternal::autofocusAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'multiple' (Type: 'attribute' ExtAttr: '')
        "multiple",
        HTMLSelectElementInternal::multipleAttrGetter,
        HTMLSelectElementInternal::multipleAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'name' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "name",
        HTMLSelectElementInternal::nameAttrGetter,
        HTMLSelectElementInternal::nameAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'size' (Type: 'attribute' ExtAttr: '')
        "size",
        HTMLSelectElementInternal::sizeAttrGetter,
        HTMLSelectElementInternal::sizeAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedCallback HTMLSelectElement_callbacks[] = {
  {"checkValidity", HTMLSelectElementInternal::checkValidityCallback},
  {"setCustomValidity", HTMLSelectElementInternal::setCustomValidityCallback},
  {"remove", V8HTMLSelectElement::removeCallback},
  {"item", HTMLSelectElementInternal::itemCallback},
  {"namedItem", HTMLSelectElementInternal::namedItemCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8HTMLSelectElementTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "HTMLSelectElement",
      V8HTMLElement::GetTemplate(), V8HTMLSelectElement::internalFieldCount,
      HTMLSelectElement_attrs, sizeof(HTMLSelectElement_attrs)/sizeof(*HTMLSelectElement_attrs),
      HTMLSelectElement_callbacks, sizeof(HTMLSelectElement_callbacks)/sizeof(*HTMLSelectElement_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  
  desc->InstanceTemplate()->SetIndexedPropertyHandler(V8HTMLSelectElement::indexedPropertyGetter, V8HTMLSelectElement::indexedPropertySetter, 0, 0, nodeCollectionIndexedPropertyEnumerator<HTMLSelectElement>, v8::Integer::New(V8ClassIndex::NODE));
  desc->InstanceTemplate()->SetNamedPropertyHandler(V8HTMLSelectElement::namedPropertyGetter, 0, 0, 0, 0);

  // Custom Signature 'add'
  const int add_argc = 2;
  v8::Handle<v8::FunctionTemplate> add_argv[add_argc] = { V8HTMLElement::GetRawTemplate(), V8HTMLElement::GetRawTemplate() };
  v8::Handle<v8::Signature> add_signature = v8::Signature::New(desc, add_argc, add_argv);
  proto->Set(v8::String::New("add"), v8::FunctionTemplate::New(HTMLSelectElementInternal::addCallback, v8::Handle<v8::Value>(), add_signature));

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8HTMLSelectElement::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8HTMLSelectElement_raw_cache_ = createRawTemplate();
  return V8HTMLSelectElement_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8HTMLSelectElement::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8HTMLSelectElement_cache_ = ConfigureV8HTMLSelectElementTemplate(GetRawTemplate());
  return V8HTMLSelectElement_cache_;
}

HTMLSelectElement* V8HTMLSelectElement::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<HTMLSelectElement*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8HTMLSelectElement::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8HTMLSelectElement::wrap(HTMLSelectElement* impl) {
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
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::HTMLSELECTELEMENT, impl);
  // Exit the node's context if it was entered.
  if (!context.IsEmpty())
    context->Exit();
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMNodeMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<HTMLSelectElement > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(HTMLSelectElement* impl) {
  if (!impl)
    return v8::Null();
  return V8HTMLSelectElement::wrap(impl);
}
} // namespace WebCore
