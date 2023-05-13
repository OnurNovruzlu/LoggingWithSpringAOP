package az.coftea.service;

import az.coftea.rest.TodoDto;
import az.coftea.rest.TodoResponse;

import java.util.List;

public interface TodoService {
    TodoResponse todoList();
    TodoDto getTodo(int id);
    void insert(String name);
    void delete(int id);
    void update(String name,int id);
}
