package com.cystrix.blog.service.impl;

import com.cystrix.blog.dao.ArticleDao;
import com.cystrix.blog.entity.Article;
import com.cystrix.blog.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: chenyue7@foxmail.com
 * @date: 11/7/2023
 * @description:
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleDao articleDao;

    public ArticleServiceImpl(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @Override
    public List<Article> getPagedArticle(Integer pageNum, Integer pageSize) {
        return articleDao.selectPage(pageSize, (pageNum - 1) * pageSize);
    }

    @Override
    public List<Article> getPagedArticleByYear(Integer pageNum, Integer pageSize, Integer year) {
        return articleDao.selectPageByYear(pageSize, (pageNum - 1) * pageSize, year);
    }
}
