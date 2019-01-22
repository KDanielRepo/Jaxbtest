
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

@Getter
@Setter

public class XmlCreator {
    Data data = new Data();
    public void create(){
        data.setName("daniel");
        data.setSurname("kuc");
        data.setAge(21);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(data,System.out);
            marshaller.marshal(data,new File("./Test.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
