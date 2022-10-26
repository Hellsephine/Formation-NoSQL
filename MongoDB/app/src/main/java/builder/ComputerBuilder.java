package builder;

import java.util.ArrayList;
import java.util.List;

public class ComputerBuilder {

    private MouseBuilder mouseBuilder;
    private ProcessingUnitBuilder processingUnitBuilder;
    private List<MemoryModuleBuilder> memoryModuleBuilders;

    public ComputerBuilder(){
       new MouseBuilder(this);
       new ProcessingUnitBuilder(this);
       new MemoryModuleBuilder(this);
    }

    public Computer Build(){
        List<MemoryModule> memoryModule = new ArrayList<MemoryModule>();
        for (MemoryModuleBuilder mmb : memoryModuleBuilders){
            MemoryModule memo = mmb.Build();
            memoryModule.add(memo);
        }
        return new Computer(mouseBuilder.Build(),processingUnitBuilder.Build(),memoryModule);
    }

    public MouseBuilder setMouse(){
        return mouseBuilder;
    }

    public ProcessingUnitBuilder setCentralProcessingUnit(){
        return processingUnitBuilder;
    }
    
    public MemoryModuleBuilder addMemoryModule(){
        memoryModuleBuilders.add(new MemoryModuleBuilder(this));
       return addMemoryModule();
    }
}