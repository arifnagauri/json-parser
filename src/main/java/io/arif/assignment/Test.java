package io.arif.assignment;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.arif.assignment.model.Property;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        parseJson();

    }

    /**
     * I have chosen the {@link Property} entity such that all common use cases are covered
     */
    private static void parseJson() {
        // test json data for a single Property entity...
        String jsonString = """ 
                    {
                        "id": "1",
                        "name": "Blue Heights",
                        "price": "2.5",
                        "priceDenomination": "Cr",
                        "description": "Lorem Ipsum Dollar dummy",
                        "averageRating": "3",
                        "location": { "id" : "1",
                                     "address": "Lorem Ipsum Dollar"
                                    },
                        "images": [
                                    { "id": "1",
                                      "imageUrl": "https://xyz-dummy-non-existing-url.com",
                                      "size": "10"
                                    },
                                    { "id": "2",
                                      "imageUrl": "https://xyz-dummy-non-existing-url.com",
                                      "size": "10"
                                    },
                                    { "id": "3",
                                      "imageUrl": "https://xyz-dummy-non-existing-url.com",
                                      "size": "10"
                                    }
                                   ]
                    }
                    """;

        // this file contains valid list json data...
        File jsonFile = new File("src/main/resources/data.json");

        ObjectMapper mapper = new ObjectMapper();

        Property property = null;
        List<Property> properties = null;

        try {
            property = mapper.readValue(jsonString, Property.class);
            System.out.println("jsonString to Property Entity:");
            System.out.println(property.toString());

            if (jsonFile.exists()) {
                properties = mapper.readValue(jsonFile, new TypeReference<>() {});
                System.out.println("jsonFile, which contains a list of objects, to list of Property Entities:");
                properties.forEach(System.out::println);
            }

        } catch (IOException e) {
            throw new RuntimeException("Invalid Json content", e);
        }
    }

}
