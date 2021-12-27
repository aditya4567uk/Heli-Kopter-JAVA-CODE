package com.company;
import java.util.*;
import java.io.*;
import java.lang.Thread;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("ENTER THE NUMBER OF ITERATIONS\n");
        Scanner sc= new Scanner(System.in);
        int itr=sc.nextInt();
        int e;
        System.out.println("Number of time Helicopter loop will run"+itr);
        try{
            for(int i=0; i<=itr; i++){
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("         :HELIKOPTER:MEOW:MEOW");
                System.out.println("           A           ");
                System.out.println("       /--------       ");
                System.out.println(" LOL====      ()\\     ");
                System.out.println("  L    \\         \\        ");
                System.out.println("        \\_________]                ");
                System.out.println("           I     I      ");
                System.out.println("        -----------/              ");
                System.out.println("                       ");
                System.out.println("      H-E-L-I-K-O-P-T-E-R!              ");

                Thread.sleep(250);

                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("MEOW:MEOW:HELIKOPTER:         ");
                System.out.println("           A           ");
                System.out.println("  L    /--------       ");
                System.out.println(" LOL====      ()\\     ");
                System.out.println("       \\         \\        ");
                System.out.println("        \\_________]                ");
                System.out.println("           I     I      ");
                System.out.println("        -----------/              ");
                System.out.println("                       ");
                System.out.println("      H-E-L-I-K-O-P-T-E-R!              ");

                Thread.sleep(250);
            }

        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
