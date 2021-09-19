package entity;

public class Manager extends Employee {

    private double allowance;

    public Manager(int id, String name, double basicSalary, double allowance) {
        super(id, name, basicSalary);
        this.allowance = allowance;
    }

    @Override
    public double computeMonthlyPay() {
        return getBasicSalary() + allowance;
    }

    @Override
    public String toString() {
        return super.toString()
                + "allowance: " + allowance + '\n';
    }

}
