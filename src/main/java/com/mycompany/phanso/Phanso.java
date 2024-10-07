package com.mycompany.phanso;
import java.util.Scanner;
public class Phanso {
    private int tu, mau;
    public Phanso(int tu,int mau){
        this.tu=tu;
        this.mau=mau;
    }
    public int getTu() {
        return tu;
    }
    public void setTu(int tu) {
        this.tu = tu;
    }
    public int getMau() {
        return mau;
    }
    public void setMau(int mau) {
        this.mau = mau;
    }
    public int timUSCLN(int a,int b){
        while(a!=b)
        {
            if(a>b)
            {
            a-=b;
            }else {
            b-=a;
            }
        }
        return a;
    }
    public void toigianphanso()
    {
        int i=timUSCLN(this.getTu(),this.getMau());
        this.setTu(this.getTu()/i);
        this.setMau(this.getMau()/i);
    }
    public void congPhanSo(Phanso ps){
        int ts=this.getTu()*ps.getMau()+ps.getTu()*this.getMau();
        int ms=this.getMau()*ps.getMau();
        Phanso tongphanso=new Phanso(ts,ms);
        tongphanso.toigianphanso();
        System.out.println("Tong hai phan so ="+tongphanso.tu+"/"+tongphanso.mau);
    }
    public void truphanso(Phanso ps){
    int ts=this.getTu()*ps.getMau()-ps.getTu()*this.getMau();
    int ms=this.getMau()*ps.getMau();
    Phanso hieuphanso=new Phanso(ts,ms);
    hieuphanso.toigianphanso();
    System.out.println("Hieu cua 2 phan so la:"+hieuphanso.tu+"/"+hieuphanso.mau);
    }
    public void nhanphanso(Phanso ps)
    {
        int ts=this.getTu()*ps.getTu();
        int ms=this.getMau()*ps.getMau();
        Phanso tichphanso=new Phanso(ts,ms);
        tichphanso.toigianphanso();
        System.out.println("Tich 2 phan so la:"+tichphanso.tu+"/"+tichphanso.mau);
    }
    public void chiaphanso(Phanso ps)
    {
        int ts=this.getTu()*ps.getMau();
        int ms=this.getMau()*ps.getTu();
        Phanso thuongphanso= new Phanso(ts,ms);
        thuongphanso.toigianphanso();
        System.out.println("Thuong cua 2 phan so la:"+thuongphanso.tu+"/"+thuongphanso.mau);    
    }
}
