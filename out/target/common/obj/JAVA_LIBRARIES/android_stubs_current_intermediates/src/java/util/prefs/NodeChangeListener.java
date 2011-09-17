package java.util.prefs;
public interface NodeChangeListener
  extends java.util.EventListener
{
public abstract  void childAdded(java.util.prefs.NodeChangeEvent e);
public abstract  void childRemoved(java.util.prefs.NodeChangeEvent e);
}
