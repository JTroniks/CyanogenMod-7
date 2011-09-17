package android.net.sip;
public class SipAudioCall
{
public static class Listener
{
public  Listener() { throw new RuntimeException("Stub!"); }
public  void onReadyToCall(android.net.sip.SipAudioCall call) { throw new RuntimeException("Stub!"); }
public  void onCalling(android.net.sip.SipAudioCall call) { throw new RuntimeException("Stub!"); }
public  void onRinging(android.net.sip.SipAudioCall call, android.net.sip.SipProfile caller) { throw new RuntimeException("Stub!"); }
public  void onRingingBack(android.net.sip.SipAudioCall call) { throw new RuntimeException("Stub!"); }
public  void onCallEstablished(android.net.sip.SipAudioCall call) { throw new RuntimeException("Stub!"); }
public  void onCallEnded(android.net.sip.SipAudioCall call) { throw new RuntimeException("Stub!"); }
public  void onCallBusy(android.net.sip.SipAudioCall call) { throw new RuntimeException("Stub!"); }
public  void onCallHeld(android.net.sip.SipAudioCall call) { throw new RuntimeException("Stub!"); }
public  void onError(android.net.sip.SipAudioCall call, int errorCode, java.lang.String errorMessage) { throw new RuntimeException("Stub!"); }
public  void onChanged(android.net.sip.SipAudioCall call) { throw new RuntimeException("Stub!"); }
}
public  SipAudioCall(android.content.Context context, android.net.sip.SipProfile localProfile) { throw new RuntimeException("Stub!"); }
public  void setListener(android.net.sip.SipAudioCall.Listener listener) { throw new RuntimeException("Stub!"); }
public  void setListener(android.net.sip.SipAudioCall.Listener listener, boolean callbackImmediately) { throw new RuntimeException("Stub!"); }
public  boolean isInCall() { throw new RuntimeException("Stub!"); }
public  boolean isOnHold() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile getLocalProfile() { throw new RuntimeException("Stub!"); }
public  android.net.sip.SipProfile getPeerProfile() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  void attachCall(android.net.sip.SipSession session, java.lang.String sessionDescription) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  void makeCall(android.net.sip.SipProfile peerProfile, android.net.sip.SipSession sipSession, int timeout) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  void endCall() throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  void holdCall(int timeout) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  void answerCall(int timeout) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  void continueCall(int timeout) throws android.net.sip.SipException { throw new RuntimeException("Stub!"); }
public  void toggleMute() { throw new RuntimeException("Stub!"); }
public  boolean isMuted() { throw new RuntimeException("Stub!"); }
public  void setSpeakerMode(boolean speakerMode) { throw new RuntimeException("Stub!"); }
public  void sendDtmf(int code) { throw new RuntimeException("Stub!"); }
public  void sendDtmf(int code, android.os.Message result) { throw new RuntimeException("Stub!"); }
public  void startAudio() { throw new RuntimeException("Stub!"); }
}
