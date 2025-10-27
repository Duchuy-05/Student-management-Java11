package loginandsignup;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class floatinglabelpassword extends javax.swing.JPanel {

    private final JLabel label;
    private final JPasswordField passwordField;
    private final Font labelFont;
    private final Color placeholderColor = Color.GRAY;
    private final Color focusColor = new Color(0, 120, 215);

    private boolean isFocused = false;
    private boolean isLabelActive = false;

    private final int labelActiveY = 5;
    private final int labelInactiveY = 25;
    private final Font activeFont;
    private final Font inactiveFont;
    

    public floatinglabelpassword(String placeholder) {
        super();
        setLayout(null);
        this.labelFont = new Font("SansSerif", Font.PLAIN, 14);

        this.inactiveFont = labelFont;
        this.activeFont = labelFont.deriveFont(11f);

        label = new JLabel(placeholder);
        label.setFont(inactiveFont);
        label.setForeground(placeholderColor);
        label.setBounds(10, labelInactiveY, 150, 20);
        add(label);

        passwordField = new JPasswordField();
        passwordField.setFont(labelFont);
        passwordField.setOpaque(false);
        passwordField.setBorder(new EmptyBorder(0, 0, 0, 0));
        passwordField.setBounds(10, 18, 180, 30);
        add(passwordField);

        setPreferredSize(new java.awt.Dimension(200, 50));
        setBackground(Color.WHITE);

        passwordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                isFocused = true;
                activateLabel();
                repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                isFocused = false;
                if (passwordField.getPassword().length == 0) {
                    deactivateLabel();
                }
                repaint();
            }
        });

        passwordField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                activateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (passwordField.getPassword().length == 0 && !isFocused) {
                    deactivateLabel();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        label.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordField.requestFocusInWindow();
            }
        });
    }

    private void activateLabel() {
        if (isLabelActive) {
            return;
        }
        isLabelActive = true;
        label.setFont(activeFont);
        label.setForeground(focusColor);
        label.setBounds(10, labelActiveY, 150, 20);
    }

    private void deactivateLabel() {
        if (!isLabelActive) {
            return;
        }
        isLabelActive = false;
        label.setFont(inactiveFont);
        label.setForeground(placeholderColor);
        label.setBounds(10, labelInactiveY, 150, 20);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        int arc = 8; // Độ bo góc
        int padding = 4; // Khoảng đệm chung

        // Viền trên bắt đầu từ y = 10.
        // Label khi active ở y = 5. 
        // Điều này cho phép label nằm "đè" lên trên viền.
        int topBorderY = 17;

        int rectX = padding;
        int rectY = topBorderY;
        int rectWidth = getWidth() - (padding * 2);
        int rectHeight = getHeight() - topBorderY - padding; // Chiều cao viền

        // 2. Vẽ viền
        if (isFocused) {
            g2.setColor(focusColor);
            g2.setStroke(new java.awt.BasicStroke(2)); // Viền dày 2px
        } else if (isLabelActive) {
            g2.setColor(Color.GRAY); // Có chữ, không focus
            g2.setStroke(new java.awt.BasicStroke(1));
        } else {
            g2.setColor(Color.LIGHT_GRAY); // Trống, không focus
            g2.setStroke(new java.awt.BasicStroke(1));
        }
        g2.drawRoundRect(rectX, rectY, rectWidth, rectHeight, arc, arc);

        // 3. Xử lý "cắt" viền
        // Nếu label đang active (nổi lên), vẽ 1 hình chữ nhật trắng
        // đè lên phần viền trên, ngay chỗ label
        if (isLabelActive) {
            g2.setColor(getBackground()); // Lấy màu nền (là màu trắng)

            // Tính toán độ rộng thực của text trên label
            String labelText = label.getText();
            java.awt.FontMetrics fm = label.getFontMetrics(label.getFont());
            int textWidth = fm.stringWidth(labelText);

            // Vị trí "cắt"
            // label.getX() là 10. Ta bắt đầu cắt từ trước đó 1 chút (ví dụ x=7)
            int cutX = label.getX() - 3;
            int cutWidth = textWidth + 6; // Độ rộng = chữ + 3px đệm mỗi bên

            // Vẽ 1 hcn trắng đè lên viền
            // Viền trên ở y = 10.
            // Vẽ 1 hcn dày 3px (để che viền dày 2px)
            // tại vị trí y = 9 (tức là rectY - 1)
            g2.fillRect(cutX, rectY - 1, cutWidth, 3);
        }

        g2.dispose();
    }
}
