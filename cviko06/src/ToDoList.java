import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> todos;

    public ToDoList() {
        this.todos = new ArrayList<>();
    }

    public void add(String todo){
        this.todos.add(todo);
    }

    public int getNumberOfTodos(){
        return this.todos.size();

    }

    public String getLongestTodo(){
        /*String result = null;

        for (String tmpTodo : this.todos){
            if(result == null || tmpTodo.length()>result.length()){
                result = tmpTodo;

            }
        }

        return result;
         */
        int maxLength = 0;
        int index = 0 ;
        for (int i = 0; i < this.todos.size(); i++){
            String tmpTodo = this.todos.get(i);
            if(tmpTodo.length() > maxLength){
                index = i;

            }
        }
        return this.todos.get(index);

    }

}
