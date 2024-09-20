package code.src.com.kunal.solidprinciples.interfacesegragation;

public class CEO implements ICEO{
    @Override
    public void makeDecisions() {
        System.out.println("CEo is making decisions");
    }

    @Override
    public void addBonus() {
        System.out.println("Manager added Bonus");
    }

    @Override
    public void addStocks() {
        System.out.println("Manager added Stocks");
    }

    @Override
    public void salary() {
        System.out.println("Manager got Salary");
    }
}
