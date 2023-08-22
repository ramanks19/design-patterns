//Concrete builder implementation
public class GamingComputerBuilder implements ComputerBuilder{

    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;

    @Override
    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    @Override
    public ComputerBuilder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(processor, memory, storage, graphicsCard);
    }   
}