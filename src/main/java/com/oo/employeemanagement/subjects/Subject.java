package com.oo.employeemanagement.subjects;

import com.oo.employeemanagement.observers.Observer;

public interface Subject {

    void registerObserver( Observer observer );
    void removeObserver( Observer observer );
    void notifyObservers();

}
