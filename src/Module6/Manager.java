package Module6;

public class Manager implements Employee{
    private final int earnedMoneyForTheCompany;
    private Company company;
    public Manager(Company company) {
        this.company = company;
        earnedMoneyForTheCompany = (int)(Math.random() * 25000 + 115000);
    }
    @Override
    public int getMonthSalary() {
        return Company.FIXED_SALARY_FOR_MANAGER + (int)Math.floor(earnedMoneyForTheCompany * 0.05);
    }
    public int getEarnedMoneyForTheCompany() { return earnedMoneyForTheCompany; }
}
