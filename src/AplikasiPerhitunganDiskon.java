/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mmada
 */
public class AplikasiPerhitunganDiskon extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPerhitunganDiskon
     */
    public AplikasiPerhitunganDiskon() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Penghitung Diskon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        resetButton.setText("Reset");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
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
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 14);
        jPanel1.add(diskonComboBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 51;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 6, 14);
        jPanel1.add(hargaTextField, gridBagConstraints);

        diskonLabel.setText("Pilih Diskon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 18);
        jPanel1.add(diskonLabel, gridBagConstraints);

        hargaLabel.setText("Masukkan Harga");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(14, 6, 0, 18);
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
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 18);
        jPanel1.add(totalLabel, gridBagConstraints);

        hematTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hematTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 14);
        jPanel1.add(hematTextField, gridBagConstraints);

        hematLabel.setText("Anda Hemat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 4, 18);
        jPanel1.add(hematLabel, gridBagConstraints);

        riwayatButton.setText("Lihat Riwayat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 21, 10, 10);
        jPanel1.add(riwayatButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hematTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hematTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hematTextFieldActionPerformed

    private void hitungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungButtonActionPerformed
        // menambahkan aritmatika dan penanganan eksepsi
        try {
            int harga = Integer.parseInt(hargaTextField.getText());
            String diskonStr = (String) diskonComboBox.getSelectedItem();
            int diskon = Integer.parseInt(diskonStr.replace("%", ""));
            int total = harga - (harga * diskon / 100);
            int hemat = harga * diskon / 100;

            totalTextField.setText(String.valueOf(total));
            hematTextField.setText(String.valueOf(hemat));
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Input tidak valid. Masukkan angka yang benar.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_hitungButtonActionPerformed

    private void diskonComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diskonComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_diskonComboBoxActionPerformed

    private void diskonComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_diskonComboBoxItemStateChanged
        //menambahkan itemListener untuk memilih persentase diskon
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            hitungButtonActionPerformed(null);
        }
    }//GEN-LAST:event_diskonComboBoxItemStateChanged

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
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JLabel hematLabel;
    private javax.swing.JTextField hematTextField;
    private javax.swing.JButton hitungButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton riwayatButton;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables
}
