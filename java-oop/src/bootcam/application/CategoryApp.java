package bootcam.application;

import bootcam.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        category.setId("ID");
        category.setId("Djancook");
        category.setId(null);

        System.out.println(category.getId());
    }
}
