/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

/**
 *
 * @author kaano
 */
public class ProjeMenuFormu extends JFrame {

    private JButton btnOgrenciKayit;
    private JButton btnDersKayit;

    public  ProjeMenuFormu() {
        initializeComponents();
    }

    private void initializeComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Anasayfa");
        setSize(400, 250); // Boyutlar güncellendi
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 255)); // Arka plan rengi toz pembe

        btnOgrenciKayit = new JButton("Öğrenci Kayıt");
        btnDersKayit = new JButton("Ders Kayıt");

        panel.add(btnOgrenciKayit);
        panel.add(btnDersKayit);
        add(panel);

        btnOgrenciKayit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OgrenciKayıtFormu ogrenciKayitFormu = new OgrenciKayıtFormu();
                ogrenciKayitFormu.setVisible(true);
            }
        });

        btnDersKayit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DersKayıtFormu dersKayitForm = new DersKayıtFormu();
                dersKayitForm.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProjeMenuFormu anasayfa = new ProjeMenuFormu();
            anasayfa.setVisible(true);
        });
    }
}


