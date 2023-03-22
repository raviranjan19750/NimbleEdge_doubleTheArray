
#include <jni.h>
#include <string>
#include <iostream>

extern "C"
JNIEXPORT jfloatArray JNICALL
Java_com_example_doublethisarray_DoubleThisArray_doubleTheArray(JNIEnv *env, jobject thisObj, jfloatArray jArray) {

    jfloat* arr = env->GetFloatArrayElements(jArray, nullptr);
    jsize length = env->GetArrayLength(jArray);

    for(int i = 0; i< length; i++) {
        arr[i] = arr[i]*2.0f;
    }

    env->ReleaseFloatArrayElements(jArray,arr, 0);
    jfloatArray result = env->NewFloatArray(length);
    env->SetFloatArrayRegion(result, 0, length, arr);

    return result;
}




