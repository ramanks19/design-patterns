//Director class to construct the computer
public class ComputerAssembler {
    private ComputerBuilder computerBuilder;

    public ComputerAssembler(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer assembleComputer() {
        return computerBuilder.build();
    }
}