/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/IBluetoothHid.aidl
 */
package android.bluetooth;
/**
 * System private API for Bluetooth HID service
 *
 * {@hide}
 */
public interface IBluetoothHid extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHid
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHid";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothHid interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothHid asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothHid))) {
return ((android.bluetooth.IBluetoothHid)iin);
}
return new android.bluetooth.IBluetoothHid.Stub.Proxy(obj);
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
case TRANSACTION_connectHidDevice:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.connectHidDevice(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disconnectHidDevice:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.disconnectHidDevice(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getConnectedSinks:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice[] _result = this.getConnectedSinks();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getNonDisconnectedSinks:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice[] _result = this.getNonDisconnectedSinks();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getHidDeviceState:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getHidDeviceState(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setHidDevicePriority:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _result = this.setHidDevicePriority(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getHidDevicePriority:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getHidDevicePriority(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothHid
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
public boolean connectHidDevice(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_connectHidDevice, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean disconnectHidDevice(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_disconnectHidDevice, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.bluetooth.BluetoothDevice[] getConnectedSinks() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.bluetooth.BluetoothDevice[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConnectedSinks, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.bluetooth.BluetoothDevice.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// change to Set<> once AIDL supports

public android.bluetooth.BluetoothDevice[] getNonDisconnectedSinks() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.bluetooth.BluetoothDevice[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNonDisconnectedSinks, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.bluetooth.BluetoothDevice.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// change to Set<> once AIDL supports

public int getHidDeviceState(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getHidDeviceState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean setHidDevicePriority(android.bluetooth.BluetoothDevice device, int priority) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(priority);
mRemote.transact(Stub.TRANSACTION_setHidDevicePriority, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getHidDevicePriority(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getHidDevicePriority, _data, _reply, 0);
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
static final int TRANSACTION_connectHidDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_disconnectHidDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getConnectedSinks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getNonDisconnectedSinks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getHidDeviceState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setHidDevicePriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getHidDevicePriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public boolean connectHidDevice(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean disconnectHidDevice(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public android.bluetooth.BluetoothDevice[] getConnectedSinks() throws android.os.RemoteException;
// change to Set<> once AIDL supports

public android.bluetooth.BluetoothDevice[] getNonDisconnectedSinks() throws android.os.RemoteException;
// change to Set<> once AIDL supports

public int getHidDeviceState(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean setHidDevicePriority(android.bluetooth.BluetoothDevice device, int priority) throws android.os.RemoteException;
public int getHidDevicePriority(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
}
