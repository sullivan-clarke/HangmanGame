package ProjectsCS101;

public class BudgetCalculator {
    public static void main (String args[]) {
    
    String name;
    String state;
    String employeeStatus;
    double monthlyIncome;
    double THP;

    double stateTax = 0.00;
    double fedTax = 0.00;
    double ssTax = 0.00;
    double medTax = 0.00;
    double totalTax = 0.00;
    
    taxes.addStates(); 
    taxes.intro();

    System.out.print("What is your name?: ");
    name = taxes.scan.nextLine();
    
    System.out.print("What state do you currently live in (abbreviation or full length)?: ");
    state = taxes.scan.nextLine().toUpperCase();
    state = taxes.stateCheck(state);

    System.out.print("Are you currently self-employed?: ");
    employeeStatus = taxes.scan.next();
    employeeStatus = taxes.checkEmployeeStatus(employeeStatus);

    System.out.print("What is your current gross monthly income (income before deducations - rough estimation)?: $");
    taxes.checkMonthlyIncome();
    monthlyIncome = taxes.scan.nextDouble();
    
    taxes profile = new taxes(name, state, monthlyIncome, totalTax);

    stateTax += profile.stateInput();
    ssTax += profile.calcSSTax(employeeStatus);
    medTax += profile.calcMedTax(employeeStatus);
    fedTax += profile.calcFedTax();

    totalTax += (stateTax + ssTax + medTax + fedTax);
    THP = monthlyIncome - totalTax;

    taxes.linePrint();
    taxes.dashPrint2();

    System.out.format("%n|PROFILE INFO|:%nName: %s%nState: %s%nSelf Employed: %s%n", name, state, employeeStatus);
    taxes.dashPrint1();
    System.out.format("%n|FINANCIALS|: %nMonthly Income: $%.2f%nEstimated Taxes: $%.2f%nTake Home Pay: $%.2f%n", monthlyIncome, totalTax, THP);
    taxes.dashPrint1(); 
    
    
    profile.calcBudget(THP);

    taxes.scan.close();
    }
}
