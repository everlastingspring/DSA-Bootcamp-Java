package code.src.com.kunal.solidprinciples.interfacesegragation;

public interface EmployeeWithoutIS {
    // CEO + managers + workers
    public void salary();
    // managers
    public void hire();
    public void train();
    // CEO + managers
    public void addBonus();
    // CEO
    public void makeDecisions();
    public void addStocks();
}
// Interface IBaseEmployee - salary();,
// IManager extends IBaseEmployee-  hire(); train(); addBonus();
// ICEO extends IBaseEmployee- makeDecisions(); addStocks(); addBonus();
// class Employee implements IEmployee -  salary(){}
// class Manager extends IManager - salary(){}, hire(){}; train(){};
// class CEO extends ICEO- salary();,makeDecisions(); addStocks(); addBonus();
