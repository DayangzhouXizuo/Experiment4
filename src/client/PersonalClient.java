package client;

import example.PersonalIncomeTaxCalculator;

public class PersonalClient {
    public static void main(String[] argv) {
        // 创建服务实例
        PersonalIncomeTaxCalculatorService service = new PersonalIncomeTaxCalculatorService();

        // 获取服务端口
        PersonalIncomeTaxCalculator port = (PersonalIncomeTaxCalculator) service.getPersonalIncomeTaxCalculatorPort();

        // 设置调用参数
        double income = 10000; // 示例收入
        double socialInsurance = 500; // 示例五险一金
        double specialDeductions = 200; // 示例专项扣除
        double otherDeductions = 100; // 示例其他扣除

        try {
            // 调用业务方法
            double tax = port.calculateTax(income, socialInsurance, specialDeductions, otherDeductions);
            System.out.println("Calculated tax: " + tax);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}