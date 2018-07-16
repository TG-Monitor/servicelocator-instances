package ai.quantumsense.tgmonitor.servicelocator.instances;

import ai.quantumsense.tgmonitor.backend.Interactor;
import ai.quantumsense.tgmonitor.servicelocator.ServiceLocator;

public class InteractorLocator implements ServiceLocator<Interactor> {

    private Interactor instance = null;

    @Override
    public void registerService(Interactor interactor) {
        System.out.println("InteractorLocator: registering interactor : " + interactor);
        instance = interactor;
    }

    @Override
    public Interactor getService() {
        System.out.println("InteractorLocator: returning " + instance);
        if (instance == null)
            Util.failNotYetRegistered(this.getClass());
        return instance;
    }
}
