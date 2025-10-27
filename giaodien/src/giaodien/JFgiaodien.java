package giaodien;

import java.awt.Color;
import javax.swing.JFrame;

public class JFgiaodien extends javax.swing.JFrame {

    public JFgiaodien() {
        initComponents();
        
        this.setTitle("Giao diện chính"); // Đặt tiêu đề
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Thoát bằng nút X
//        this.setLocationRelativeTo(null); // Hiển thị cửa sổ ở giữa màn hình
       this.getContentPane().setBackground(Color.LIGHT_GRAY); // can change
       circlebutton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
 
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new component.Menu();
        background = new swing.roundpanel();
        header1 = new component.header();
        circlebutton1 = new swing.circlebutton();
        circlebutton2 = new swing.circlebutton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(50, 50, 50));

        header1.setBackground(new java.awt.Color(75, 75, 75));

        circlebutton1.setBackground(new java.awt.Color(239, 234, 234));
        circlebutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gmail.png"))); // NOI18N

        circlebutton2.setBackground(new java.awt.Color(239, 234, 234));
        circlebutton2.setForeground(new java.awt.Color(242, 83, 83));
        circlebutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chuông.png"))); // NOI18N
        circlebutton2.setMaximumSize(new java.awt.Dimension(40, 40));
        circlebutton2.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header1Layout.createSequentialGroup()
                .addContainerGap(966, Short.MAX_VALUE)
                .addComponent(circlebutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(circlebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(circlebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(circlebutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(595, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JFgiaodien().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.roundpanel background;
    private swing.circlebutton circlebutton1;
    private swing.circlebutton circlebutton2;
    private component.header header1;
    private component.Menu menu1;
    // End of variables declaration//GEN-END:variables
}
