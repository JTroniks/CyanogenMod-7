package android.net.sip;
public class SipProfile
  implements android.os.Parcelable, java.io.Serializable, java.lang.Cloneable
{
public static class Builder
{
public  Builder(android.net.sip.SipProfile profile) { throw new RuntimeException("Stub!"); }
public  Builder(java.lang.String uriString) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public  Builder(java.lang.String username, java.lang.String serverDomain) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile.Builder setProfileName(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile.Builder setPassword(java.lang.String password) { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile.Builder setPort(int port) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile.Builder setProtocol(java.lang.String protocol) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile.Builder setOutboundProxy(java.lang.String outboundProxy) { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile.Builder setDisplayName(java.lang.String displayName) { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile.Builder setSendKeepAlive(boolean flag) { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile.Builder setKeepAliveInterval(int interval) { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile.Builder setAutoRegistration(boolean flag) { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile build() { throw new RuntimeException("Stub!"); }
}
SipProfile() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUriString() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUserName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPassword() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSipDomain() { throw new RuntimeException("Stub!"); }
public  int getPort() { throw new RuntimeException("Stub!"); }
public  java.lang.String getProtocol() { throw new RuntimeException("Stub!"); }
public  java.lang.String getProxyAddress() { throw new RuntimeException("Stub!"); }
public  java.lang.String getProfileName() { throw new RuntimeException("Stub!"); }
public  boolean getSendKeepAlive() { throw new RuntimeException("Stub!"); }
public  int getKeepAliveInterval() { throw new RuntimeException("Stub!"); }
public  boolean getAutoRegistration() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.sip.SipProfile> CREATOR;
static { CREATOR = null; }
}
