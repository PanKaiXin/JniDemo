package cn.edu.zafu.jnidemo;

/**
 * Created by lizhangqu on 2015/4/15.
 * cd app/src/main
 * javah -d jni -classpath "D:\Program Files\adt-bundle-windows-x64-20140702\sdk\platforms\android-21\android.jar;..\..\build\intermediates\classes\debug" cn.edu.zafu.jnidemo.Test
 */
public class Test {
    static {
        System.loadLibrary("Test");
    }
    public native String getName();
}
