package az.coftea.controller;

import az.coftea.rest.TodoDto;
import az.coftea.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("")
public class TodoController {
    private final TodoService service;

    @GetMapping("/")
    public String getIndex(Model model){
        List<TodoDto> todos=service.todoList().getTodos();
        model.addAttribute("todos",todos);
        return "index";
    }
    @PostMapping("/add")
    public String getInsert(@RequestParam("name")String name){
        service.insert(name);
        return "addTodo";
    }
    @PostMapping("/delete")
    public String getDelete(@RequestParam("id")int id,Model model){
        service.delete(id);
        List<TodoDto> todos=service.todoList().getTodos();
        model.addAttribute("todos",todos);
        return "index";
    }
    @PostMapping("/update")
    public String getUpdate(@RequestParam("name")String name,
                            @RequestParam("id")int id,Model model){
        service.update(name,id);
        List<TodoDto> todos=service.todoList().getTodos();
        model.addAttribute("todos",todos);
        return "index";
    }
    @GetMapping("/addTodo")
    public String getAddTodo(){
        return "addTodo";
    }

}
