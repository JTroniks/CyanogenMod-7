package android.net.sip;
public class SipManager
{
SipManager() { throw new RuntimeException("Stub!"); }
public static  android.net.sip.SipManager newInstance(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  boolean isApiSupported(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  boolean isVoipSupported(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  boolean isSipWifiOnly(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void open(android.net.sip.SipProfile localProfile) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  void open(android.net.sip.SipProfile localProfile, android.app.PendingIntent incomingCallPendingIntent, android.net.sip.SipRegistrationListener listener) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  void setRegistrationListener(java.lang.String localProfileUri, android.net.sip.SipRegistrationListener listener) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  void close(java.lang.String localProfileUri) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  boolean isOpened(java.lang.String localProfileUri) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  boolean isRegistered(java.lang.String localProfileUri) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipAudioCall makeAudioCall(android.net.sip.SipProfile localProfile, android.net.sip.SipProfile peerProfile, android.net.sip.SipAudioCall.Listener listener, int timeout) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipAudioCall makeAudioCall(java.lang.String localProfileUri, java.lang.String peerProfileUri, android.net.sip.SipAudioCall.Listener listener, int timeout) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipAudioCall takeAudioCall(android.content.Intent incomingCallIntent, android.net.sip.SipAudioCall.Listener listener) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public static  boolean isIncomingCallIntent(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getCallId(android.content.Intent incomingCallIntent) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getOfferSessionDescription(android.content.Intent incomingCallIntent) { throw new RuntimeException("Stub!"); }
public  void register(android.net.sip.SipProfile localProfile, int expiryTime, android.net.sip.SipRegistrationListener listener) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  void unregister(android.net.sip.SipProfile localProfile, android.net.sip.SipRegistrationListener listener) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipSession getSessionFor(android.content.Intent incomingCallIntent) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipSession createSipSession(android.net.sip.SipProfile localProfile, android.net.sip.SipSession.Listener listener) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public static final int INCOMING_CALL_RESULT_CODE = 101;
public static final java.lang.String EXTRA_CALL_ID = "android:sipCallID";
public static final java.lang.String EXTRA_OFFER_SD = "android:sipOfferSD";
}
