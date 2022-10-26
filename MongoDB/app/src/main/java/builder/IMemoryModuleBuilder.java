package builder;

public interface IMemoryModuleBuilder {
    
    public MemoryModuleBuilder setFrequency(float frequency);

    public MemoryModuleBuilder setMemory(int memory);

    public MemoryModuleBuilder setDdrType(DDRType ddrType);

    public ComputerBuilder and();
}
