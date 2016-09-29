#include <cn_edu_zafu_jnidemo_Test.h>
JNIEXPORT jstring JNICALL Java_cn_edu_zafu_jnidemo_Test_getName(JNIEnv * env, jobject jObj){
        jstring str = (*env)->NewStringUTF(env, "HelloWorld from JNI !");
        return str;
}

