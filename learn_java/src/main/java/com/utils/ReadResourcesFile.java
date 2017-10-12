package com.utils;

import java.io.File;
import java.net.URL;

/**
 * Created by Wuxiang on 2017/10/12.
 * 根据resources 目录下的文件名称，获取绝对路径
 */
public class ReadResourcesFile {

    public static String getPath(String fileName) {
        URL url = ReadResourcesFile.class.getClassLoader().getResource(fileName);
        File file = new File(url.getFile());
        return file.getPath();
    }
}
