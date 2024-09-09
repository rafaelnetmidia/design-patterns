package br.com.designpatterns.factory.half1;

import br.com.designpatterns.model.IPhone;
import br.com.designpatterns.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
