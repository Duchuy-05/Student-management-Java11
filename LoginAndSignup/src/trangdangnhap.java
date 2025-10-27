
import loginandsignup.floatinglabelpassword;
import loginandsignup.floatinglabeltext;


public class trangdangnhap extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(trangdangnhap.class.getName());
    private final floatinglabeltext masv;
    private final floatinglabelpassword matkhau;
    public trangdangnhap() {
        initComponents();
        this.setLocationRelativeTo(null);
        masv = new floatinglabeltext("Mã sinh viên");
        panelMSV.add(masv, java.awt.BorderLayout.CENTER);
        
        matkhau = new floatinglabelpassword("Mật khẩu");
        panelMK.add(matkhau, java.awt.BorderLayout.CENTER);
        
        panelMSV.revalidate();
        panelMSV.repaint();
        panelMK.revalidate();
        panelMK.repaint();
        
        panelMK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelMSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgrounddangnhap1 = new loginandsignup.backgrounddangnhap();
        jPanel1 = new javax.swing.JPanel();
        dangnhap = new javax.swing.JLabel();
        btdangnhap = new javax.swing.JButton();
        lbquenmatkhau = new javax.swing.JLabel();
        lbvantay = new javax.swing.JLabel();
        btdangki = new javax.swing.JButton();
        ngonngu = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        panelMSV = new javax.swing.JPanel();
        panelMK = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        dangnhap.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        dangnhap.setForeground(new java.awt.Color(255, 0, 0));
        dangnhap.setText("Đăng nhập");

        btdangnhap.setBackground(new java.awt.Color(73, 73, 241));
        btdangnhap.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btdangnhap.setForeground(new java.awt.Color(255, 255, 255));
        btdangnhap.setText("Đăng nhập");
        btdangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdangnhapActionPerformed(evt);
            }
        });

        lbquenmatkhau.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbquenmatkhau.setForeground(new java.awt.Color(102, 102, 255));
        lbquenmatkhau.setText("Quên mật khẩu");

        lbvantay.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbvantay.setForeground(new java.awt.Color(102, 102, 255));
        lbvantay.setText("Vân tay ");

        btdangki.setBackground(new java.awt.Color(73, 73, 241));
        btdangki.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btdangki.setForeground(new java.awt.Color(255, 255, 255));
        btdangki.setText("Đăng ký");
        btdangki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdangkiActionPerformed(evt);
            }
        });

        ngonngu.setText("language");

        logo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        logo.setText("Logo đây");

        panelMSV.setToolTipText("panelMSV");
        panelMSV.setLayout(new java.awt.BorderLayout());

        panelMK.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btdangki, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btdangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(logo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                .addComponent(dangnhap)
                                .addGap(82, 82, 82)
                                .addComponent(ngonngu)
                                .addGap(8, 8, 8)))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbquenmatkhau)
                        .addGap(70, 70, 70)
                        .addComponent(lbvantay)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelMSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ngonngu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(panelMSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(panelMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbquenmatkhau)
                    .addComponent(lbvantay))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btdangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btdangki, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgrounddangnhap1Layout = new javax.swing.GroupLayout(backgrounddangnhap1);
        backgrounddangnhap1.setLayout(backgrounddangnhap1Layout);
        backgrounddangnhap1Layout.setHorizontalGroup(
            backgrounddangnhap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrounddangnhap1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        backgrounddangnhap1Layout.setVerticalGroup(
            backgrounddangnhap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrounddangnhap1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        getContentPane().add(backgrounddangnhap1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btdangkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdangkiActionPerformed
        // TODO add your handling code here:
        btdangki.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btdangkiActionPerformed

    private void btdangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdangnhapActionPerformed
        // TODO add your handling code here:
        btdangnhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btdangnhapActionPerformed

    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new trangdangnhap().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private loginandsignup.backgrounddangnhap backgrounddangnhap1;
    private javax.swing.JButton btdangki;
    private javax.swing.JButton btdangnhap;
    private javax.swing.JLabel dangnhap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbquenmatkhau;
    private javax.swing.JLabel lbvantay;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel ngonngu;
    private javax.swing.JPanel panelMK;
    private javax.swing.JPanel panelMSV;
    // End of variables declaration//GEN-END:variables
}
