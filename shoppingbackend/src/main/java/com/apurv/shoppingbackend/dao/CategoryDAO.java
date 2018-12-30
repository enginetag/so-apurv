package com.apurv.shoppingbackend.dao;

import com.apurv.shoppingbackend.dto.Category;

import java.util.List;

/**
 * @author michael.malevannyy@gmail.com, 30.12.2018
 */

public interface CategoryDAO {
    List<Category> list();
}
