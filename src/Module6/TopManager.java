package Module6;

public class TopManager implements Employee {
    private final int earnedMoneyForTheCompany;
    private Company company;
    public TopManager(Company company) {
        this.company = company;
        earnedMoneyForTheCompany = (int)(Math.random() * 25000 + 115000);
    }
    @Override
    public int getMonthSalary() {
        if (company.getIncome() > 10_000_000)
            return Company.FIXED_SALARY_FOR_TOP_MANAGER + (int)Math.floor(Company.FIXED_SALARY_FOR_TOP_MANAGER * 1.5);
        return Company.FIXED_SALARY_FOR_TOP_MANAGER;
    }
    public int getEarnedMoneyForTheCompany() { return earnedMoneyForTheCompany; }
}
