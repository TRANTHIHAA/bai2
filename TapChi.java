package BAI2;

public class TapChi extends TaiLieu{
    private long soPhathanh;
    private int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(int maTL, String nhaXuatban, long soBanPhatHanh, long soPhathanh, int thangPhatHanh) {
        super(maTL, nhaXuatban, soBanPhatHanh);
        this.soPhathanh = soPhathanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public long getSoPhathanh() {
        return soPhathanh;
    }

    public void setSoPhathanh(long soPhathanh) {
        this.soPhathanh = soPhathanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +super.toString()+
                "soPhathanh=" + soPhathanh +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
