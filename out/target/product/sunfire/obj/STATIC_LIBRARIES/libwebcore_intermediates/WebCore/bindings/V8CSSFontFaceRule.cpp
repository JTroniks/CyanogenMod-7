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

#include "CSSMutableStyleDeclaration.h"
#include "V8CSSFontFaceRule.h"
#include "V8CSSRule.h"
#include "V8CSSStyleDeclaration.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace CSSFontFaceRuleInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> styleAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CSSFontFaceRule.style._get");
    CSSFontFaceRule* imp = V8CSSFontFaceRule::toNative(info.Holder());
    return toV8(imp->style());
  }

} // namespace CSSFontFaceRuleInternal

static const BatchedAttribute CSSFontFaceRule_attrs[] = {
    {
        // Attribute 'style' (Type: 'readonly attribute' ExtAttr: '')
        "style",
        CSSFontFaceRuleInternal::styleAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8CSSFontFaceRuleTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "CSSFontFaceRule",
      V8CSSRule::GetTemplate(), V8CSSFontFaceRule::internalFieldCount,
      CSSFontFaceRule_attrs, sizeof(CSSFontFaceRule_attrs)/sizeof(*CSSFontFaceRule_attrs),
      NULL, 0);
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8CSSFontFaceRule::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8CSSFontFaceRule_raw_cache_ = createRawTemplate();
  return V8CSSFontFaceRule_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8CSSFontFaceRule::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8CSSFontFaceRule_cache_ = ConfigureV8CSSFontFaceRuleTemplate(GetRawTemplate());
  return V8CSSFontFaceRule_cache_;
}

CSSFontFaceRule* V8CSSFontFaceRule::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<CSSFontFaceRule*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8CSSFontFaceRule::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8CSSFontFaceRule::wrap(CSSFontFaceRule* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::CSSFONTFACERULE, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<CSSFontFaceRule > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(CSSFontFaceRule* impl) {
  if (!impl)
    return v8::Null();
  return V8CSSFontFaceRule::wrap(impl);
}
} // namespace WebCore
