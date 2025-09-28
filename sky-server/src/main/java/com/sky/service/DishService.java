package com.sky.service;

import com.sky.dto.*;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface DishService {

    void insertDishWithFlavor(DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);
}
