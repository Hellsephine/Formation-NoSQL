package builder;

public interface IMouseBuilder {

    public MouseBuilder setRgb(boolean rgb);
       
    public MouseBuilder setWired(boolean wired);

    public MouseBuilder setWirelength(float wirelength);

    public MouseBuilder setColor(Color color);

    public ComputerBuilder and();
}
