package com.mycompany.bai2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap mot chuoi: ");
        String str = sc.nextLine();
        System.out.printf("nhap mot ky tu: ");
        char chr = sc.next().charAt(0);
        System.out.printf("Nhap mot so nguyen: ");
        int i = sc.nextInt();
        System.out.printf("nhap mot so thuc: ");
        float f = sc.nextFloat();
        try {
            FileOutputStream fo = new FileOutputStream("exp.dat");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(str+"\t"+chr+"\t" + i+"\t" + f);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
