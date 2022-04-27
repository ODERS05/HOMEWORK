package dao;

import entity.NewsCategoryEntity;

import java.util.List;

public interface NewscategoryDao {
    Long create(NewsCategoryEntity nc);
    NewsCategoryEntity updateCategory(Long id, NewsCategoryEntity nc);
    List<NewsCategoryEntity> showCategories();
}
