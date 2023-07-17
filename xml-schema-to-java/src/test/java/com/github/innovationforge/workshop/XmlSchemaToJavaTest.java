package com.github.innovationforge.workshop;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class XmlSchemaToJavaTest {

    private ObjectFactory objectFactory;

    @BeforeEach
    void setUp(){
        objectFactory = new ObjectFactory();
    }

    @Test
    public void testSomeFunctionality() {
        // Create an instance of your JAXB class
        Example ExampleJAXBObject = objectFactory.createExample();

        // Set values and perform operations on the object
        ExampleJAXBObject.setAge(40);
        ExampleJAXBObject.setName("John");

        // Assert expected results using assertions
        assertEquals(40, ExampleJAXBObject.getAge());
        assertEquals("John", ExampleJAXBObject.getName());
    }
}
