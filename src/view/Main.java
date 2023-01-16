package view;

import controller.StaffController;
import model.StaffModel;
import model.KamarModel;
//import view.gui.kamarGUI;
import view.gui.berandaGUI;
import view.gui.loginGUI;



public class Main implements jalanInterface{
    public void run(){
        StaffController loginCtrl = new StaffController();
        loginCtrl.forView();
    }
    private static void initial(){
        StaffModel.staffData();
        KamarModel.initialKamar();
    }
    public static void main(String[] args) {
        initial();
//        new loginGUI().setVisible(true);
        new berandaGUI().setVisible(true);
//        new Main().run();


    }
}