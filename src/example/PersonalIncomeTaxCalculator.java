package example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class PersonalIncomeTaxCalculator {

    @WebMethod
    public double calculateTax(
            double income,
            double socialInsurance,
            double specialDeductions,
            double otherDeductions
    ) {
        double taxFreeThreshold = 5000; // Assuming the tax-free threshold is 5000 yuan, adjust according to the latest tax law
        return calculatePersonalIncomeTax(income, taxFreeThreshold, socialInsurance, specialDeductions, otherDeductions);
    }

    private double calculatePersonalIncomeTax(
            double income,
            double taxFreeThreshold,
            double socialInsurance,
            double specialDeductions,
            double otherDeductions
    ) {
        // Calculate taxable income
        double taxableIncome = income - taxFreeThreshold - socialInsurance - specialDeductions - otherDeductions;

        // Calculate tax based on taxable income
        if (taxableIncome <= 0) {
            return 0;
        } else if (taxableIncome <= 3000) {
            return taxableIncome * 0.03;
        } else if (taxableIncome <= 12000) {
            return taxableIncome * 0.1 - 210;
        } else if (taxableIncome <= 25000) {
            return taxableIncome * 0.2 - 1410;
        } else if (taxableIncome <= 35000) {
            return taxableIncome * 0.25 - 2660;
        } else if (taxableIncome <= 55000) {
            return taxableIncome * 0.3 - 4410;
        } else if (taxableIncome <= 80000) {
            return taxableIncome * 0.35 - 7160;
        } else {
            return taxableIncome * 0.45 - 15160;
        }
    }

    public static void main(String[] argv) {
        PersonalIncomeTaxCalculator implementor = new PersonalIncomeTaxCalculator();
        String address = "http://localhost:9000/PersonalIncomeTaxCalculator";
        System.out.println("Publishing service at " + address);
        javax.xml.ws.Endpoint.publish(address, implementor);
    }
}
