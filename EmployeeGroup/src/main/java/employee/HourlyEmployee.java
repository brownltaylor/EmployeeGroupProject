package employee;

public class HourlyEmployee extends Employee {

    private double hourlyWage;
    private double hours;
    String firstName = getFirstName();
    String lastName = getLastName();
    int socialSecurity = getSocialSecurity();


    public HourlyEmployee(String firstName, String lastName, int socialSecurity, double hourlyWage){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
        this.hourlyWage = hourlyWage;
    }

    void setHourlyWage(double hw){
        hourlyWage = hw;
    }
    void setHours(double h){
        hours = h;
    }
    double getHourlyWage(){
        return hourlyWage;
    }
    double hours(){
        return hours;
    }

    @Override
    public String calculatePay(double hours){
        String str = "";
        double weeklyPay = hours * hourlyWage;
        if (hours > 40) {
            double overtimePay = (hours - 40) * (hourlyWage * 1.5);
            str = str + "You worked overtime! This week you are getting paid $" + weeklyPay + "!";
            weeklyPay = overtimePay + weeklyPay;
        }
        str = str + "This week, you are getting paid your normal weekly amount, $" + weeklyPay + ".";

        return str;

    }

    @Override
    public String calculatePay(){
        return "You just got paid!";
    }
}
