package ai.quantumsense.tgmonitor.servicelocator.instances;

public class Util {
    static void failNotYetRegistered(Class cl) {
        throw new RuntimeException("Attempting to get instance of type " + cl.getSimpleName() + ", but has not yet been registered");
    }
}
