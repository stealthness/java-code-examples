package composite.shape;

import java.awt.*;

public abstract class BasicShape implements Shape, Drawable {

    protected Point location;
    protected boolean isSelected = false;
    protected Color color;

    void enableSelectionStyle(Graphics graphics) {
        graphics.setColor(Color.LIGHT_GRAY);

        Graphics2D g2 = (Graphics2D) graphics;
        float[] dash1 = {2.0f};
        g2.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f, dash1, 0.0f));
    }

    void disableSelectionStyle(Graphics graphics) {
        graphics.setColor(color);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke());
    }

    public void draw(Graphics graphics) {
        color = graphics.getColor();
        if (isSelected) {
            enableSelectionStyle(graphics);
        }
    }



}
