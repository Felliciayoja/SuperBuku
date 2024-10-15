package BukuBio;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih : \n 1. TextBook \n 2. Novel ");
        int pilihan = in.nextInt();
        in.nextLine();
        if (pilihan == 1) {
            System.out.println("Judul = ");
            String Judul = in.nextLine();
            System.out.println("Subject = ");
            String Subject = in.nextLine();
            System.out.println("About = ");
            String About = in.nextLine();
            System.out.println("Tahun Terbit = ");
            int Year = in.nextInt();
            System.out.println("Harganya = ");
            double Price = in.nextDouble();
            Biography Biography1 = new Biography(Judul, Year, Price, Subject, About);
            Biography1.print();
        } else if (pilihan == 2) {
            System.out.println("Judul = ");
            String Judul = in.nextLine();
            System.out.println("Tahun Terbit = ");
            int Year = in.nextInt();
            System.out.println("Harganya = ");
            double Price = in.nextDouble();
            System.out.println("Genre = ");
            String Genre = in.next();
            Novel Novel1 = new Novel (Judul, Year, Price, Genre);
            Novel1.print();
        }else {
            System.out.println("Maaf Inputan Anda Salah !!! ");
        }

    }

}
