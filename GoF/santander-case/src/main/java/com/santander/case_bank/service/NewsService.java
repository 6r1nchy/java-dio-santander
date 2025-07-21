package com.santander.case_bank.service;

import com.santander.case_bank.model.News;
import java.util.List;

public interface NewsService {
    List<News> getAllNews();
    News getNewsById(Long id);
    News createNews(News news);
    void deleteNews(Long id);
}
