
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>calculateTax complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡarg0���Ե�ֵ��
     * 
     */
    public double getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     * 
     */
    public void setArg0(double value) {
        this.arg0 = value;
    }

    /**
     * ��ȡarg1���Ե�ֵ��
     * 
     */
    public double getArg1() {
        return arg1;
    }

    /**
     * ����arg1���Ե�ֵ��
     * 
     */
    public void setArg1(double value) {
        this.arg1 = value;
    }

    /**
     * ��ȡarg2���Ե�ֵ��
     * 
     */
    public double getArg2() {
        return arg2;
    }

    /**
     * ����arg2���Ե�ֵ��
     * 
     */
    public void setArg2(double value) {
        this.arg2 = value;
    }

    /**
     * ��ȡarg3���Ե�ֵ��
     * 
     */
    public double getArg3() {
        return arg3;
    }

    /**
     * ����arg3���Ե�ֵ��
     * 
     */
    public void setArg3(double value) {
        this.arg3 = value;
    }

}
