package br.com.designpatterns.controller;

import br.com.designpatterns.service.FactoryMethodService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class FactoryMethodControllerTest {

    @InjectMocks
    private FactoryMethodController factoryMethodController;

    @Mock
    private FactoryMethodService factoryMethodService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNoFactoryMethod() {
        String expectedResponse = "Expected Response";
        when(factoryMethodService.noFactoryMethodIphone("X", "standard")).thenReturn(expectedResponse);

        ResponseEntity<String> response = factoryMethodController.noFactoryMethod();

        assertEquals(expectedResponse, response.getBody());
    }

    @Test
    public void testHalfFactoryMethod() {
        String expectedResponse = "Expected Response";
        when(factoryMethodService.halfFactoryMethodIphone()).thenReturn(expectedResponse);

        ResponseEntity<String> response = factoryMethodController.halfFactoryMethod();

        assertEquals(expectedResponse, response.getBody());
    }

    @Test
    public void testHalfFactoryMethod1() {
        String expectedResponse = "Expected Response";
        when(factoryMethodService.half1FactoryMethodIphone("standard")).thenReturn(expectedResponse);

        ResponseEntity<String> response = factoryMethodController.halfFactoryMethod1();

        assertEquals(expectedResponse, response.getBody());
    }

    @Test
    public void testSimpleFactoryMethod() {
        String expectedResponse = "Expected Response";
        when(factoryMethodService.simpleFactoryMethodIphone("X", "standard")).thenReturn(expectedResponse);

        ResponseEntity<String> response = factoryMethodController.simpleFactoryMethod();

        assertEquals(expectedResponse, response.getBody());
    }
}