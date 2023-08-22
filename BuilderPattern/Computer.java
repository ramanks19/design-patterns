//Computer class representing the complex objects
public class Computer{
    
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;

    public Computer(String processor, String memory, String storage, String graphicsCard) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    //Getters for the computer components
    public String getProcessor() {
        return processor;
    }

    public String getMemory() {
        return memory;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer {" +
               "processor='" + processor + '\'' +
               ", memory='" + memory + '\'' +
               ", storage='" + storage + '\'' +
               ", graphicsCard='" + graphicsCard + '\'' +
               '}';
    }
}