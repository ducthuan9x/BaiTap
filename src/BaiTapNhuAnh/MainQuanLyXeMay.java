package BaiTapNhuAnh;

public class MainQuanLyXeMay {
    public static void main(String[] args) {
       QuanLyXeMay qlxm=new QuanLyXeMay();
       XeMay xeMay1=new XeMay("Yamaha","red","Sirius",1000,"110cc");
       XeMay xeMay2 =new XeMay("honda","blu","ways",500,"110cc");
        XeMay xeMay3 =new XeMay("honda","while","sh",500,"150cc");
        qlxm.add(xeMay1);
        qlxm.add(xeMay2);
        qlxm.add(xeMay3);
        qlxm.delete(xeMay2);
        qlxm.getAll();
        qlxm.print();
    }
}
