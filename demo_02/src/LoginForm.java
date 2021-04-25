import javax.swing.*;

import java.lang.reflect.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class LoginForm {
    private static String className = "";

    public static void display() {
        // Create a Java Frame
        JFrame frame = new JFrame("GoF(JAVA version) ex2");
        // Set the width and height of frame
        frame.setSize(400, 200);
        // Not allow resize
        frame.setResizable(false);
        // Set CloseOperation (Directly exit JVM)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a panel to add other components
        JPanel panel = new JPanel();
        // Add panel to the frame
        frame.add(panel);
        // Add components into the panle
        addComponents(panel);
        // Set frame visible
        frame.setVisible(true);
    }

    private static void addComponents(JPanel panel) {
        // Set panel to null
        panel.setLayout(null);

        // Create user Label
        JLabel userLabel = new JLabel("User:");
        // Set font
        userLabel.setFont(new java.awt.Font("", 1, 24));
        // setBounds(x, y, width, height)
        userLabel.setBounds(30, 20, 80, 25);
        panel.add(userLabel);

        // Create user Text area
        JTextField userText = new JTextField(20);
        userText.setFont(new java.awt.Font("", 0, 20));
        userText.setBounds(180, 20, 180, 25);
        panel.add(userText);

        // Add password lable
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new java.awt.Font("", 1, 24));
        passwordLabel.setBounds(30, 65, 120, 25);
        panel.add(passwordLabel);

        // Add password text area
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setFont(new java.awt.Font("", 0, 20));
        passwordText.setBounds(180, 65, 180, 25);
        panel.add(passwordText);

        try {
            // Reflect my own JButton
            Class abstractButton = Class.forName(className);
            Method method = abstractButton.getMethod("setBounds", int.class, int.class, int.class, int.class);
            Constructor constructor = abstractButton.getConstructor();
            Object object = constructor.newInstance();
            method.invoke(object, 30, 115, 100, 30);
            panel.add((AbstractButton) object);
            method = abstractButton.getMethod("view");
            method.invoke(object);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        // Create DocumentBuilderFactory Instance
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // Create DocumentBuilder
        DocumentBuilder db = dbf.newDocumentBuilder();
        File file = new File("gof_java/ex2/src/config.xml");
        Document document = db.parse(file);
        className = document.getElementsByTagName("className").item(0).getFirstChild().getNodeValue();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                display();
            }
        });
    }
}