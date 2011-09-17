/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/nfc/ILlcpServiceSocket.aidl
 */
package android.nfc;
/**
 * {@hide}
 */
public interface ILlcpServiceSocket extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.nfc.ILlcpServiceSocket
{
private static final java.lang.String DESCRIPTOR = "android.nfc.ILlcpServiceSocket";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.nfc.ILlcpServiceSocket interface,
 * generating a proxy if needed.
 */
public static android.nfc.ILlcpServiceSocket asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.nfc.ILlcpServiceSocket))) {
return ((android.nfc.ILlcpServiceSocket)iin);
}
return new android.nfc.ILlcpServiceSocket.Stub.Proxy(obj);
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
case TRANSACTION_accept:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.accept(_arg0);
reply.writeNoException();
reply.writeInt(_result);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.nfc.ILlcpServiceSocket
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
public int accept(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_accept, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
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
}
static final int TRANSACTION_accept = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public int accept(int nativeHandle) throws android.os.RemoteException;
public void close(int nativeHandle) throws android.os.RemoteException;
}
