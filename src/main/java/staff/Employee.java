package staff;

public abstract class Employee {

    private String name;
    private int nationalInsurance;
    private double salary;

    public Employee(String name, int nationalInsurance, double salary){
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNationalInsurance() {
        return nationalInsurance;
    }

    public double getSalary() {
        return salary;
    }
    

    public void raiseSalary(double increment){
        if (increment > 0) {
            this.salary += increment;
        }
    }

    public double payBonus(){
        return salary / 100;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")){
            this.name = name;
        }
    }
}
