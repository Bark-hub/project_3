package com.company;

import java.util.*;

public class Collection {

    protected ArrayList<Task> ToDo = new ArrayList<>();

    public void addingTask(Task something){
        ToDo.add(something);
    }
}
