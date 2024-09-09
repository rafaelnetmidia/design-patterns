package br.com.designpatterns.factory.half1;

import br.com.designpatterns.model.IPhone;
import br.com.designpatterns.model.IPhoneXsMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneXsMax();
    }
}
