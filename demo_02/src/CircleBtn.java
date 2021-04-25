import java.awt.Color;
import java.awt.Graphics;

public class CircleBtn extends AbstractButton {
    private static final long serialVersionUID = 1L;

    public void view() {
        this.setText("Circle");
    }

    protected void paintComponent(Graphics g) {
        g.setColor(new Color(31, 171, 137));
        g.fillRoundRect(0, 0, getSize().width - 1, getSize().height - 1, 15, 15);
        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g)
    {
        g.drawRoundRect(0,0,getSize().width-1,getSize().height-1,15,15);
    }
}