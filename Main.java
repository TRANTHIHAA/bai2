package BAI2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLiSach quanLiSach = new QuanLiSach();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-----Menu-----");
            System.out.println("--------------" );
            System.out.println("1.Them moi tai lieu");
            System.out.println("2.Xoa tai lieu theo ma");
            System.out.println("3.hien thi thong tin tai lieu");
            System.out.println("4.Tim kiem theo loai");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                   quanLiSach.themTaiLieu(scanner);
                    break;
                case 2:
                    quanLiSach.xoaTaiLieu(scanner);
                    break;
                case 3:
                   quanLiSach.hienThi();
                    break;
                case 4:
//                    System.out.println(quanLiSach.timTaiLieuTheoLoai(scanner));
                    quanLiSach.timTaiLieuTheoLoai(scanner);
                    break;
            }
        } while (choice !=0);

    }
}
