package az.coftea.service;

import az.coftea.model.Todo;
import az.coftea.repository.TodoRepository;
import az.coftea.rest.TodoDto;
import az.coftea.rest.TodoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{
    private final TodoRepository repository;

    @Override
    public TodoResponse todoList() {
        List<Todo> todoList=repository.findAll();
        List<TodoDto> dtoList=new ArrayList<>();
        for(Todo t:todoList){
            TodoDto dto=convertToDto(t);
            dtoList.add(dto);
        }
        return TodoResponse.builder().todos(dtoList).build();
    }

    @Override
    public TodoDto getTodo(int id) {
        Todo todo=repository.getReferenceById(id);
        return convertToDto(todo);
    }

    @Override
    public void insert(String name) {
    Todo todo=new Todo();
    todo.setName(name);
    repository.save(todo);
    }

    @Override
    public void delete(int id) {
    repository.deleteById(id);
    }

    @Override
    public void update(String name, int id) {
    Todo todo=repository.getReferenceById(id);
    todo.setName(name);
    repository.save(todo);
    }
    private TodoDto convertToDto(Todo todo){
        return TodoDto.builder().id(todo.getId())
                .name(todo.getName()).build();
    }
}
