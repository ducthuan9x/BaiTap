package BaiTapNhuAnh;

public class Oto extends  PhuongTien implements QuanLyXe<Oto>{
    private String soCho;

    public Oto() {
    }

    public Oto(String hang, String color, String ten, double gia, String soCho) {
        super(hang, color, ten, gia);
        this.soCho = soCho;
    }

    public String getSoCho() {
        return soCho;
    }

    public void setSoCho(String soCho) {
        this.soCho = soCho;
    }

    @Override
    public String toString() {
        return "Oto{" +super.toString()
                + "soCho='" + soCho + '\'' + '}';
    }





    @Override
    public void add(Oto oto) {

    }

    @Override
    public void edit(Oto oto) {

    }

    @Override
    public void delete(Oto oto) {

    }


    @Override
    public Oto[] getAll() {
        return new Oto[0];
    }

    @Override
    public void print() {

    }

}
