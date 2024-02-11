package com.dkilchytskyi.gymanalytics.model;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@AllArgsConstructor
public class User {
    public String firstName;
    public String lastName;
}
