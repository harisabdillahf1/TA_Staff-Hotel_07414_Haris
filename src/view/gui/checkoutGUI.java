package view.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import controller.TamuController;

public class checkoutGUI extends JFrame {
    private JButton ok;
    private JTextField nikField;
    private TamuController tamuCtrl = new TamuController();
    public checkoutGUI(int width, int height) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLayout(null);
        setSize(507, 350);
        setLocation(150, 180);

        JButton next = new JButton("NEXT");
        next.setBounds(300, 200, 50, 25);

        setVisible(true);
        new reservasiGUI().setVisible(true);

        JLabel judul = new JLabel("CHECKOUT TAMU");
        setFontSize(judul,20);
        judul.setBounds(20, 30, 200, 30);
        add(judul);

        JLabel nik = new JLabel("Masukkan NIK");
        nik.setBounds(30, 75, 100, 20);
        add(nik);

        nikField = new JTextField();
        nikField.setBounds(135, 75, 300, 25);
        add(nikField);

        ok = new JButton("OK");
        ok.setBounds(390, 150, 80, 30);
        add(ok);

        event();
    }

    protected void setFontSize(Component comp, int size) {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontLama.getFontName(), fontLama.getStyle(), size);
        comp.setFont(fontBaru);
    }

    public void event(){
        ok.addActionListener((e) -> {
            String nik = nikField.getText();

            boolean status = tamuCtrl.hapusTamu(nik);
            if (status) {
                JOptionPane.showMessageDialog(null,
                        "BERHASIL MENGHAPUS DATA",
                        "Checkout",
                        JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null,
                        "NIK " + nik + " tidak ditemukan",
                        "Gagal checkout",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println("NIK " + nik + " tidak ditemukan");
            }
        });
    }
}
