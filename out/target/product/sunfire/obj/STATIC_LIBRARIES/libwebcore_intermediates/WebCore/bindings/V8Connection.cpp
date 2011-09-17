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

#include "V8Connection.h"

namespace WebCore {
namespace ConnectionInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> typeAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.Connection.type._get");
    Connection* imp = V8Connection::toNative(info.Holder());
    return v8::Integer::New(imp->type());
  }

} // namespace ConnectionInternal

static const BatchedAttribute Connection_attrs[] = {
    {
        // Attribute 'type' (Type: 'readonly attribute' ExtAttr: '')
        "type",
        ConnectionInternal::typeAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedConstant Connection_consts[] = {
  { "UNKNOWN", static_cast<signed int>(0) },
  { "ETHERNET", static_cast<signed int>(1) },
  { "WIFI", static_cast<signed int>(2) },
  { "CELL_2G", static_cast<signed int>(3) },
  { "CELL_3G", static_cast<signed int>(4) },
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8ConnectionTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "Connection",
      v8::Persistent<v8::FunctionTemplate>(), V8Connection::internalFieldCount,
      Connection_attrs, sizeof(Connection_attrs)/sizeof(*Connection_attrs),
      NULL, 0);
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  
  batchConfigureConstants(desc, proto, Connection_consts, sizeof(Connection_consts)/sizeof(*Connection_consts));

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8Connection::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8Connection_raw_cache_ = createRawTemplate();
  return V8Connection_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8Connection::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8Connection_cache_ = ConfigureV8ConnectionTemplate(GetRawTemplate());
  return V8Connection_cache_;
}

Connection* V8Connection::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<Connection*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8Connection::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8Connection::wrap(Connection* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::CONNECTION, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<Connection > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(Connection* impl) {
  if (!impl)
    return v8::Null();
  return V8Connection::wrap(impl);
}
} // namespace WebCore
