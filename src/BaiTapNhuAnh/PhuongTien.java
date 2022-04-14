package BaiTapNhuAnh;

public abstract class PhuongTien{
    private String hang;
    private String color;
    private String ten;
    private double gia;

    public PhuongTien() {
    }

    public PhuongTien(String hang, String color, String ten, double gia) {
        this.hang = hang;
        this.color = color;
        this.ten = ten;
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return
                "hang='" + hang + '\'' +
                ", color='" + color + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia;
    }
}
