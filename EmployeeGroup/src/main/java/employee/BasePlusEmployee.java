package employee;

public class BasePlusEmployee extends CommissionEmployee {

    String firstName = getFirstName();
    String lastName = getLastName();
    int socialSecurity = getSocialSecurity();
    double grossSales = getGrossSales();
    double commissionRate = getCommissionRate();
    private double baseSalary;

    public BasePlusEmployee(String firstName, String lastName, int socialSecurity, double commissionRate, double baseSalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    void setBaseSalary(double bs){
        baseSalary = bs;
    }
    double getBaseSalary(){
        return baseSalary;
    }
    @Override
     public String calculatePay(){
        return "You just got paid!";
     }

     @Override
    public String calculatePay(double grossSales){
        String str = "";
        double totalPay = baseSalary + (grossSales * commissionRate);
        str = str + "You made " + grossSales + " sales. Your total pay is $" + totalPay + ".";
        return str;
     }



}
