package builder;

public class MemoryModule {
    
    private float frequency;
    private int memory;
    private DDRType ddrType;

    
    public MemoryModule(float frequency, int memory, DDRType ddrType) {
        this.frequency = frequency;
        this.memory = memory;
        this.ddrType = ddrType;
    }

    public float getFrequency() {
        return frequency;
    }

    public int getMemory() {
        return memory;
    }


    public DDRType getDdrType() {
        return ddrType;
    }

    
}
