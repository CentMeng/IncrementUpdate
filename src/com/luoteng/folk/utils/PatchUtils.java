package com.luoteng.folk.utils;

public class PatchUtils {
    //定义Native方法

    /**
     * 通过NDK合并得到新版本的apk文件
     * @param oldApk 旧版本的apk文件路径
     * @param newApk 合并的新版本apk文件路径
     * @param patch  差分包路径
     */
    public native  static  int patch(String oldApk,String newApk,String patch);

    static{
        System.loadLibrary("ApkPatchLib");
    }
}
