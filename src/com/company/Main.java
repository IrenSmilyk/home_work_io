package com.company;

import java.io.File;
import java.text.DateFormat;


public class Main {

    public static void main(String[] args) {
        File dir = new File("E:\\Iren\\Java\\home_work_io");
        System.out.println("Имя папки: " + dir.getName().toUpperCase());
        System.out.println("Дерево папки " + dir.getName().toUpperCase() + ":");
        readFiles(dir);
    }
    private static void readFiles(File baseDirect){
        if (baseDirect.isDirectory()){
            for (File file : baseDirect.listFiles()) {
                if(file.isFile()){
                    DateFormat sdf = DateFormat.getDateTimeInstance();
                    System.out.println(file.getName() +" "+ sdf.format(file.lastModified()));
                }else {
                    System.out.println(file.getName().toUpperCase());
                    readFiles(file);
                }
            }
        }
    }
}
