package view.staff;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import entity.TamuEntity;
import entity.KamarEntity;
import model.TamuModel;
import model.KamarModel;
import view.tamu.reservasi;

public class beranda {
    public void menu() {
        int pilihan;
        Scanner input = new Scanner(System.in);
        reservasi visitor = new reservasi();
        do {
            System.out.println("""
                    ================
                        MENU
                    ================
                    1. CHECKIN
                    2. CHECKOUT
                    3. DAFTAR KAMAR
                    4. DAFTAR PENGUNJUNG""");
            System.out.println("================");
            System.out.print(" pilihan anda : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    visitor.checkIn();
                    break;
                case 2:
                    visitor.checkout();
                    break;
                case 3:
                    viewKamar();
                    break;
                case 4:
                    cetak();
                    break;
            }
        }
        while (pilihan != 5 || pilihan != 0);
        return;
    }

    public void cetak(){
        ArrayList<TamuEntity> data = TamuModel.semua();

        if (data.isEmpty()){
            System.out.println("-----------------------");
            System.out.println(" maaf belum ada tamu");
            System.out.println("-----------------------");
        }
        else {
            for (TamuEntity ada : data){
                System.out.println("--------------------");
                System.out.println("Nama        : "+ada.getNamaTamu());
                System.out.println("Usia        : "+ada.getUsia());
                System.out.println("NIK         : "+ada.getNik());
                System.out.println("No.Telp     : "+ada.getNotelp());
                System.out.println("Alamat      : "+ada.getAlamat());
                System.out.println("No. Kamar   : "+ada.getNoKamar());
            }
        }
    }

    private void viewKamar(){
        ArrayList<KamarEntity> kamarlist = KamarModel.semua();
        for (KamarEntity kamar : kamarlist){
            System.out.println("No Kamar            : " + kamar.getNoKamar());
            System.out.println("Tipe model.kamar    : " + kamar.getTipeKamar());
            System.out.println("Status model.kamar  : " + kamar.getStatusKamar());
        }
    }
}
