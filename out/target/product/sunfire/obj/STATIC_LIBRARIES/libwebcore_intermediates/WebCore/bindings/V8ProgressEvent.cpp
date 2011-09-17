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

#include "V8Event.h"
#include "V8ProgressEvent.h"

namespace WebCore {
namespace ProgressEventInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> lengthComputableAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.ProgressEvent.lengthComputable._get");
    ProgressEvent* imp = V8ProgressEvent::toNative(info.Holder());
    return v8Boolean(imp->lengthComputable());
  }

  static v8::Handle<v8::Value> loadedAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.ProgressEvent.loaded._get");
    ProgressEvent* imp = V8ProgressEvent::toNative(info.Holder());
    return v8::Integer::NewFromUnsigned(imp->loaded());
  }

  static v8::Handle<v8::Value> totalAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.ProgressEvent.total._get");
    ProgressEvent* imp = V8ProgressEvent::toNative(info.Holder());
    return v8::Integer::NewFromUnsigned(imp->total());
  }

  static v8::Handle<v8::Value> initProgressEventCallback(const v8::Arguments& args) {
    INC_STATS("DOM.ProgressEvent.initProgressEvent");
    ProgressEvent* imp = V8ProgressEvent::toNative(args.Holder());
    V8Parameter<> typeArg = args[0];
    bool canBubbleArg = args[1]->BooleanValue();
    bool cancelableArg = args[2]->BooleanValue();
    bool lengthComputableArg = args[3]->BooleanValue();
    unsigned loadedArg = toInt32(args[4]);
    unsigned totalArg = toInt32(args[5]);
    imp->initProgressEvent(typeArg, canBubbleArg, cancelableArg, lengthComputableArg, loadedArg, totalArg);
    return v8::Handle<v8::Value>();
  }

} // namespace ProgressEventInternal

static const BatchedAttribute ProgressEvent_attrs[] = {
    {
        // Attribute 'lengthComputable' (Type: 'readonly attribute' ExtAttr: '')
        "lengthComputable",
        ProgressEventInternal::lengthComputableAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'loaded' (Type: 'readonly attribute' ExtAttr: '')
        "loaded",
        ProgressEventInternal::loadedAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'total' (Type: 'readonly attribute' ExtAttr: '')
        "total",
        ProgressEventInternal::totalAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedCallback ProgressEvent_callbacks[] = {
  {"initProgressEvent", ProgressEventInternal::initProgressEventCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8ProgressEventTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "ProgressEvent",
      V8Event::GetTemplate(), V8ProgressEvent::internalFieldCount,
      ProgressEvent_attrs, sizeof(ProgressEvent_attrs)/sizeof(*ProgressEvent_attrs),
      ProgressEvent_callbacks, sizeof(ProgressEvent_callbacks)/sizeof(*ProgressEvent_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8ProgressEvent::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8ProgressEvent_raw_cache_ = createRawTemplate();
  return V8ProgressEvent_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8ProgressEvent::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8ProgressEvent_cache_ = ConfigureV8ProgressEventTemplate(GetRawTemplate());
  return V8ProgressEvent_cache_;
}

ProgressEvent* V8ProgressEvent::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<ProgressEvent*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8ProgressEvent::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8ProgressEvent::wrap(ProgressEvent* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::PROGRESSEVENT, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<ProgressEvent > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(ProgressEvent* impl) {
  if (!impl)
    return v8::Null();
  return V8ProgressEvent::wrap(impl);
}
} // namespace WebCore
