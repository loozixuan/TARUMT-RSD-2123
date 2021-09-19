package entity;

public class Clerk extends Employee {

    private int overtimeHours;
    private double overtimeRate;

    public Clerk(int id, String name, double basicSalary, int overtimeHours, double overtimeRate) {
        super(id, name, basicSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    private double computeOvertimePay() {
        return overtimeHours * overtimeRate;
    }

    @Override
    public double computeMonthlyPay() {
        return getBasicSalary() + computeOvertimePay();
    }

    @Override
    public String toString() {
        return super.toString()
                + "overtimeHours : " + overtimeHours + "\novertimeRate=" + overtimeRate + "\n";
    }

}
