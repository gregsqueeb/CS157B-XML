/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author mr.nam
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User_type")
public class UserType {
    @XmlElement(required = true)
    protected String name;
    
    public String getName() {
        return name;
    }
    public void setName(String value) {
        this.name = value;
    }
   
   
}
