package view.gui;

import controller.TamuController;
import model.KamarModel;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class reservasiGUI extends JFrame {
    private TamuController tamuCtrl = new TamuController();

    private void setFontSize(Component comp, int size) {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontLama.getFontName(), fontLama.getStyle(), size);
        comp.setFont(fontBaru);
    }

    reservasiGUI(){
        super("Reservasi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(825, 350);
        setLocation(650, 180);

        JTable dataTamu = new JTable();
        TableModel model = createTableModel();
        dataTamu.setModel(model);

        JLabel label = new JLabel("Daftar Reservasi");
        setFontSize(label,18);
        label.setBounds(20, 15, 300, 45);
        add(label);

        JScrollPane scroll = new JScrollPane(dataTamu);
        scroll.setBounds(20, 60, 775, 145);

        JButton back = new JButton("back");
        back.setBounds(25, 259, 85, 31);
        add(back);

        add(scroll);
        setVisible(true);
        dataTamu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int i = dataTamu.getSelectedRow();
                String selectedId = dataTamu.getValueAt(i,0).toString();
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new berandaGUI().setVisible(true);
                dispose();
            }
        });
    }

    private TableModel createTableModel(){
        DefaultTableModel dataTamu = new DefaultTableModel();
        Object[] kolom = {"No", "Nama", "Usia", "NIK", "NoTelp", "Alamat", "No Kamar"};
        dataTamu.setColumnIdentifiers(kolom);
        int size = tamuCtrl.tamuList().size();
        for(int i=0; i<size; i++){
            Object[] data = new Object[7];
            data[0]=i+1;
            data[1]=tamuCtrl.tamuList().get(i).getNamaTamu();
            data[2]=tamuCtrl.tamuList().get(i).getUsia();
            data[3]=tamuCtrl.tamuList().get(i).getNik();
            data[4]=tamuCtrl.tamuList().get(i).getNotelp();
            data[5]=tamuCtrl.tamuList().get(i).getAlamat();
            data[6]=tamuCtrl.tamuList().get(i).getNoKamar();

            dataTamu.addRow(data);
        }
        return dataTamu;
    }

}