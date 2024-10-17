import example.PersonalIncomeTaxCalculator;

public class TestClient {
    public static void main(String[] args) {
        // 直接创建服务类的实例
        PersonalIncomeTaxCalculator calculator = new PersonalIncomeTaxCalculator();

        // 设置调用参数
        double income = 10000; // 示例收入
        double socialInsurance = 1000; // 示例五险一金
        double specialDeductions = 500; // 示例专项扣除
        double otherDeductions = 300; // 示例其他扣除

        // 调用业务方法
        double tax = calculator.calculateTax(income, socialInsurance, specialDeductions, otherDeductions);
        System.out.println("Calculated tax for income " + income + " is: " + tax);
    }
}