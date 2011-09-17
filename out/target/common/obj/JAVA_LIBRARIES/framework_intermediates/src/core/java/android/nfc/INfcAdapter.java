/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/nfc/INfcAdapter.aidl
 */
package android.nfc;
/**
 * @hide
 */
public interface INfcAdapter extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.nfc.INfcAdapter
{
private static final java.lang.String DESCRIPTOR = "android.nfc.INfcAdapter";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.nfc.INfcAdapter interface,
 * generating a proxy if needed.
 */
public static android.nfc.INfcAdapter asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.nfc.INfcAdapter))) {
return ((android.nfc.INfcAdapter)iin);
}
return new android.nfc.INfcAdapter.Stub.Proxy(obj);
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
case TRANSACTION_getLlcpInterface:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.ILlcpSocket _result = this.getLlcpInterface();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getLlcpConnectionlessInterface:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.ILlcpConnectionlessSocket _result = this.getLlcpConnectionlessInterface();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getLlcpServiceInterface:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.ILlcpServiceSocket _result = this.getLlcpServiceInterface();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getNfcTagInterface:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.INfcTag _result = this.getNfcTagInterface();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getP2pTargetInterface:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.IP2pTarget _result = this.getP2pTargetInterface();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getP2pInitiatorInterface:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.IP2pInitiator _result = this.getP2pInitiatorInterface();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getNfcAdapterExtrasInterface:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.INfcAdapterExtras _result = this.getNfcAdapterExtrasInterface();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_isEnabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isEnabled();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_localGet:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.NdefMessage _result = this.localGet();
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
case TRANSACTION_localSet:
{
data.enforceInterface(DESCRIPTOR);
android.nfc.NdefMessage _arg0;
if ((0!=data.readInt())) {
_arg0 = android.nfc.NdefMessage.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.localSet(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_enableForegroundDispatch:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.app.PendingIntent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.content.IntentFilter[] _arg2;
_arg2 = data.createTypedArray(android.content.IntentFilter.CREATOR);
android.nfc.TechListParcel _arg3;
if ((0!=data.readInt())) {
_arg3 = android.nfc.TechListParcel.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.enableForegroundDispatch(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_disableForegroundDispatch:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.disableForegroundDispatch(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_enableForegroundNdefPush:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.nfc.NdefMessage _arg1;
if ((0!=data.readInt())) {
_arg1 = android.nfc.NdefMessage.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.enableForegroundNdefPush(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_disableForegroundNdefPush:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.disableForegroundNdefPush(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_createLlcpConnectionlessSocket:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.createLlcpConnectionlessSocket(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_createLlcpServiceSocket:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _result = this.createLlcpServiceSocket(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_createLlcpSocket:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _result = this.createLlcpSocket(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_disable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.disable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_enable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.enable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getProperties:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getProperties(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setProperties:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.setProperties(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.nfc.INfcAdapter
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
public android.nfc.ILlcpSocket getLlcpInterface() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.nfc.ILlcpSocket _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLlcpInterface, _data, _reply, 0);
_reply.readException();
_result = android.nfc.ILlcpSocket.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.nfc.ILlcpConnectionlessSocket getLlcpConnectionlessInterface() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.nfc.ILlcpConnectionlessSocket _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLlcpConnectionlessInterface, _data, _reply, 0);
_reply.readException();
_result = android.nfc.ILlcpConnectionlessSocket.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.nfc.ILlcpServiceSocket getLlcpServiceInterface() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.nfc.ILlcpServiceSocket _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLlcpServiceInterface, _data, _reply, 0);
_reply.readException();
_result = android.nfc.ILlcpServiceSocket.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.nfc.INfcTag getNfcTagInterface() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.nfc.INfcTag _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNfcTagInterface, _data, _reply, 0);
_reply.readException();
_result = android.nfc.INfcTag.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.nfc.IP2pTarget getP2pTargetInterface() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.nfc.IP2pTarget _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getP2pTargetInterface, _data, _reply, 0);
_reply.readException();
_result = android.nfc.IP2pTarget.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.nfc.IP2pInitiator getP2pInitiatorInterface() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.nfc.IP2pInitiator _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getP2pInitiatorInterface, _data, _reply, 0);
_reply.readException();
_result = android.nfc.IP2pInitiator.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.nfc.INfcAdapterExtras getNfcAdapterExtrasInterface() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.nfc.INfcAdapterExtras _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNfcAdapterExtrasInterface, _data, _reply, 0);
_reply.readException();
_result = android.nfc.INfcAdapterExtras.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// NfcAdapter-class related methods

public boolean isEnabled() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.nfc.NdefMessage localGet() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.nfc.NdefMessage _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_localGet, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.nfc.NdefMessage.CREATOR.createFromParcel(_reply);
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
public void localSet(android.nfc.NdefMessage message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((message!=null)) {
_data.writeInt(1);
message.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_localSet, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void enableForegroundDispatch(android.content.ComponentName activity, android.app.PendingIntent intent, android.content.IntentFilter[] filters, android.nfc.TechListParcel techLists) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((activity!=null)) {
_data.writeInt(1);
activity.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeTypedArray(filters, 0);
if ((techLists!=null)) {
_data.writeInt(1);
techLists.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_enableForegroundDispatch, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void disableForegroundDispatch(android.content.ComponentName activity) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((activity!=null)) {
_data.writeInt(1);
activity.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_disableForegroundDispatch, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void enableForegroundNdefPush(android.content.ComponentName activity, android.nfc.NdefMessage msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((activity!=null)) {
_data.writeInt(1);
activity.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((msg!=null)) {
_data.writeInt(1);
msg.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_enableForegroundNdefPush, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void disableForegroundNdefPush(android.content.ComponentName activity) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((activity!=null)) {
_data.writeInt(1);
activity.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_disableForegroundNdefPush, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Non-public methods
// TODO: check and complete

public int createLlcpConnectionlessSocket(int sap) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sap);
mRemote.transact(Stub.TRANSACTION_createLlcpConnectionlessSocket, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int createLlcpServiceSocket(int sap, java.lang.String sn, int miu, int rw, int linearBufferLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sap);
_data.writeString(sn);
_data.writeInt(miu);
_data.writeInt(rw);
_data.writeInt(linearBufferLength);
mRemote.transact(Stub.TRANSACTION_createLlcpServiceSocket, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int createLlcpSocket(int sap, int miu, int rw, int linearBufferLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sap);
_data.writeInt(miu);
_data.writeInt(rw);
_data.writeInt(linearBufferLength);
mRemote.transact(Stub.TRANSACTION_createLlcpSocket, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean disable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean enable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getProperties(java.lang.String param) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(param);
mRemote.transact(Stub.TRANSACTION_getProperties, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int setProperties(java.lang.String param, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(param);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setProperties, _data, _reply, 0);
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
static final int TRANSACTION_getLlcpInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getLlcpConnectionlessInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getLlcpServiceInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getNfcTagInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getP2pTargetInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getP2pInitiatorInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getNfcAdapterExtrasInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_localGet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_localSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_enableForegroundDispatch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_disableForegroundDispatch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_enableForegroundNdefPush = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_disableForegroundNdefPush = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_createLlcpConnectionlessSocket = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_createLlcpServiceSocket = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_createLlcpSocket = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_disable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_enable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_setProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
}
public android.nfc.ILlcpSocket getLlcpInterface() throws android.os.RemoteException;
public android.nfc.ILlcpConnectionlessSocket getLlcpConnectionlessInterface() throws android.os.RemoteException;
public android.nfc.ILlcpServiceSocket getLlcpServiceInterface() throws android.os.RemoteException;
public android.nfc.INfcTag getNfcTagInterface() throws android.os.RemoteException;
public android.nfc.IP2pTarget getP2pTargetInterface() throws android.os.RemoteException;
public android.nfc.IP2pInitiator getP2pInitiatorInterface() throws android.os.RemoteException;
public android.nfc.INfcAdapterExtras getNfcAdapterExtrasInterface() throws android.os.RemoteException;
// NfcAdapter-class related methods

public boolean isEnabled() throws android.os.RemoteException;
public android.nfc.NdefMessage localGet() throws android.os.RemoteException;
public void localSet(android.nfc.NdefMessage message) throws android.os.RemoteException;
public void enableForegroundDispatch(android.content.ComponentName activity, android.app.PendingIntent intent, android.content.IntentFilter[] filters, android.nfc.TechListParcel techLists) throws android.os.RemoteException;
public void disableForegroundDispatch(android.content.ComponentName activity) throws android.os.RemoteException;
public void enableForegroundNdefPush(android.content.ComponentName activity, android.nfc.NdefMessage msg) throws android.os.RemoteException;
public void disableForegroundNdefPush(android.content.ComponentName activity) throws android.os.RemoteException;
// Non-public methods
// TODO: check and complete

public int createLlcpConnectionlessSocket(int sap) throws android.os.RemoteException;
public int createLlcpServiceSocket(int sap, java.lang.String sn, int miu, int rw, int linearBufferLength) throws android.os.RemoteException;
public int createLlcpSocket(int sap, int miu, int rw, int linearBufferLength) throws android.os.RemoteException;
public boolean disable() throws android.os.RemoteException;
public boolean enable() throws android.os.RemoteException;
public java.lang.String getProperties(java.lang.String param) throws android.os.RemoteException;
public int setProperties(java.lang.String param, java.lang.String value) throws android.os.RemoteException;
}
