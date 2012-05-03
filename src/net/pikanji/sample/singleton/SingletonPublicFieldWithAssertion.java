package net.pikanji.sample.singleton;

class SingletonPublicFieldWithAssertion extends Singleton {
    public static final SingletonPublicFieldWithAssertion INSTANCE = new SingletonPublicFieldWithAssertion();
    private SingletonPublicFieldWithAssertion() {
        if (null != INSTANCE) {
            throw new AssertionError();
        }
    }

    public String sayHello() {
        if (this == INSTANCE) {
            return "hello from original " + this.getClass().getName() + " instance";            
        } else {
            return "hello from another " + this.getClass().getName() + " instance";
        }
    }
}