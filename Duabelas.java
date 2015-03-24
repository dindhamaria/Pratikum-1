package com.company;

/**
 * Created by dindha on 3/24/2015.
 */
public class Duabelas {
    public static void main(String[] args) {
        System.out.println("variabel");
        int x;
        int y;
        int panjang=7;
        int lebar=4;
        for(x=1;x<=lebar;x++){
            if(x % 2 == 0){
                System.out.print(" ");
            }
            for (y = 1;y <=panjang;y++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
