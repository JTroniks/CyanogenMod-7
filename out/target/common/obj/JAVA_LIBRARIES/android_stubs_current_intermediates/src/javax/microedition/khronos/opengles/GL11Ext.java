package javax.microedition.khronos.opengles;
public interface GL11Ext
  extends javax.microedition.khronos.opengles.GL
{
public abstract  void glTexParameterfv(int target, int pname, float[] param, int offset);
public abstract  void glCurrentPaletteMatrixOES(int matrixpaletteindex);
public abstract  void glDrawTexfOES(float x, float y, float z, float width, float height);
public abstract  void glDrawTexfvOES(float[] coords, int offset);
public abstract  void glDrawTexfvOES(java.nio.FloatBuffer coords);
public abstract  void glDrawTexiOES(int x, int y, int z, int width, int height);
public abstract  void glDrawTexivOES(int[] coords, int offset);
public abstract  void glDrawTexivOES(java.nio.IntBuffer coords);
public abstract  void glDrawTexsOES(short x, short y, short z, short width, short height);
public abstract  void glDrawTexsvOES(short[] coords, int offset);
public abstract  void glDrawTexsvOES(java.nio.ShortBuffer coords);
public abstract  void glDrawTexxOES(int x, int y, int z, int width, int height);
public abstract  void glDrawTexxvOES(int[] coords, int offset);
public abstract  void glDrawTexxvOES(java.nio.IntBuffer coords);
public abstract  void glEnable(int cap);
public abstract  void glEnableClientState(int array);
public abstract  void glLoadPaletteFromModelViewMatrixOES();
public abstract  void glMatrixIndexPointerOES(int size, int type, int stride, java.nio.Buffer pointer);
public abstract  void glMatrixIndexPointerOES(int size, int type, int stride, int offset);
public abstract  void glWeightPointerOES(int size, int type, int stride, java.nio.Buffer pointer);
public abstract  void glWeightPointerOES(int size, int type, int stride, int offset);
public static final int GL_MATRIX_INDEX_ARRAY_BUFFER_BINDING_OES = 35742;
public static final int GL_MATRIX_INDEX_ARRAY_OES = 34884;
public static final int GL_MATRIX_INDEX_ARRAY_POINTER_OES = 34889;
public static final int GL_MATRIX_INDEX_ARRAY_SIZE_OES = 34886;
public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_OES = 34888;
public static final int GL_MATRIX_INDEX_ARRAY_TYPE_OES = 34887;
public static final int GL_MATRIX_PALETTE_OES = 34880;
public static final int GL_MAX_PALETTE_MATRICES_OES = 34882;
public static final int GL_MAX_VERTEX_UNITS_OES = 34468;
public static final int GL_TEXTURE_CROP_RECT_OES = 35741;
public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING_OES = 34974;
public static final int GL_WEIGHT_ARRAY_OES = 34477;
public static final int GL_WEIGHT_ARRAY_POINTER_OES = 34476;
public static final int GL_WEIGHT_ARRAY_SIZE_OES = 34475;
public static final int GL_WEIGHT_ARRAY_STRIDE_OES = 34474;
public static final int GL_WEIGHT_ARRAY_TYPE_OES = 34473;
}
