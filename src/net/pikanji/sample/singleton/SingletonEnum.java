package net.pikanji.sample.singleton;

public enum SingletonEnum {
    INSTANCE;

    private SingletonEnum() {
    }

    public String sayHello() {
        if (this == INSTANCE) {
            return "hello from original " + this.getClass().getName() + " instance";            
        } else {
            return "hello from another " + this.getClass().getName() + " instance";
        }
    }
}
