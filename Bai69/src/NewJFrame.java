



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author quocb
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        lb1 = new javax.swing.JLabel();
        txta = new javax.swing.JTextField();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        txtb = new javax.swing.JTextField();
        tong = new javax.swing.JButton();
        hieu = new javax.swing.JButton();
        tich = new javax.swing.JButton();
        thuong = new javax.swing.JButton();
        txtkq = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Các Phép toán");

        lb1.setText("Số A:");

        lb2.setText("Số B:");

        lb3.setText("Kết quả:");

        txtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbActionPerformed(evt);
            }
        });

        tong.setText("+");
        tong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongActionPerformed(evt);
            }
        });

        hieu.setText("-");
        hieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hieuActionPerformed(evt);
            }
        });

        tich.setText("*");
        tich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tichActionPerformed(evt);
            }
        });

        thuong.setText("/");
        thuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb2)
                        .addGap(18, 18, 18)
                        .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb1)
                                .addGap(18, 18, 18)
                                .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtkq, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(tong)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hieu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tich)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thuong)))
                        .addContainerGap(46, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tong)
                    .addComponent(hieu)
                    .addComponent(tich)
                    .addComponent(thuong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtkq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongActionPerformed
        int a = Integer.parseInt(txta.getText());           
           int b = Integer.parseInt(txtb.getText());           
           int Tong = a+b;          
           txtkq.setText(String.valueOf(Tong));
    }//GEN-LAST:event_tongActionPerformed

    private void txtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbActionPerformed

    private void hieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hieuActionPerformed
        int a = Integer.parseInt(txta.getText());           
           int b = Integer.parseInt(txtb.getText());           
           int Tong = a-b;          
           txtkq.setText(String.valueOf(Tong));
    }//GEN-LAST:event_hieuActionPerformed

    private void tichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tichActionPerformed
        int a = Integer.parseInt(txta.getText());           
           int b = Integer.parseInt(txtb.getText());           
           int Tong = a*b;          
           txtkq.setText(String.valueOf(Tong));
    }//GEN-LAST:event_tichActionPerformed

    private void thuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuongActionPerformed
        float a = Float.parseFloat(txta.getText());           
           float b = Float.parseFloat(txtb.getText());             
           float Thuong = a/b;     
           if(a==0)
           {txtkq.setText("Không thực hiện được phép chia!");    }
           else{
           txtkq.setText(String.valueOf(Thuong));
           }
    }//GEN-LAST:event_thuongActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hieu;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JButton thuong;
    private javax.swing.JButton tich;
    private javax.swing.JButton tong;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtkq;
    // End of variables declaration//GEN-END:variables
}
