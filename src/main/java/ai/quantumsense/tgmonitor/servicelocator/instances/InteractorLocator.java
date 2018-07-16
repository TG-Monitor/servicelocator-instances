package ai.quantumsense.tgmonitor.servicelocator.instances;

import ai.quantumsense.tgmonitor.backend.Interactor;
import ai.quantumsense.tgmonitor.servicelocator.ServiceLocator;

public class InteractorLocator implements ServiceLocator<Interactor> {

    private Interactor instance = null;

    @Override
    public void registerService(Interactor interactor) {
        instance = interactor;
    }

    @Override
    public Interactor getService() {
        if (instance == null)
            Util.failNotYetRegistered(this.getClass());
        return instance;
    }
}
