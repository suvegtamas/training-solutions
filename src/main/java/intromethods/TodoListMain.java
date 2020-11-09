package intromethods;

import java.util.Arrays;

public class TodoListMain {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.addTodo("Feed the dog");
        todoList.addTodo("Learn");
        todoList.addTodo("Learn More");
        todoList.addTodo("Do the dishes");

        System.out.println(todoList);

        todoList.finishTodos("Feed the dog");
        todoList.finishAllTodos(Arrays.asList("Learn", "Learn More"));


        System.out.println(todoList);

        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.numberOfFinishedTodos());



    }
}
