package com.mycompany.phanso;
import java.util.Scanner;
public class TestPhanso {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tu1,mau1;
        int tu2,mau2;
        System.out.printf("Nhap vao tu phan so 1:");
        tu1 = scanner.nextInt();
        System.out.printf("Nhap vao mau phan so 1:");
        mau1 =scanner.nextInt();
        System.out.printf("Nhap vao tu phan so 2:");
        tu2 = scanner.nextInt();
        System.out.printf("Nhap vao mau phan so 2:");
        mau2 = scanner.nextInt();
        Phanso phanso1=new Phanso(tu1,mau1);
        Phanso phanso2=new Phanso(tu2,mau2);
        phanso1.congPhanSo(phanso2);
        phanso1.truphanso(phanso2);
        phanso1.nhanphanso(phanso2);
        phanso1.chiaphanso(phanso2);
    }
}
