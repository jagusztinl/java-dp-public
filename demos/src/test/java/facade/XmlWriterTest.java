package facade;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class XmlWriterTest {

    @Test
    public void testWrite() {
        Employee employee = new Employee(11, "John Doe");
        XmlWriter xmlWriter = new XmlWriter();
        String xml = xmlWriter.writeXml(employee);
        assertThat(xml.indexOf("<name>John Doe</name>") >= 0, equalTo(true));
    }
}
