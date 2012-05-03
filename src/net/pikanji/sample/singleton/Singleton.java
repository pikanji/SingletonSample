package net.pikanji.sample.singleton;

public abstract class Singleton {
    protected boolean mIsAnotherInstance = false;

    public String sayHello() {
        if (mIsAnotherInstance) {
            
            return "hello from another " + this.getClass().getName() + " instance";
        } else {
            return "hello from original " + this.getClass().getName() + " instance";
        }
    }
}
