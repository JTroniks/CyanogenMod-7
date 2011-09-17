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

#ifndef V8HTMLAppletElement_H
#define V8HTMLAppletElement_H

#include <v8.h>
#include <wtf/HashMap.h>
#include "StringHash.h"
#include "V8Index.h"
#include "HTMLAppletElement.h"

namespace WebCore {

class V8HTMLAppletElement {

 public:
  static bool HasInstance(v8::Handle<v8::Value> value);
  static v8::Persistent<v8::FunctionTemplate> GetRawTemplate();
  static v8::Persistent<v8::FunctionTemplate> GetTemplate();
  static HTMLAppletElement* toNative(v8::Handle<v8::Object>);
  static v8::Handle<v8::Object> wrap(HTMLAppletElement*);
  static v8::Handle<v8::Value> indexedPropertyGetter(uint32_t index, const v8::AccessorInfo& info);
  static v8::Handle<v8::Value> indexedPropertySetter(uint32_t index, v8::Local<v8::Value> value, const v8::AccessorInfo& info);
  static v8::Handle<v8::Value> namedPropertyGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info);
  static v8::Handle<v8::Value> namedPropertySetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info);
  static v8::Handle<v8::Value> callAsFunctionCallback(const v8::Arguments&);
  static const int cacheIndex = v8DefaultWrapperInternalFieldCount + 0;
  static const int internalFieldCount = v8DefaultWrapperInternalFieldCount + 1;
};

  v8::Handle<v8::Value> toV8(HTMLAppletElement*);
  v8::Handle<v8::Value> toV8(PassRefPtr<HTMLAppletElement >);
}

#endif // V8HTMLAppletElement_H
