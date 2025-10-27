package swing;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

public class roundpanel extends javax.swing.JPanel {

    private int cornerRadius = 15;

    public roundpanel() {
        initComponents();
        setOpaque(false);
        setBackground (new Color (100,100,100));

    }

    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Gọi phương thức của lớp cha để đảm bảo các hành vi mặc định được thực thi
        super.paintComponent(g);

        // Lấy kích thước hiện tại của panel
        int width = getWidth();
        int height = getHeight();

        // Tạo một đối tượng Graphics2D để có các tùy chọn vẽ nâng cao
        Graphics2D g2 = (Graphics2D) g.create();

        // Bật chế độ khử răng cưa (anti-aliasing) để các đường cong được mượt mà
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 1. Vẽ nền bo tròn
        // Sử dụng màu nền của panel (màu bạn đặt trong phần Properties)
        g2.setColor(getBackground());
        // Vẽ một hình chữ nhật bo tròn lấp đầy toàn bộ component
        // Các tham số: x, y, width, height, arcWidth, arcHeight
        g2.fill(new RoundRectangle2D.Double(0, 0, width, height, cornerRadius, cornerRadius));

        // Giải phóng tài nguyên của đối tượng Graphics2D
        g2.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
