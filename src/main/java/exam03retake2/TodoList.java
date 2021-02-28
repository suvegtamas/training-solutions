package exam03retake2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {
    private List<Todo> todos = new ArrayList<>();

    public int getNumberOfItemsLeft() {
        return (int) todos.stream().filter(t -> t.getState()==State.NON_COMPLETED).count();
    }

    public List<Todo> getTodos() {
        return new ArrayList<>(todos);
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public List<String> getMostImportantTodosText() {
        List<String> result = new ArrayList<>();
      List<Todo> sortedTodos = todos.stream().sorted(Comparator.comparing(Todo::getPriority)).collect(Collectors.toList());
      int min = sortedTodos.get(0).getPriority();
      for(Todo t : sortedTodos) {
          if(t.getPriority() == min) {
              result.add(t.getText());
          }
      }
      return result;
    }

    public void deleteCompleted() {
        todos.removeIf(t -> t.getState() == State.COMPLETED);
    }
}
