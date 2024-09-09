package br.com.designpatterns.factory.half2;

import br.com.designpatterns.model.IPhone;

public abstract class IPhoneHalfFactory {

    public IPhone orderIPhone(String level) {

        IPhone device = null;

        device = createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone(String level);
}
