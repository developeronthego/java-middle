package middle.lesson26;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbUsage {
	private static final Logger LOGGER = Logger.getLogger(JaxbUsage.class.getName());

	public static void main(String[] args) {
		String directory = "c:\\data\\";
		Question questionOne = new Question(1, "Który z poni¿szych krajów nale¿y do Unii Europejskiej?");
		questionOne.populate(1, "Polska", true);
		questionOne.populate(2, "Serbia", false);
		questionOne.populate(3, "Hiszpania", true);
		questionOne.populate(4, "Norwegia", false);
		Question questionTwo = new Question(2, "Stolica Niemiec jest?");
		questionTwo.populate(1, "Londyn", true);
		questionTwo.populate(2, "Pary¿", false);
		questionTwo.populate(3, "Berlin", false);
		questionTwo.populate(4, "Frankfurt", false);
		convertObjectToXML(questionOne, directory + "question1.xml");
		convertObjectToXML(questionTwo, directory + "question2.xml");
		convertXMLToObject(directory + "question1.xml");
		convertXMLToObject(directory + "question2.xml");
	}

    public static Question convertXMLToObject(String path) {
        LOGGER.info("convertXMLToObject");
        Question entity = null;

        try {
            File file = new File(path);
            LOGGER.info("open file");
			JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            entity = (Question) jaxbUnmarshaller.unmarshal(file);
            LOGGER.info("Result of mapping xml is " + entity.toString());

        } catch (JAXBException e) {
        	LOGGER.log(Level.WARNING, e.getMessage(), e);
        }

        return entity;
    }
    
    public static StringWriter convertObjectToXML(Question entity, String filePath) {
        StringWriter stringWriter = new StringWriter();

        LOGGER.log(Level.INFO, "convertObjectToXML with path {0}", filePath);
        try {
            LOGGER.info("start writing..");
            try {
                checkFile(filePath);
            } catch (IOException e) {
            	LOGGER.log(Level.WARNING, e.getMessage(), e);
            }

            File file = new File(filePath);

            LOGGER.info("created file");
			JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(entity, file);
            jaxbMarshaller.marshal(entity, stringWriter);
        } catch (JAXBException e) {
        	LOGGER.log(Level.WARNING, e.getMessage(), e);
        }

        return stringWriter;
    }
    
    private static void checkFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        if (Files.exists(path)) {
            LOGGER.info("File exist..");
            if (Files.isWritable(path)) {
                Files.deleteIfExists(path);
                LOGGER.info("File deleted..");              
            } else {
                LOGGER.info("File is not writable..");
            }
        } else {
            LOGGER.info("File is not exist..");            
        }
    }
}
