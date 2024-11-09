package test;
import java.util.Scanner;
public class MathA {
    public static void main(String[] args) {
        Scanner scen = new Scanner(System.in);

        // Nhập giá trị a từ bàn phím
        System.out.print("Nhập giá trị của a: ");
        double a = scen.nextDouble();

        // Căn bậc hai của a
        double canBacHai = Math.sqrt(a);
        System.out.println("Căn bậc hai của a: " + canBacHai);

        // Bình phương của a
        double binhPhuong = Math.pow(a, 2);
        System.out.println("Bình phương của a: " + binhPhuong);

        // Pi nhân với a
        double piNhanA = Math.PI * a;
        System.out.println("Math.PI x a: " + piNhanA);

        scen.close();
    }

}
