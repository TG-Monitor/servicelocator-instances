package ai.quantumsense.tgmonitor.servicelocator.instances;

import ai.quantumsense.tgmonitor.entities.Peers;
import ai.quantumsense.tgmonitor.servicelocator.ServiceLocator;

public class PeersLocator implements ServiceLocator<Peers> {

    Peers instance = null;

    @Override
    public void registerService(Peers peers) {
        instance = peers;
    }

    @Override
    public Peers getService() {
        if (instance == null)
            Util.failNotYetRegistered(this.getClass());
        return instance;
    }
}
