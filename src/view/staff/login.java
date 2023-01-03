package view.staff;

import controller.StaffController;

import java.util.Scanner;

public class login {
    private StaffController staffCtrl = new StaffController();
    private Scanner forlogin = new Scanner(System.in);
    private beranda home = new beranda();
    public void staffLogin(){
        while(true){
            String namaStaff = "Haris Abdillah Firmansyah";
            int id;
            String password;
            System.out.println("    LOGIN");
            System.out.println("==============");
            System.out.print("id : ");
            id = forlogin.nextInt();
            forlogin.nextLine();
            System.out.print("password : ");
            password = forlogin.nextLine();

            boolean statusLogin = staffCtrl.loginCheck(id, password);
            if (statusLogin){
                System.out.println("======================");
                System.out.println("    Login berhasil!");
                System.out.println("========================");
                System.out.println(" Nama : "+namaStaff);
                System.out.println(" id   : "+id);
                System.out.println("========================");

                home.menu();
            }
            else{
                System.out.println("maaf id atau password salah");
            }
        }
    }
}
