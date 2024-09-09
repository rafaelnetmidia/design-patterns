package br.com.designpatterns.factory.half1;

import br.com.designpatterns.model.IPhone;
import br.com.designpatterns.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
