package Day02;



import java.util.Random;

import java.util.Scanner;



public class GOTP {

               public static int OTP() {

              Random ran=new Random();

              return 1000+ran.nextInt(50000);

             

               }

           public static void main(String[] args) {

          Scanner in=new Scanner(System.in);