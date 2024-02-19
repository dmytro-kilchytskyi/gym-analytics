package com.dkilchytskyi.gymanalytics.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "exercises")
public class Exercise {
    @Id
    private String id;
    private String name;
}
