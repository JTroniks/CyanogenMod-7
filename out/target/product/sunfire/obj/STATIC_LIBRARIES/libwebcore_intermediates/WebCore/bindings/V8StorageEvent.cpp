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


#if ENABLE(DOM_STORAGE)

#include "V8Event.h"
#include "V8Storage.h"
#include "V8StorageEvent.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace StorageEventInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> keyAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.StorageEvent.key._get");
    StorageEvent* imp = V8StorageEvent::toNative(info.Holder());
    return v8StringOrNull(imp->key());
  }

  static v8::Handle<v8::Value> oldValueAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.StorageEvent.oldValue._get");
    StorageEvent* imp = V8StorageEvent::toNative(info.Holder());
    return v8StringOrNull(imp->oldValue());
  }

  static v8::Handle<v8::Value> newValueAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.StorageEvent.newValue._get");
    StorageEvent* imp = V8StorageEvent::toNative(info.Holder());
    return v8StringOrNull(imp->newValue());
  }

  static v8::Handle<v8::Value> uriAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.StorageEvent.uri._get");
    StorageEvent* imp = V8StorageEvent::toNative(info.Holder());
    return v8String(imp->uri());
  }

  static v8::Handle<v8::Value> storageAreaAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.StorageEvent.storageArea._get");
    StorageEvent* imp = V8StorageEvent::toNative(info.Holder());
    return toV8(imp->storageArea());
  }

  static v8::Handle<v8::Value> initStorageEventCallback(const v8::Arguments& args) {
    INC_STATS("DOM.StorageEvent.initStorageEvent");
    StorageEvent* imp = V8StorageEvent::toNative(args.Holder());
    V8Parameter<> typeArg = args[0];
    bool canBubbleArg = args[1]->BooleanValue();
    bool cancelableArg = args[2]->BooleanValue();
    V8Parameter<> keyArg = args[3];
    V8Parameter<WithNullCheck> oldValueArg = args[4];
    V8Parameter<WithNullCheck> newValueArg = args[5];
    V8Parameter<> uriArg = args[6];
    Storage* storageAreaArg = V8Storage::HasInstance(args[7]) ? V8Storage::toNative(v8::Handle<v8::Object>::Cast(args[7])) : 0;
    imp->initStorageEvent(typeArg, canBubbleArg, cancelableArg, keyArg, oldValueArg, newValueArg, uriArg, storageAreaArg);
    return v8::Handle<v8::Value>();
  }

} // namespace StorageEventInternal

static const BatchedAttribute StorageEvent_attrs[] = {
    {
        // Attribute 'key' (Type: 'readonly attribute' ExtAttr: 'ConvertNullStringTo')
        "key",
        StorageEventInternal::keyAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'oldValue' (Type: 'readonly attribute' ExtAttr: 'ConvertNullStringTo')
        "oldValue",
        StorageEventInternal::oldValueAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'newValue' (Type: 'readonly attribute' ExtAttr: 'ConvertNullStringTo')
        "newValue",
        StorageEventInternal::newValueAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'uri' (Type: 'readonly attribute' ExtAttr: '')
        "uri",
        StorageEventInternal::uriAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'storageArea' (Type: 'readonly attribute' ExtAttr: '')
        "storageArea",
        StorageEventInternal::storageAreaAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8StorageEventTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "StorageEvent",
      V8Event::GetTemplate(), V8StorageEvent::internalFieldCount,
      StorageEvent_attrs, sizeof(StorageEvent_attrs)/sizeof(*StorageEvent_attrs),
      NULL, 0);
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  

  // Custom Signature 'initStorageEvent'
  const int initStorageEvent_argc = 8;
  v8::Handle<v8::FunctionTemplate> initStorageEvent_argv[initStorageEvent_argc] = { v8::Handle<v8::FunctionTemplate>(), v8::Handle<v8::FunctionTemplate>(), v8::Handle<v8::FunctionTemplate>(), v8::Handle<v8::FunctionTemplate>(), v8::Handle<v8::FunctionTemplate>(), v8::Handle<v8::FunctionTemplate>(), v8::Handle<v8::FunctionTemplate>(), V8Storage::GetRawTemplate() };
  v8::Handle<v8::Signature> initStorageEvent_signature = v8::Signature::New(desc, initStorageEvent_argc, initStorageEvent_argv);
  proto->Set(v8::String::New("initStorageEvent"), v8::FunctionTemplate::New(StorageEventInternal::initStorageEventCallback, v8::Handle<v8::Value>(), initStorageEvent_signature));

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8StorageEvent::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8StorageEvent_raw_cache_ = createRawTemplate();
  return V8StorageEvent_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8StorageEvent::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8StorageEvent_cache_ = ConfigureV8StorageEventTemplate(GetRawTemplate());
  return V8StorageEvent_cache_;
}

StorageEvent* V8StorageEvent::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<StorageEvent*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8StorageEvent::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8StorageEvent::wrap(StorageEvent* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::STORAGEEVENT, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<StorageEvent > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(StorageEvent* impl) {
  if (!impl)
    return v8::Null();
  return V8StorageEvent::wrap(impl);
}
} // namespace WebCore

#endif // ENABLE(DOM_STORAGE)
