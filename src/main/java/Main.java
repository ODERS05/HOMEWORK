import dao.NewsDao;
import dao.NewscategoryDao;
import dao.impl.NewsCategoryDaoImpl;
import dao.impl.NewsDaoImpl;
import entity.NewsCategoryEntity;
import entity.NewsEntity;
import enums.Category;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        NewsDao newsDao = new NewsDaoImpl();
        NewscategoryDao newscategoryDao = new NewsCategoryDaoImpl();
        NewsCategoryEntity music = NewsCategoryEntity.builder()
                .name(Category.MUSIC)
                .build();
        newscategoryDao.create(music);
        NewsEntity news = NewsEntity.builder()
                .postTime(LocalDateTime.now())
                .newsText("some text")
                .newsHeader("some text")
                .newsCategory(music).build();
        newsDao.create(news);
    }
}