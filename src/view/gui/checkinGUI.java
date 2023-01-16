package view.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;

import controller.TamuController;
import entity.TamuEntity;

public class checkinGUI extends JFrame {
    private JLabel title, nama, usia, nik, notelp, alamat, nokamar;
    private JTextField namaField, usiaField, nikField, telpField, alamatField, kamarField;
    private JButton nextBtn;
    private TamuController tamuCtrl = new TamuController();

    public checkinGUI(int width, int height){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLayout(null);
        setSize(507, 441);
        setLocation(500, 250);
    }

    @Override
    public void setVisible(boolean b) {
        if (b == true) {
            component();
            event();
        }
        super.setVisible(b);
    }
    protected void boundedAdd(Component comp, int x, int y, int width, int height) {
        int constX = 15, constY = 55;
        x = x - (constX / 2);
        y = y - (constY / 2);
        width = width + (constX / 2);
        comp.setBounds(x, y, width, height);
        add(comp);
    }
    protected void setFontStyle(Component comp, int style) {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontLama.getFontName(), style, fontLama.getSize());
        comp.setFont(fontBaru);
    }
    protected void setFontSize(Component comp, int size) {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontLama.getFontName(), fontLama.getStyle(), size);
        comp.setFont(fontBaru);
    }

    public void component(){
        title = new JLabel("MASUKKAN DATA RESERVASI");
        setFontSize(title,18);
        setFontStyle(title, Font.BOLD);
        boundedAdd(title,40,46,290,24);

        nama = new JLabel("Nama");
        setFontSize(nama,16);
        setFontStyle(nama, Font.BOLD);
        boundedAdd(nama,25,100,44,19);

        namaField = new JTextField();
        namaField.setBounds(120,75, 353, 21);
        add(namaField);

        usia = new JLabel("Usia");
        setFontSize(usia,16);
        setFontStyle(usia, Font.BOLD);
        boundedAdd(usia,25,130,34,19);

        usiaField = new JTextField();
        usiaField.setBounds(120,105, 353, 21 );
        add(usiaField);

        nik = new JLabel("NIK");
        setFontSize(nik,16);
        setFontStyle(nik, Font.BOLD);
        boundedAdd(nik,25,160,27,19);

        nikField = new JTextField();
        nikField.setBounds(120,135, 353,21);
        add(nikField);

        notelp = new JLabel("No.Telp");
        setFontSize(notelp,16);
        setFontStyle(notelp, Font.BOLD);
        boundedAdd(notelp,25,190,59,19);

        telpField = new JTextField();
        telpField.setBounds(120,165, 353, 21 );
        add(telpField);

        alamat = new JLabel("Alamat");
        setFontSize(alamat,16);
        setFontStyle(alamat, Font.BOLD);
        boundedAdd(alamat,25,220,54,19);

        alamatField = new JTextField();
        alamatField.setBounds(120,195, 353, 21);
        add(alamatField);

        nokamar = new JLabel("No. Kamar");
        setFontSize(nokamar,16);
        setFontStyle(nokamar, Font.BOLD);
        boundedAdd(nokamar,25,250,79,19);

        kamarField = new JTextField();
        kamarField.setBounds(120,225, 353, 21);
        add(kamarField);

        nextBtn = new JButton("NEXT");
        nextBtn.setBounds(391, 360, 85, 31);
        add(nextBtn);
    }

    public void event() {
            nextBtn.addActionListener((e) -> {
                try {
                    String namaTamu = namaField.getText();
                    int usia = Integer.parseInt(usiaField.getText());
                    String nik = nikField.getText();
                    String notelp = telpField.getText();
                    String alamat = alamatField.getText();
                    int noKamar = Integer.parseInt(kamarField.getText());

                    boolean statusTamu = tamuCtrl.tambahTamu(namaTamu, usia, nik, notelp, alamat, noKamar);
                    if (statusTamu) {
                        JOptionPane.showMessageDialog(null,
                                "berhasil input tamu",
                                "berhasil",
                                JOptionPane.INFORMATION_MESSAGE);
                        new berandaGUI().setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Nama " + namaTamu + " sudah terdaftar",
                                "gagal menambah",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch (Exception r){
                    System.out.println(r);
                }
            });

    }
}
