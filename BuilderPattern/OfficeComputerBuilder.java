class OfficeComputerBuilder implements ComputerBuilder {
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;

    public OfficeComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public OfficeComputerBuilder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public OfficeComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public OfficeComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public Computer build() {
        return new Computer(processor, memory, storage, graphicsCard);
    }
}
