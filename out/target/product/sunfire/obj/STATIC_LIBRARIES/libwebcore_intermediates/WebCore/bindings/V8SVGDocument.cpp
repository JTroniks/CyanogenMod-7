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


#if ENABLE(SVG)

#include "ExceptionCode.h"
#include "V8Document.h"
#include "V8Event.h"
#include "V8SVGDocument.h"
#include "V8SVGSVGElement.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace SVGDocumentInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> rootElementAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.SVGDocument.rootElement._get");
    SVGDocument* imp = V8SVGDocument::toNative(info.Holder());
    return toV8(imp->rootElement());
  }

  static v8::Handle<v8::Value> createEventCallback(const v8::Arguments& args) {
    INC_STATS("DOM.SVGDocument.createEvent");
    SVGDocument* imp = V8SVGDocument::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    V8Parameter<> eventType = args[0];
    RefPtr<Event> result = imp->createEvent(eventType, ec);
    if (UNLIKELY(ec)) goto fail;
    return toV8(result.release());
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

} // namespace SVGDocumentInternal

static const BatchedAttribute SVGDocument_attrs[] = {
    {
        // Attribute 'rootElement' (Type: 'readonly attribute' ExtAttr: '')
        "rootElement",
        SVGDocumentInternal::rootElementAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedCallback SVGDocument_callbacks[] = {
  {"createEvent", SVGDocumentInternal::createEventCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8SVGDocumentTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "SVGDocument",
      V8Document::GetTemplate(), V8SVGDocument::internalFieldCount,
      SVGDocument_attrs, sizeof(SVGDocument_attrs)/sizeof(*SVGDocument_attrs),
      SVGDocument_callbacks, sizeof(SVGDocument_callbacks)/sizeof(*SVGDocument_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8SVGDocument::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8SVGDocument_raw_cache_ = createRawTemplate();
  return V8SVGDocument_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8SVGDocument::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8SVGDocument_cache_ = ConfigureV8SVGDocumentTemplate(GetRawTemplate());
  return V8SVGDocument_cache_;
}

SVGDocument* V8SVGDocument::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<SVGDocument*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8SVGDocument::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8SVGDocument::wrap(SVGDocument* impl, bool forceNewObject) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  if (impl->document()) {
    proxy = V8Proxy::retrieve(impl->document()->frame());
    if (proxy && static_cast<Node*>(impl->document()) == static_cast<Node*>(impl))
      proxy->windowShell()->initContextIfNeeded();
  }

  if (!forceNewObject) {
  wrapper = V8DOMWrapper::getWrapper(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  }

  v8::Handle<v8::Context> context;
  if (proxy)
    context = proxy->context();

  // Enter the node's context and create the wrapper in that context.
  if (!context.IsEmpty())
    context->Enter();
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::SVGDOCUMENT, impl);
  // Exit the node's context if it was entered.
  if (!context.IsEmpty())
    context->Exit();
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMNodeMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<SVGDocument > impl, bool forceNewObject) {
  return toV8(impl.get(), forceNewObject);
}
} // namespace WebCore

#endif // ENABLE(SVG)
