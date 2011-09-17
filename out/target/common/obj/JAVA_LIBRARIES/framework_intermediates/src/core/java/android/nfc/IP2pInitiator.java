/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/nfc/IP2pInitiator.aidl
 */
package android.nfc;
/**
 * @hide
 */
public interface IP2pInitiator extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.nfc.IP2pInitiator
{
private static final java.lang.String DESCRIPTOR = "android.nfc.IP2pInitiator";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.nfc.IP2pInitiator interface,
 * generating a proxy if needed.
 */
public static android.nfc.IP2pInitiator asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.nfc.IP2pInitiator))) {
return ((android.nfc.IP2pInitiator)iin);
}
return new android.nfc.IP2pInitiator.Stub.Proxy(obj);
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
case TRANSACTION_getGeneralBytes:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _result = this.getGeneralBytes(_arg0);
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_getMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getMode(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_receive:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _result = this.receive(_arg0);
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_send:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
boolean _result = this.send(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.nfc.IP2pInitiator
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
public byte[] getGeneralBytes(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_getGeneralBytes, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getMode(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_getMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public byte[] receive(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_receive, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean send(int nativeHandle, byte[] data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
_data.writeByteArray(data);
mRemote.transact(Stub.TRANSACTION_send, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getGeneralBytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_receive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_send = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public byte[] getGeneralBytes(int nativeHandle) throws android.os.RemoteException;
public int getMode(int nativeHandle) throws android.os.RemoteException;
public byte[] receive(int nativeHandle) throws android.os.RemoteException;
public boolean send(int nativeHandle, byte[] data) throws android.os.RemoteException;
}
