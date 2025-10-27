package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class circlebutton extends JButton {

    public circlebutton() {
        setBackground(Color.BLACK);

        //Xóa bỏ việc vẽ nền và viền mặc định của JButton
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false); // Bỏ hiệu ứng focus khi click

        // kích thước tự điều chỉnh
        setPreferredSize(new Dimension(25, 25));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // vẽ nền hình tròn trước tiên
        // Nó sẽ sử dụng màu bạn đã set (ví dụ: Color.BLACK hoặc Color.WHITE)
        g2.setColor(getBackground());
        g2.fillOval(0, 0, getWidth(), getHeight());
        
        // check
        if (getModel().isRollover() || getModel().isPressed()){
            Color pressColor = new Color(255, 51, 51, 70);
            g2.setColor(pressColor);
            // ve lop mau trang
            g2.fillOval(0, 0, getWidth(), getHeight());
        }
        g2.dispose();

        // BƯỚC 2: Gọi phương thức của lớp cha SAU CÙNG
        // Lệnh này sẽ vẽ icon (chuong.png) và chữ (nếu có) LÊN TRÊN hình tròn bạn vừa vẽ
        super.paintComponent(g);
    }
}
