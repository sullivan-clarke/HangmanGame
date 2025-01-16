package ProjectsCS101;
import java.util.Scanner; 
import java.util.ArrayList;

public class taxes {
    private String name;
    private String state;
    private final double monthlyIncome;
    private static double incomeTax;
    private double totalTax;
    private static ArrayList<String> allStates = new ArrayList<String>();
    public static final Scanner scan = new Scanner(System.in);
    
    public taxes (String name, String state, final double monthlyIncome, double totalTax) {
        this.name = name;
        this.state = state;
        this.monthlyIncome = monthlyIncome;
        this.totalTax = totalTax;
    }
    
    public double stateInput() {
        double amountTaxed = 0.00;
            switch (state) {
                case "AK":
                case "FL":
                case "NV":
                case "SD":
                case "TN":
                case "TX":
                case "WA":
                case "WY":
                case "ALASKA":
                case "FLORIDA":
                case "NEVADA":
                case "SOUTH DAKOTA":
                case "TENNESSEE":
                case "TEXAS":
                case "WASHINGTON":
                case "WYOMING":
                    incomeTax = 0.000;
                    amountTaxed += 0.00;
                    break;

                case "AZ":
                case "ARIZONA":
                    incomeTax = 0.0250;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;

                case "CO":
                case "COLORADO":
                    incomeTax = 0.0440;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;
                
                case "GA":
                case "GEORGIA":
                    incomeTax = 0.0549;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;
                    
                case "ID":
                case "IDAHO":
                    incomeTax = 0.0580;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;
            
                case "IL":
                case "ILLINOIS":
                    incomeTax = 0.0495;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;

                case "IN":
                case "INDIANA":
                    incomeTax = 0.0315;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;

                case "KY":
                case "NC":
                case "KENTUCKY":
                case "NORTH CAROLINE":
                    incomeTax = 0.0450;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;
                
                case "MA":
                case "MASSACHUSETTS":
                    incomeTax = 0.0500;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;
                
                case "MI":
                case "MICHIGAN":
                    incomeTax = 0.0425;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;
                
                case "MS":
                case "MISSISSIPPI":
                    incomeTax = 0.0470;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;
                
                case "NH":
                case "NEW HAMPSHIRE":
                    incomeTax = 0.0500;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;
                    
                case "PA":
                case "PENNSYLVANIA":
                    incomeTax = 0.0307;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;
                
                case "UT":
                case "UTAH":
                    incomeTax = 0.0485;
                    amountTaxed += monthlyIncome * incomeTax;
                    break;
                
                case "AL":
                case "ALABAMA":
                if (monthlyIncome <= 41.67) {
                    amountTaxed += monthlyIncome * 0.02;
                } else if (monthlyIncome <= 250.00) {
                    amountTaxed += 41.67 * 0.02;
                    amountTaxed += (monthlyIncome - 41.67) * 0.04;
                } else {
                    amountTaxed += 41.67 * 0.02;
                    amountTaxed += 208.33 * 0.04;
                    amountTaxed += (monthlyIncome - 250.00) * 0.05;
                }
                break;

                case "AR":
                case "ARKANSAS":
                if (monthlyIncome <= 733.33) {
                    amountTaxed += monthlyIncome * 0.02;
                } else if (monthlyIncome <= 1466.67) {
                    amountTaxed += 733.33 * 0.02;
                    amountTaxed += (monthlyIncome - 733.33) * 0.04;
                } else {
                    amountTaxed += 733.33 * 0.02;
                    amountTaxed += 733.34 * 0.04;
                    amountTaxed += (monthlyIncome - 1466.67) * 0.05;
                }
                break;

                case "CA":
                case "CALIFORNIA":
                if (monthlyIncome <= 833.33) {
                    amountTaxed += monthlyIncome * 0.01;
                } else if (monthlyIncome <= 1666.67) {
                    amountTaxed += 833.33 * 0.01;
                    amountTaxed += (monthlyIncome - 833.33) * 0.02;
                } else if (monthlyIncome <= 2500.00) {
                    amountTaxed += 833.33 * 0.01;
                    amountTaxed += 833.34 * 0.02;
                    amountTaxed += (monthlyIncome - 1666.67) * 0.04;
                } else if (monthlyIncome <= 3333.33) {
                    amountTaxed += 833.33 * 0.01;
                    amountTaxed += 833.34 * 0.02;
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += (monthlyIncome - 2500.00) * 0.06;
                } else if (monthlyIncome <= 4166.67) {
                    amountTaxed += 833.33 * 0.01;
                    amountTaxed += 833.34 * 0.02;
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += 833.33 * 0.06;
                    amountTaxed += (monthlyIncome - 3333.33) * 0.08;
                } else if (monthlyIncome <= 5000.00) {
                    amountTaxed += 833.33 * 0.01;
                    amountTaxed += 833.34 * 0.02;
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += 833.33 * 0.06;
                    amountTaxed += 833.34 * 0.08;
                    amountTaxed += (monthlyIncome - 4166.67) * 0.093;
                } else if (monthlyIncome <= 5833.33) {
                    amountTaxed += 833.33 * 0.01;
                    amountTaxed += 833.34 * 0.02;
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += 833.33 * 0.06;
                    amountTaxed += 833.34 * 0.08;
                    amountTaxed += 833.33 * 0.093;
                    amountTaxed += (monthlyIncome - 5000.00) * 0.103;
                } else if (monthlyIncome <= 6666.67) {
                    amountTaxed += 833.33 * 0.01;
                    amountTaxed += 833.34 * 0.02;
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += 833.33 * 0.06;
                    amountTaxed += 833.34 * 0.08;
                    amountTaxed += 833.33 * 0.093;
                    amountTaxed += 833.33 * 0.103;
                    amountTaxed += (monthlyIncome - 5833.33) * 0.113;
                } else if (monthlyIncome <= 83333.33) {
                    amountTaxed += 833.33 * 0.01;
                    amountTaxed += 833.34 * 0.02;
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += 833.33 * 0.06;
                    amountTaxed += 833.34 * 0.08;
                    amountTaxed += 833.33 * 0.093;
                    amountTaxed += 833.33 * 0.103;
                    amountTaxed += 833.34 * 0.113;
                    amountTaxed += (monthlyIncome - 6666.67) * 0.123;
                } else {
                    amountTaxed += 833.33 * 0.01;
                    amountTaxed += 833.34 * 0.02;
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += 833.33 * 0.06;
                    amountTaxed += 833.34 * 0.08;
                    amountTaxed += 833.33 * 0.093;
                    amountTaxed += 833.33 * 0.103;
                    amountTaxed += 833.34 * 0.113;
                    amountTaxed += 76666.66 * 0.123;
                    amountTaxed += (monthlyIncome - 83333.33) * 0.133;
                }
                break;

                case "CT":
                case "CONNECTICUT":
                if (monthlyIncome <= 833.33) {
                    amountTaxed += monthlyIncome * 0.03;
                } else if (monthlyIncome <= 3333.33) {
                    amountTaxed += 833.33 * 0.03;
                    amountTaxed += (monthlyIncome - 833.33) * 0.05;
                } else if (monthlyIncome <= 6666.67) {
                    amountTaxed += 833.33 * 0.03;
                    amountTaxed += 2500.00 * 0.05;
                    amountTaxed += (monthlyIncome - 3333.33) * 0.055;
                } else if (monthlyIncome <= 8333.33) {
                    amountTaxed += 833.33 * 0.03;
                    amountTaxed += 2500.00 * 0.05;
                    amountTaxed += 3333.34 * 0.055;
                    amountTaxed += (monthlyIncome - 6666.67) * 0.06;
                } else if (monthlyIncome <= 10000.00) {
                    amountTaxed += 833.33 * 0.03;
                    amountTaxed += 2500.00 * 0.05;
                    amountTaxed += 3333.34 * 0.055;
                    amountTaxed += 1666.66 * 0.06;
                    amountTaxed += (monthlyIncome - 8333.33) * 0.065;
                } else if (monthlyIncome <= 16666.67) {
                    amountTaxed += 833.33 * 0.03;
                    amountTaxed += 2500.00 * 0.05;
                    amountTaxed += 3333.34 * 0.055;
                    amountTaxed += 1666.66 * 0.06;
                    amountTaxed += 1666.67 * 0.065;
                    amountTaxed += (monthlyIncome - 10000.00) * 0.069;
                } else {
                    amountTaxed += 833.33 * 0.03;
                    amountTaxed += 2500.00 * 0.05;
                    amountTaxed += 3333.34 * 0.055;
                    amountTaxed += 1666.66 * 0.06;
                    amountTaxed += 1666.67 * 0.065;
                    amountTaxed += 6666.67 * 0.069;
                    amountTaxed += (monthlyIncome - 16666.67) * 0.0699;
                }
                break;

                case "DE":
                case "DELAWARE":
                if (monthlyIncome <= 166.67) {
                    amountTaxed += monthlyIncome * 0.022;
                } else if (monthlyIncome <= 333.33) {
                    amountTaxed += 166.67 * 0.02;
                    amountTaxed += (monthlyIncome - 166.67) * 0.039;
                } else if (monthlyIncome <= 500.00) {
                    amountTaxed += 166.67 * 0.02;
                    amountTaxed += 166.66 * 0.039;
                    amountTaxed += (monthlyIncome - 333.33) * 0.048;
                } else if (monthlyIncome <= 833.33) {
                    amountTaxed += 166.67 * 0.02;
                    amountTaxed += 166.66 * 0.039;
                    amountTaxed += 166.67 * 0.048;
                    amountTaxed += (monthlyIncome - 500.00) * 0.052;
                } else if (monthlyIncome <= 1250) {
                    amountTaxed += 166.67 * 0.02;
                    amountTaxed += 166.66 * 0.039;
                    amountTaxed += 166.67 * 0.048;
                    amountTaxed += 333.33 * 0.052;
                    amountTaxed += (monthlyIncome - 833.33) * 0.0555;
                } else {
                    amountTaxed += 166.67 * 0.02;
                    amountTaxed += 166.66 * 0.039;
                    amountTaxed += 166.67 * 0.048;
                    amountTaxed += 333.33 * 0.052;
                    amountTaxed += 416.67 * 0.0555;
                    amountTaxed += (monthlyIncome - 1250.00) * 0.066;
                }
                break;

                case "HI":
                case "HAWAII":
                if (monthlyIncome <= 1200.00) {
                    amountTaxed += monthlyIncome * 0.014;
                } else if (monthlyIncome <= 2400.00) {
                    amountTaxed += 1200.00 * 0.014;
                    amountTaxed += (monthlyIncome - 1200.00) * 0.032;
                } else if (monthlyIncome <= 3600.00) {
                    amountTaxed += 1200.00 * 0.014;
                    amountTaxed += 1200.00 * 0.032;
                    amountTaxed += (monthlyIncome - 2400.00) * 0.055;
                } else if (monthlyIncome <= 4800.00) {
                    amountTaxed += 1200.00 * 0.014;
                    amountTaxed += 1200.00 * 0.032;
                    amountTaxed += 1200.00 * 0.055;
                    amountTaxed += (monthlyIncome - 3600.00) * 0.064;
                } else if (monthlyIncome <= 6000.00) {
                    amountTaxed += 1200.00 * 0.014;
                    amountTaxed += 1200.00 * 0.032;
                    amountTaxed += 1200.00 * 0.055;
                    amountTaxed += 1200.00 * 0.064;
                    amountTaxed += (monthlyIncome - 4800.00) * 0.068;
                } else if (monthlyIncome <= 7200.00) {
                    amountTaxed += 1200.00 * 0.014;
                    amountTaxed += 1200.00 * 0.032;
                    amountTaxed += 1200.00 * 0.055;
                    amountTaxed += 1200.00 * 0.064;
                    amountTaxed += 1200.00 * 0.068;
                    amountTaxed += (monthlyIncome - 6000.00) * 0.072;
                } else if (monthlyIncome <= 8400.00) {
                    amountTaxed += 1200.00 * 0.014;
                    amountTaxed += 1200.00 * 0.032;
                    amountTaxed += 1200.00 * 0.055;
                    amountTaxed += 1200.00 * 0.064;
                    amountTaxed += 1200.00 * 0.068;
                    amountTaxed += 1200.00 * 0.072;
                    amountTaxed += (monthlyIncome - 7200.00) * 0.076;
                } else if (monthlyIncome <= 9600.00) {
                    amountTaxed += 1200.00 * 0.014;
                    amountTaxed += 1200.00 * 0.032;
                    amountTaxed += 1200.00 * 0.055;
                    amountTaxed += 1200.00 * 0.064;
                    amountTaxed += 1200.00 * 0.068;
                    amountTaxed += 1200.00 * 0.072;
                    amountTaxed += 1200.00 * 0.076;
                    amountTaxed += (monthlyIncome - 8400.00) * 0.079;
                } else if (monthlyIncome <= 12000.00) {
                    amountTaxed += 1200.00 * 0.014;
                    amountTaxed += 1200.00 * 0.032;
                    amountTaxed += 1200.00 * 0.055;
                    amountTaxed += 1200.00 * 0.064;
                    amountTaxed += 1200.00 * 0.068;
                    amountTaxed += 1200.00 * 0.072;
                    amountTaxed += 1200.00 * 0.076;
                    amountTaxed += 1200.00 * 0.079;
                    amountTaxed += (monthlyIncome - 9600.00) * 0.0825;
                } else if (monthlyIncome <= 15000.00) {
                    amountTaxed += 1200.00 * 0.014;
                    amountTaxed += 1200.00 * 0.032;
                    amountTaxed += 1200.00 * 0.055;
                    amountTaxed += 1200.00 * 0.064;
                    amountTaxed += 1200.00 * 0.068;
                    amountTaxed += 1200.00 * 0.072;
                    amountTaxed += 1200.00 * 0.076;
                    amountTaxed += 1200.00 * 0.079;
                    amountTaxed += 2400.00 * 0.0825;
                    amountTaxed += (monthlyIncome - 12000.00) * 0.09;
                } else if (monthlyIncome <= 16666.67) {
                    amountTaxed += 1200.00 * 0.014;
                    amountTaxed += 1200.00 * 0.032;
                    amountTaxed += 1200.00 * 0.055;
                    amountTaxed += 1200.00 * 0.064;
                    amountTaxed += 1200.00 * 0.068;
                    amountTaxed += 1200.00 * 0.072;
                    amountTaxed += 1200.00 * 0.076;
                    amountTaxed += 1200.00 * 0.079;
                    amountTaxed += 2400.00 * 0.0825;
                    amountTaxed += 3000.00 * 0.09;
                    amountTaxed += (monthlyIncome - 15000.00) * 0.1;
                } else {
                    amountTaxed += 1200.00 * 0.014;
                    amountTaxed += 1200.00 * 0.032;
                    amountTaxed += 1200.00 * 0.055;
                    amountTaxed += 1200.00 * 0.064;
                    amountTaxed += 1200.00 * 0.068;
                    amountTaxed += 1200.00 * 0.072;
                    amountTaxed += 1200.00 * 0.076;
                    amountTaxed += 1200.00 * 0.079;
                    amountTaxed += 2400.00 * 0.0825;
                    amountTaxed += 3000.00 * 0.09;
                    amountTaxed += 1666.67 * 0.1;
                    amountTaxed += (monthlyIncome - 16666.67) * 0.11;
                }
                break;

                case "IA":
                case "IOWA":
                if (monthlyIncome <= 1000.00) {
                    amountTaxed += monthlyIncome * 0.044;
                } else if (monthlyIncome <= 2583.33) {
                    amountTaxed += 1000.00 * 0.044;
                    amountTaxed += (monthlyIncome - 1000.00) * 0.057;
                } else {
                    amountTaxed += 1000.00 * 0.044;
                    amountTaxed += 1583.33 * 0.057;
                    amountTaxed += (monthlyIncome - 2583.33) * 0.06;
                }
                break;

                case "KS":
                case "KANSAS":
                if (monthlyIncome <= 1250.00) {
                    amountTaxed += monthlyIncome * 0.031;
                } else if (monthlyIncome <= 2500.00) {
                    amountTaxed += 1250.00 * 0.031;
                    amountTaxed += (monthlyIncome - 1250.00) * 0.0525;
                } else {
                    amountTaxed += 1250.00 * 0.031;
                    amountTaxed += 1250.00 * 0.0525;
                    amountTaxed += (monthlyIncome - 2500) * 0.057;
                }
                break;

                case "LA":
                case "LOUISIANA":
                if (monthlyIncome <= 1050.00) {
                    amountTaxed += monthlyIncome * 0.058;
                } else if (monthlyIncome <= 4616.67) {
                    amountTaxed += 1050.00 * 0.058;
                    amountTaxed += (monthlyIncome - 1050.00) * 0.0675;
                } else {
                    amountTaxed += 1050.00 * 0.058;
                    amountTaxed += 3566.67 * 0.0675;
                    amountTaxed += (monthlyIncome - 4626.67) * 0.0715;
                }
                break;

                case "ME":
                case "MAINE":
                if (monthlyIncome <= 2171.00) {
                    amountTaxed += monthlyIncome * 0.058;
                } else if (monthlyIncome <= 5133.00) {
                    amountTaxed += 2171.00 * 0.058;
                    amountTaxed += (monthlyIncome - 2171.00) * 0.0675;
                } else {
                    amountTaxed += 2171.00 * 0.058;
                    amountTaxed += 2962.00 * 0.0675;
                    amountTaxed += (monthlyIncome - 5133.00) * 0.0715;
                }
                break;

                case "MD":
                case "MARYLAND":
                if (monthlyIncome <= 83.33) {
                    amountTaxed += monthlyIncome * 0.02;
                } else if (monthlyIncome <= 166.67) {
                    amountTaxed += 83.33 * 0.02;
                    amountTaxed += (monthlyIncome - 83.33) * 0.03;
                } else if (monthlyIncome <= 250.00) {
                    amountTaxed += 83.33 * 0.02;
                    amountTaxed += 83.34 * 0.03;
                    amountTaxed += (monthlyIncome - 166.67) * 0.04;
                } else if (monthlyIncome <= 8333.33) {
                    amountTaxed += 83.33 * 0.02;
                    amountTaxed += 83.34 * 0.03;
                    amountTaxed += 83.33 * 0.04;
                    amountTaxed += (monthlyIncome - 250.00) * 0.0475;
                } else if (monthlyIncome <= 10416.67) {
                    amountTaxed += 83.33 * 0.02;
                    amountTaxed += 83.34 * 0.03;
                    amountTaxed += 83.33 * 0.04;
                    amountTaxed += 8083.33 * 0.0475;
                    amountTaxed += (monthlyIncome - 8333.33) * 0.05;
                } else if (monthlyIncome <= 12500.00) {
                    amountTaxed += 83.33 * 0.02;
                    amountTaxed += 83.34 * 0.03;
                    amountTaxed += 83.33 * 0.04;
                    amountTaxed += 8083.33 * 0.0475;
                    amountTaxed += 2083.34 * 0.05;
                    amountTaxed += (monthlyIncome - 10416.67) * 0.0525;
                } else if (monthlyIncome <= 20833.33) {
                    amountTaxed += 83.33 * 0.02;
                    amountTaxed += 83.34 * 0.03;
                    amountTaxed += 83.33 * 0.04;
                    amountTaxed += 8083.33 * 0.0475;
                    amountTaxed += 2083.34 * 0.05;
                    amountTaxed += 2083.33 * 0.0525;
                    amountTaxed += (monthlyIncome - 12500.00) * 0.055;
                } else {
                    amountTaxed += 83.33 * 0.02;
                    amountTaxed += 83.34 * 0.03;
                    amountTaxed += 83.33 * 0.04;
                    amountTaxed += 8083.33 * 0.0475;
                    amountTaxed += 2083.34 * 0.05;
                    amountTaxed += 2083.33 * 0.0525;
                    amountTaxed += 8333.33 * 0.055;
                    amountTaxed += (monthlyIncome - 20833.33) * 0.0575;
                }
                break;

                case "MN":
                case "MINNESOTA":
                if (monthlyIncome <= 3968.33) {
                    amountTaxed += monthlyIncome * 0.0535;
                } else if (monthlyIncome <= 15765.00) {
                    amountTaxed += 3968.33 * 0.0535;
                    amountTaxed += (monthlyIncome - 3968.33) * 0.068;
                } else if (monthlyIncome <= 27533.33) {
                    amountTaxed += 3968.33 * 0.0535;
                    amountTaxed += 11796.67 * 0.068;
                    amountTaxed += (monthlyIncome - 15765.00) * 0.0785;
                } else {
                    amountTaxed += 3968.33 * 0.0535;
                    amountTaxed += 11796.67 * 0.068;
                    amountTaxed += 11768.33 * 0.0785;
                    amountTaxed += (monthlyIncome - 27533.33) * 0.0785;
                }
                break;

                case "MO":
                case "MISSOURI":
                if (monthlyIncome <= 1273.00) {
                    amountTaxed += monthlyIncome * 0.0;
                } else if (monthlyIncome <= 2546.00) {
                    amountTaxed += 1273.00 * 0.0;
                    amountTaxed += (monthlyIncome - 1273.00) * 0.02;
                } else if (monthlyIncome <= 3819.00) {
                    amountTaxed += 1273.00 * 0.0;
                    amountTaxed += 1273.00 * 0.02;
                    amountTaxed += (monthlyIncome - 2546.00) * 0.025;
                } else if (monthlyIncome <= 5092.00) {
                    amountTaxed += 1273.00 * 0.0;
                    amountTaxed += 1273.00 * 0.02;
                    amountTaxed += 1273.00 * 0.025;
                    amountTaxed += (monthlyIncome - 3819.00) * 0.03;
                } else if (monthlyIncome <= 6365.00) {
                    amountTaxed += 1273.00 * 0.0;
                    amountTaxed += 1273.00 * 0.02;
                    amountTaxed += 1273.00 * 0.025;
                    amountTaxed += 1273.00 * 0.03;
                    amountTaxed += (monthlyIncome - 5092.00) * 0.035;
                } else if (monthlyIncome <= 7638.00) {
                    amountTaxed += 1273.00 * 0.0;
                    amountTaxed += 1273.00 * 0.02;
                    amountTaxed += 1273.00 * 0.025;
                    amountTaxed += 1273.00 * 0.03;
                    amountTaxed += 1273.00 * 0.035;
                    amountTaxed += (monthlyIncome - 6365.00) * 0.04;
                } else if (monthlyIncome <= 8911.00) {
                    amountTaxed += 1273.00 * 0.0;
                    amountTaxed += 1273.00 * 0.02;
                    amountTaxed += 1273.00 * 0.025;
                    amountTaxed += 1273.00 * 0.03;
                    amountTaxed += 1273.00 * 0.035;
                    amountTaxed += 1273.00 * 0.04;
                    amountTaxed += (monthlyIncome - 7638.00) * 0.045;
                } else {
                    amountTaxed += 1273.00 * 0.0;
                    amountTaxed += 1273.00 * 0.02;
                    amountTaxed += 1273.00 * 0.025;
                    amountTaxed += 1273.00 * 0.03;
                    amountTaxed += 1273.00 * 0.035;
                    amountTaxed += 1273.00 * 0.04;
                    amountTaxed += 1273.00 * 0.045;
                    amountTaxed += (monthlyIncome - 8911.00) * 0.048;
                }
                break;

                case "MT":
                case "MONTANA":
                if (monthlyIncome <= 1708.33) {
                    amountTaxed += 1708.33 * 0.047;
                } else {
                    amountTaxed += 1708.33 * 0.047;
                    amountTaxed += (monthlyIncome - 1708.33) * 0.059;
                }
                break;

                case "NE":
                case "NEBRASKA":
                if (monthlyIncome <= 500.00) {
                    amountTaxed += monthlyIncome * 0.0246;
                } else if (monthlyIncome <= 1500.00) {
                    amountTaxed += 500.00 * 0.0246;
                    amountTaxed += (monthlyIncome - 500.00) * 0.0351;
                } else if (monthlyIncome <= 2416.67) {
                    amountTaxed += 500.00 * 0.0246;
                    amountTaxed += 1000.00 * 0.0351;
                    amountTaxed += (monthlyIncome - 1500.00) * 0.0501;
                } else {
                    amountTaxed += 500.00 * 0.0246;
                    amountTaxed += 1000.00 * 0.0351;
                    amountTaxed += 916.67 * 0.0501;
                    amountTaxed += (monthlyIncome - 2416.67) * 0.0584;
                }
                break;

                case "NJ":
                case "NEW JERSEY":
                if (monthlyIncome <= 1666.67) {
                    amountTaxed += monthlyIncome * 0.014;
                } else if (monthlyIncome <= 2916.67) {
                    amountTaxed += 1666.67 * 0.014;
                    amountTaxed += (monthlyIncome - 1666.67) * 0.0175;
                } else if (monthlyIncome <= 3333.33) {
                    amountTaxed += 1666.67 * 0.014;
                    amountTaxed += 1250 * 0.0175;
                    amountTaxed += (monthlyIncome - 2916.67) * 0.035;
                } else if (monthlyIncome <= 6250.00) {
                    amountTaxed += 1666.67 * 0.014;
                    amountTaxed += 1250 * 0.0175;
                    amountTaxed += 416.66 * 0.035;
                    amountTaxed += (monthlyIncome - 3333.33) * 0.0553;
                } else if (monthlyIncome <= 41666.67) {
                    amountTaxed += 1666.67 * 0.014;
                    amountTaxed += 1250 * 0.0175;
                    amountTaxed += 416.66 * 0.035;
                    amountTaxed += 2916.67 * 0.0553;
                    amountTaxed += (monthlyIncome - 6250.00) * 0.0637;
                } else if (monthlyIncome <= 83333.33) {
                    amountTaxed += 1666.67 * 0.014;
                    amountTaxed += 1250 * 0.0175;
                    amountTaxed += 416.66 * 0.035;
                    amountTaxed += 2916.67 * 0.0553;
                    amountTaxed += 35416.67 * 0.0637;
                    amountTaxed += (monthlyIncome - 41666.67) * 0.0897;
                } else {
                    amountTaxed += 1666.67 * 0.014;
                    amountTaxed += 1250 * 0.0175;
                    amountTaxed += 416.66 * 0.035;
                    amountTaxed += 2916.67 * 0.0553;
                    amountTaxed += 35416.67 * 0.0637;
                    amountTaxed += 41666.66 * 0.0897;
                    amountTaxed += (monthlyIncome - 83333.33) * 0.1075;
                }
                break;

                case "NM":
                case "NEW MEXICO":
                if (monthlyIncome <= 458.33) {
                    amountTaxed += monthlyIncome * 0.017;
                } else if (monthlyIncome <= 916.67) {
                    amountTaxed += 458.33 * 0.017;
                    amountTaxed += (monthlyIncome - 458.33) * 0.032;
                } else if (monthlyIncome <= 1333.33) {
                    amountTaxed += 458.33 * 0.017;
                    amountTaxed += 458.34 * 0.032;
                    amountTaxed += (monthlyIncome - 916.67) * 0.047;
                } else if (monthlyIncome <= 17500.00) {
                    amountTaxed += 458.33 * 0.017;
                    amountTaxed += 458.34 * 0.032;
                    amountTaxed += 416.66 * 0.047;
                    amountTaxed += (monthlyIncome - 1333.33) * 0.049;
                } else {
                    amountTaxed += 458.33 * 0.017;
                    amountTaxed += 458.34 * 0.032;
                    amountTaxed += 416.66 * 0.047;
                    amountTaxed += 16166.67 * 0.049;
                    amountTaxed += (monthlyIncome - 1333.33) * 0.059;
                }
                break;

                case "NY":
                case "NEW YORK":
                if (monthlyIncome <= 708.33) {
                    amountTaxed += monthlyIncome * 0.04;
                } else if (monthlyIncome <= 975.00) {
                    amountTaxed += 708.33 * 0.04;
                    amountTaxed += (monthlyIncome - 708.33) * 0.045;
                } else if (monthlyIncome <= 1158.33) {
                    amountTaxed += 708.33 * 0.04;
                    amountTaxed += 266.67 * 0.045;
                    amountTaxed += (monthlyIncome - 975.00) * 0.0525;
                } else if (monthlyIncome <= 6720.83) {
                    amountTaxed += 708.33 * 0.04;
                    amountTaxed += 266.67 * 0.045;
                    amountTaxed += 183.33 * 0.0525;
                    amountTaxed += (monthlyIncome - 1158.33) * 0.055;
                } else if (monthlyIncome <= 17950.00) {
                    amountTaxed += 708.33 * 0.04;
                    amountTaxed += 266.67 * 0.045;
                    amountTaxed += 183.33 * 0.0525;
                    amountTaxed += 5562.50 * 0.055;
                    amountTaxed += (monthlyIncome - 6720.83) * 0.06;
                } else if (monthlyIncome <= 89795.83) {
                    amountTaxed += 708.33 * 0.04;
                    amountTaxed += 266.67 * 0.045;
                    amountTaxed += 183.33 * 0.0525;
                    amountTaxed += 5562.50 * 0.055;
                    amountTaxed += 11229.17 * 0.06;
                    amountTaxed += (monthlyIncome - 17950.00) * 0.0685;
                } else if (monthlyIncome <= 416666.67) {
                    amountTaxed += 708.33 * 0.04;
                    amountTaxed += 266.67 * 0.045;
                    amountTaxed += 183.33 * 0.0525;
                    amountTaxed += 5562.50 * 0.055;
                    amountTaxed += 11229.17 * 0.06;
                    amountTaxed += 71845.83 * 0.0685;
                    amountTaxed += (monthlyIncome - 89795.83) * 0.0965;
                } else if (monthlyIncome <= 2083333.33) {
                    amountTaxed += 708.33 * 0.04;
                    amountTaxed += 266.67 * 0.045;
                    amountTaxed += 183.33 * 0.0525;
                    amountTaxed += 5562.50 * 0.055;
                    amountTaxed += 11229.17 * 0.06;
                    amountTaxed += 71845.83 * 0.0685;
                    amountTaxed += 326870.84 * 0.0965;
                    amountTaxed += (monthlyIncome - 416666.67) * 0.103;
                } else {
                    amountTaxed += 708.33 * 0.04;
                    amountTaxed += 266.67 * 0.045;
                    amountTaxed += 183.33 * 0.0525;
                    amountTaxed += 5562.50 * 0.055;
                    amountTaxed += 11229.17 * 0.06;
                    amountTaxed += 71845.83 * 0.0685;
                    amountTaxed += 326870.84 * 0.0965;
                    amountTaxed += 1666666.66 * 0.103;
                    amountTaxed += (monthlyIncome - 2083333.33) * 0.109;
                }
                break;

                case "OH":
                case "OHIO":
                if (monthlyIncome <= 2170.83) {
                    amountTaxed += monthlyIncome * 0.0275;
                } else {
                    amountTaxed += 2170.83 * 0.0275;
                    amountTaxed += (monthlyIncome - 2170.83) * 0.035;
                }
                break;

                case "OR":
                case "OREGON":
                if (monthlyIncome <= 1000.00) {
                    amountTaxed += monthlyIncome * 0.0475;
                } else if (monthlyIncome <= 2083.33) {
                    amountTaxed += 1000.00 * 0.0475;
                    amountTaxed += (monthlyIncome - 1000.00) * 0.0675;
                } else if (monthlyIncome <= 4166.67) {
                    amountTaxed += 1000.00 * 0.0475;
                    amountTaxed += 1083.33 * 0.0675;
                    amountTaxed += (monthlyIncome - 2083.33) * 0.0875;
                } else {
                    amountTaxed += 1000.00 * 0.0475;
                    amountTaxed += 1083.33 * 0.0675;
                    amountTaxed += 2083.34 * 0.0875;
                    amountTaxed += (monthlyIncome - 4166.67) * 0.099;
                }
                break;

                case "OK":
                case "OKLAHOMA":
                if (monthlyIncome <= 83.33) {
                    amountTaxed += monthlyIncome * 0.0025;
                } else if (monthlyIncome <= 208.33) {
                    amountTaxed += 83.33 * 0.0025;
                    amountTaxed += (monthlyIncome - 83.33) * 0.0075;
                } else if (monthlyIncome <= 312.50) {
                    amountTaxed += 83.33 * 0.025;
                    amountTaxed += 125.00 * 0.075;
                    amountTaxed += (monthlyIncome - 208.33) * 0.0175;
                } else if (monthlyIncome <= 408.33) {
                    amountTaxed += 83.33 * 0.025;
                    amountTaxed += 125.00 * 0.075;
                    amountTaxed += 95.83 * 0.0175;
                    amountTaxed += (monthlyIncome - 312.50) * 0.0275;
                } else if (monthlyIncome <= 600.00) {
                    amountTaxed += 83.33 * 0.025;
                    amountTaxed += 125.00 * 0.075;
                    amountTaxed += 95.83 * 0.0175;
                    amountTaxed += 95.83 * 0.0275;
                    amountTaxed += (monthlyIncome - 408.33) * 0.0375;
                } else {
                    amountTaxed += 83.33 * 0.025;
                    amountTaxed += 125.00 * 0.075;
                    amountTaxed += 95.83 * 0.0175;
                    amountTaxed += 95.83 * 0.0275;
                    amountTaxed += 191.67 * 0.0375;
                    amountTaxed += (monthlyIncome - 600.00) * 0.0475;
                }
                break;

                case "RI":
                case "RHODE ISLAND":
                if (monthlyIncome <= 6454.17) {
                    amountTaxed += monthlyIncome * 0.0375;
                } else if (monthlyIncome <= 14670.83) {
                    amountTaxed += 6454.17 * 0.0375;
                    amountTaxed += (monthlyIncome - 6454.17) * 0.0475;
                } else {
                    amountTaxed += 6454.17 * 0.0375;
                    amountTaxed += 8216.66 * 0.0475;
                    amountTaxed += (monthlyIncome - 14670.83) * 0.0599;
                }
                break;

                case "SC":
                case "SOUTH CAROLINA":
                if (monthlyIncome <= 288.33) {
                    amountTaxed += monthlyIncome * 0.0;
                } else if (monthlyIncome <= 1444.17) {
                    amountTaxed += 288.33 * 0.0;
                    amountTaxed += (monthlyIncome - 288.33) * 0.03;
                } else {
                    amountTaxed += 288.33 * 0.0;
                    amountTaxed += 1155.84 * 0.03;
                    amountTaxed += (monthlyIncome - 1444.17) * 0.064;
                }
                break;

                case "VT":
                case "VERMONT":
                if (monthlyIncome <= 3333.33) {
                    amountTaxed += monthlyIncome * 0.035;
                } else if (monthlyIncome <= 8333.33) {
                    amountTaxed += 3333.33 * 0.035;
                    amountTaxed += (monthlyIncome - 3333.33) * 0.066;
                } else if (monthlyIncome <= 20833.33) {
                    amountTaxed += 3333.33 * 0.035;
                    amountTaxed += 5000.00 * 0.066;
                    amountTaxed += (monthlyIncome - 8333.33) * 0.076;
                } else {
                    amountTaxed += 3333.33 * 0.035;
                    amountTaxed += 5000.00 * 0.066;
                    amountTaxed += 12500.00 * 0.076;
                    amountTaxed += (monthlyIncome - 20833.33) * 0.0875;
                }
                break;

                case "VA":
                case "VIRGINIA":
                if (monthlyIncome <= 250.00) {
                    amountTaxed += monthlyIncome * 0.02;
                } else if (monthlyIncome <= 416.67) {
                    amountTaxed += 250.00 * 0.02;
                    amountTaxed += (monthlyIncome - 250.00) * 0.03;
                } else if (monthlyIncome <= 1416.67) {
                    amountTaxed += 250.00 * 0.02;
                    amountTaxed += 166.67 * 0.03;
                    amountTaxed += (monthlyIncome - 416.67) * 0.05;
                } else {
                    amountTaxed += 250.00 * 0.02;
                    amountTaxed += 166.67 * 0.03;
                    amountTaxed += 1000.00 * 0.05;
                    amountTaxed += (monthlyIncome - 1416.67) * 0.0575;
                }
                break;

                case "DC":
                case "DISTRICT OF COLUMBIA":
                if (monthlyIncome <= 833.33) {
                    amountTaxed += monthlyIncome * 0.04;
                } else if (monthlyIncome <= 3333.33) {
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += (monthlyIncome - 833.33) * 0.06;
                } else if (monthlyIncome <= 5000.00) {
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += 2500.00 * 0.06;
                    amountTaxed += (monthlyIncome - 3333.33) * 0.065;
                } else if (monthlyIncome <= 20833.33) {
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += 2500.00 * 0.06;
                    amountTaxed += 1666.67 * 0.065;
                    amountTaxed += (monthlyIncome - 5000.00) * 0.085;
                } else if (monthlyIncome <= 41666.67) {
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += 2500.00 * 0.06;
                    amountTaxed += 1666.67 * 0.065;
                    amountTaxed += 15833.33 * 0.085;
                    amountTaxed += (monthlyIncome - 20833.33) * 0.0925;
                } else if (monthlyIncome <= 83333.33) {
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += 2500.00 * 0.06;
                    amountTaxed += 1666.67 * 0.065;
                    amountTaxed += 15833.33 * 0.085;
                    amountTaxed += 20833.33 * 0.0925;
                    amountTaxed += (monthlyIncome - 41666.67) * 0.0975;
                } else {
                    amountTaxed += 833.33 * 0.04;
                    amountTaxed += 2500.00 * 0.06;
                    amountTaxed += 1666.67 * 0.065;
                    amountTaxed += 15833.33 * 0.085;
                    amountTaxed += 20833.33 * 0.0925;
                    amountTaxed += 41666.66 * 0.0975;
                    amountTaxed += (monthlyIncome - 83333.33) * 0.1075;
                }
                break;

                case "WV":
                case "WEST VIRGINIA":
                if (monthlyIncome <= 833.33) {
                    amountTaxed += monthlyIncome * 0.0236;
                } else if (monthlyIncome <= 2083.33) {
                    amountTaxed += 833.33 * 0.0236;
                    amountTaxed += (monthlyIncome - 833.33) * 0.0315;
                } else if (monthlyIncome <= 3333.33) {
                    amountTaxed += 833.33 * 0.0236;
                    amountTaxed += 1250.00 * 0.0315;
                    amountTaxed += (monthlyIncome - 2083.33) * 0.0354;
                } else if (monthlyIncome <= 5000.00) {
                    amountTaxed += 833.33 * 0.0236;
                    amountTaxed += 1250.00 * 0.0315;
                    amountTaxed += 1250.00 * 0.0354;
                    amountTaxed += (monthlyIncome - 3333.33) * 0.0472;
                } else {
                    amountTaxed += 833.33 * 0.0236;
                    amountTaxed += 1250.00 * 0.0315;
                    amountTaxed += 1250.00 * 0.0354;
                    amountTaxed += 1666.67 * 0.0472;
                    amountTaxed += (monthlyIncome - 5000.00) * 0.0512;
                }
                break;
                
                case "WI":
                case "WISCONSIN":
                if (monthlyIncome <= 1193.33) {
                    amountTaxed += monthlyIncome * 0.035;
                } else if (monthlyIncome <= 2386.67) {
                    amountTaxed += 1193.33 * 0.0350;
                    amountTaxed += (monthlyIncome - 1193.33) * 0.044;
                } else if (monthlyIncome <= 26275.83) {
                    amountTaxed += 1193.33 * 0.035;
                    amountTaxed += 1193.34 * 0.044;
                    amountTaxed += (monthlyIncome - 2386.67) * 0.053;
                } else {
                    amountTaxed += 1193.33 * 0.035;
                    amountTaxed += 1193.34 * 0.044;
                    amountTaxed += 23889.16 * 0.053;
                    amountTaxed += (monthlyIncome - 26275.83) * 0.0765;
                }
                break;

        }
        totalTax += amountTaxed;
        return amountTaxed;
    }

    public double calcSSTax(String input) {
        input.toLowerCase();
        double amountSSTaxed = 0.00;
        if (input.equals("yes")) {
            amountSSTaxed = monthlyIncome * 0.029;
        } else {
            amountSSTaxed = monthlyIncome * 0.0145;
        }
        totalTax += amountSSTaxed;
        return amountSSTaxed;
    }

    public double calcMedTax(String input) {
        input.toLowerCase();
        double amountMedTaxed = 0.00;
        if (input.equals("yes")) {
            amountMedTaxed = monthlyIncome * 0.124;
        } else {
            amountMedTaxed = monthlyIncome * 0.062;
        }
        totalTax += amountMedTaxed;
        return amountMedTaxed;
    }

    public double calcFedTax() {
        double amountFedTaxed = 0.00;
        if (monthlyIncome <= 966.67) {
            amountFedTaxed += monthlyIncome * 0.1;
        } else if (monthlyIncome <= 3929.17) {
            amountFedTaxed += 966.67 * 0.1;
            amountFedTaxed += (monthlyIncome - 966.67) * 0.12;
        } else if (monthlyIncome <= 8377.08) {
            amountFedTaxed += 966.67 * 0.1;
            amountFedTaxed += 2962.5 * 0.12;
            amountFedTaxed += (monthlyIncome - 3929.17) * 0.22;
        } else if (monthlyIncome <= 15995.83) {
            amountFedTaxed += 966.67 * 0.1;
            amountFedTaxed += 2962.5 * 0.12;
            amountFedTaxed += 4447.91 * 0.22;
            amountFedTaxed += (monthlyIncome - 8377.08) * 0.24;
        } else if (monthlyIncome <= 20310.42) {
            amountFedTaxed += 966.67 * 0.1;
            amountFedTaxed += 2962.5 * 0.12;
            amountFedTaxed += 4447.91 * 0.22;
            amountFedTaxed += 7618.75 * 0.24;
            amountFedTaxed += (monthlyIncome - 15995.83) * 0.32;
        } else if (monthlyIncome <= 50779.17) {
            amountFedTaxed += 966.67 * 0.1;
            amountFedTaxed += 2962.5 * 0.12;
            amountFedTaxed += 4447.91 * 0.22;
            amountFedTaxed += 7618.75 * 0.24;
            amountFedTaxed += 4314.59 * 0.32;
            amountFedTaxed += (monthlyIncome - 20310.42) * 0.35;
        } else {
            amountFedTaxed += 966.67 * 0.1;
            amountFedTaxed += 2962.5 * 0.12;
            amountFedTaxed += 4447.91 * 0.22;
            amountFedTaxed += 7618.75 * 0.24;
            amountFedTaxed += 4314.59 * 0.32;
            amountFedTaxed += 30468.75 * 0.35;
            amountFedTaxed += (monthlyIncome - 50779.17) * 0.37;
        }
        totalTax += amountFedTaxed;
        return amountFedTaxed;
    }

    public void calcBudget(double THP) {
        double total = 100;

        System.out.println("");
        System.out.format("|CURRENT BUDGET|:%nMoney for Needs: ?%nMoney for Savings: ?%nMoney for Investment: ?%nMoney for Wants: ?%n ");
        taxes.dashPrint1();

        System.out.format("%nPercent of Take Home Pay remaining: %.2f%%", total);
        System.out.format("%nWhat percentage of the Take Home Pay should be allocated towards the category: Needs (%%)?: ");
        taxes.checkMonthlyIncome();
        double needsP = scan.nextDouble();
        needsP = taxes.checkPercent(needsP, total);
        total -= needsP;

        taxes.percentUpdate(total);
        System.out.print("What percentage of the Take Home Pay should be allocated towards the category: Savings (%)?: ");
        taxes.checkMonthlyIncome();
        double savingsP = scan.nextDouble();
        savingsP = taxes.checkPercent(savingsP, total);
        total -= savingsP;

        taxes.percentUpdate(total);
        System.out.print("What percentage of the Take Home Pay should be allocated towards the category: Investments (%)?: ");
        taxes.checkMonthlyIncome();
        double investmentP = scan.nextDouble();
        investmentP = taxes.checkPercent(investmentP, total);
        total -= investmentP;

        taxes.percentUpdate(total);
        System.out.format("What percentage of the Take Home Pay should be allocated towards the category: Wants (%%)?: %f%n", total);
        
        //ALTERNATE METHOD:
        //taxes.checkMonthlyIncome();
        //double wantsP = scan.nextDouble();
        //wantsP = taxes.checkPercent(wantsP, total);
        //total -= wantsP;
        
        needsP /= 100.0;
        savingsP /= 100.0;
        investmentP /= 100.0;
        total /= 100.0;

        double needs;
        double savings;
        double investment;
        double wants;

        needs = THP * needsP;
        savings = THP * savingsP;
        investment = THP * investmentP;
        wants = THP * total;

        taxes.dashPrint1();

        System.out.format("%n|BUDGET|: %nMoney for Needs: $%.2f%nMoney for Savings: $%.2f%nMoney for Investments: $%.2f%nMoney for Wants: $%.2f%n", needs, savings, investment, wants);

        System.out.println(); 
        System.out.println("Thank you for choosing McCracken Calculations. Please enjoy your new budget!");
        taxes.dashPrint2();

    }

    public static double checkTotal(double percent, double whole) {
            while ((whole - percent) < 0) {
                System.out.print("Please choose a distribution that does not exceed the allocated percent shown: ");
                taxes.checkMonthlyIncome();
                double newPercent = taxes.scan.nextDouble();
                if (whole - newPercent > 0) {
                    whole -= percent;
                    return whole;
                } else {
                    continue;
                }
            }

            whole -= percent;
            return whole;
    }

    public static double checkPercent(double percent, double whole) {
        while ((whole - percent) < 0) {
            System.out.print("Please choose a distribution that does not exceed the allocated percent shown: ");
            taxes.checkMonthlyIncome();
            double newPercent = taxes.scan.nextDouble();
            if (whole - newPercent > 0) {
                return newPercent;
            } else {
                continue;
            }
        }
        return percent;
    }

    public static String stateCheck(String input1) {
        input1.toUpperCase();
        String input2;
        while (!allStates.contains(input1)) {
            System.out.print("Please enter a valid U.S. state: ");
            input2 = scan.nextLine().toUpperCase();
            if (allStates.contains(input2)) {
                input1 = input2;
                break;
            } else {
                continue;
            }
            
        }
        return input1;
    }

    public static String checkEmployeeStatus(String input) {
        input.toLowerCase();
        if (input.equals("yes")) {
            return input;
        } else if (input.equals("no")) {
            return input;
        } else {
            boolean validInput = true;
            while (validInput) {
                System.out.print("Please enter Yes or No: ");
                String response = scan.next().toLowerCase();
                if (response.equals("yes")) {
                    input = response;
                    validInput = false;
                } else if (response.equals("no")) {
                    input = response;
                    validInput = false;
                } else {
                    continue;
                }
            }
        }
        return input;
    }

    public static void checkMonthlyIncome() {
        while (!(taxes.scan.hasNextDouble())) {
            System.out.print("Please enter a number: ");
            taxes.scan.next(); //consumes the invalid input, essentially disregards it
        } 
     }
    
    public static void percentUpdate(double total) {
        System.out.format("%nPercent of Take Home Pay remaining for budget: %.2f%%%n", total);
    }

    public static void intro() {
        String welcome1 = "Tax calculations may not be 100% accurate. Please refer to the IRS or a tax expert for the true numbers.";
        String indent = " ".repeat(14);
        taxes.dashPrint1();
        String welcome2 = indent + welcome1;

        System.out.println("");
        System.out.println("Welcome to McCracken Calculations, a customizable budget calculator!!!");
        System.out.println("|DISCLAIMER|: Tax calculations are based on the 2024 rates and assume the user is a single filer.");
        System.out.println(welcome2);
        System.out.println("");
        System.out.println("|INSTRUCTIONS|: Enter the correct data when prompted. Please Enjoy!!");
        taxes.dashPrint1();
        System.out.println("");
    }

    public static void addStates() {
        allStates.add("AL"); // Alabama
        allStates.add("AK"); // Alaska
        allStates.add("AZ"); // Arizona
        allStates.add("AR"); // Arkansas
        allStates.add("CA"); // California
        allStates.add("CO"); // Colorado
        allStates.add("CT"); // Connecticut
        allStates.add("DE"); // Delaware
        allStates.add("FL"); // Florida
        allStates.add("GA"); // Georgia
        allStates.add("HI"); // Hawaii
        allStates.add("ID"); // Idaho
        allStates.add("IL"); // Illinois
        allStates.add("IN"); // Indiana
        allStates.add("IA"); // Iowa
        allStates.add("KS"); // Kansas
        allStates.add("KY"); // Kentucky
        allStates.add("LA"); // Louisiana
        allStates.add("ME"); // Maine
        allStates.add("MD"); // Maryland
        allStates.add("MA"); // Massachusetts
        allStates.add("MI"); // Michigan
        allStates.add("MN"); // Minnesota
        allStates.add("MS"); // Mississippi
        allStates.add("MO"); // Missouri
        allStates.add("MT"); // Montana
        allStates.add("NE"); // Nebraska
        allStates.add("NV"); // Nevada
        allStates.add("NH"); // New Hampshire
        allStates.add("NJ"); // New Jersey
        allStates.add("NM"); // New Mexico
        allStates.add("NY"); // New York
        allStates.add("NC"); // North Carolina
        allStates.add("ND"); // North Dakota
        allStates.add("OH"); // Ohio
        allStates.add("OK"); // Oklahoma
        allStates.add("OR"); // Oregon
        allStates.add("PA"); // Pennsylvania
        allStates.add("RI"); // Rhode Island
        allStates.add("SC"); // South Carolina
        allStates.add("SD"); // South Dakota
        allStates.add("TN"); // Tennessee
        allStates.add("TX"); // Texas
        allStates.add("UT"); // Utah
        allStates.add("VT"); // Vermont
        allStates.add("VA"); // Virginia
        allStates.add("WA"); // Washington
        allStates.add("WV"); // West Virginia
        allStates.add("WI"); // Wisconsin
        allStates.add("WY"); // Wyoming
        allStates.add("ALABAMA");
        allStates.add("ALASKA"); 
        allStates.add("ARIZONA"); 
        allStates.add("ARKANSAS");
        allStates.add("CALIFORNIA");
        allStates.add("COLORADO");
        allStates.add("CONNECTICUT"); 
        allStates.add("DELAWARE");
        allStates.add("FLORIDA");
        allStates.add("GEORGIA");
        allStates.add("HAWAII");
        allStates.add("IDAHO"); 
        allStates.add("ILLINOIS"); 
        allStates.add("INDIANA"); 
        allStates.add("IOWA");
        allStates.add("KANSAS"); 
        allStates.add("KENTUCKY"); 
        allStates.add("LOUISIANA");
        allStates.add("MAINE"); 
        allStates.add("MARYLAND"); 
        allStates.add("MASSACHUSETTS"); 
        allStates.add("MICHIGAN"); 
        allStates.add("MINNESOTA"); 
        allStates.add("MISSISSIPPI"); 
        allStates.add("MISSOURI"); 
        allStates.add("MONTANA"); 
        allStates.add("NEBRASKA"); 
        allStates.add("NEVADA"); 
        allStates.add("NEW HAMPSHIRE"); 
        allStates.add("NEW JERSEY"); 
        allStates.add("NEW MEXICO"); 
        allStates.add("NEW YORK");
        allStates.add("NORTH CAROLINA"); 
        allStates.add("NORTH DAKOTA"); 
        allStates.add("OHIO"); 
        allStates.add("OKLAHOMA"); 
        allStates.add("OREGON"); 
        allStates.add("PENNSYLVANIA"); 
        allStates.add("RHODE ISLAND"); 
        allStates.add("SOUTH CAROLINA"); 
        allStates.add("SOUTH DAKOTA");
        allStates.add("TENNESSEE"); 
        allStates.add("TEXAS");
        allStates.add("UTAH"); 
        allStates.add("VERMONT"); 
        allStates.add("VIRGINIA");
        allStates.add("WASHINGTON");
        allStates.add("WEST VIRGINIA");
        allStates.add("WISCONSIN");
        allStates.add("WYOMING");
    }


    public static void linePrint() {
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }

    public static void dashPrint1() {
        for (int i = 0; i < 125; i++) {
            System.out.print("-");
        }
    }

    public static void dashPrint2() {
        for (int i = 0; i < 125; i++) {
            System.out.print("_");
        }
    }
    
    public double getTotalTax() {
        return totalTax;
    }

    public String getName() {
        return name;
    } 

}


