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

    static HomePage WelcomeFrame = new HomePage("");
    static JFrame frame = null;

    static Logger root = (Logger) LoggerFactory
            .getLogger(Logger.ROOT_LOGGER_NAME);

    static {
        root.setLevel(Level.OFF);
    }


    public static void changeFrame(String username){
        frame.setVisible(false);
        WelcomeFrame.setUserName(username);
        System.out.println(WelcomeFrame.userName);
        WelcomeFrame.frame1.pack();
        WelcomeFrame.frame1.setVisible(true);
    }

    public static void main(String[] args) throws IOException {


        if(args[0].toString().equals("SignUp"))
            frame = new sign_in().frame1;
        else if (args[0].toString().equals("LogIn")) {
            frame = new asd().frame1;
        }

        WelcomeFrame.frame1.setVisible(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

//        printListElements(LoginUser());

//        FindIterable<Document> doc = users.find();

//        printListElements(doc);
    }
}