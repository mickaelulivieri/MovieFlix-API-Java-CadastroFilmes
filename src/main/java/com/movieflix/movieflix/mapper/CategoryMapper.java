package com.movieflix.movieflix.mapper;

import com.movieflix.movieflix.entity.Category;
import com.movieflix.movieflix.request.CategoryRequest;
import com.movieflix.movieflix.response.CategoryResponse;
import lombok.experimental.UtilityClass;
import com.movieflix.movieflix.entity.Category;

@UtilityClass
public class CategoryMapper {

    public static Category toCategory(CategoryRequest categoryRequest){
        return Category
                .builder()
                .name(categoryRequest.name())
                .build();
    }

    public static CategoryResponse toCategoryResponse(Category category){
        return CategoryResponse
                .builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}

