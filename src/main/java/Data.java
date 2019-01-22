import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Setter;
@Setter
@XmlRootElement(name = "pierwsze")
public class Data {
    @XmlElement(name = "imie")
    private String name;
    @XmlElement(name = "nazwisko")
    private String surname;
    @XmlElement(name = "wiek")
    private int age;
}
