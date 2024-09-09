package br.com.designpatterns.factory.half2;

import br.com.designpatterns.model.*;

public class IPhone11HalfFactory extends IPhoneHalfFactory {

    public IPhone createIPhone(String level) {
        switch (level) {
            case "standard":
                return new IPhone11();
            case "highEnd":
                return new IPhone11Pro();
            default:
                return null;
        }
    }
}
