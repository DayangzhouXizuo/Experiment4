
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>calculateTax complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="calculateTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateTax", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class CalculateTax {

    protected double arg0;
    protected double arg1;
    protected double arg2;
    protected double arg3;

    /**
     * 获取arg0属性的值。
     * 
     */
    public double getArg0() {
        return arg0;
    }

    /**
     * 设置arg0属性的值。
     * 
     */
    public void setArg0(double value) {
        this.arg0 = value;
    }

    /**
     * 获取arg1属性的值。
     * 
     */
    public double getArg1() {
        return arg1;
    }

    /**
     * 设置arg1属性的值。
     * 
     */
    public void setArg1(double value) {
        this.arg1 = value;
    }

    /**
     * 获取arg2属性的值。
     * 
     */
    public double getArg2() {
        return arg2;
    }

    /**
     * 设置arg2属性的值。
     * 
     */
    public void setArg2(double value) {
        this.arg2 = value;
    }

    /**
     * 获取arg3属性的值。
     * 
     */
    public double getArg3() {
        return arg3;
    }

    /**
     * 设置arg3属性的值。
     * 
     */
    public void setArg3(double value) {
        this.arg3 = value;
    }

}
