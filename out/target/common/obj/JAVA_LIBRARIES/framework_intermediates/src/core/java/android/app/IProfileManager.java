/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/IProfileManager.aidl
 */
package android.app;
/** {@hide} */
public interface IProfileManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IProfileManager
{
private static final java.lang.String DESCRIPTOR = "android.app.IProfileManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.IProfileManager interface,
 * generating a proxy if needed.
 */
public static android.app.IProfileManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IProfileManager))) {
return ((android.app.IProfileManager)iin);
}
return new android.app.IProfileManager.Stub.Proxy(obj);
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
case TRANSACTION_setActiveProfile:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.setActiveProfile(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setActiveProfileByName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.setActiveProfileByName(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActiveProfile:
{
data.enforceInterface(DESCRIPTOR);
android.app.Profile _result = this.getActiveProfile();
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
case TRANSACTION_addProfile:
{
data.enforceInterface(DESCRIPTOR);
android.app.Profile _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.Profile.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.addProfile(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeProfile:
{
data.enforceInterface(DESCRIPTOR);
android.app.Profile _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.Profile.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeProfile(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getProfile:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.app.Profile _result = this.getProfile(_arg0);
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
case TRANSACTION_getProfileByName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.Profile _result = this.getProfileByName(_arg0);
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
case TRANSACTION_getProfiles:
{
data.enforceInterface(DESCRIPTOR);
android.app.Profile[] _result = this.getProfiles();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_profileExists:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.profileExists(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_profileExistsByName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.profileExistsByName(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_persist:
{
data.enforceInterface(DESCRIPTOR);
this.persist();
reply.writeNoException();
return true;
}
case TRANSACTION_getNotificationGroups:
{
data.enforceInterface(DESCRIPTOR);
android.app.NotificationGroup[] _result = this.getNotificationGroups();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_addNotificationGroup:
{
data.enforceInterface(DESCRIPTOR);
android.app.NotificationGroup _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.NotificationGroup.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.addNotificationGroup(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeNotificationGroup:
{
data.enforceInterface(DESCRIPTOR);
android.app.NotificationGroup _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.NotificationGroup.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.removeNotificationGroup(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getNotificationGroupForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.NotificationGroup _result = this.getNotificationGroupForPackage(_arg0);
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
case TRANSACTION_getNotificationGroup:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.NotificationGroup _result = this.getNotificationGroup(_arg0);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IProfileManager
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
public boolean setActiveProfile(android.os.ParcelUuid profileParcelUuid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((profileParcelUuid!=null)) {
_data.writeInt(1);
profileParcelUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setActiveProfile, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean setActiveProfileByName(java.lang.String profileName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(profileName);
mRemote.transact(Stub.TRANSACTION_setActiveProfileByName, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.app.Profile getActiveProfile() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.Profile _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveProfile, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.Profile.CREATOR.createFromParcel(_reply);
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
public boolean addProfile(android.app.Profile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addProfile, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean removeProfile(android.app.Profile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeProfile, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.app.Profile getProfile(android.os.ParcelUuid profileParcelUuid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.Profile _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((profileParcelUuid!=null)) {
_data.writeInt(1);
profileParcelUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getProfile, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.Profile.CREATOR.createFromParcel(_reply);
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
public android.app.Profile getProfileByName(java.lang.String profileName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.Profile _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(profileName);
mRemote.transact(Stub.TRANSACTION_getProfileByName, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.Profile.CREATOR.createFromParcel(_reply);
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
public android.app.Profile[] getProfiles() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.Profile[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProfiles, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.app.Profile.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean profileExists(android.os.ParcelUuid profileUuid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((profileUuid!=null)) {
_data.writeInt(1);
profileUuid.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_profileExists, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean profileExistsByName(java.lang.String profileName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(profileName);
mRemote.transact(Stub.TRANSACTION_profileExistsByName, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void persist() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_persist, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public android.app.NotificationGroup[] getNotificationGroups() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.NotificationGroup[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNotificationGroups, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.app.NotificationGroup.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void addNotificationGroup(android.app.NotificationGroup group) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((group!=null)) {
_data.writeInt(1);
group.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addNotificationGroup, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void removeNotificationGroup(android.app.NotificationGroup group) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((group!=null)) {
_data.writeInt(1);
group.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeNotificationGroup, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public android.app.NotificationGroup getNotificationGroupForPackage(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.NotificationGroup _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_getNotificationGroupForPackage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.NotificationGroup.CREATOR.createFromParcel(_reply);
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
public android.app.NotificationGroup getNotificationGroup(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.NotificationGroup _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_getNotificationGroup, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.NotificationGroup.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_setActiveProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setActiveProfileByName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getActiveProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_addProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_removeProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getProfileByName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_profileExists = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_profileExistsByName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_persist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getNotificationGroups = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_addNotificationGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_removeNotificationGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getNotificationGroupForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getNotificationGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
}
public boolean setActiveProfile(android.os.ParcelUuid profileParcelUuid) throws android.os.RemoteException;
public boolean setActiveProfileByName(java.lang.String profileName) throws android.os.RemoteException;
public android.app.Profile getActiveProfile() throws android.os.RemoteException;
public boolean addProfile(android.app.Profile profile) throws android.os.RemoteException;
public boolean removeProfile(android.app.Profile profile) throws android.os.RemoteException;
public android.app.Profile getProfile(android.os.ParcelUuid profileParcelUuid) throws android.os.RemoteException;
public android.app.Profile getProfileByName(java.lang.String profileName) throws android.os.RemoteException;
public android.app.Profile[] getProfiles() throws android.os.RemoteException;
public boolean profileExists(android.os.ParcelUuid profileUuid) throws android.os.RemoteException;
public boolean profileExistsByName(java.lang.String profileName) throws android.os.RemoteException;
public void persist() throws android.os.RemoteException;
public android.app.NotificationGroup[] getNotificationGroups() throws android.os.RemoteException;
public void addNotificationGroup(android.app.NotificationGroup group) throws android.os.RemoteException;
public void removeNotificationGroup(android.app.NotificationGroup group) throws android.os.RemoteException;
public android.app.NotificationGroup getNotificationGroupForPackage(java.lang.String pkg) throws android.os.RemoteException;
public android.app.NotificationGroup getNotificationGroup(java.lang.String name) throws android.os.RemoteException;
}
