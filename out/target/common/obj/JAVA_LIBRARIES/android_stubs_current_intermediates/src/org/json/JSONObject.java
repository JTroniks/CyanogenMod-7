package org.json;
public class JSONObject
{
public  JSONObject() { throw new RuntimeException("Stub!"); }
public  JSONObject(java.util.Map copyFrom) { throw new RuntimeException("Stub!"); }
public  JSONObject(org.json.JSONTokener readFrom) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  JSONObject(java.lang.String json) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  JSONObject(org.json.JSONObject copyFrom, java.lang.String[] names) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  int length() { throw new RuntimeException("Stub!"); }
public  org.json.JSONObject put(java.lang.String name, boolean value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  org.json.JSONObject put(java.lang.String name, double value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  org.json.JSONObject put(java.lang.String name, int value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  org.json.JSONObject put(java.lang.String name, long value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  org.json.JSONObject put(java.lang.String name, java.lang.Object value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  org.json.JSONObject putOpt(java.lang.String name, java.lang.Object value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  org.json.JSONObject accumulate(java.lang.String name, java.lang.Object value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  java.lang.Object remove(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean isNull(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean has(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.Object get(java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  java.lang.Object opt(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean getBoolean(java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  boolean optBoolean(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean optBoolean(java.lang.String name, boolean fallback) { throw new RuntimeException("Stub!"); }
public  double getDouble(java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  double optDouble(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  double optDouble(java.lang.String name, double fallback) { throw new RuntimeException("Stub!"); }
public  int getInt(java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  int optInt(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  int optInt(java.lang.String name, int fallback) { throw new RuntimeException("Stub!"); }
public  long getLong(java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  long optLong(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  long optLong(java.lang.String name, long fallback) { throw new RuntimeException("Stub!"); }
public  java.lang.String getString(java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  java.lang.String optString(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String optString(java.lang.String name, java.lang.String fallback) { throw new RuntimeException("Stub!"); }
public  org.json.JSONArray getJSONArray(java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  org.json.JSONArray optJSONArray(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.json.JSONObject getJSONObject(java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  org.json.JSONObject optJSONObject(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.json.JSONArray toJSONArray(org.json.JSONArray names) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public  java.util.Iterator keys() { throw new RuntimeException("Stub!"); }
public  org.json.JSONArray names() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString(int indentSpaces) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public static  java.lang.String numberToString(java.lang.Number number) throws org.json.JSONException { throw new RuntimeException("Stub!"); }
public static  java.lang.String quote(java.lang.String data) { throw new RuntimeException("Stub!"); }
public static final java.lang.Object NULL;
static { NULL = null; }
}
