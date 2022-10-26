package builder;

public interface IProcessingUnitBuilder {
    
    public ProcessingUnitBuilder setFrequency(float frequency);

    public ProcessingUnitBuilder setChipset(Chipset chipset);

    public ProcessingUnitBuilder setHyperthreading(boolean hyperthreading);

    public ProcessingUnitBuilder setCoreCount(int coreCount);

    public ComputerBuilder and();
}
