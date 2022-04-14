package BaiTapNhuAnh;

public class XeMay extends  PhuongTien{
    private String dungTich;

    public XeMay() {
    }

    public XeMay(String hang, String color, String ten, double gia, String dungTich) {
        super(hang, color, ten, gia);
        this.dungTich = dungTich;
    }

    public String getDungTich() {
        return dungTich;
    }

    public void setDungTich(String dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return "XeMay{" + super.toString()
                + "dungTich='" + dungTich + '\'' + '}';
    }


}
