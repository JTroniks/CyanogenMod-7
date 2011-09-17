package android.view;
public final class InputQueue
{
public static interface Callback
{
public abstract  void onInputQueueCreated(android.view.InputQueue queue);
public abstract  void onInputQueueDestroyed(android.view.InputQueue queue);
}
InputQueue() { throw new RuntimeException("Stub!"); }
}
