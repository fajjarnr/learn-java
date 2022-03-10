public class AplikasiTodoList {
    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     * manampilkan todo list
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar: Aplikasi Todo List";
        showTodoList();
    }

    /**
     *  menambah todo ke list
     */
    public static void addTodoList(String todo){
        // apakah model penuh ?
        var isFull = true;
        for (var i = 0; i < model.length; i++) {
            if(model[i] == null){
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, resize array 2x lipat
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambah ke posisi yang data array nya null
        for (var i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++) {
            addTodoList("todo ke-" + i);
        }

        showTodoList();
    }

    /**
     *  menghapus todo list
     */
    public static boolean removeTodoList(Integer number){
        if((number - 1) >= model.length){
            return false;
        }else if(model[number - 1] == null){
            return false;
        }else {
            for (int i = (number - 1); i < model.length; i++) {
                if(i == model.length - 1){
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }

            return true;
        }
    }

    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("nama");
        System.out.println("Hai, " + name);
    }

    /**
     * menampilkan view todo list
     */
    public static void viewShowTodoList(){
        while (true){
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            var input = input("pilih");

            if(input.equals("1")){
                viewAddTodoList();
            }else if(input.equals("2")){
                viewRemoveTodoList();
            }else if(input.equals("3")){
                break;
            }else {
                System.out.println("pilihan tidak ada");
            }
        }
    }

    public static void testViewTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        viewShowTodoList();
    }

    /**
     * menampilkan view menambahkan todo list
     */
    public static void viewAddTodoList(){
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo (x jika batal)");

        if(todo.equals("x")){
            // batal
        }else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList(){
        viewAddTodoList();
        showTodoList();
    }

    /**
     * menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList(){
        System.out.println("HAPUS TODOLIST");
        showTodoList();

        var number = input("Nomor yang dihapus (x jika batal)");

        if(number.equals("x")){

        }else {
           boolean success = removeTodoList(Integer.valueOf(number));
           if(!success){
               System.out.println("gagal menghapus todolist : "+ number);
           }
        }
    }

    public static void testViewRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");

        showTodoList();
        viewRemoveTodoList();
        showTodoList();
    }
}
