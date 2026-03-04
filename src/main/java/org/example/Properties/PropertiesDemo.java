package org.example.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {

        Properties p = new Properties() ;
        FileInputStream fis = new FileInputStream("abc.properties") ; //to read file
        p.load(fis);
        System.out.println(p);
        String s = p.getProperty("venki");
        System.out.println(s);
        p.setProperty("venki" , "22222");
        FileOutputStream fos = new FileOutputStream("abc.properties"); //to write in file   
        p.store(fos , "Upadated By Shivam");
    }
}
