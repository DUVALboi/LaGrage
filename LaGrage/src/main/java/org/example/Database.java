package org.example;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import javax.print.Doc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Database {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    static String MongoURI = "mongodb+srv://DUVALboi:Babuin1234@cluster0.8l8gsee.mongodb.net/?retryWrites=true&w=majority";
    static String dataBaseName = "LaGrage";
    public static MongoDatabase getDatabase(){
        MongoClient client = MongoClients.create(MongoURI);
        return client.getDatabase(dataBaseName);
    }

    public static MongoCollection getTable(String collectionName){
        return getDatabase().getCollection(collectionName);
    }

    public static String getUserInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static boolean userExists(Document userToFind){
        return getTable("users").countDocuments(userToFind) >= 1;
    }
    public static FindIterable getUser() throws IOException{
        System.out.println("UserName: ");
        String userName = getUserInput();


        Document userToFind = new Document();

        userToFind.append("userName", userName);

        if(userExists(userToFind))
            return null;

        return getTable("users").find(userToFind);
    }
    public static FindIterable LoginUser() throws IOException{
        System.out.println("UserName: ");
        String userName = getUserInput();
        System.out.println("Password");
        String passWord = getUserInput();

        Document userToFind = new Document();

        userToFind.append("userName", userName);
        userToFind.append("password", passWord);

        if(userExists(userToFind))
            return null;

        return getTable("users").find(userToFind);
    }

    public static boolean userValidationDocument(String userName, String email){
        if(userExists(new Document("userName",userName)))
            return true;
        else return userExists(new Document("email", email));
    }

    public static boolean checkEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public static void registerUser() throws IOException {
        System.out.print("UserName: ");
        String userName = getUserInput();
        System.out.print("LastName: ");
        String LastName = getUserInput();
        System.out.print("FirstName: ");
        String FirstName = getUserInput();
        System.out.print("Email: ");
        String email = getUserInput();
        System.out.print("Password: ");
        String password = getUserInput();

        if(!checkEmail(email)){
            System.out.println("Invalid email address");
            registerUser();
            return;
        }

        User newUser = new User(userName, FirstName, LastName, email, password, false);
        if(userValidationDocument(userName, email)){
            System.out.println("User Already Exists");
            registerUser();
            return;
        }
        getTable("users").insertOne(newUser.getDocument());

    }
}
