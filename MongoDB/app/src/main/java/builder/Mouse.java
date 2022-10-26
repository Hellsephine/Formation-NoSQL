package builder;

public class Mouse {
    
    private boolean rgb;
    private boolean wired;
    private float wirelength;
    private Color color;

    public Mouse(boolean rgb, boolean wired, float wirelength, Color color) {
        this.rgb = rgb;
        this.wired = wired;
        this.wirelength = wirelength;
        this.color = color;
    }

    public boolean isRgb() {
        return rgb;
    }
    public boolean isWired() {
        return wired;
    }
    public float getWirelength() {
        return wirelength;
    }
    public Color getColor() {
        return color;
    }

}
