package controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloControllerTest {
    @Test
    public void should_not_return_null() {
        String result = new HelloController().home();
        assertNotNull(result);
    }
}