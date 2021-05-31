package com.ua.lemon.kapustnyk.files;

import com.ua.lemon.kapustnyk.store.domain.Phone;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static final String INFO_TXT = "info.txt";

    public static void main(String[] args) throws Exception {
//        OutputStream outputStream = null;
//        try {
//            outputStream = new FileOutputStream(INFO_TXT);
//            String stringToWrite = "Hello World";
//            outputStream.write(stringToWrite.getBytes());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                outputStream.flush();
//                outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//        InputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream(INFO_TXT);
//            byte[] byteResult = inputStream.readAllBytes();
//            System.out.println(byteResult);
//            System.out.println(Arrays.toString(byteResult));
//            String resultString = new String(byteResult);
//            System.out.println(resultString);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                inputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        Phone p1 = new Phone("galaxy s10", 9.99);
        Phone p2 = new Phone("galaxy fold", 29.99);
        Phone p3 = new Phone("lg g20", 0.67);

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(p1);
        phoneList.add(p2);
        phoneList.add(p3);

//        OutputStream outputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            outputStream = new FileOutputStream("phone.txt");
//            objectOutputStream = new ObjectOutputStream(outputStream);
//
//            objectOutputStream.writeObject(phoneList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                outputStream.close();
//                objectOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        InputStream inputStream = null;
//        ObjectInputStream objectInputStream = null;
//
//        try {
//            inputStream = new FileInputStream("phone.txt");
//            objectInputStream = new ObjectInputStream(inputStream);
//
//            List<Phone> readPhone = (List<Phone>) objectInputStream.readObject();
//            System.out.println(readPhone);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        Path path = Path.of("testDirectory","new.txt");
//
//        String result = "";
//
//        for (int i = 0; i < phoneList.size(); i++) {
//            result += phoneList.get(i).getModel() + "\n";
//        }
//        System.out.println(result);
//        try {
//            Files.write(path, result.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            List<String> res2 = Files.readAllLines(path);
//            System.out.println(res2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        File file = new File(path.toString());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.canExecute());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getPath());
//        System.out.println(file.getName());
//        System.out.println(file.getFreeSpace() / 1024 / 1024 / 1024);
//        System.out.println(file.getTotalSpace() / 1024 / 1024 / 1024);
////        fileDirectory.mkdir();
//
//        Optional<Integer> int1 = Optional.ofNullable(new Integer(4));
//        System.out.println(int1.isPresent());


    }
}
