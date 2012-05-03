package net.pikanji.sample.singleton;

class SingletonPublicField extends Singleton {
    public static final SingletonPublicField INSTANCE = new SingletonPublicField();
    private SingletonPublicField() {
    }

    public String sayHello() {
        if (this == INSTANCE) {
            return "hello from original " + this.getClass().getName() + " instance";            
        } else {
            return "hello from another " + this.getClass().getName() + " instance";
        }
    }
}