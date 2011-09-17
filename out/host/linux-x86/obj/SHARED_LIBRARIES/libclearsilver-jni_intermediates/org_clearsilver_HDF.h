/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_clearsilver_HDF */

#ifndef _Included_org_clearsilver_HDF
#define _Included_org_clearsilver_HDF
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_clearsilver_HDF
 * Method:    _init
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_clearsilver_HDF__1init
  (JNIEnv *, jclass);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _dealloc
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_clearsilver_HDF__1dealloc
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _readFile
 * Signature: (JLjava/lang/String;Z)Z
 */
JNIEXPORT jboolean JNICALL Java_org_clearsilver_HDF__1readFile
  (JNIEnv *, jobject, jlong, jstring, jboolean);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _writeFile
 * Signature: (JLjava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_org_clearsilver_HDF__1writeFile
  (JNIEnv *, jclass, jlong, jstring);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _writeFileAtomic
 * Signature: (JLjava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_org_clearsilver_HDF__1writeFileAtomic
  (JNIEnv *, jclass, jlong, jstring);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _readString
 * Signature: (JLjava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_org_clearsilver_HDF__1readString
  (JNIEnv *, jclass, jlong, jstring);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _writeString
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_clearsilver_HDF__1writeString
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _getIntValue
 * Signature: (JLjava/lang/String;I)I
 */
JNIEXPORT jint JNICALL Java_org_clearsilver_HDF__1getIntValue
  (JNIEnv *, jclass, jlong, jstring, jint);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _getValue
 * Signature: (JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_clearsilver_HDF__1getValue
  (JNIEnv *, jclass, jlong, jstring, jstring);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _setValue
 * Signature: (JLjava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_clearsilver_HDF__1setValue
  (JNIEnv *, jclass, jlong, jstring, jstring);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _removeTree
 * Signature: (JLjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_clearsilver_HDF__1removeTree
  (JNIEnv *, jclass, jlong, jstring);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _setSymLink
 * Signature: (JLjava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_clearsilver_HDF__1setSymLink
  (JNIEnv *, jclass, jlong, jstring, jstring);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _getObj
 * Signature: (JLjava/lang/String;)J
 */
JNIEXPORT jlong JNICALL Java_org_clearsilver_HDF__1getObj
  (JNIEnv *, jclass, jlong, jstring);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _getChild
 * Signature: (JLjava/lang/String;)J
 */
JNIEXPORT jlong JNICALL Java_org_clearsilver_HDF__1getChild
  (JNIEnv *, jclass, jlong, jstring);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _objChild
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_clearsilver_HDF__1objChild
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _objNext
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_clearsilver_HDF__1objNext
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _objName
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_clearsilver_HDF__1objName
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _objValue
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_clearsilver_HDF__1objValue
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _copy
 * Signature: (JLjava/lang/String;J)V
 */
JNIEXPORT void JNICALL Java_org_clearsilver_HDF__1copy
  (JNIEnv *, jclass, jlong, jstring, jlong);

/*
 * Class:     org_clearsilver_HDF
 * Method:    _dump
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_clearsilver_HDF__1dump
  (JNIEnv *, jclass, jlong);

#ifdef __cplusplus
}
#endif
#endif
