package com.cystrix.blog.dao;

import com.cystrix.blog.entity.ArticleCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: chenyue7@foxmail.com
 * @date: 10/7/2023
 * @description:
 */
@Repository
public interface ArticleCategoryDao {

    void insert(ArticleCategory articleCategory);

   void deleteByArticleIdAndCategoryId(ArticleCategory articleCategory);

   List<Integer> selectArticleIdByCategoryId(Integer categoryId);
}
