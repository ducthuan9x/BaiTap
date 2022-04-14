package BaiTapNhuAnh;

public interface QuanLyXe<T>{

    void add(T t);
    void  edit(T t);
    void delete(T t);

    T[] getAll();
    void print();
}
