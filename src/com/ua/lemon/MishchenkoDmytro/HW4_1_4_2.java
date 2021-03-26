package com.ua.lemon.MishchenkoDmytro;

import java.util.Scanner;
public class HW4_1_4_2 {
    public static void main(String[] args) {
        int begin, end;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter begin point of cycle");
        begin = in.nextInt();
        System.out.println("Enter end point of cycle");
        end = in.nextInt();
        CyclesInfo(begin,end);

    }
    static void CyclesInfo(int beginPoint, int endPoint){
        for (int i = beginPoint; i <endPoint+1 ; i++) {
            System.out.print(i+"");
        }
        System.out.println();
        for (int i = endPoint; i >beginPoint-1 ; i--) {
            System.out.print(i+"");
        }
    }

}
