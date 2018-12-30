package com.apurv.shoppingbackend.daoImpl;

import com.apurv.shoppingbackend.dao.CategoryDAO;
import com.apurv.shoppingbackend.dto.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

    private static List<Category> categories = new ArrayList<>();

    static {
        Category category = new Category();

        //first category
        category.setId(1);
//        category.setName("Televison");
//        category.setDescription("this is a flat screen tv");
//        category.setImageURL("CAT_1.png");


        categories.add(category);


        /*
         * //second category category=new Category(); category.setId(2);
         * category.setName("Mobile"); category.setDescription("this is a apple phone");
         * category.setImageURL("CAT_2.png");
         *
         *
         * categories.add(category);
         *
         * //third category
         *
         * category=new Category();
         *
         * category.setId(3); category.setName("fridge");
         * category.setDescription("this is a double door fridge");
         * category.setImageURL("CAT_3.png");
         *
         *
         * categories.add(category);
         *
         * //fourth category
         *
         * category=new Category(); category.setId(4);
         * category.setName("washing machine");
         * category.setDescription("this is an automatic washing machine ");
         * category.setImageURL("CAT_4.png");
         *
         *
         * categories.add(category);
         *
         */
    }

    @Override
    public List<Category> list() {
        // TODO Auto-generated method stub
        return categories;
    }

}