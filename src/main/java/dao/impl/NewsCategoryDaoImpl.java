package dao.impl;

import dao.NewscategoryDao;
import entity.NewsCategoryEntity;
import org.hibernate.Session;
import utils.HibernateUtils;

import java.util.List;

public class NewsCategoryDaoImpl implements NewscategoryDao {
    @Override
    public Long create(NewsCategoryEntity nc){
        try {
            Session session = HibernateUtils.sessionFactory.openSession();
            session.beginTransaction();
            session.save(nc);
            session.getTransaction().commit();
            session.close();
            System.out.println("Успешно создан " + nc);
            return nc.getId();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public NewsCategoryEntity updateCategory(Long id, NewsCategoryEntity nc) {
        try {
            Session session = HibernateUtils.sessionFactory.openSession();
            session.beginTransaction();
            NewsCategoryEntity nc1 = (NewsCategoryEntity) session.load(NewsCategoryEntity.class, id);
            nc1.setName(nc.getName());
            session.beginTransaction().commit();
            session.close();
            System.out.println("Успешно изменено " + nc1);
            return nc1;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<NewsCategoryEntity> showCategories() {
        try {
            Session session = HibernateUtils.sessionFactory.openSession();
            List<NewsCategoryEntity> ncs = session.createQuery("From NewsCategoryEntity").list();
            session.close();
            System.out.println("Найдено " + ncs.size() + " новостей");
            System.out.println("Новости " + ncs);
            return ncs;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
