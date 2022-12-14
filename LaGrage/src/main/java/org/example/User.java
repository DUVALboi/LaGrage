package org.example;

import com.mongodb.client.FindIterable;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.io.IOException;

import static org.example.Database.*;

public class User{

    String userName;
    String FirstName;
    String LastName;
    String email;
    String password;
    Boolean isAdmin;

    public User(String userName, String firstName, String lastName, String email, String password, Boolean isAdmin) {
        this.userName = userName;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }
    public Document getDocument() {
        Document user = new Document("_id", new ObjectId());
        user.append("userName", this.userName);
        user.append("fistName", this.FirstName);
        user.append("lastName", this.LastName);
        user.append("email", this.email);
        user.append("password", this.password);
        user.append("isAdmin", this.isAdmin);

        return user;
    }

}
