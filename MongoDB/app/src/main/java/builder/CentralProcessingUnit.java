package builder;

public class CentralProcessingUnit {
    
    private float frequency;
    private Chipset chipset;
    private boolean hyperthreading;
    private int coreCount;
    
    public CentralProcessingUnit(float frequency, Chipset chipset, boolean hyperthreading, int coreCount) {
        this.frequency = frequency;
        this.chipset = chipset;
        this.hyperthreading = hyperthreading;
        this.coreCount = coreCount;
    }

    public float getFrequency() {
        return frequency;
    }

    public Chipset getChipset() {
        return chipset;
    }

    public boolean isHyperthreading() {
        return hyperthreading;
    }

    public int getCoreCount() {
        return coreCount;
    }

    
}
