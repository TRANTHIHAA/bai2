package BAI2;

public class TaiLieu {
    private int maTL;
    private String NhaXuatban;
    private long soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(int maTL, String nhaXuatban, long soBanPhatHanh) {
        this.maTL = maTL;
        NhaXuatban = nhaXuatban;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getMaTL() {
        return maTL;
    }

    public void setMaTL(int maTL) {
        this.maTL = maTL;
    }

    public String getNhaXuatban() {
        return NhaXuatban;
    }

    public void setNhaXuatban(String nhaXuatban) {
        NhaXuatban = nhaXuatban;
    }

    public long getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoPhatHanh(long soPhatHanh) {
        this.soBanPhatHanh = soPhatHanh;
    }

    @Override
    public String toString() {
        return
                "maTL=" + maTL +
                ", NhaXuatban='" + NhaXuatban + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +" "
                ;
    }
}
