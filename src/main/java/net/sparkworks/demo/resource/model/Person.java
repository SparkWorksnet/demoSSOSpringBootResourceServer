package net.sparkworks.demo.resource.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "persons")
public class Person {
    
    @Id
    private String id;
    
    private String name;
}
