package com.ua.lemon.MishchenkoDmytro.TASKFROMOleksii;

public class FirstTaskTableOfIncrease {

    void getTable(int value)
    {
        for (int i = 1; i <= value ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + "*"+j+" = "+j*i);
            }
        }

    }

    void getTable2(int value)
    {
        int i = 1;
        int j = 1;
        final int ten = 10;
        while(i<=value)
        {
            while(j<=ten)
            {
                System.out.println(i + "*"+j + " = "+j*i);

                j++;
            }
            j = 1;
            i++;
        }


    }


}
