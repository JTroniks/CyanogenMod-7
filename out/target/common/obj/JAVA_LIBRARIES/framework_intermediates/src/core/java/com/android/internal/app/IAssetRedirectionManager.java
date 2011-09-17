/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/app/IAssetRedirectionManager.aidl
 */
package com.android.internal.app;
/**
 * Interface used to interact with the AssetRedirectionManagerService.
 */
public interface IAssetRedirectionManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IAssetRedirectionManager
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IAssetRedirectionManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IAssetRedirectionManager interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IAssetRedirectionManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IAssetRedirectionManager))) {
return ((com.android.internal.app.IAssetRedirectionManager)iin);
}
return new com.android.internal.app.IAssetRedirectionManager.Stub.Proxy(obj);
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
case TRANSACTION_getPackageRedirectionMap:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.content.res.PackageRedirectionMap _result = this.getPackageRedirectionMap(_arg0, _arg1, _arg2);
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
case TRANSACTION_clearRedirectionMapsByTheme:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.clearRedirectionMapsByTheme(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_clearPackageRedirectionMap:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearPackageRedirectionMap(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IAssetRedirectionManager
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
/**
     * Access the package redirection map for the supplied package name given a
     * particular theme.
     */
public android.content.res.PackageRedirectionMap getPackageRedirectionMap(java.lang.String themePackageName, java.lang.String themeId, java.lang.String targetPackageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.res.PackageRedirectionMap _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(themePackageName);
_data.writeString(themeId);
_data.writeString(targetPackageName);
mRemote.transact(Stub.TRANSACTION_getPackageRedirectionMap, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.res.PackageRedirectionMap.CREATOR.createFromParcel(_reply);
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
/**
     * Clear all redirection maps for the given theme.
     */
public void clearRedirectionMapsByTheme(java.lang.String themePackageName, java.lang.String themeId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(themePackageName);
_data.writeString(themeId);
mRemote.transact(Stub.TRANSACTION_clearRedirectionMapsByTheme, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Clear all redirection maps for the given target package.
     */
public void clearPackageRedirectionMap(java.lang.String targetPackageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(targetPackageName);
mRemote.transact(Stub.TRANSACTION_clearPackageRedirectionMap, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getPackageRedirectionMap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_clearRedirectionMapsByTheme = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_clearPackageRedirectionMap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
     * Access the package redirection map for the supplied package name given a
     * particular theme.
     */
public android.content.res.PackageRedirectionMap getPackageRedirectionMap(java.lang.String themePackageName, java.lang.String themeId, java.lang.String targetPackageName) throws android.os.RemoteException;
/**
     * Clear all redirection maps for the given theme.
     */
public void clearRedirectionMapsByTheme(java.lang.String themePackageName, java.lang.String themeId) throws android.os.RemoteException;
/**
     * Clear all redirection maps for the given target package.
     */
public void clearPackageRedirectionMap(java.lang.String targetPackageName) throws android.os.RemoteException;
}
