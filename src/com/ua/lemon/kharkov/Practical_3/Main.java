package com.ua.lemon.kharkov.Practical_3;

import com.ua.lemon.kharkov.Practical_3.dao.LaptopDaoFile;
import com.ua.lemon.kharkov.Practical_3.domain.Laptop;
import com.ua.lemon.kharkov.Practical_3.сatchError.LaptopNotFoundException;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static LaptopDaoFile laptopList = new LaptopDaoFile();

    public static void main(String ... args) {

        Scanner in = new Scanner(System.in);

        int choice;

        while (true) {

            System.out.println("\n1) Add new laptop model\n" +
                    "2) Get all laptop\n" +
                    "3) Find by model laptop\n" +
                    "4) Exit");

            System.out.print("Enter menu number you want: ");
            choice = in.nextInt();

            if (choice <= 0 || choice > 4) {
                System.out.println("Invalid number.");

            }else {
                switch (choice){
                    case (1):
                            System.out.println("Enter model");
                            String model = in.next();

                            System.out.println("Enter price");
                            Double price = in.nextDouble();

                            System.out.println("Enter serial number");
                            Integer SN = in.nextInt();

                            Laptop l1 = new Laptop(model, price, SN);

                            laptopList.addLaptop(l1);
                            laptopList.WriteLaptopFile();

                    case (2):
                        List<Laptop> readList = laptopList.getAll();
                        System.out.println(readList);

                        Main.main();

                    case (3):
                        System.out.println("Enter model");
                        String findModel = in.next();

                        try {
                            Laptop laptop = laptopList.getLaptopByModel(findModel);

                            if (laptop == null){
                                throw new LaptopNotFoundException("Laptop not found " + findModel);
                            }else {
                                System.out.println(laptop);
                            }
                        } catch (LaptopNotFoundException e) {
                            e.printStackTrace();
                        }


                        Main.main();
                    case (4):
                        System.exit(0);
                }
            }

        }
    }
}