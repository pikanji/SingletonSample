package net.pikanji.sample.singleton;

import java.lang.reflect.Constructor;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SampleSingletonActivity extends Activity {
    private static final String LOG_TAG = "SampleSingleton";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        testSingletonPublicField();
        
        testSingletonPublicFieldWithAssertion();
        
        testSingletonStaticFactoryMethod();
        
        testSingletonEnum();
    }
    
    public void testSingletonPublicField() {
        Log.d(LOG_TAG, SingletonPublicField.INSTANCE.sayHello());
        
        Constructor<SingletonPublicField>[] c = SingletonPublicField.class.getDeclaredConstructors();
        try {
            c[0].setAccessible(true);
            SingletonPublicField spf = c[0].newInstance();
            Log.d(LOG_TAG, spf.sayHello());
        } catch (Exception e) {
            Log.e(LOG_TAG, "SingletonPublicField instatiation failed");
            e.printStackTrace();
        }
    }
    
    public void testSingletonPublicFieldWithAssertion() {
        Log.d(LOG_TAG, SingletonPublicFieldWithAssertion.INSTANCE.sayHello());
        
        Constructor<SingletonPublicFieldWithAssertion>[] c = SingletonPublicFieldWithAssertion.class.getDeclaredConstructors();
        try {
            c[0].setAccessible(true);
            SingletonPublicFieldWithAssertion spf = c[0].newInstance();
            Log.d(LOG_TAG, spf.sayHello());
        } catch (Exception e) {
            Log.e(LOG_TAG, "SingletonPublicFieldWithAssertion instatiation failed");
            e.printStackTrace();
        }
    }

    public void testSingletonStaticFactoryMethod() {
        Log.d(LOG_TAG, SingletonStaticFactoryMethod.getInstance().sayHello());
        
        Constructor<SingletonStaticFactoryMethod>[] c = SingletonStaticFactoryMethod.class.getDeclaredConstructors();
        try {
            c[0].setAccessible(true);
            SingletonStaticFactoryMethod spf = c[0].newInstance();
            Log.d(LOG_TAG, spf.sayHello());
        } catch (Exception e) {
            Log.e(LOG_TAG, "SingletonStaticFactoryMethod instatiation failed");
            e.printStackTrace();
        }
    }
    
    public void testSingletonEnum() {
        Log.d(LOG_TAG, SingletonEnum.INSTANCE.sayHello());
        
        Constructor<SingletonEnum>[] c = SingletonEnum.class.getDeclaredConstructors();
        try {
            c[0].setAccessible(true);
            SingletonEnum spf = c[0].newInstance("DUMMY", 0);
            Log.d(LOG_TAG, spf.sayHello());
        } catch (Exception e) {
            Log.e(LOG_TAG, "SingletonEnum instatiation failed");
            e.printStackTrace();
        }
    }
}