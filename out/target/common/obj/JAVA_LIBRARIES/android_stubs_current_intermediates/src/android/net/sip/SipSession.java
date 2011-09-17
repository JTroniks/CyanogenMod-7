package android.net.sip;
public final class SipSession
{
public static class State
{
State() { throw new RuntimeException("Stub!"); }
public static  java.lang.String toString(int state) { throw new RuntimeException("Stub!"); }
public static final int READY_TO_CALL = 0;
public static final int REGISTERING = 1;
public static final int DEREGISTERING = 2;
public static final int INCOMING_CALL = 3;
public static final int INCOMING_CALL_ANSWERING = 4;
public static final int OUTGOING_CALL = 5;
public static final int OUTGOING_CALL_RING_BACK = 6;
public static final int OUTGOING_CALL_CANCELING = 7;
public static final int IN_CALL = 8;
public static final int PINGING = 9;
public static final int NOT_DEFINED = 101;
}
public static class Listener
{
public  Listener() { throw new RuntimeException("Stub!"); }
public  void onCalling(android.net.sip.SipSession session) { throw new RuntimeException("Stub!"); }
public  void onRinging(android.net.sip.SipSession session, android.net.sip.SipProfile caller, java.lang.String sessionDescription) { throw new RuntimeException("Stub!"); }
public  void onRingingBack(android.net.sip.SipSession session) { throw new RuntimeException("Stub!"); }
public  void onCallEstablished(android.net.sip.SipSession session, java.lang.String sessionDescription) { throw new RuntimeException("Stub!"); }
public  void onCallEnded(android.net.sip.SipSession session) { throw new RuntimeException("Stub!"); }
public  void onCallBusy(android.net.sip.SipSession session) { throw new RuntimeException("Stub!"); }
public  void onError(android.net.sip.SipSession session, int errorCode, java.lang.String errorMessage) { throw new RuntimeException("Stub!"); }
public  void onCallChangeFailed(android.net.sip.SipSession session, int errorCode, java.lang.String errorMessage) { throw new RuntimeException("Stub!"); }
public  void onRegistering(android.net.sip.SipSession session) { throw new RuntimeException("Stub!"); }
public  void onRegistrationDone(android.net.sip.SipSession session, int duration) { throw new RuntimeException("Stub!"); }
public  void onRegistrationFailed(android.net.sip.SipSession session, int errorCode, java.lang.String errorMessage) { throw new RuntimeException("Stub!"); }
public  void onRegistrationTimeout(android.net.sip.SipSession session) { throw new RuntimeException("Stub!"); }
}
SipSession() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLocalIp() { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile getLocalProfile() { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile getPeerProfile() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  boolean isInCall() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCallId() { throw new RuntimeException("Stub!"); }
public  void setListener(android.net.sip.SipSession.Listener listener) { throw new RuntimeException("Stub!"); }
public  void register(int duration) { throw new RuntimeException("Stub!"); }
public  void unregister() { throw new RuntimeException("Stub!"); }
public  void makeCall(android.net.sip.SipProfile callee, java.lang.String sessionDescription, int timeout) { throw new RuntimeException("Stub!"); }
public  void answerCall(java.lang.String sessionDescription, int timeout) { throw new RuntimeException("Stub!"); }
public  void endCall() { throw new RuntimeException("Stub!"); }
public  void changeCall(java.lang.String sessionDescription, int timeout) { throw new RuntimeException("Stub!"); }
}
