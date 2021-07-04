package intuit;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {
    private Singleton singletonInstance;

    private Singleton(){
    }

    public Singleton getInstance() {
        if(singletonInstance == null) {
            synchronized (this) {
                if (singletonInstance == null) {
                    singletonInstance = new Singleton();
                }
            }
        }

        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singletonInstance; // or throw exception
    }

    protected Object readResolve() {
        return singletonInstance;
    }

    public static void main(String[] args) {

    }
}
