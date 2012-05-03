package net.pikanji.sample.singleton;

public class SingletonStaticFactoryMethod {
    private static final SingletonStaticFactoryMethod INSTANCE = new SingletonStaticFactoryMethod();
    private SingletonStaticFactoryMethod() {
        if (null != INSTANCE) {
            throw new AssertionError();
        }
    }
    
    public static SingletonStaticFactoryMethod getInstance() {
        return INSTANCE;
    }

    public String sayHello() {
        if (this == INSTANCE) {
            return "hello from original " + this.getClass().getName() + " instance";            
        } else {
            return "hello from another " + this.getClass().getName() + " instance";
        }
    }
}
