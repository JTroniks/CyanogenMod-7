/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/statusbar/IStatusBar.aidl
 */
package com.android.internal.statusbar;
/** @hide */
public interface IStatusBar extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.statusbar.IStatusBar
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.statusbar.IStatusBar";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.statusbar.IStatusBar interface,
 * generating a proxy if needed.
 */
public static com.android.internal.statusbar.IStatusBar asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.statusbar.IStatusBar))) {
return ((com.android.internal.statusbar.IStatusBar)iin);
}
return new com.android.internal.statusbar.IStatusBar.Stub.Proxy(obj);
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
case TRANSACTION_setIcon:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.android.internal.statusbar.StatusBarIcon _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.internal.statusbar.StatusBarIcon.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setIcon(_arg0, _arg1);
return true;
}
case TRANSACTION_removeIcon:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.removeIcon(_arg0);
return true;
}
case TRANSACTION_addNotification:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
com.android.internal.statusbar.StatusBarNotification _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.internal.statusbar.StatusBarNotification.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.addNotification(_arg0, _arg1);
return true;
}
case TRANSACTION_updateNotification:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
com.android.internal.statusbar.StatusBarNotification _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.internal.statusbar.StatusBarNotification.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.updateNotification(_arg0, _arg1);
return true;
}
case TRANSACTION_removeNotification:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.removeNotification(_arg0);
return true;
}
case TRANSACTION_disable:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.disable(_arg0);
return true;
}
case TRANSACTION_animateExpand:
{
data.enforceInterface(DESCRIPTOR);
this.animateExpand();
return true;
}
case TRANSACTION_animateCollapse:
{
data.enforceInterface(DESCRIPTOR);
this.animateCollapse();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.statusbar.IStatusBar
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
public void setIcon(int index, com.android.internal.statusbar.StatusBarIcon icon) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
if ((icon!=null)) {
_data.writeInt(1);
icon.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setIcon, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void removeIcon(int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_removeIcon, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void addNotification(android.os.IBinder key, com.android.internal.statusbar.StatusBarNotification notification) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(key);
if ((notification!=null)) {
_data.writeInt(1);
notification.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addNotification, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void updateNotification(android.os.IBinder key, com.android.internal.statusbar.StatusBarNotification notification) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(key);
if ((notification!=null)) {
_data.writeInt(1);
notification.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateNotification, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void removeNotification(android.os.IBinder key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(key);
mRemote.transact(Stub.TRANSACTION_removeNotification, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void disable(int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_disable, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void animateExpand() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_animateExpand, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void animateCollapse() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_animateCollapse, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_removeIcon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_addNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_updateNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_removeNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_disable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_animateExpand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_animateCollapse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void setIcon(int index, com.android.internal.statusbar.StatusBarIcon icon) throws android.os.RemoteException;
public void removeIcon(int index) throws android.os.RemoteException;
public void addNotification(android.os.IBinder key, com.android.internal.statusbar.StatusBarNotification notification) throws android.os.RemoteException;
public void updateNotification(android.os.IBinder key, com.android.internal.statusbar.StatusBarNotification notification) throws android.os.RemoteException;
public void removeNotification(android.os.IBinder key) throws android.os.RemoteException;
public void disable(int state) throws android.os.RemoteException;
public void animateExpand() throws android.os.RemoteException;
public void animateCollapse() throws android.os.RemoteException;
}
