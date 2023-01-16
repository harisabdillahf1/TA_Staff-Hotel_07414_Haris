package view.gui;

import controller.TamuController;
import model.KamarModel;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class kamarGUI extends JFrame {
    private TamuController tamuCtrl = new TamuController();

    private void setFontSize(Component comp, int size) {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontLama.getFontName(), fontLama.getStyle(), size);
        comp.setFont(fontBaru);
    }

    kamarGUI(){
        super("lihat kamar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 350);
        setLocation(500, 250);

        JTable dataKamar = new JTable();
        TableModel model = createTableModel();
        dataKamar.setModel(model);

        JLabel label = new JLabel("Daftar Kamar");
        setFontSize(label,18);
        label.setBounds(20, 15, 300, 45);
        add(label);

        JScrollPane scroll = new JScrollPane(dataKamar);
        scroll.setBounds(20, 60, 450, 105);

        JButton back = new JButton("back");
        back.setBounds(25, 259, 85, 31);
        add(back);

        add(scroll);
        setVisible(true);
        dataKamar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int i = dataKamar.getSelectedRow();
                String selectedId = dataKamar.getValueAt(i,0).toString();
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
        DefaultTableModel dataKamar = new DefaultTableModel();
        Object[] kolom = {"No.", "No.Kamar", "Tipe Kamar", "Status Kamar"};
        dataKamar.setColumnIdentifiers(kolom);
        int size = tamuCtrl.kamarList().size();
        for(int i=0; i<size; i++){
            Object[] data = new Object[4];
            data[0]=i+1;
            data[1]=tamuCtrl.kamarList().get(i).getNoKamar();
            data[2]=tamuCtrl.kamarList().get(i).getTipeKamar();
            data[3]=tamuCtrl.kamarList().get(i).getStatusKamar();

            dataKamar.addRow(data);
        }
        return dataKamar;
    }
}