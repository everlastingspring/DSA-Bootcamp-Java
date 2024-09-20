package code.src.com.kunal.solidprinciples.interfacesegragation;

public class InterfaceSegregation {
    public static void main(String[] args) {
        IEmployee employee = new Employee();
        employee.salary();
        IManager manager = new Manager();
        manager.salary();
        manager.addBonus();
        manager.train();
        manager.hire();
        ICEO ceo = new CEO();
        ceo.salary();
        ceo.addStocks();
        ceo.addBonus();
        ceo.makeDecisions();
    }
}
