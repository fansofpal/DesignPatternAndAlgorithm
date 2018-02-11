package com.hdw.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 组合模式--结构型模式
 * 组合模式常用来处理具有树形结构的业务场景。
 * 举例：文件系统是树形结构，文件夹下面有文件和文件夹，文件夹的最底层是文件。
 * 定义好一个节点抽象类，无论是文件还是文件夹，均继承这个抽象类。
 * user:hudawei1
 * date:2018/2/11
 * time:16:52
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        Component folder1 = new Folder("根目录");
        Component folder2 = new Folder("1级目录");

        Component file1 = new File("1级文件");
        Component file2 = new File("2级文件a");
        Component file3 = new File("2级文件b");
        folder1.add(folder2).add(file1);
        folder2.add(file2);
        folder2.add(file3);

        folder1.display();

    }
}
