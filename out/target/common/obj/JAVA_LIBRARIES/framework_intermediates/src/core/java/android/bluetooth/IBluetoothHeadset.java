/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/IBluetoothHeadset.aidl
 */
package android.bluetooth;
/**
 * System private API for Bluetooth Headset service
 *
 * {@hide}
 */
public interface IBluetoothHeadset extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHeadset
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHeadset";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothHeadset interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothHeadset asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothHeadset))) {
return ((android.bluetooth.IBluetoothHeadset)iin);
}
return new android.bluetooth.IBluetoothHeadset.Stub.Proxy(obj);
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
case TRANSACTION_getState:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getState(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCurrentHeadset:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _result = this.getCurrentHeadset();
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
case TRANSACTION_connectHeadset:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.connectHeadset(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disconnectHeadset:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.disconnectHeadset(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isConnected:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isConnected(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startVoiceRecognition:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.startVoiceRecognition();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopVoiceRecognition:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.stopVoiceRecognition();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPriority:
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
boolean _result = this.setPriority(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPriority:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getPriority(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getBatteryUsageHint:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getBatteryUsageHint();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_createIncomingConnect:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.createIncomingConnect(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_acceptIncomingConnect:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.acceptIncomingConnect(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_rejectIncomingConnect:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.rejectIncomingConnect(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_cancelConnectThread:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.cancelConnectThread();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_connectHeadsetInternal:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.connectHeadsetInternal(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disconnectHeadsetInternal:
{
data.enforceInterface(DESCRIPTOR);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.disconnectHeadsetInternal(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothHeadset
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
public int getState(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_getState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.bluetooth.BluetoothDevice getCurrentHeadset() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.bluetooth.BluetoothDevice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentHeadset, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(_reply);
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
public boolean connectHeadset(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_connectHeadset, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void disconnectHeadset(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_disconnectHeadset, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean isConnected(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_isConnected, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean startVoiceRecognition() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startVoiceRecognition, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean stopVoiceRecognition() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopVoiceRecognition, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean setPriority(android.bluetooth.BluetoothDevice device, int priority) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_setPriority, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getPriority(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_getPriority, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getBatteryUsageHint() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBatteryUsageHint, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean createIncomingConnect(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_createIncomingConnect, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean acceptIncomingConnect(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_acceptIncomingConnect, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean rejectIncomingConnect(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_rejectIncomingConnect, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean cancelConnectThread() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelConnectThread, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean connectHeadsetInternal(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_connectHeadsetInternal, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean disconnectHeadsetInternal(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_disconnectHeadsetInternal, _data, _reply, 0);
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
static final int TRANSACTION_getState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getCurrentHeadset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_connectHeadset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_disconnectHeadset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_startVoiceRecognition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_stopVoiceRecognition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setPriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getPriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getBatteryUsageHint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_createIncomingConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_acceptIncomingConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_rejectIncomingConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_cancelConnectThread = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_connectHeadsetInternal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_disconnectHeadsetInternal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
}
public int getState(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public android.bluetooth.BluetoothDevice getCurrentHeadset() throws android.os.RemoteException;
public boolean connectHeadset(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public void disconnectHeadset(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean isConnected(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean startVoiceRecognition() throws android.os.RemoteException;
public boolean stopVoiceRecognition() throws android.os.RemoteException;
public boolean setPriority(android.bluetooth.BluetoothDevice device, int priority) throws android.os.RemoteException;
public int getPriority(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public int getBatteryUsageHint() throws android.os.RemoteException;
public boolean createIncomingConnect(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean acceptIncomingConnect(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean rejectIncomingConnect(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean cancelConnectThread() throws android.os.RemoteException;
public boolean connectHeadsetInternal(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public boolean disconnectHeadsetInternal(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
}
