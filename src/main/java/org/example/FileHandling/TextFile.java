package org.example.FileHandling;

import java.io.*;
import java.util.Scanner;

public class TextFile {

    public static void createFile(String filePath){
        try{
            File myObj = new File(filePath) ;

            if(myObj.createNewFile()){
                System.out.println("File Created with Name : " + myObj.getName());
            }else {
                System.out.println("File Already Created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(String filePath){
        try{
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write("Welcome To Java File handling");
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readFile(String filePath){
        try{
            File myObj = new File(filePath) ;
            Scanner myReader = new Scanner(myObj) ;
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void renameFile(String oldFilePath , String newFilePath) {
        File oldFile = new File(oldFilePath) ;
        File newFile = new File(newFilePath) ;

        if(oldFile.renameTo(newFile)){
            System.out.println("File Name Changed");
        }else {
            System.out.println("File Does Not Exits");
        }
    }

    public static void deleteFile(String filePath){
        File myObj = new File(filePath) ;
        if(myObj.delete()){
            System.out.println("File Delete Successfully named : " + myObj.getName());
        }else{
            System.out.println("File Does Not Exits");
        }
    }

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Admin\\Desktop\\myFile.txt" ;

        createFile(filePath);
        writeFile(filePath);
        readFile(filePath);

        String newPath = "C:\\Users\\Admin\\Desktop\\myFile1.txt" ;
        renameFile(filePath , newPath);
        deleteFile(newPath);

    }
}
