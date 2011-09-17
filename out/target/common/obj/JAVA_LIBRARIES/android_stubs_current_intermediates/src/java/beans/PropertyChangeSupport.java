package java.beans;
public class PropertyChangeSupport
  implements java.io.Serializable
{
public  PropertyChangeSupport(java.lang.Object sourceBean) { throw new RuntimeException("Stub!"); }
public  void firePropertyChange(java.lang.String propertyName, java.lang.Object oldValue, java.lang.Object newValue) { throw new RuntimeException("Stub!"); }
public  void fireIndexedPropertyChange(java.lang.String propertyName, int index, java.lang.Object oldValue, java.lang.Object newValue) { throw new RuntimeException("Stub!"); }
public synchronized  void removePropertyChangeListener(java.lang.String propertyName, java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
public synchronized  void addPropertyChangeListener(java.lang.String propertyName, java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
public synchronized  java.beans.PropertyChangeListener[] getPropertyChangeListeners(java.lang.String propertyName) { throw new RuntimeException("Stub!"); }
public  void firePropertyChange(java.lang.String propertyName, boolean oldValue, boolean newValue) { throw new RuntimeException("Stub!"); }
public  void fireIndexedPropertyChange(java.lang.String propertyName, int index, boolean oldValue, boolean newValue) { throw new RuntimeException("Stub!"); }
public  void firePropertyChange(java.lang.String propertyName, int oldValue, int newValue) { throw new RuntimeException("Stub!"); }
public  void fireIndexedPropertyChange(java.lang.String propertyName, int index, int oldValue, int newValue) { throw new RuntimeException("Stub!"); }
public synchronized  boolean hasListeners(java.lang.String propertyName) { throw new RuntimeException("Stub!"); }
public synchronized  void removePropertyChangeListener(java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
public synchronized  void addPropertyChangeListener(java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
public synchronized  java.beans.PropertyChangeListener[] getPropertyChangeListeners() { throw new RuntimeException("Stub!"); }
public  void firePropertyChange(java.beans.PropertyChangeEvent event) { throw new RuntimeException("Stub!"); }
}
