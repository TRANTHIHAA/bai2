package BAI2;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao() {
    }

    public Bao(int maTL, String nhaXuatban, long soBanPhatHanh, String ngayPhatHanh) {
        super(maTL, nhaXuatban, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +super.toString()+
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                '}';
    }
}
