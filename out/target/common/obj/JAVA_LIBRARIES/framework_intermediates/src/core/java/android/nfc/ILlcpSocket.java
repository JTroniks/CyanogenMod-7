/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/nfc/ILlcpSocket.aidl
 */
package android.nfc;
/**
 * @hide
 */
public interface ILlcpSocket extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.nfc.ILlcpSocket
{
private static final java.lang.String DESCRIPTOR = "android.nfc.ILlcpSocket";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.nfc.ILlcpSocket interface,
 * generating a proxy if needed.
 */
public static android.nfc.ILlcpSocket asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.nfc.ILlcpSocket))) {
return ((android.nfc.ILlcpSocket)iin);
}
return new android.nfc.ILlcpSocket.Stub.Proxy(obj);
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
int _result = this.close(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_connect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.connect(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_connectByName:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.connectByName(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getLocalSap:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getLocalSap(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getLocalSocketMiu:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getLocalSocketMiu(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getLocalSocketRw:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getLocalSocketRw(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getRemoteSocketMiu:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getRemoteSocketMiu(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getRemoteSocketRw:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getRemoteSocketRw(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_receive:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new byte[_arg1_length];
}
int _result = this.receive(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
reply.writeByteArray(_arg1);
return true;
}
case TRANSACTION_send:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
int _result = this.send(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.nfc.ILlcpSocket
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
public int close(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int connect(int nativeHandle, int sap) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
_data.writeInt(sap);
mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int connectByName(int nativeHandle, java.lang.String sn) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
_data.writeString(sn);
mRemote.transact(Stub.TRANSACTION_connectByName, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getLocalSap(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_getLocalSap, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getLocalSocketMiu(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_getLocalSocketMiu, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getLocalSocketRw(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_getLocalSocketRw, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getRemoteSocketMiu(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_getRemoteSocketMiu, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getRemoteSocketRw(int nativeHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
mRemote.transact(Stub.TRANSACTION_getRemoteSocketRw, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int receive(int nativeHandle, byte[] receiveBuffer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
if ((receiveBuffer==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(receiveBuffer.length);
}
mRemote.transact(Stub.TRANSACTION_receive, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
_reply.readByteArray(receiveBuffer);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int send(int nativeHandle, byte[] data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(nativeHandle);
_data.writeByteArray(data);
mRemote.transact(Stub.TRANSACTION_send, _data, _reply, 0);
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
static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_connectByName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getLocalSap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getLocalSocketMiu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getLocalSocketRw = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getRemoteSocketMiu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getRemoteSocketRw = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_receive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_send = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
public int close(int nativeHandle) throws android.os.RemoteException;
public int connect(int nativeHandle, int sap) throws android.os.RemoteException;
public int connectByName(int nativeHandle, java.lang.String sn) throws android.os.RemoteException;
public int getLocalSap(int nativeHandle) throws android.os.RemoteException;
public int getLocalSocketMiu(int nativeHandle) throws android.os.RemoteException;
public int getLocalSocketRw(int nativeHandle) throws android.os.RemoteException;
public int getRemoteSocketMiu(int nativeHandle) throws android.os.RemoteException;
public int getRemoteSocketRw(int nativeHandle) throws android.os.RemoteException;
public int receive(int nativeHandle, byte[] receiveBuffer) throws android.os.RemoteException;
public int send(int nativeHandle, byte[] data) throws android.os.RemoteException;
}
