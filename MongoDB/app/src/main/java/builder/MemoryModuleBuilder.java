package builder;

public class MemoryModuleBuilder implements IMemoryModuleBuilder{
    
    private float frequency = 3.2f;
    private int memory = 8;
    private DDRType ddrType = DDRType.DDR4;
    private ComputerBuilder computerBuilder;

    public MemoryModuleBuilder(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public ComputerBuilder and(){
        return computerBuilder;
    }

    public MemoryModule Build(){
        return new MemoryModule(frequency,memory,ddrType);
    }

    public MemoryModuleBuilder setFrequency(float frequency) {
        this.frequency = frequency;
        return this;
    }

    public MemoryModuleBuilder setMemory(int memory) {
        this.memory = memory;
        return this;
    }

    public MemoryModuleBuilder setDdrType(DDRType ddrType) {
        this.ddrType = ddrType;
        return this;
    }

}
