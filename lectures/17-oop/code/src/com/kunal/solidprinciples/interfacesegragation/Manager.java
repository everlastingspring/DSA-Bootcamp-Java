package code.src.com.kunal.solidprinciples.interfacesegragation;

public class Manager implements IManager{
    @Override
    public void hire() {
        System.out.println("Manager is hiring");
    }

    @Override
    public void train() {
        System.out.println("Manager is training");
    }

    @Override
    public void addBonus() {
        System.out.println("Manager added Bonus");
    }

    @Override
    public void salary() {
        System.out.println("Manager got Salary");
    }
}
