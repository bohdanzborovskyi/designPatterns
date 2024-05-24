package org.example.Structural.Composite;

import java.util.ArrayList;

public class TaskList implements Task{

    private String taskListTitle;
    private ArrayList<Task> taskList;

    public TaskList(String taskListTitle) {
        this.taskList = new ArrayList<>();
        this.taskListTitle = taskListTitle;
    }

    @Override
    public String getTitle() {
        return this.taskListTitle;
    }

    @Override
    public void setTitle(String title) {
        this.taskListTitle = title;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(Task task) {
        taskList.remove(task);
    }

    @Override
    public void display() {
        System.out.println("Task List: " + taskListTitle);
        for (Task task : taskList) {
            task.display();
        }
    }
}
