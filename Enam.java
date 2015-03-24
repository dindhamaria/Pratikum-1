package com.company;

/**
 * Created by dindha on 3/24/2015.
 */
public class Enam {
    public static void main(String[] args) {
        int awal= 1;
        int akhir= 10;
        int jumlah=0;

        while(awal<=akhir){
            jumlah=jumlah+awal;
            awal++;
        }

        System.out.println(jumlah);
    }
}
