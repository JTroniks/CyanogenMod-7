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
#include "HTMLNames.h"
#include "V8HTMLElement.h"
#include "V8HTMLFormElement.h"
#include "V8HTMLTextAreaElement.h"
#include "V8ValidityState.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace HTMLTextAreaElementInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> defaultValueAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.defaultValue._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8String(imp->defaultValue());
  }

  static void defaultValueAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.defaultValue._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setDefaultValue(v);
    return;
  }

  static v8::Handle<v8::Value> formAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.form._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return toV8(imp->form());
  }

  static v8::Handle<v8::Value> validityAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.validity._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return toV8(imp->validity());
  }

  static v8::Handle<v8::Value> accessKeyAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.accessKey._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8String(imp->accessKey());
  }

  static void accessKeyAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.accessKey._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setAccessKey(v);
    return;
  }

  static v8::Handle<v8::Value> colsAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.cols._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8::Integer::New(imp->cols());
  }

  static void colsAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.cols._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    int v = toInt32(value);
    imp->setCols(v);
    return;
  }

  static v8::Handle<v8::Value> disabledAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.disabled._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8Boolean(imp->disabled());
  }

  static void disabledAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.disabled._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    bool v = value->BooleanValue();
    imp->setDisabled(v);
    return;
  }

  static v8::Handle<v8::Value> autofocusAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.autofocus._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8Boolean(imp->autofocus());
  }

  static void autofocusAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.autofocus._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    bool v = value->BooleanValue();
    imp->setAutofocus(v);
    return;
  }

  static v8::Handle<v8::Value> maxLengthAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.maxLength._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8::Integer::New(imp->maxLength());
  }

  static void maxLengthAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.maxLength._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    int v = toInt32(value);
    ExceptionCode ec = 0;
    imp->setMaxLength(v, ec);
    if (UNLIKELY(ec))
        V8Proxy::setDOMException(ec);
    return;
  }

  static v8::Handle<v8::Value> nameAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.name._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8String(imp->name());
  }

  static void nameAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.name._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setName(v);
    return;
  }

  static v8::Handle<v8::Value> placeholderAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.placeholder._get");
    return getElementStringAttr(info, HTMLNames::placeholderAttr);
  }

  static void placeholderAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.placeholder._set");
    setElementStringAttr(info, HTMLNames::placeholderAttr, value);
  }

  static v8::Handle<v8::Value> readOnlyAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.readOnly._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8Boolean(imp->readOnly());
  }

  static void readOnlyAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.readOnly._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    bool v = value->BooleanValue();
    imp->setReadOnly(v);
    return;
  }

  static v8::Handle<v8::Value> requiredAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.required._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8Boolean(imp->required());
  }

  static void requiredAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.required._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    bool v = value->BooleanValue();
    imp->setRequired(v);
    return;
  }

  static v8::Handle<v8::Value> rowsAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.rows._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8::Integer::New(imp->rows());
  }

  static void rowsAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.rows._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    int v = toInt32(value);
    imp->setRows(v);
    return;
  }

  static v8::Handle<v8::Value> typeAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.type._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8String(imp->type());
  }

  static v8::Handle<v8::Value> valueAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.value._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8String(imp->value());
  }

  static void valueAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.value._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setValue(v);
    return;
  }

  static v8::Handle<v8::Value> textLengthAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.textLength._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8::Integer::NewFromUnsigned(imp->textLength());
  }

  static v8::Handle<v8::Value> willValidateAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.willValidate._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8Boolean(imp->willValidate());
  }

  static v8::Handle<v8::Value> validationMessageAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.validationMessage._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8String(imp->validationMessage());
  }

  static v8::Handle<v8::Value> selectionStartAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.selectionStart._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8::Integer::New(imp->selectionStart());
  }

  static void selectionStartAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.selectionStart._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    int v = toInt32(value);
    imp->setSelectionStart(v);
    return;
  }

  static v8::Handle<v8::Value> selectionEndAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.selectionEnd._get");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    return v8::Integer::New(imp->selectionEnd());
  }

  static void selectionEndAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLTextAreaElement.selectionEnd._set");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(info.Holder());
    int v = toInt32(value);
    imp->setSelectionEnd(v);
    return;
  }

  static v8::Handle<v8::Value> selectCallback(const v8::Arguments& args) {
    INC_STATS("DOM.HTMLTextAreaElement.select");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(args.Holder());
    imp->select();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> checkValidityCallback(const v8::Arguments& args) {
    INC_STATS("DOM.HTMLTextAreaElement.checkValidity");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(args.Holder());
    return v8Boolean(imp->checkValidity());
  }

  static v8::Handle<v8::Value> setCustomValidityCallback(const v8::Arguments& args) {
    INC_STATS("DOM.HTMLTextAreaElement.setCustomValidity");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(args.Holder());
    V8Parameter<WithUndefinedOrNullCheck> error = args[0];
    imp->setCustomValidity(error);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> setSelectionRangeCallback(const v8::Arguments& args) {
    INC_STATS("DOM.HTMLTextAreaElement.setSelectionRange");
    HTMLTextAreaElement* imp = V8HTMLTextAreaElement::toNative(args.Holder());
    int start = toInt32(args[0]);
    int end = toInt32(args[1]);
    imp->setSelectionRange(start, end);
    return v8::Handle<v8::Value>();
  }

} // namespace HTMLTextAreaElementInternal

static const BatchedAttribute HTMLTextAreaElement_attrs[] = {
    {
        // Attribute 'defaultValue' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "defaultValue",
        HTMLTextAreaElementInternal::defaultValueAttrGetter,
        HTMLTextAreaElementInternal::defaultValueAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'form' (Type: 'readonly attribute' ExtAttr: '')
        "form",
        HTMLTextAreaElementInternal::formAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'validity' (Type: 'readonly attribute' ExtAttr: '')
        "validity",
        HTMLTextAreaElementInternal::validityAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'accessKey' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "accessKey",
        HTMLTextAreaElementInternal::accessKeyAttrGetter,
        HTMLTextAreaElementInternal::accessKeyAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'cols' (Type: 'attribute' ExtAttr: '')
        "cols",
        HTMLTextAreaElementInternal::colsAttrGetter,
        HTMLTextAreaElementInternal::colsAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'disabled' (Type: 'attribute' ExtAttr: '')
        "disabled",
        HTMLTextAreaElementInternal::disabledAttrGetter,
        HTMLTextAreaElementInternal::disabledAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'autofocus' (Type: 'attribute' ExtAttr: '')
        "autofocus",
        HTMLTextAreaElementInternal::autofocusAttrGetter,
        HTMLTextAreaElementInternal::autofocusAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'maxLength' (Type: 'attribute' ExtAttr: '')
        "maxLength",
        HTMLTextAreaElementInternal::maxLengthAttrGetter,
        HTMLTextAreaElementInternal::maxLengthAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'name' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "name",
        HTMLTextAreaElementInternal::nameAttrGetter,
        HTMLTextAreaElementInternal::nameAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'placeholder' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString Reflect')
        "placeholder",
        HTMLTextAreaElementInternal::placeholderAttrGetter,
        HTMLTextAreaElementInternal::placeholderAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'readOnly' (Type: 'attribute' ExtAttr: '')
        "readOnly",
        HTMLTextAreaElementInternal::readOnlyAttrGetter,
        HTMLTextAreaElementInternal::readOnlyAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'required' (Type: 'attribute' ExtAttr: '')
        "required",
        HTMLTextAreaElementInternal::requiredAttrGetter,
        HTMLTextAreaElementInternal::requiredAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'rows' (Type: 'attribute' ExtAttr: '')
        "rows",
        HTMLTextAreaElementInternal::rowsAttrGetter,
        HTMLTextAreaElementInternal::rowsAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'type' (Type: 'readonly attribute' ExtAttr: '')
        "type",
        HTMLTextAreaElementInternal::typeAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'value' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "value",
        HTMLTextAreaElementInternal::valueAttrGetter,
        HTMLTextAreaElementInternal::valueAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'textLength' (Type: 'readonly attribute' ExtAttr: '')
        "textLength",
        HTMLTextAreaElementInternal::textLengthAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'willValidate' (Type: 'readonly attribute' ExtAttr: '')
        "willValidate",
        HTMLTextAreaElementInternal::willValidateAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'validationMessage' (Type: 'readonly attribute' ExtAttr: '')
        "validationMessage",
        HTMLTextAreaElementInternal::validationMessageAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'selectionStart' (Type: 'attribute' ExtAttr: '')
        "selectionStart",
        HTMLTextAreaElementInternal::selectionStartAttrGetter,
        HTMLTextAreaElementInternal::selectionStartAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'selectionEnd' (Type: 'attribute' ExtAttr: '')
        "selectionEnd",
        HTMLTextAreaElementInternal::selectionEndAttrGetter,
        HTMLTextAreaElementInternal::selectionEndAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedCallback HTMLTextAreaElement_callbacks[] = {
  {"select", HTMLTextAreaElementInternal::selectCallback},
  {"checkValidity", HTMLTextAreaElementInternal::checkValidityCallback},
  {"setCustomValidity", HTMLTextAreaElementInternal::setCustomValidityCallback},
  {"setSelectionRange", HTMLTextAreaElementInternal::setSelectionRangeCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8HTMLTextAreaElementTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "HTMLTextAreaElement",
      V8HTMLElement::GetTemplate(), V8HTMLTextAreaElement::internalFieldCount,
      HTMLTextAreaElement_attrs, sizeof(HTMLTextAreaElement_attrs)/sizeof(*HTMLTextAreaElement_attrs),
      HTMLTextAreaElement_callbacks, sizeof(HTMLTextAreaElement_callbacks)/sizeof(*HTMLTextAreaElement_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8HTMLTextAreaElement::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8HTMLTextAreaElement_raw_cache_ = createRawTemplate();
  return V8HTMLTextAreaElement_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8HTMLTextAreaElement::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8HTMLTextAreaElement_cache_ = ConfigureV8HTMLTextAreaElementTemplate(GetRawTemplate());
  return V8HTMLTextAreaElement_cache_;
}

HTMLTextAreaElement* V8HTMLTextAreaElement::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<HTMLTextAreaElement*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8HTMLTextAreaElement::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8HTMLTextAreaElement::wrap(HTMLTextAreaElement* impl) {
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
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::HTMLTEXTAREAELEMENT, impl);
  // Exit the node's context if it was entered.
  if (!context.IsEmpty())
    context->Exit();
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMNodeMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<HTMLTextAreaElement > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(HTMLTextAreaElement* impl) {
  if (!impl)
    return v8::Null();
  return V8HTMLTextAreaElement::wrap(impl);
}
} // namespace WebCore
