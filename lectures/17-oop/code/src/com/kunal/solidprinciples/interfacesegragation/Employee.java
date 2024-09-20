package code.src.com.kunal.solidprinciples.interfacesegragation;

public class Employee implements IEmployee{
    @Override
    public void salary() {
        System.out.println("Employee goy salary");
    }
}
