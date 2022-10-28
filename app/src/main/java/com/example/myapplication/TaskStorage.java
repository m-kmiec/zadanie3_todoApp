package com.example.myapplication;

import android.os.Build;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();

    private final List<Task> tasks;

    public static TaskStorage getInstance() {
        return taskStorage;
    }

    private TaskStorage() {
        tasks = new ArrayList<>();
        for (int i = 1; i <= 150; i++) {
            Task task = new Task();
            task.setName("Pilne zadanie numer " + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTask(UUID taskID) {
        Task task = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            task =  tasks.stream().
                    filter(certainTask -> taskID.equals(certainTask.getId())).
                    findAny().
                    orElse(null);
        }
        return task;
    }
}
