/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parsers;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * @author Ёжик
 */
public class RolesDataParser extends AbstractParser {

    @Override
    public ArrayList parse(InputStream stream) {
        Document document = getDocument(stream);
        if (document == null) {
            return null;
        }
        Node node;
        ArrayList roles = new ArrayList();
        NodeList nodes = document.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            node = nodes.item(i);
            switch (node.getNodeName()) {
                case "Roles":
                    nodes = node.getChildNodes();
                    i = 0;
                    break;
                case "role":
                    roles.add(node.getTextContent());
                    break;
            }

        }
        return roles;
    }
}
