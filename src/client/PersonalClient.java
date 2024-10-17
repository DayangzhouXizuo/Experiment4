package client;

import example.PersonalIncomeTaxCalculator;

public class PersonalClient {
    public static void main(String[] argv) {
        // ��������ʵ��
        PersonalIncomeTaxCalculatorService service = new PersonalIncomeTaxCalculatorService();

        // ��ȡ����˿�
        PersonalIncomeTaxCalculator port = (PersonalIncomeTaxCalculator) service.getPersonalIncomeTaxCalculatorPort();

        // ���õ��ò���
        double income = 10000; // ʾ������
        double socialInsurance = 500; // ʾ������һ��
        double specialDeductions = 200; // ʾ��ר��۳�
        double otherDeductions = 100; // ʾ�������۳�

        try {
            // ����ҵ�񷽷�
            double tax = port.calculateTax(income, socialInsurance, specialDeductions, otherDeductions);
            System.out.println("Calculated tax: " + tax);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}