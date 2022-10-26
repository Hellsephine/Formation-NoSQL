package builder;

public class MouseBuilder implements IMouseBuilder{

    private boolean rgb = true;
    private boolean wired = true;
    private float wirelength = 1f;
    private Color color = Color.Red;
    private ComputerBuilder computerBuilder;

    public Mouse Build(){
        return new Mouse(rgb,wired,wirelength,color);
    }
    
    public MouseBuilder(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public ComputerBuilder and(){
        return computerBuilder;
    }
    
    public MouseBuilder setRgb(boolean rgb) {
        this.rgb = rgb;
        return this;
    }

    public MouseBuilder setWired(boolean wired) {
        this.wired = wired;
        return this;
    }

    public MouseBuilder setWirelength(float wirelength) {
        this.wirelength = wirelength;
        return this;
    }

    public MouseBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

}
