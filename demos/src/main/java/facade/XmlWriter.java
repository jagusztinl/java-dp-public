package facade;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class XmlWriter {

    public String writeXml(Object object) {
        try {
            JAXBContext ctx = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = ctx.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter writer = new StringWriter();
            marshaller.marshal(object, writer);
            return writer.toString();
        }
        catch (JAXBException je) {
            throw new IllegalStateException("Cannot write to xml", je);
        }
    }
}
