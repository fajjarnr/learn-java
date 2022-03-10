package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository{

    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    public boolean isFull(){
        var isFull = true;

        for (var i = 0; i < data.length; i++) {
            if(data[i] == null){
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        return isFull;
    }

    public void resizeIsFull(){
        // jika penuh, resize array 2x lipat
        if(isFull()){
            var temp = data;
            data = new TodoList[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(TodoList todolist) {
        resizeIsFull();

        // tambah ke posisi yang data array nya null
        for (var i = 0; i < data.length; i++){
            if(data[i] == null){
                data[i] = todolist;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if((number - 1) >= data.length){
            return false;
        }else if(data[number - 1] == null){
            return false;
        }else {
            for (int i = (number - 1); i < data.length; i++) {
                if(i == data.length - 1){
                    data[i] = null;
                }else {
                    data[i] = data[i + 1];
                }
            }

            return true;
        }
    }
}
