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



        QuanLyOto qlot=new QuanLyOto();
        Oto qlot1=new Oto("toyota","do","mada",9000,5);
        Oto qlot2=new Oto("toyota","vang","mada5",10000,5);
        Oto qlot3=new Oto("toyota","xanh","mada6",8000,5);

        qlot.them(qlot1);
        qlot.them(qlot2);
        qlot.them(qlot3);
        qlot.in();
        qlot.sapXep();
        System.out.println(qlot.timKiem("mada5"));

        Oto qlot4=new Oto("toyota","vang","lexu",8000,7);
        qlot.sua("mada6", qlot4);
        qlot.in();
        qlot.xoa("mada5");
        qlot.in();

    }
}
