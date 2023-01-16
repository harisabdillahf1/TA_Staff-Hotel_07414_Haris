package view.gui;

import javax.swing.*;

public class berandaGUI extends JFrame {
    private JLabel MenuLabel;
    private JButton btnCheckin, btnCheckout, btnKamar, btnPengunjung, ButtonBackLogin;


    public berandaGUI() {
        setTitle("Hotel asdfg");
        setSize(354, 380);
        setLayout(null);
        setLocation(500, 250);

        createComponents();
        event();
    }


    private void createComponents() {
        MenuLabel = new JLabel ("MENU");
        MenuLabel.setBounds(160, 20, 200, 30);
        btnCheckin = new JButton("CHECKIN");
        btnCheckin.setBounds(75, 60, 200, 30);
        btnCheckout = new JButton("CHECKOUT");
        btnCheckout.setBounds(75, 100, 200, 30);
        btnKamar = new JButton("DAFTAR KAMAR");
        btnKamar.setBounds(75, 140, 200, 30);
        btnPengunjung = new JButton("DAFTAR PENGUNJUNG");
        btnPengunjung.setBounds(75, 180, 200, 30);
        ButtonBackLogin = new JButton("LOGOUT");
        ButtonBackLogin.setBounds(20, 300, 100, 25);

        add(MenuLabel);
        add(btnCheckin);
        add(btnCheckout);
        add(btnKamar);
        add(btnPengunjung);
        add(ButtonBackLogin);
    }
    private void event() {
        ButtonBackLogin.addActionListener((e) -> {
            new loginGUI().setVisible(true);
            dispose();
        });
        btnCheckin.addActionListener((e) -> {
            new checkinGUI(500, 441).setVisible(true);
            dispose();
        });
        btnPengunjung.addActionListener((e) -> {
            new reservasiGUI().setVisible(true);
            dispose();
        });
        btnKamar.addActionListener((e) -> {
            new kamarGUI().setVisible(true);
            dispose();
        });
        btnCheckout.addActionListener((e) -> {
            dispose();
            new checkoutGUI(507, 441).setVisible(true);
        });
    }
}
