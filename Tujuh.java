package com.company;

/**
 * Created by dindha on 3/24/2015.
 */
public class Tujuh {
    public static void main(String[] args) {
        double awal=1;
        double akhir=10;
        double jumlah=0;
        double rata;
        System.out.println("angka pertamma="+awal);
        System.out.println("angka akhir="+akhir);
        System.out.println("jumlah deretan angka=");
        while(awal<=akhir) {
            jumlah = jumlah + awal;
            awal++;
        }
        System.out.println(jumlah);
        rata=jumlah/akhir;
        System.out.println("rata-rata deretan angka="+rata);
        }
    }