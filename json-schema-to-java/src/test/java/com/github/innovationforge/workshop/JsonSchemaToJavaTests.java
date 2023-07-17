package com.github.innovationforge.workshop;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class JsonSchemaToJavaTests {

    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp(){
        objectMapper = new ObjectMapper();
    }
    @Test
    public void testJsonSerializationDeserialization() throws Exception {
        // Create an instance of your JSON class
        ExampleSchema jsonObject = new ExampleSchema();
        jsonObject.setId(1);
        jsonObject.setEmail("John.Doe@test.nl");
        jsonObject.setName("John Doe");
        jsonObject.setAdditionalProperty("testprop","testvalue");
        Address address = new Address();
        address.setCity("testCity");
        address.setStreet("TestStreet");
        address.setZipcode("23234234234");
        address.setAdditionalProperty("additional-address-pro", "additional-address-value");
        jsonObject.setAddress(address);

        // Create an ObjectMapper instance
//        ObjectMapper objectMapper = new ObjectMapper();

        // Serialize the object to JSON
        String json = objectMapper.writeValueAsString(jsonObject);

        // Deserialize the JSON back to the object
        ExampleSchema deserializedObject = objectMapper.readValue(json, ExampleSchema.class);

        // Assert expected results using assertions
        assertEquals(1, deserializedObject.getId());
        assertEquals("John Doe", deserializedObject.getName());
        assertEquals("John.Doe@test.nl", deserializedObject.getEmail());
    }
}
