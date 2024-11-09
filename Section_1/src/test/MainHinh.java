package test;

import java.util.Scanner;

public class MainHinh {
    public static void main(String[] args) {
        Scanner scen = new Scanner(System.in);
        // Hình Vuông
        System.out.print("Nhập cạnh hình vuông: ");
        Float canhHinhVuong = scen.nextFloat();
        System.out.println("Chu vi hình vuông: " + HinhVuong.chuVi(canhHinhVuong));
        System.out.println("Diện tích hình vuông: " + HinhVuong.dienTich(canhHinhVuong));
        //hinh cn
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        Float chieuDai = scen.nextFloat();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        Float chieuRong = scen.nextFloat();

        System.out.println("Chu vi hình cn: " + HinhChuNhat.chuVi(chieuDai, chieuRong));
        System.out.println("Diện tích hình cn: " + HinhChuNhat.dienTich(chieuDai, chieuRong));

        // Hình Tròn
        System.out.print("Nhập bán kính hình tròn: ");
        Float banKinh = scen.nextFloat();

        System.out.println("Chu vi hình tròn: " + HinhTron.chuVi(banKinh));
        System.out.println("Diện tích hình tròn: " + HinhTron.dienTich(banKinh));

        // Tam Giác Vuông
        System.out.print("Nhập cạnh A của tam giác vuông: ");
        Float canhA = scen.nextFloat();
        System.out.print("Nhập cạnh B của tam giác vuông: ");
        Float canhB = scen.nextFloat();

        System.out.println("Chu vi tam giác vuông: " + HinhTamGiacV.chuVi(canhA, canhB));
        System.out.println("Diện tích tam giác vuông: " + HinhTamGiacV.dienTich(canhA, canhB));
        scen.close();

    }
}
