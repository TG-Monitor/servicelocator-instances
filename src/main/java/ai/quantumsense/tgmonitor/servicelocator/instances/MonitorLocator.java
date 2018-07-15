package ai.quantumsense.tgmonitor.servicelocator.instances;

import ai.quantumsense.tgmonitor.monitor.Monitor;
import ai.quantumsense.tgmonitor.servicelocator.ServiceLocator;

public class MonitorLocator implements ServiceLocator<Monitor> {

    private Monitor instance = null;

    @Override
    public void registerService(Monitor monitor) {
        instance = monitor;
    }

    @Override
    public Monitor getService() {
        if (instance == null)
            Util.failNotYetRegistered(this.getClass());
        return instance;
    }
}
