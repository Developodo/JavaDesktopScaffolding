package edu.developodo.test;

import edu.developodo.model.connection.ConnectionProperties;
import edu.developodo.utils.XMLManager;

public class saveConnection {
    public static void main(String[] args) {
        ConnectionProperties c = new ConnectionProperties("localhost","3306","library","root","root");
        XMLManager.writeXML(c,"connection.xml");
    }
}
