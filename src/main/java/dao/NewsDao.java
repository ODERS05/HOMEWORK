package dao;

import entity.NewsEntity;

import java.util.List;

public interface NewsDao {
    Long create(NewsEntity newsEntity);
    List<NewsEntity> showNews();
    String delete(Long id);
    NewsEntity changeNewsTextAndHeaderById(NewsEntity newsEntity, Long id);
    List<NewsEntity> search(String text);
}
