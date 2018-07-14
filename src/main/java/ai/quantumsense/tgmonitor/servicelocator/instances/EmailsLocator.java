package ai.quantumsense.tgmonitor.servicelocator.instances;

import ai.quantumsense.tgmonitor.entities.Emails;
import ai.quantumsense.tgmonitor.servicelocator.ServiceLocator;

public class EmailsLocator implements ServiceLocator<Emails> {

    private Emails instance = null;

    @Override
    public void registerService(Emails emails) {
        instance = emails;
    }

    @Override
    public Emails getService() {
        if (instance == null)
            Util.failNotYetRegistered(this.getClass());
        return instance;
    }
}
