package br.com.designpatterns.service;

import br.com.designpatterns.factory.half1.IPhone11ProFactory;
import br.com.designpatterns.factory.half1.IPhoneFactory;
import br.com.designpatterns.factory.half1.IPhoneXFactory;
import br.com.designpatterns.factory.half2.IPhone11HalfFactory;
import br.com.designpatterns.factory.half2.IPhoneHalfFactory;
import br.com.designpatterns.factory.half2.IPhoneXHalfFactory;
import br.com.designpatterns.factory.simple.IPhoneSimpleFactory;
import br.com.designpatterns.model.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FactoryMethodService {

    public String noFactoryMethodIphone(String generation, String level) {

        IPhone device = null;

        if (generation.equals("X")) {
            if (level.equals("standard")) {
                device = new IPhoneX();
            } else if (level.equals("highEnd")) {
                device = new IPhoneXsMax();
            }
        } else if (generation.equals("11")) {
            if (level.equals("standard")) {
                device = new IPhone11();
            } else if (level.equals("highEnd")) {
                device = new IPhone11Pro();
            }
        }

        assert device != null;
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device.toString();

    }

    public String halfFactoryMethodIphone() {

        IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
        IPhoneFactory iPhone11ProFactory = new IPhone11ProFactory();

        return iPhoneXFactory.orderIPhone().toString() + "-" +iPhone11ProFactory.orderIPhone().toString();
    }

    public String half1FactoryMethodIphone(String level) {

        IPhoneHalfFactory iPhoneXHalfFactory = new IPhoneXHalfFactory();
        IPhoneHalfFactory iPhone11HalfFactory = new IPhone11HalfFactory();

        return iPhoneXHalfFactory.orderIPhone(level).toString()+" - "+iPhone11HalfFactory.orderIPhone(level).toString();
    }

    public String simpleFactoryMethodIphone(String generation, String level) {
        return IPhoneSimpleFactory.orderIPhone(generation, level).toString();
    }
}
