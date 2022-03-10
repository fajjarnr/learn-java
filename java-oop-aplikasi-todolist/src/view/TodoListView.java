package view;

import service.TodoListService;
import utils.InputUtil;

public class TodoListView {
    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList(){
        while (true){
            todoListService.showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            var input = InputUtil.input("pilih");

            if(input.equals("1")){
                addTodoList();
            }else if(input.equals("2")){
                removeTodoList();
            }else if(input.equals("3")){
                break;
            }else {
                System.out.println("pilihan tidak ada");
            }
        }
    }

    public void addTodoList(){
        System.out.println("MENAMBAH TODOLIST");

        var todo = InputUtil.input("Todo (x jika batal)");

        if(todo.equals("x")){
            // batal
        }else {
            todoListService.addTodoList(todo);
        }
    }

    public void removeTodoList(){
        System.out.println("HAPUS TODOLIST");
        todoListService.showTodoList();

        var number = InputUtil.input("Nomor yang dihapus (x jika batal)");

        if(number.equals("x")){
            // batal
        }else {
            todoListService.removeTodoList(Integer.valueOf(number));
        }
    }
}
