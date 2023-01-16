package view.gui;

import javax.swing.*;
import java.awt.*;

import controller.StaffController;

public class loginGUI extends abstractGUILogin {
    private StaffController staffCtrl = new StaffController();
    private JLabel hotelAsLabel, logLabel, pesanLabel, passLabel, idLabel;
    private JTextField idField;
    private JPasswordField passField;
    private JButton btn;
    public loginGUI(){
        super(500,300);
    }

    @Override
    protected void component() {
        hotelAsLabel = new JLabel("Hotel asdfg");
        setFontSize(hotelAsLabel,24);
        setFontStyle(hotelAsLabel, Font.BOLD);
        boundedAdd(hotelAsLabel,14,29,142,28);

        logLabel = new JLabel("LOGIN");
        setFontSize(logLabel,20);
        setFontStyle(logLabel, Font.BOLD);
        boundedAdd(logLabel,224,86,67,27);

        pesanLabel = new JLabel("silahkan login terlebih dahulu");
        setFontSize(pesanLabel,13);
        setFontStyle(pesanLabel, Font.ITALIC);
        boundedAdd(pesanLabel,165,113,185,18);

        idLabel = new JLabel("id");
        setFontSize(idLabel,14);
        setFontStyle(idLabel, Font.BOLD);
        boundedAdd(idLabel,114,156,13,17);

        idField = new JTextField();
        idField.setBounds(177,128, 180, 22);
        add(idField);

        passLabel = new JLabel("password");
        setFontSize(passLabel,14);
        setFontStyle(passLabel, Font.BOLD);
        boundedAdd(passLabel,93,194,65,17);

        passField = new JPasswordField();
        passField.setBounds(177,167, 180, 22);
        add(passField);

        btn = new JButton("ENTER");
        setFontSize(btn,7);
        setFontStyle(btn, Font.BOLD);
        boundedAdd(btn,231,234,65,28);
    }

    @Override
    protected void event() {
        btn.addActionListener((e) -> {
            try {
                int id = Integer.parseInt(String.valueOf(idField.getText()));
                String password = String.valueOf(passField.getPassword());

                Boolean status = staffCtrl.loginCheck(id, password);
                if (status) {
                    new berandaGUI().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Username atau Password Salah",
                            "Login Gagal",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception r){
                JOptionPane.showMessageDialog(null,
                        "Input tidak sesuai",
                        "Login Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }

        });
    }
}
