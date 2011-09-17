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


#if ENABLE(WORKERS)

#include "V8ErrorEvent.h"
#include "V8Event.h"

namespace WebCore {
namespace ErrorEventInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> messageAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.ErrorEvent.message._get");
    ErrorEvent* imp = V8ErrorEvent::toNative(info.Holder());
    return v8String(imp->message());
  }

  static v8::Handle<v8::Value> filenameAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.ErrorEvent.filename._get");
    ErrorEvent* imp = V8ErrorEvent::toNative(info.Holder());
    return v8String(imp->filename());
  }

  static v8::Handle<v8::Value> linenoAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.ErrorEvent.lineno._get");
    ErrorEvent* imp = V8ErrorEvent::toNative(info.Holder());
    return v8::Integer::NewFromUnsigned(imp->lineno());
  }

  static v8::Handle<v8::Value> initErrorEventCallback(const v8::Arguments& args) {
    INC_STATS("DOM.ErrorEvent.initErrorEvent");
    ErrorEvent* imp = V8ErrorEvent::toNative(args.Holder());
    V8Parameter<> typeArg = args[0];
    bool canBubbleArg = args[1]->BooleanValue();
    bool cancelableArg = args[2]->BooleanValue();
    V8Parameter<> messageArg = args[3];
    V8Parameter<> filenameArg = args[4];
    unsigned linenoArg = toInt32(args[5]);
    imp->initErrorEvent(typeArg, canBubbleArg, cancelableArg, messageArg, filenameArg, linenoArg);
    return v8::Handle<v8::Value>();
  }

} // namespace ErrorEventInternal

static const BatchedAttribute ErrorEvent_attrs[] = {
    {
        // Attribute 'message' (Type: 'readonly attribute' ExtAttr: '')
        "message",
        ErrorEventInternal::messageAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'filename' (Type: 'readonly attribute' ExtAttr: '')
        "filename",
        ErrorEventInternal::filenameAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'lineno' (Type: 'readonly attribute' ExtAttr: '')
        "lineno",
        ErrorEventInternal::linenoAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedCallback ErrorEvent_callbacks[] = {
  {"initErrorEvent", ErrorEventInternal::initErrorEventCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8ErrorEventTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "ErrorEvent",
      V8Event::GetTemplate(), V8ErrorEvent::internalFieldCount,
      ErrorEvent_attrs, sizeof(ErrorEvent_attrs)/sizeof(*ErrorEvent_attrs),
      ErrorEvent_callbacks, sizeof(ErrorEvent_callbacks)/sizeof(*ErrorEvent_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8ErrorEvent::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8ErrorEvent_raw_cache_ = createRawTemplate();
  return V8ErrorEvent_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8ErrorEvent::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8ErrorEvent_cache_ = ConfigureV8ErrorEventTemplate(GetRawTemplate());
  return V8ErrorEvent_cache_;
}

ErrorEvent* V8ErrorEvent::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<ErrorEvent*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8ErrorEvent::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8ErrorEvent::wrap(ErrorEvent* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::ERROREVENT, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<ErrorEvent > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(ErrorEvent* impl) {
  if (!impl)
    return v8::Null();
  return V8ErrorEvent::wrap(impl);
}
} // namespace WebCore

#endif // ENABLE(WORKERS)
