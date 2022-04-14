package BaiTapNA;

public class Main {
    public static void main(String[] args) {
        QuanLyXeMay qlxm = new QuanLyXeMay();
        XeMay xm1 = new XeMay("Honda", "Den", "a", 20, 150);
        XeMay xm2 = new XeMay("Honda", "Xanh", "b", 80, 150);
        XeMay xm3 = new XeMay("Honda", "Do", "c", 60, 150);

        qlxm.them(xm1);
        qlxm.them(xm2);
        qlxm.them(xm3);
        qlxm.in();
        qlxm.sapXep();
        System.out.println(qlxm.timKiem("a"));

        XeMay xm4 = new XeMay("Honda", "Trang", "d", 70, 200);
        qlxm.sua("c", xm4);
        qlxm.in();
        qlxm.xoa("b");
        qlxm.in();

    }
}
