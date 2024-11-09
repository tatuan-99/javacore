package test;

public class Main {
    public static void main(String[] args) {
         float  a = 5.5f;
         float b = 2.2f;
         float tong = TinhToan.tongHaiso(a,b);
         float hieu = TinhToan.hieuHaiso(a,b);
         float tich = TinhToan.tichHaiso(a,b);
         float thuong = TinhToan.thuongHaiso (a,b);

        System.out.println("tổng hiệu tích thương 2 số a và b ");
        System.out.println(tong);
        System.out.println(hieu);
        System.out.println(tich);
        System.out.println(thuong);

        double x = 5.5;
        double y = 2.2;
        double tongx = TinhToan.tongHaiso(x,y);
        double hieux = TinhToan.hieuHaiso(x,y);
        double tichx = TinhToan.tichHaiso(x,y);
        double thuongx = TinhToan.thuongHaiso(x,y);

        System.out.println("tổng hiệu tích thương 2 số a và b ");
        System.out.println(tongx);
        System.out.println(hieux);
        System.out.println(tichx);
        System.out.println(thuongx);
    }
}
