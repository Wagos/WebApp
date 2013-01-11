/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parsers;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Ёжик
 */
abstract public class AbstractParser {
    private String errorMessage;

    AbstractParser() {

    }

    protected Document getDocument(InputStream stream) {
        try {
            DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = f.newDocumentBuilder();
            return builder.parse(stream);
        } catch (SAXException | IOException | ParserConfigurationException ex) {
            errorMessage = ex.getMessage();
        }
        return null;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    protected void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


    public Object parse(InputStream stream) {
        return null;
    }

}
