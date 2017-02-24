

	
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainLibro {

	
	public static void mostrar() throws SAXException, FileNotFoundException, IOException{

		XMLReader reader = XMLReaderFactory.createXMLReader();
		ParserLibroXML parserlibro = new ParserLibroXML();
		
		reader.setContentHandler(parserlibro);
		
		reader.parse(new InputSource(new FileInputStream("libros.xml")));
		System.out.println("el numero de libros en HashMap es " +ParserLibroXML.mapa_libros.size());
		
	}
	public static void main(String[] args) throws FileNotFoundException, SAXException, IOException {
		
	mostrar();

	}
	
}


