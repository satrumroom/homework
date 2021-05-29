package com.ua.lemon.kharkov.Practical_3;

import com.ua.lemon.kharkov.Practical_3.dao.LaptopDaoDb;
import com.ua.lemon.kharkov.Practical_3.domain.Laptop;
import com.ua.lemon.kharkov.Practical_3.сatchError.LaptopNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String ... args) {

        LaptopDaoDb laptopDaoDb = new LaptopDaoDb();
        List<Laptop> laptopList = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int choice;

        while (true) {

            System.out.println("\n1) Get All\n" +
                    "2) Delete By Id\n" +
                    "3) Find by model laptop\n" +
                    "4) Exit");

            System.out.print("Enter menu number you want: ");
            choice = in.nextInt();

            if (choice <= 0 || choice > 4) {
                System.out.println("Invalid number.");

            }else {
                switch (choice){
                    case (1):
                        laptopList = laptopDaoDb.getAll();
                        System.out.println(laptopList);

                        Main.main();
                    case (2):
                        int idNum = in.nextInt();
                        laptopDaoDb.deleteById(idNum);
                        Main.main();
                    case (3):
                        String model = in.next();
                        laptopDaoDb.findLaptopByModel(model);
                        Main.main();
                    case (4):
                        System.exit(0);
                }
            }

        }
    }
}