package Module6;

public class Operator implements Employee {
    private final int earnedMoneyForTheCompany;
    private Company company;
    public Operator(Company company) {
        this.company = company;
        earnedMoneyForTheCompany = (int)(Math.random() * 25000 + 115000);
    }
    @Override
    public int getMonthSalary() {
        return Company.FIXED_SALARY_FOR_OPERATOR;
    }
    public int getEarnedMoneyForTheCompany() { return earnedMoneyForTheCompany; }
}
