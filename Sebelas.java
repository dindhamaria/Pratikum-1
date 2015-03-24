package com.company;

/**
 * Created by dindha on 3/24/2015.
 */
public class Sebelas {
    public static void main(String[] args) {
        int a;
        int b;
        int c=4;

        for(a=1;a<=c;a++){
            if(a%2==0){
                System.out.print(" ");
            }
            for(b=1;b<=c;b++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
