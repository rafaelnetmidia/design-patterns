package br.com.designpatterns.factory.half1;

import br.com.designpatterns.model.IPhone;
import br.com.designpatterns.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
