package BaiTapNA;

public class Main {
    public static void main(String[] args) {
        QuanLyXeMay qlxm = new QuanLyXeMay();
        XeMay xm1 = new XeMay("Yamaha", "vang", "sirius", 20, 150);
        XeMay xm2 = new XeMay("Honda", "Xanh", "ways", 80, 150);
        XeMay xm3 = new XeMay("Honda", "Do", "sh", 60, 150);

        qlxm.them(xm1);
        qlxm.them(xm2);
        qlxm.them(xm3);
        qlxm.in();
        qlxm.sapXep();
        System.out.println(qlxm.timKiem("sh"));

        XeMay xm4 = new XeMay("Honda", "Trang", "@", 70, 200);
        qlxm.sua("sirius", xm4);
        qlxm.in();
        qlxm.xoa("ways");
        qlxm.in();

    }
}
