SingletonSample
===============

Over View
---------
This demonstrates behavior of 3 different implementations of singleton classes.

GitHub URL: [https://github.com/pikanji/SingletonSample](https://github.com/pikanji/SingletonSample)

### Classes
These implementations all realize singleton class, but some have a vulnerability.
* SingletonPublicField -- this demonstrates making constructors private still fails to prevent from creating multiple instances by reflection.
* SingletonPublicFieldWithAssertion -- this demonstrates the solution to the vulnerability shown by SingletonPublicField.
* SingletonStaticFactoryMethod -- this leaves choice to change it singleton or not without changing its API.
* SingletonEnum -- this is suitable if it should be serializable, but fails to prevent from creating multiple instances by reflection. This is suitable if it should be serializable.
* SampleSingletonActivity -- this is the main class that tests those classes above.