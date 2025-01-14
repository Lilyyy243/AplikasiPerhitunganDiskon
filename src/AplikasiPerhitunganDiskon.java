/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mmada
 */
public class AplikasiPerhitunganDiskon extends javax.swing.JFrame {
    
    private java.util.List<String> riwayatList = new java.util.ArrayList<>();

    /**
     * Creates new form AplikasiPerhitunganDiskon
     */
    public AplikasiPerhitunganDiskon() {
        initComponents();
        // Initialize slider properties
        diskonSlider.setMinimum(10);
        diskonSlider.setMaximum(25);
        diskonSlider.setValue(10);
        diskonSlider.setMajorTickSpacing(5);
        diskonSlider.setPaintTicks(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();
        hitungButton = new javax.swing.JButton();
        diskonComboBox = new javax.swing.JComboBox<>();
        hargaTextField = new javax.swing.JTextField();
        diskonLabel = new javax.swing.JLabel();
        hargaLabel = new javax.swing.JLabel();
        totalTextField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        hematTextField = new javax.swing.JTextField();
        hematLabel = new javax.swing.JLabel();
        riwayatButton = new javax.swing.JButton();
        kuponLabel = new javax.swing.JLabel();
        kuponTextField = new javax.swing.JTextField();
        diskonSlider = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Penghitung Diskon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 7, 10);
        jPanel1.add(resetButton, gridBagConstraints);

        hitungButton.setText("Hitung");
        hitungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(14, 19, 7, 10);
        jPanel1.add(hitungButton, gridBagConstraints);

        diskonComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10%", "15%", "20%", "25%" }));
        diskonComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                diskonComboBoxItemStateChanged(evt);
            }
        });
        diskonComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskonComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 14);
        jPanel1.add(diskonComboBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 51;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 7, 14);
        jPanel1.add(hargaTextField, gridBagConstraints);

        diskonLabel.setText("Pilih Diskon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 1, 18);
        jPanel1.add(diskonLabel, gridBagConstraints);

        hargaLabel.setText("Masukkan Harga");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(14, 6, 5, 18);
        jPanel1.add(hargaLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 14);
        jPanel1.add(totalTextField, gridBagConstraints);

        totalLabel.setText("Total Harga Anda");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 5, 18);
        jPanel1.add(totalLabel, gridBagConstraints);

        hematTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hematTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 14);
        jPanel1.add(hematTextField, gridBagConstraints);

        hematLabel.setText("Anda Hemat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 9, 18);
        jPanel1.add(hematLabel, gridBagConstraints);

        riwayatButton.setText("Lihat Riwayat");
        riwayatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 21, 10, 10);
        jPanel1.add(riwayatButton, gridBagConstraints);

        kuponLabel.setText("Masukkan Kode Kupon (Jika Ada)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 7, 16);
        jPanel1.add(kuponLabel, gridBagConstraints);

        kuponTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuponTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 13);
        jPanel1.add(kuponTextField, gridBagConstraints);

        diskonSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                diskonSliderStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 3);
        jPanel1.add(diskonSlider, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hematTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hematTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hematTextFieldActionPerformed

    private void hitungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungButtonActionPerformed
    // menambahkan aritmatika dan penanganan eksepsi
    calculateTotal();
}//GEN-LAST:event_hitungButtonActionPerformed

    private void diskonComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diskonComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_diskonComboBoxActionPerformed

    private void diskonComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_diskonComboBoxItemStateChanged
        //menambahkan itemListener untuk memilih persentase diskon
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            try {
                int selectedDiscount = Integer.parseInt(
                    diskonComboBox.getSelectedItem().toString().replace("%", ""));
                diskonSlider.setValue(selectedDiscount);
            } catch (Exception e) {
                // Handle parsing error silently
            }
        }
    }//GEN-LAST:event_diskonComboBoxItemStateChanged

    private void diskonSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_diskonSliderStateChanged
        // Penambahan JSlider sebagai alternatif JComboBox
        if (!diskonSlider.getValueIsAdjusting()) {
            int sliderValue = diskonSlider.getValue();
            diskonComboBox.setSelectedItem(sliderValue + "%");
        }
    }//GEN-LAST:event_diskonSliderStateChanged

    private void riwayatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatButtonActionPerformed
        // Display history
        javax.swing.JOptionPane.showMessageDialog(this, String.join("\n", riwayatList), "Riwayat Perhitungan", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_riwayatButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        hargaTextField.setText("");
        diskonComboBox.setSelectedIndex(0);
        diskonSlider.setValue(20);
        kuponTextField.setText("");
        totalTextField.setText("");
        hematTextField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void kuponTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuponTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kuponTextFieldActionPerformed

    private void calculateTotal() {
        try {
            String hargaText = hargaTextField.getText().trim();
            if (hargaText.isEmpty()) {
                throw new NumberFormatException("Harga tidak boleh kosong");
            }

            int harga = Integer.parseInt(hargaText);
            if (harga <= 0) {
                throw new NumberFormatException("Harga harus lebih besar dari 0");
            }

            int diskon = diskonSlider.getValue();
            int total = harga - (harga * diskon / 100);
            int hemat = harga * diskon / 100;

            String kupon = kuponTextField.getText().trim();
            if (kupon.equalsIgnoreCase("50HAPPY")) {
                total -= total * 50 / 100;
                hemat += total * 50 / 100;
            }

            totalTextField.setText(String.format("%,d", total));
            hematTextField.setText(String.format("%,d", hemat));

            // Add to history with formatted numbers
            String riwayat = String.format("Harga: %,d, Diskon: %d%%, Kupon: %s, Total: %,d, Hemat: %,d",
                    harga, diskon, kupon, total, hemat);
            riwayatList.add(riwayat);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Input tidak valid. " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPerhitunganDiskon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> diskonComboBox;
    private javax.swing.JLabel diskonLabel;
    private javax.swing.JSlider diskonSlider;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JLabel hematLabel;
    private javax.swing.JTextField hematTextField;
    private javax.swing.JButton hitungButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kuponLabel;
    private javax.swing.JTextField kuponTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton riwayatButton;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables
}
