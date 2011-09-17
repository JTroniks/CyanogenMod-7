/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/bluetooth/IBluetoothNetwork.aidl
 */
package android.bluetooth;
/**
 * System private API for Bluetooth Network service
 *
 * {@hide}
 */
public interface IBluetoothNetwork extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothNetwork
{
private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothNetwork";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.bluetooth.IBluetoothNetwork interface,
 * generating a proxy if needed.
 */
public static android.bluetooth.IBluetoothNetwork asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.bluetooth.IBluetoothNetwork))) {
return ((android.bluetooth.IBluetoothNetwork)iin);
}
return new android.bluetooth.IBluetoothNetwork.Stub.Proxy(obj);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.bluetooth.IBluetoothNetwork
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
}
}
}
