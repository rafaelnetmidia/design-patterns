package br.com.designpatterns.factory.half1;

import br.com.designpatterns.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone() {

        IPhone device = null;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone();
}
