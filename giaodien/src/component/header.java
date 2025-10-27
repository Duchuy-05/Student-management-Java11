package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;


public class header extends javax.swing.JPanel {

    public header() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(100, 100, 100));
        
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        circlebutton1 = new swing.circlebutton();
        circlebutton2 = new swing.circlebutton();

        setPreferredSize(new java.awt.Dimension(400, 60));

        circlebutton1.setBackground(new java.awt.Color(204, 204, 204));
        circlebutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gmail.png"))); // NOI18N

        circlebutton2.setBackground(new java.awt.Color(204, 204, 204));
        circlebutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chuông.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(circlebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(347, Short.MAX_VALUE)
                    .addComponent(circlebutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(circlebutton1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(circlebutton2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint (Graphics g){   
        //tạo bản sao của đối tượng Graphics để không 
        //làm ảnh hưởng đến các thao tác khác
        Graphics2D g2=(Graphics2D)g.create();
        
         // bật chế độ Anti-aliasing để các đường cong 
         // được mượt, không bị răng cưa
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // thiết lập màu vẽ là màu nền của component
        g2.setColor(getBackground());
        
        // vẽ hcn bo tròn lên component.
        // Lệnh .fill() chính là lệnh thực hiện việc vẽ.
        // Trừ 1 ở width và height để đường viền không bị cắt ở cạnh phải và dưới.
        Area area = new Area (new RoundRectangle2D.Double(0, 0, getWidth() , getHeight(), 15, 15));
        
        g2.fill(area);
        
        // Hủy bản sao Graphics2D 
        g2.dispose();
        super.paint(g);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.circlebutton circlebutton1;
    private swing.circlebutton circlebutton2;
    // End of variables declaration//GEN-END:variables
}
