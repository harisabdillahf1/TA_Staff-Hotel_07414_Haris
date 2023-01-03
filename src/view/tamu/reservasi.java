package view.tamu;

import java.util.Scanner;

import controller.TamuController;
import entity.TamuEntity;

public class reservasi extends TamuEntity {
    private TamuController tamuCtrl = new TamuController();

    public void checkIn(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama     : ");
        namaTamu = input.nextLine();
        System.out.print("Masukkan Usia     : ");
        usia = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan NIK      : ");
        nik = input.nextLine();
        System.out.print("Masukkan no.Telp  : ");
        notelp = input.nextLine();
        System.out.print("Masukkan Alamat   : ");
        alamat = input.nextLine();
        System.out.print("Masukkan No.Kamar : ");
        noKamar = input.nextInt();
        input.nextLine();

        boolean statusTamu = tamuCtrl.tambahTamu(namaTamu, usia, nik, notelp, alamat, noKamar);
        if (!statusTamu){
            System.out.println("Nama "+namaTamu +" sudah terdaftar");
        }
    }

    public void checkout(){
        Scanner isi = new Scanner(System.in);
        String nik;

        System.out.print("Masukkan NIK : ");
        nik = isi.nextLine();

        boolean status = tamuCtrl.hapusTamu(nik);
        if (status){
            System.out.println("BERHASIL MENGHAPUS DATA");
        }
        else {
            System.out.println("NIK "+nik +" tidak ditemukan");
        }
    }
}
