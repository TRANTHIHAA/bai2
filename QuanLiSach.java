package BAI2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiSach {
   private List<TaiLieu> taiLieuList;

   public QuanLiSach(){
       taiLieuList = new ArrayList<>();
   }

   public void themTaiLieu(Scanner scanner){
       System.out.println("nhap thong tin tai lieu moi:");

       System.out.print("nhap ma tai lieu:");
       int ma = scanner.nextInt();
       if (!checkMa(ma)){

       System.out.print("nhap nha xuat ban: ");
       String nxb = scanner.next();

       System.out.print("nhap so ban phat hanh:");
       long sbph = scanner.nextLong();

       System.out.println("chon loai tai lieu: ");
       System.out.println("1.Sach");
       System.out.println("2.Tap chi");
       System.out.println("3.Bao");
       int chon = scanner.nextInt();
       if (chon == 1){
               System.out.print("nhap ten tac gia: ");
               String tacGia = scanner.next();

               System.out.print("nhap so trang:");
               long soTrang = scanner.nextLong();

               TaiLieu sach = new Sach(ma,nxb,sbph,tacGia,soTrang);
               taiLieuList.add(sach);
       }
       if (chon == 2){
           System.out.print("nhap so phat hanh: ");
           Long sph = scanner.nextLong();
           System.out.print("nhap thang phat hanh: ");
           int tph= scanner.nextInt();

           TaiLieu tapChi = new TapChi(ma,nxb,  sbph,sph,tph);

               taiLieuList.add(tapChi);

       }

       if (chon == 3){
           System.out.print("nhap ngay phat hanh: ");
           String nph = scanner.next();
           TaiLieu bao = new Bao(ma,nxb,sbph,nph);

               taiLieuList.add(bao);
       }

       }else System.out.println("ko the them vao");
   }

   public void xoaTaiLieu(Scanner scanner){
       System.out.println("nhap ma tai lueu muon xoa: ");
       int ma = scanner.nextInt();
       for (TaiLieu tailieu: taiLieuList) {
           if (tailieu.getMaTL() == ma){
               taiLieuList.remove(tailieu);
           }
       }
   }

   public void hienThi(){
       for (TaiLieu taiLieu : taiLieuList) {
           System.out.println(taiLieu);
       }
   }

   public void timTaiLieuTheoLoai(Scanner scanner){
      // List<TaiLieu> taiLieus = new ArrayList<>();
       System.out.print("chon loai tai lieu: ");
       System.out.println("1.Sach");
       System.out.println("2.Tap chi");
       System.out.println("3.Bao");
       int chon = scanner.nextInt();
       switch (chon){
           case 1:
               for (TaiLieu taiLieu : taiLieuList) {
                   if (taiLieu instanceof Sach){
//                       taiLieus.add(taiLieu);
                       System.out.println(taiLieu);
                   }
               }
               break;
           case 2:
               for (TaiLieu taiLieu : taiLieuList) {
                   if (taiLieu instanceof TapChi){
                     //  taiLieus.add(taiLieu);
                       System.out.println(taiLieu);
                   }
               }
               break;
           case 3:
               for (TaiLieu taiLieu : taiLieuList) {
                   if (taiLieu instanceof Bao){
                     //  taiLieus.add(taiLieu);
                       System.out.println(taiLieu);
                   }
               }
               break;
       }
//       return taiLieus;

   }

   public boolean checkMa(int ma){
       for (TaiLieu taiLieu : taiLieuList) {
           if (ma == taiLieu.getMaTL() ){
               return true;
           }
       }return false;
   }



}
