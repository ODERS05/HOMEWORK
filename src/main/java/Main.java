import dao.impl.NewsCategoryDaoImpl;
import dao.impl.NewsDaoImpl;
import entity.NewsCategoryEntity;
import entity.NewsEntity;
import enums.Category;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        NewsDaoImpl newsDao = new NewsDaoImpl();
        NewsCategoryDaoImpl newsCategoryDao = new NewsCategoryDaoImpl();
        NewsCategoryEntity newsCategory = new NewsCategoryEntity("sport");
//        newsCategoryDao.create(newsCategory);
        NewsEntity newsEntity = NewsEntity.builder()
                .newsCategory(newsCategory)
                .newsHeader("Some text")
                .newsText("Nice")
                .postTime(LocalDateTime.now())
                .build();
//        newsDao.create(newsEntity);
        newsDao.search("Some text");
    }
}