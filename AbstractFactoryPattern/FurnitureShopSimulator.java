public class FurnitureShopSimulator {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();

        modernChair.sit();
        modernSofa.relax();
        modernCoffeeTable.placeCoffee();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable();

        victorianChair.sit();
        victorianSofa.relax();
        victorianCoffeeTable.placeCoffee();
    }
    
}
