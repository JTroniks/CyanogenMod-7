package javax.net.ssl;
public class SSLEngineResult
{
public static enum HandshakeStatus
{
FINISHED(),
NEED_TASK(),
NEED_UNWRAP(),
NEED_WRAP(),
NOT_HANDSHAKING();
}
public static enum Status
{
BUFFER_OVERFLOW(),
BUFFER_UNDERFLOW(),
CLOSED(),
OK();
}
public  SSLEngineResult(javax.net.ssl.SSLEngineResult.Status status, javax.net.ssl.SSLEngineResult.HandshakeStatus handshakeStatus, int bytesConsumed, int bytesProduced) { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLEngineResult.Status getStatus() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLEngineResult.HandshakeStatus getHandshakeStatus() { throw new RuntimeException("Stub!"); }
public final  int bytesConsumed() { throw new RuntimeException("Stub!"); }
public final  int bytesProduced() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
