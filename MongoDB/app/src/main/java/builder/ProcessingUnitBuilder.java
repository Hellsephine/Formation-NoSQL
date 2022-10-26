package builder;

public class ProcessingUnitBuilder implements IProcessingUnitBuilder{

    private float frequency = 3.2f;
    private Chipset chipset = Chipset.Intel;
    private boolean hyperthreading = true;
    private int coreCount = 8;
    private ComputerBuilder computerBuilder;

    public ProcessingUnitBuilder(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public ComputerBuilder and(){
        return computerBuilder;
    }
    
    public CentralProcessingUnit Build(){
        return new CentralProcessingUnit(frequency,chipset,hyperthreading,coreCount);
    }

    public ProcessingUnitBuilder setFrequency(float frequency) {
        this.frequency = frequency;
        return this;
    }

    public ProcessingUnitBuilder setChipset(Chipset chipset) {
        this.chipset = chipset;
        return this;
    }
    

    public ProcessingUnitBuilder setHyperthreading(boolean hyperthreading) {
        this.hyperthreading = hyperthreading;
        return this;
    }

    public ProcessingUnitBuilder setCoreCount(int coreCount) {
        this.coreCount = coreCount;
        return this;
    }

}
