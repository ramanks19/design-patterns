public class BuilderExample {
    public static void main(String[] args) {
        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerAssembler gamingComputerAssembler = new ComputerAssembler(gamingComputerBuilder);

        Computer gamingComputer = gamingComputerAssembler.assembleComputer();
        System.out.println("Gaming Computer: " + gamingComputer);

        ComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        ComputerAssembler officeComputerAssembler = new ComputerAssembler(officeComputerBuilder);

        Computer officeComputer = officeComputerAssembler.assembleComputer();
        System.out.println("Office Computer: " + officeComputer);
    }
}