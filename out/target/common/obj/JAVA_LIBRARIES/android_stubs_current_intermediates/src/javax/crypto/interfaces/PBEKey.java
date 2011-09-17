package javax.crypto.interfaces;
public interface PBEKey
  extends javax.crypto.SecretKey
{
public abstract  int getIterationCount();
public abstract  byte[] getSalt();
public abstract  char[] getPassword();
public static final long serialVersionUID = -1430015993304333921L;
}
