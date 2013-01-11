/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parsers;

import entity.DBConnectionProperties;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;

/**
 * @author Ёжик
 */
@Deprecated
public class ConnectionDataParser extends AbstractParser {

    @Override
    public DBConnectionProperties parse(InputStream stream) {

        Document document = getDocument(stream);
        if (document == null) {
            return null;
        }

        DBConnectionProperties properties = new DBConnectionProperties();

        Node node;
        NodeList nodes = document.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            node = nodes.item(i);
            switch (node.getNodeName()) {
                case "Connection":
                    properties.setDbName(node.getAttributes().getNamedItem("dbName").getTextContent());
                    nodes = node.getChildNodes();
                    i = 0;
                    break;
                case "URL":
                    properties.setUrl(node.getTextContent());
                    break;
                case "port":
                    properties.setPort(node.getTextContent());
                    break;
                case "login":
                    properties.setLogin(node.getTextContent());
                    break;
                case "password":
                    properties.setPassword(node.getTextContent());
                    break;
            }

        }
        return properties;
    }

}
