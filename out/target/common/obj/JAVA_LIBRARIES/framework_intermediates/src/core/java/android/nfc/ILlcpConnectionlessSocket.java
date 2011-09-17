/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/nfc/ILlcpConnectionlessSocket.aidl
 */
package android.nfc;
/**
 * @hide
 */
public interface ILlcpConnectionlessSocket extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.nfc.ILlcpConnectionlessSocket
{
private static final java.lang.String DESCRIPTOR = "android.nfc.ILlcpConnectionlessSocket";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.nfc.ILlcpConnectionlessSocket interface,
 * generating a proxy if needed.
 */
public static android.nfc.ILlcpConnectionlessSocket asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.nfc.ILlcpConnectionlessSocket))) {
return ((android.nfc.ILlcpConnectionlessSocket)iin);
}
return new android.nfc.ILlcpConnectionlessSocket.Stub.Proxy(obj);
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
case TRANSACTION_close:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.close(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getSap:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getSap(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_receiveFrom:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.nfc.LlcpPacket _result = this.receiveFrom(_arg0);
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
case TRANSACTION_sendTo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.nfc.LlcpPacket _arg1;
if ((0!=data.readInt())) {
_arg1 = android.nfc.LlcpPacket.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _result = this.sendTo(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.nfc.ILlcpConnectionlessSocket
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
public void close(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getSap(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_getSap, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.nfc.LlcpPacket receiveFrom(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.nfc.LlcpPacket _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_receiveFrom, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.nfc.LlcpPacket.CREATOR.createFromParcel(_reply);
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
public int sendTo(int nativeHandle, android.nfc.LlcpPacket packet) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
if ((packet!=null)) {
_data.writeInt(1);
packet.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendTo, _data, _reply, 0);
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
static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getSap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_receiveFrom = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_sendTo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void close(int nativeHandle) throws android.os.RemoteException;
public int getSap(int nativeHandle) throws android.os.RemoteException;
public android.nfc.LlcpPacket receiveFrom(int nativeHandle) throws android.os.RemoteException;
public int sendTo(int nativeHandle, android.nfc.LlcpPacket packet) throws android.os.RemoteException;
}
