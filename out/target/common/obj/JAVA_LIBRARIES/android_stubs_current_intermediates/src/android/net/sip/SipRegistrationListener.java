package android.net.sip;
public interface SipRegistrationListener
{
public abstract  void onRegistering(java.lang.String localProfileUri);
public abstract  void onRegistrationDone(java.lang.String localProfileUri, long expiryTime);
public abstract  void onRegistrationFailed(java.lang.String localProfileUri, int errorCode, java.lang.String errorMessage);
}
