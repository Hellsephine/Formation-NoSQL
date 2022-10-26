package builder;

import java.util.List;

public class Computer {
    
    private Mouse mouse;
    private CentralProcessingUnit cpu;
    private List<MemoryModule> MemoryModule;
    
    public Computer(Mouse mouse, CentralProcessingUnit cpu, List<MemoryModule> memoryModule) {
        this.mouse = mouse;
        this.cpu = cpu;
        MemoryModule = memoryModule;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public CentralProcessingUnit getCpu() {
        return cpu;
    }

    public List<MemoryModule> getMemoryModule() {
        return MemoryModule;
    }
    
}
