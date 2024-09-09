package br.com.designpatterns.factory.half2;

import br.com.designpatterns.model.*;

public class IPhoneXHalfFactory extends IPhoneHalfFactory {

    public IPhone createIPhone(String level) {
        switch (level) {
            case "standard":
                return new IPhoneX();
            case "highEnd":
                return new IPhoneXsMax();
            default:
                return null;
        }
    }
}
