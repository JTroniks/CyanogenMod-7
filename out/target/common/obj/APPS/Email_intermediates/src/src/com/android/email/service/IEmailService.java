/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/apps/Email/src/com/android/email/service/IEmailService.aidl
 */
package com.android.email.service;
public interface IEmailService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.email.service.IEmailService
{
private static final java.lang.String DESCRIPTOR = "com.android.email.service.IEmailService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.email.service.IEmailService interface,
 * generating a proxy if needed.
 */
public static com.android.email.service.IEmailService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.email.service.IEmailService))) {
return ((com.android.email.service.IEmailService)iin);
}
return new com.android.email.service.IEmailService.Stub.Proxy(obj);
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
case TRANSACTION_validate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
int _arg4;
_arg4 = data.readInt();
boolean _arg5;
_arg5 = (0!=data.readInt());
boolean _arg6;
_arg6 = (0!=data.readInt());
int _result = this.validate(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_startSync:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.startSync(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_stopSync:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.stopSync(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_loadMore:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.loadMore(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_loadAttachment:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.loadAttachment(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_updateFolderList:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.updateFolderList(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_createFolder:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.createFolder(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_deleteFolder:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.deleteFolder(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_renameFolder:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.renameFolder(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setCallback:
{
data.enforceInterface(DESCRIPTOR);
com.android.email.service.IEmailServiceCallback _arg0;
_arg0 = com.android.email.service.IEmailServiceCallback.Stub.asInterface(data.readStrongBinder());
this.setCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setLogging:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setLogging(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_hostChanged:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.hostChanged(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_autoDiscover:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.Bundle _result = this.autoDiscover(_arg0, _arg1);
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
case TRANSACTION_sendMeetingResponse:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
this.sendMeetingResponse(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.email.service.IEmailService
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
public int validate(java.lang.String protocol, java.lang.String host, java.lang.String userName, java.lang.String password, int port, boolean ssl, boolean trustCertificates) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(protocol);
_data.writeString(host);
_data.writeString(userName);
_data.writeString(password);
_data.writeInt(port);
_data.writeInt(((ssl)?(1):(0)));
_data.writeInt(((trustCertificates)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_validate, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void startSync(long mailboxId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(mailboxId);
mRemote.transact(Stub.TRANSACTION_startSync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void stopSync(long mailboxId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(mailboxId);
mRemote.transact(Stub.TRANSACTION_stopSync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void loadMore(long messageId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(messageId);
mRemote.transact(Stub.TRANSACTION_loadMore, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void loadAttachment(long attachmentId, java.lang.String destinationFile, java.lang.String contentUriString) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(attachmentId);
_data.writeString(destinationFile);
_data.writeString(contentUriString);
mRemote.transact(Stub.TRANSACTION_loadAttachment, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void updateFolderList(long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_updateFolderList, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean createFolder(long accountId, java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_createFolder, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean deleteFolder(long accountId, java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_deleteFolder, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean renameFolder(long accountId, java.lang.String oldName, java.lang.String newName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
_data.writeString(oldName);
_data.writeString(newName);
mRemote.transact(Stub.TRANSACTION_renameFolder, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setCallback(com.android.email.service.IEmailServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setLogging(int on) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(on);
mRemote.transact(Stub.TRANSACTION_setLogging, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void hostChanged(long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_hostChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public android.os.Bundle autoDiscover(java.lang.String userName, java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(userName);
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_autoDiscover, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
public void sendMeetingResponse(long messageId, int response) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(messageId);
_data.writeInt(response);
mRemote.transact(Stub.TRANSACTION_sendMeetingResponse, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_validate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_startSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_stopSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_loadMore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_loadAttachment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_updateFolderList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_createFolder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_deleteFolder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_renameFolder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setLogging = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_hostChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_autoDiscover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_sendMeetingResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
}
public int validate(java.lang.String protocol, java.lang.String host, java.lang.String userName, java.lang.String password, int port, boolean ssl, boolean trustCertificates) throws android.os.RemoteException;
public void startSync(long mailboxId) throws android.os.RemoteException;
public void stopSync(long mailboxId) throws android.os.RemoteException;
public void loadMore(long messageId) throws android.os.RemoteException;
public void loadAttachment(long attachmentId, java.lang.String destinationFile, java.lang.String contentUriString) throws android.os.RemoteException;
public void updateFolderList(long accountId) throws android.os.RemoteException;
public boolean createFolder(long accountId, java.lang.String name) throws android.os.RemoteException;
public boolean deleteFolder(long accountId, java.lang.String name) throws android.os.RemoteException;
public boolean renameFolder(long accountId, java.lang.String oldName, java.lang.String newName) throws android.os.RemoteException;
public void setCallback(com.android.email.service.IEmailServiceCallback cb) throws android.os.RemoteException;
public void setLogging(int on) throws android.os.RemoteException;
public void hostChanged(long accountId) throws android.os.RemoteException;
public android.os.Bundle autoDiscover(java.lang.String userName, java.lang.String password) throws android.os.RemoteException;
public void sendMeetingResponse(long messageId, int response) throws android.os.RemoteException;
}
