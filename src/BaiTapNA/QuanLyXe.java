package BaiTapNA;

public interface QuanLyXe <T>{
    void them(T t);

    void sua(String name, T t);

    void them(XeMay xeMay);

    void sua(String name, XeMay xeMay);

    void xoa(String name);

    int timKiem(String name);

    void in();

    void sapXep();
}
