package ai.quantumsense.tgmonitor.servicelocator.instances;

import ai.quantumsense.tgmonitor.monitor.LoginCodePrompt;
import ai.quantumsense.tgmonitor.servicelocator.ServiceLocator;

public class LoginCodePromptLocator implements ServiceLocator<LoginCodePrompt> {

    LoginCodePrompt instance = null;

    @Override
    public void registerService(LoginCodePrompt loginCodePrompt) {
        instance = loginCodePrompt;
    }

    @Override
    public LoginCodePrompt getService() {
        if (instance == null)
            Util.failNotYetRegistered(this.getClass());
        return instance;
    }
}
