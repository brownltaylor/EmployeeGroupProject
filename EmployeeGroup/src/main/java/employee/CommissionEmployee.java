package employee;

public class CommissionEmployee extends Employee {
    String firstName = getFirstName();
    String lastName = getLastName();
    int socialSecurity = getSocialSecurity();
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(){

    }

    public CommissionEmployee(String firstName, String lastName, int socialSecurity, double commissionRate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
        this.commissionRate = commissionRate;
    }

    void setGrossSales(double gs){
        grossSales = gs;
    }
    void setCommissionRate(double cr){
        commissionRate = cr;
    }
    double getCommissionRate(){
        return commissionRate;
    }
    double getGrossSales(){
        return grossSales;
    }

    @Override
    public String calculatePay(){
        return "You just got paid!";
    }
    public String calculatePay(double grossSales){
        String str = "";
        double totalPay = grossSales * commissionRate;
        str = str + "You made " + grossSales + " this year. Your total earnings are $" + totalPay + ".";
        return str;
    }
}
