package com.singtel.assignment.behaviours.impl.Singable;
import com.singtel.assignment.behaviours.Singable;

public class RoosterSound extends CanSing {

    @Override
    public void sing() {
        System.out.println(getSound("rooster"));
    }
}
