package ro.fastrackit.classroom.c7;

import ro.fastrackit.classroom.Human;

public class Box<T extends Human> {
    T genericObj;

    public Box(T genericObj){
        this.genericObj = genericObj;
    }

    public T getT() {
        return genericObj;
    }

    public void setT(T genericObj) {
        this.genericObj = genericObj;
    }
}
