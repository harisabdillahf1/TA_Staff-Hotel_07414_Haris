package view;

import controller.StaffController;
import model.StaffModel;
import model.KamarModel;

public class Main {
    private void run(){
        StaffController loginCtrl = new StaffController();
        loginCtrl.forView();
    }
    private static void initial(){
        StaffModel.staffData();
        KamarModel.initialKamar();
    }
    public static void main(String[] args) {
        initial();
        new Main().run();
    }
}