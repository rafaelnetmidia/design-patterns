package br.com.designpatterns.service;

import br.com.designpatterns.factory.half1.IPhoneFactory;
import br.com.designpatterns.factory.half2.IPhoneHalfFactory;
import br.com.designpatterns.factory.simple.IPhoneSimpleFactory;
import br.com.designpatterns.model.IPhone;
import br.com.designpatterns.model.IPhone11;
import br.com.designpatterns.model.IPhone11Pro;
import br.com.designpatterns.model.IPhoneX;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FactoryMethodServiceTest {

    @InjectMocks
    private FactoryMethodService factoryMethodService;

    @Mock
    private IPhoneFactory iPhoneFactory;

    @Mock
    private IPhoneHalfFactory iPhoneHalfFactory;

    @Mock
    private IPhoneSimpleFactory iPhoneSimpleFactory;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNoFactoryMethodIphone() {
        IPhone iPhoneX = mock(IPhoneX.class);
        when(iPhoneX.toString()).thenReturn("IPhoneX");
        when(iPhoneFactory.orderIPhone()).thenReturn(iPhoneX);

        String result = factoryMethodService.noFactoryMethodIphone("X", "standard");

        assertNotNull(result);
    }

    @Test
    public void testHalfFactoryMethodIphone() {
        IPhone iPhoneX = mock(IPhoneX.class);
        IPhone iPhone11Pro = mock(IPhone11Pro.class);
        when(iPhoneX.toString()).thenReturn("IPhoneX");
        when(iPhone11Pro.toString()).thenReturn("IPhone11Pro");
        when(iPhoneFactory.orderIPhone()).thenReturn(iPhoneX).thenReturn(iPhone11Pro);

        String result = factoryMethodService.halfFactoryMethodIphone();

        assertNotNull(result);
    }

    @Test
    public void testHalf1FactoryMethodIphone() {
        IPhone iPhoneX = mock(IPhoneX.class);
        IPhone iPhone11 = mock(IPhone11.class);
        when(iPhoneX.toString()).thenReturn("IPhoneX");
        when(iPhone11.toString()).thenReturn("IPhone11");
        when(iPhoneHalfFactory.orderIPhone("standard")).thenReturn(iPhoneX).thenReturn(iPhone11);

        String result = factoryMethodService.half1FactoryMethodIphone("standard");

        assertNotNull(result);
    }

}
