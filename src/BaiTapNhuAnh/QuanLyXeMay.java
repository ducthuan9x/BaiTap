package BaiTapNhuAnh;


import java.util.ArrayList;

public class QuanLyXeMay implements QuanLyXe<XeMay> {
    //    private XeMay[] danhSach=new XeMay[20];
//    int size =0;
    private ArrayList<XeMay> danhSach;

    public QuanLyXeMay() {
        this.danhSach = new ArrayList<XeMay>();
    }

    public QuanLyXeMay(ArrayList<XeMay> danhSach) {
        this.danhSach = danhSach;
    }

    @Override
    public void add(XeMay xeMay) {
//       danhSach[size]=xeMay;
//       size++;
        this.danhSach.add(xeMay);
    }

    @Override
    public void edit(XeMay xeMay) {

    }


    @Override
    public void delete(XeMay xeMay) {
        this.danhSach.remove(xeMay);
    }


    @Override
    public XeMay[] getAll() {
        return new XeMay[danhSach.size()];
    }

    @Override
    public void print() {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println(danhSach.get(i));
        }
    }
}
