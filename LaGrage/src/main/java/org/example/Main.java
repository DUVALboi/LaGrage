package org.example;
import com.mongodb.client.*;
import org.bson.Document;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

import java.io.IOException;
import java.util.List;

import static org.example.Database.*;
import org.example.sign_in.*;

import javax.swing.*;

public class Main {


    static Logger root = (Logger) LoggerFactory
            .getLogger(Logger.ROOT_LOGGER_NAME);

    static {
        root.setLevel(Level.OFF);
    }

    public static void main(String[] args) throws IOException {

        JFrame frame = new sign_in().frame1;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

//        printListElements(LoginUser());

//        FindIterable<Document> doc = users.find();

//        printListElements(doc);
    }
}