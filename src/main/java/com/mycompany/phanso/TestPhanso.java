package com.mycompany.phanso;
import java.util.Scanner;
public class TestPhanso {
    public static void main(String[] args) {
        Phanso phanso1=new Phanso(4,5);
        Phanso phanso2=new Phanso(2,3);
        phanso1.congPhanSo(phanso2);
        phanso1.truphanso(phanso2);
        phanso1.nhanphanso(phanso2);
        phanso1.chiaphanso(phanso2);
    }
}
