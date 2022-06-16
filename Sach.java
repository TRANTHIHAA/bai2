package BAI2;

public class Sach extends TaiLieu{
    private String tacGia;
    private long soTrang;

    public Sach() {
    }

    public Sach(int maTL, String nhaXuatban, long soBanPhatHanh, String tacGia, long soTrang) {
        super(maTL, nhaXuatban, soBanPhatHanh);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public long getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(long soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +super.toString()+
                "tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
