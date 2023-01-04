package view;

import controller.StaffController;
import model.StaffModel;
import model.KamarModel;
//import view.gui.swing;

import javax.swing.*;

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
//        swing jswing = new swing();
//        jswing.setVisible(true);
        initial();
        new Main().run();
    }
}