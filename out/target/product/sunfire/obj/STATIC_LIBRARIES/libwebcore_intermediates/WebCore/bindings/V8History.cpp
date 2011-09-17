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

#include "V8History.h"

namespace WebCore {
namespace HistoryInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> lengthAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.History.length._get");
    History* imp = V8History::toNative(info.Holder());
    return v8::Integer::NewFromUnsigned(imp->length());
  }

  static v8::Handle<v8::Value> backCallback(const v8::Arguments& args) {
    INC_STATS("DOM.History.back");
    History* imp = V8History::toNative(args.Holder());
    imp->back();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> backAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.History.back._get");
    static v8::Persistent<v8::FunctionTemplate> private_template =
        v8::Persistent<v8::FunctionTemplate>::New(v8::FunctionTemplate::New(HistoryInternal::backCallback, v8::Handle<v8::Value>(), v8::Signature::New(V8History::GetRawTemplate())));
    v8::Handle<v8::Object> holder = V8DOMWrapper::lookupDOMWrapper(V8History::GetTemplate(), info.This());
    if (holder.IsEmpty()) {
      // can only reach here by 'object.__proto__.func', and it should passed
      // domain security check already
      return private_template->GetFunction();
    }
    History* imp = V8History::toNative(holder);
    if (!V8BindingSecurity::canAccessFrame(V8BindingState::Only(), imp->frame(), false)) {
      static v8::Persistent<v8::FunctionTemplate> shared_template =
        v8::Persistent<v8::FunctionTemplate>::New(v8::FunctionTemplate::New(HistoryInternal::backCallback, v8::Handle<v8::Value>(), v8::Signature::New(V8History::GetRawTemplate())));
      return shared_template->GetFunction();

    } else {
      return private_template->GetFunction();
    }
  }

  static v8::Handle<v8::Value> forwardCallback(const v8::Arguments& args) {
    INC_STATS("DOM.History.forward");
    History* imp = V8History::toNative(args.Holder());
    imp->forward();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> forwardAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.History.forward._get");
    static v8::Persistent<v8::FunctionTemplate> private_template =
        v8::Persistent<v8::FunctionTemplate>::New(v8::FunctionTemplate::New(HistoryInternal::forwardCallback, v8::Handle<v8::Value>(), v8::Signature::New(V8History::GetRawTemplate())));
    v8::Handle<v8::Object> holder = V8DOMWrapper::lookupDOMWrapper(V8History::GetTemplate(), info.This());
    if (holder.IsEmpty()) {
      // can only reach here by 'object.__proto__.func', and it should passed
      // domain security check already
      return private_template->GetFunction();
    }
    History* imp = V8History::toNative(holder);
    if (!V8BindingSecurity::canAccessFrame(V8BindingState::Only(), imp->frame(), false)) {
      static v8::Persistent<v8::FunctionTemplate> shared_template =
        v8::Persistent<v8::FunctionTemplate>::New(v8::FunctionTemplate::New(HistoryInternal::forwardCallback, v8::Handle<v8::Value>(), v8::Signature::New(V8History::GetRawTemplate())));
      return shared_template->GetFunction();

    } else {
      return private_template->GetFunction();
    }
  }

  static v8::Handle<v8::Value> goCallback(const v8::Arguments& args) {
    INC_STATS("DOM.History.go");
    History* imp = V8History::toNative(args.Holder());
    int distance = toInt32(args[0]);
    imp->go(distance);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> goAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.History.go._get");
    static v8::Persistent<v8::FunctionTemplate> private_template =
        v8::Persistent<v8::FunctionTemplate>::New(v8::FunctionTemplate::New(HistoryInternal::goCallback, v8::Handle<v8::Value>(), v8::Signature::New(V8History::GetRawTemplate())));
    v8::Handle<v8::Object> holder = V8DOMWrapper::lookupDOMWrapper(V8History::GetTemplate(), info.This());
    if (holder.IsEmpty()) {
      // can only reach here by 'object.__proto__.func', and it should passed
      // domain security check already
      return private_template->GetFunction();
    }
    History* imp = V8History::toNative(holder);
    if (!V8BindingSecurity::canAccessFrame(V8BindingState::Only(), imp->frame(), false)) {
      static v8::Persistent<v8::FunctionTemplate> shared_template =
        v8::Persistent<v8::FunctionTemplate>::New(v8::FunctionTemplate::New(HistoryInternal::goCallback, v8::Handle<v8::Value>(), v8::Signature::New(V8History::GetRawTemplate())));
      return shared_template->GetFunction();

    } else {
      return private_template->GetFunction();
    }
  }

} // namespace HistoryInternal

static const BatchedAttribute History_attrs[] = {
    {
        // Attribute 'length' (Type: 'readonly attribute' ExtAttr: '')
        "length",
        HistoryInternal::lengthAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedCallback History_callbacks[] = {
  {"pushState", V8History::pushStateCallback},
  {"replaceState", V8History::replaceStateCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8HistoryTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "History",
      v8::Persistent<v8::FunctionTemplate>(), V8History::internalFieldCount,
      History_attrs, sizeof(History_attrs)/sizeof(*History_attrs),
      History_callbacks, sizeof(History_callbacks)/sizeof(*History_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  instance->SetAccessCheckCallbacks(V8History::namedSecurityCheck, V8History::indexedSecurityCheck, v8::Integer::New(V8ClassIndex::ToInt(V8ClassIndex::HISTORY)));

  // Function 'back' (ExtAttr: 'DoNotCheckDomainSecurity')
   proto->SetAccessor(
      v8::String::New("back"),
      HistoryInternal::backAttrGetter,
      0,
      v8::Handle<v8::Value>(),
      v8::ALL_CAN_READ,
      static_cast<v8::PropertyAttribute>(v8::DontDelete|v8::ReadOnly));

  // Function 'forward' (ExtAttr: 'DoNotCheckDomainSecurity')
   proto->SetAccessor(
      v8::String::New("forward"),
      HistoryInternal::forwardAttrGetter,
      0,
      v8::Handle<v8::Value>(),
      v8::ALL_CAN_READ,
      static_cast<v8::PropertyAttribute>(v8::DontDelete|v8::ReadOnly));

  // Function 'go' (ExtAttr: 'DoNotCheckDomainSecurity')
   proto->SetAccessor(
      v8::String::New("go"),
      HistoryInternal::goAttrGetter,
      0,
      v8::Handle<v8::Value>(),
      v8::ALL_CAN_READ,
      static_cast<v8::PropertyAttribute>(v8::DontDelete|v8::ReadOnly));

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8History::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8History_raw_cache_ = createRawTemplate();
  return V8History_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8History::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8History_cache_ = ConfigureV8HistoryTemplate(GetRawTemplate());
  return V8History_cache_;
}

History* V8History::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<History*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8History::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8History::wrap(History* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::HISTORY, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<History > impl) {
  return toV8(impl.get());
}
} // namespace WebCore
