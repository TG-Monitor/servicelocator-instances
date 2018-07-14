package ai.quantumsense.tgmonitor.servicelocator.instances;

import ai.quantumsense.tgmonitor.entities.Patterns;
import ai.quantumsense.tgmonitor.servicelocator.ServiceLocator;

public class PatternsLocator implements ServiceLocator<Patterns> {

    private Patterns instance = null;

    @Override
    public void registerService(Patterns patterns) {
        instance = patterns;
    }

    @Override
    public Patterns getService() {
        if (instance == null)
            Util.failNotYetRegistered(this.getClass());
        return instance;
    }
}