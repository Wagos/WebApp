/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ёжик
 */
@Deprecated
@XmlRootElement(name = "Connection")
public class DBConnectionProperties {

    private String dbName;

    private String url;

    private String port;

    private String login;

    private String password;

    @XmlAttribute(name = "dbName")
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    @XmlElement(name = "login")
    public void setLogin(String login) {
        this.login = login;
    }

    @XmlElement(name = "password")
    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement(name = "port")
    public void setPort(String port) {
        this.port = port;
    }

    @XmlElement(name = "URL")
    public void setUrl(String url) {
        this.url = url;
    }


    public String getDbName() {
        return dbName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getPort() {
        return port;
    }

    public String getUrl() {
        return url;
    }

}
