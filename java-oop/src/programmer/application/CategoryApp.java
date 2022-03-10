package programmer.application;

import programmer.data.Category;

public interface CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("1");
        category.setId(null);
        category.setExpensive(true);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());

    }
}
