import example.PersonalIncomeTaxCalculator;

public class TestClient {
    public static void main(String[] args) {
        // ֱ�Ӵ����������ʵ��
        PersonalIncomeTaxCalculator calculator = new PersonalIncomeTaxCalculator();

        // ���õ��ò���
        double income = 10000; // ʾ������
        double socialInsurance = 1000; // ʾ������һ��
        double specialDeductions = 500; // ʾ��ר��۳�
        double otherDeductions = 300; // ʾ�������۳�

        // ����ҵ�񷽷�
        double tax = calculator.calculateTax(income, socialInsurance, specialDeductions, otherDeductions);
        System.out.println("Calculated tax for income " + income + " is: " + tax);
    }
}