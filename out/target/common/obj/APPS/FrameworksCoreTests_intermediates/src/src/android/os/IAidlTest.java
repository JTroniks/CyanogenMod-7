/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/tests/coretests/src/android/os/IAidlTest.aidl
 */
package android.os;
public interface IAidlTest extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.IAidlTest
{
private static final java.lang.String DESCRIPTOR = "android.os.IAidlTest";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.IAidlTest interface,
 * generating a proxy if needed.
 */
public static android.os.IAidlTest asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.IAidlTest))) {
return ((android.os.IAidlTest)iin);
}
return new android.os.IAidlTest.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_intMethod:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.intMethod(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_parcelableIn:
{
data.enforceInterface(DESCRIPTOR);
android.os.AidlTest.TestParcelable _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.AidlTest.TestParcelable.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.AidlTest.TestParcelable _result = this.parcelableIn(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_parcelableOut:
{
data.enforceInterface(DESCRIPTOR);
android.os.AidlTest.TestParcelable _arg0;
_arg0 = new android.os.AidlTest.TestParcelable();
android.os.AidlTest.TestParcelable _result = this.parcelableOut(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_parcelableInOut:
{
data.enforceInterface(DESCRIPTOR);
android.os.AidlTest.TestParcelable _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.AidlTest.TestParcelable.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.AidlTest.TestParcelable _result = this.parcelableInOut(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_listParcelableLonger:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.os.AidlTest.TestParcelable> _arg0;
_arg0 = data.createTypedArrayList(android.os.AidlTest.TestParcelable.CREATOR);
int _arg1;
_arg1 = data.readInt();
android.os.AidlTest.TestParcelable _result = this.listParcelableLonger(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
reply.writeTypedList(_arg0);
return true;
}
case TRANSACTION_listParcelableShorter:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.os.AidlTest.TestParcelable> _arg0;
_arg0 = data.createTypedArrayList(android.os.AidlTest.TestParcelable.CREATOR);
int _arg1;
_arg1 = data.readInt();
int _result = this.listParcelableShorter(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
reply.writeTypedList(_arg0);
return true;
}
case TRANSACTION_booleanArray:
{
data.enforceInterface(DESCRIPTOR);
boolean[] _arg0;
_arg0 = data.createBooleanArray();
boolean[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new boolean[_arg1_length];
}
boolean[] _arg2;
_arg2 = data.createBooleanArray();
boolean[] _result = this.booleanArray(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeBooleanArray(_result);
reply.writeBooleanArray(_arg1);
reply.writeBooleanArray(_arg2);
return true;
}
case TRANSACTION_charArray:
{
data.enforceInterface(DESCRIPTOR);
char[] _arg0;
_arg0 = data.createCharArray();
char[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new char[_arg1_length];
}
char[] _arg2;
_arg2 = data.createCharArray();
char[] _result = this.charArray(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeCharArray(_result);
reply.writeCharArray(_arg1);
reply.writeCharArray(_arg2);
return true;
}
case TRANSACTION_intArray:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
int[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new int[_arg1_length];
}
int[] _arg2;
_arg2 = data.createIntArray();
int[] _result = this.intArray(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeIntArray(_result);
reply.writeIntArray(_arg1);
reply.writeIntArray(_arg2);
return true;
}
case TRANSACTION_longArray:
{
data.enforceInterface(DESCRIPTOR);
long[] _arg0;
_arg0 = data.createLongArray();
long[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new long[_arg1_length];
}
long[] _arg2;
_arg2 = data.createLongArray();
long[] _result = this.longArray(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLongArray(_result);
reply.writeLongArray(_arg1);
reply.writeLongArray(_arg2);
return true;
}
case TRANSACTION_floatArray:
{
data.enforceInterface(DESCRIPTOR);
float[] _arg0;
_arg0 = data.createFloatArray();
float[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new float[_arg1_length];
}
float[] _arg2;
_arg2 = data.createFloatArray();
float[] _result = this.floatArray(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeFloatArray(_result);
reply.writeFloatArray(_arg1);
reply.writeFloatArray(_arg2);
return true;
}
case TRANSACTION_doubleArray:
{
data.enforceInterface(DESCRIPTOR);
double[] _arg0;
_arg0 = data.createDoubleArray();
double[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new double[_arg1_length];
}
double[] _arg2;
_arg2 = data.createDoubleArray();
double[] _result = this.doubleArray(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeDoubleArray(_result);
reply.writeDoubleArray(_arg1);
reply.writeDoubleArray(_arg2);
return true;
}
case TRANSACTION_stringArray:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _arg0;
_arg0 = data.createStringArray();
java.lang.String[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new java.lang.String[_arg1_length];
}
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
java.lang.String[] _result = this.stringArray(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeStringArray(_result);
reply.writeStringArray(_arg1);
reply.writeStringArray(_arg2);
return true;
}
case TRANSACTION_parcelableArray:
{
data.enforceInterface(DESCRIPTOR);
android.os.AidlTest.TestParcelable[] _arg0;
_arg0 = data.createTypedArray(android.os.AidlTest.TestParcelable.CREATOR);
android.os.AidlTest.TestParcelable[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new android.os.AidlTest.TestParcelable[_arg1_length];
}
android.os.AidlTest.TestParcelable[] _arg2;
_arg2 = data.createTypedArray(android.os.AidlTest.TestParcelable.CREATOR);
android.os.AidlTest.TestParcelable[] _result = this.parcelableArray(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
reply.writeTypedArray(_arg1, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
reply.writeTypedArray(_arg2, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_voidSecurityException:
{
data.enforceInterface(DESCRIPTOR);
this.voidSecurityException();
reply.writeNoException();
return true;
}
case TRANSACTION_intSecurityException:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.intSecurityException();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.IAidlTest
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public int intMethod(int a) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(a);
mRemote.transact(Stub.TRANSACTION_intMethod, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.os.AidlTest.TestParcelable parcelableIn(android.os.AidlTest.TestParcelable p) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.AidlTest.TestParcelable _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((p!=null)) {
_data.writeInt(1);
p.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_parcelableIn, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.AidlTest.TestParcelable.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.os.AidlTest.TestParcelable parcelableOut(android.os.AidlTest.TestParcelable p) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.AidlTest.TestParcelable _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_parcelableOut, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.AidlTest.TestParcelable.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
if ((0!=_reply.readInt())) {
p.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.os.AidlTest.TestParcelable parcelableInOut(android.os.AidlTest.TestParcelable p) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.AidlTest.TestParcelable _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((p!=null)) {
_data.writeInt(1);
p.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_parcelableInOut, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.AidlTest.TestParcelable.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
if ((0!=_reply.readInt())) {
p.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.os.AidlTest.TestParcelable listParcelableLonger(java.util.List<android.os.AidlTest.TestParcelable> list, int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.AidlTest.TestParcelable _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(list);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_listParcelableLonger, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.AidlTest.TestParcelable.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
_reply.readTypedList(list, android.os.AidlTest.TestParcelable.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int listParcelableShorter(java.util.List<android.os.AidlTest.TestParcelable> list, int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(list);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_listParcelableShorter, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
_reply.readTypedList(list, android.os.AidlTest.TestParcelable.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean[] booleanArray(boolean[] a0, boolean[] a1, boolean[] a2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeBooleanArray(a0);
if ((a1==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(a1.length);
}
_data.writeBooleanArray(a2);
mRemote.transact(Stub.TRANSACTION_booleanArray, _data, _reply, 0);
_reply.readException();
_result = _reply.createBooleanArray();
_reply.readBooleanArray(a1);
_reply.readBooleanArray(a2);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public char[] charArray(char[] a0, char[] a1, char[] a2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
char[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeCharArray(a0);
if ((a1==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(a1.length);
}
_data.writeCharArray(a2);
mRemote.transact(Stub.TRANSACTION_charArray, _data, _reply, 0);
_reply.readException();
_result = _reply.createCharArray();
_reply.readCharArray(a1);
_reply.readCharArray(a2);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int[] intArray(int[] a0, int[] a1, int[] a2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(a0);
if ((a1==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(a1.length);
}
_data.writeIntArray(a2);
mRemote.transact(Stub.TRANSACTION_intArray, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
_reply.readIntArray(a1);
_reply.readIntArray(a2);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long[] longArray(long[] a0, long[] a1, long[] a2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLongArray(a0);
if ((a1==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(a1.length);
}
_data.writeLongArray(a2);
mRemote.transact(Stub.TRANSACTION_longArray, _data, _reply, 0);
_reply.readException();
_result = _reply.createLongArray();
_reply.readLongArray(a1);
_reply.readLongArray(a2);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public float[] floatArray(float[] a0, float[] a1, float[] a2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloatArray(a0);
if ((a1==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(a1.length);
}
_data.writeFloatArray(a2);
mRemote.transact(Stub.TRANSACTION_floatArray, _data, _reply, 0);
_reply.readException();
_result = _reply.createFloatArray();
_reply.readFloatArray(a1);
_reply.readFloatArray(a2);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public double[] doubleArray(double[] a0, double[] a1, double[] a2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
double[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeDoubleArray(a0);
if ((a1==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(a1.length);
}
_data.writeDoubleArray(a2);
mRemote.transact(Stub.TRANSACTION_doubleArray, _data, _reply, 0);
_reply.readException();
_result = _reply.createDoubleArray();
_reply.readDoubleArray(a1);
_reply.readDoubleArray(a2);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String[] stringArray(java.lang.String[] a0, java.lang.String[] a1, java.lang.String[] a2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringArray(a0);
if ((a1==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(a1.length);
}
_data.writeStringArray(a2);
mRemote.transact(Stub.TRANSACTION_stringArray, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
_reply.readStringArray(a1);
_reply.readStringArray(a2);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.os.AidlTest.TestParcelable[] parcelableArray(android.os.AidlTest.TestParcelable[] a0, android.os.AidlTest.TestParcelable[] a1, android.os.AidlTest.TestParcelable[] a2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.AidlTest.TestParcelable[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(a0, 0);
if ((a1==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(a1.length);
}
_data.writeTypedArray(a2, 0);
mRemote.transact(Stub.TRANSACTION_parcelableArray, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.os.AidlTest.TestParcelable.CREATOR);
_reply.readTypedArray(a1, android.os.AidlTest.TestParcelable.CREATOR);
_reply.readTypedArray(a2, android.os.AidlTest.TestParcelable.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void voidSecurityException() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_voidSecurityException, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int intSecurityException() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_intSecurityException, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_intMethod = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_parcelableIn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_parcelableOut = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_parcelableInOut = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_listParcelableLonger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_listParcelableShorter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_booleanArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_charArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_intArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_longArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_floatArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_doubleArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_stringArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_parcelableArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_voidSecurityException = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_intSecurityException = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
}
public int intMethod(int a) throws android.os.RemoteException;
public android.os.AidlTest.TestParcelable parcelableIn(android.os.AidlTest.TestParcelable p) throws android.os.RemoteException;
public android.os.AidlTest.TestParcelable parcelableOut(android.os.AidlTest.TestParcelable p) throws android.os.RemoteException;
public android.os.AidlTest.TestParcelable parcelableInOut(android.os.AidlTest.TestParcelable p) throws android.os.RemoteException;
public android.os.AidlTest.TestParcelable listParcelableLonger(java.util.List<android.os.AidlTest.TestParcelable> list, int index) throws android.os.RemoteException;
public int listParcelableShorter(java.util.List<android.os.AidlTest.TestParcelable> list, int index) throws android.os.RemoteException;
public boolean[] booleanArray(boolean[] a0, boolean[] a1, boolean[] a2) throws android.os.RemoteException;
public char[] charArray(char[] a0, char[] a1, char[] a2) throws android.os.RemoteException;
public int[] intArray(int[] a0, int[] a1, int[] a2) throws android.os.RemoteException;
public long[] longArray(long[] a0, long[] a1, long[] a2) throws android.os.RemoteException;
public float[] floatArray(float[] a0, float[] a1, float[] a2) throws android.os.RemoteException;
public double[] doubleArray(double[] a0, double[] a1, double[] a2) throws android.os.RemoteException;
public java.lang.String[] stringArray(java.lang.String[] a0, java.lang.String[] a1, java.lang.String[] a2) throws android.os.RemoteException;
public android.os.AidlTest.TestParcelable[] parcelableArray(android.os.AidlTest.TestParcelable[] a0, android.os.AidlTest.TestParcelable[] a1, android.os.AidlTest.TestParcelable[] a2) throws android.os.RemoteException;
public void voidSecurityException() throws android.os.RemoteException;
public int intSecurityException() throws android.os.RemoteException;
}
