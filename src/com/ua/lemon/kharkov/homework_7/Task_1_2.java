package com.ua.lemon.kharkov.homework_7;

import java.io.*;

public class Task_1_2 {
    private static final String TEXT_TXT = "text.txt";

    public static void main(String... args) {
        writeTextFile();

        readeTextFile();
    }

    public static void writeTextFile(){
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;

        String text = "Hello Word";

        try{
            outputStream = new FileOutputStream(TEXT_TXT);
            objectOutputStream = new ObjectOutputStream(outputStream);objectOutputStream.writeObject(text);
        }catch(FileNotFoundException e ){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                outputStream.close();
                objectOutputStream.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void readeTextFile(){
        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;

        String texts = "";

        try{
            inputStream = new FileInputStream(TEXT_TXT);
            objectInputStream = new ObjectInputStream(inputStream);

            texts = (String) objectInputStream.readObject();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(texts);
    }
}
