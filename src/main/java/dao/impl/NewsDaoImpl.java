package dao.impl;

import dao.NewsDao;
import entity.NewsEntity;
import org.hibernate.Session;
import utils.HibernateUtils;

import java.util.List;

public class NewsDaoImpl implements NewsDao {
    @Override
    public Long create(NewsEntity newsEntity) {
        try {
            Session session = HibernateUtils.sessionFactory.openSession();
            session.beginTransaction();
            session.save(newsEntity);
            session.getTransaction().commit();
            session.close();
            System.out.println("Успешно добавлено " + newsEntity);
            return newsEntity.getId();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<NewsEntity> showNews() {
        try {
            Session session = HibernateUtils.sessionFactory.openSession();
            List<NewsEntity> newsEntities = session.createQuery("From NewsEntity").list();
            session.close();
            System.out.println("Найдено " + newsEntities.size() + " новостей");
            System.out.println("Новости " + newsEntities);
            return  newsEntities;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String delete(Long id) {
        try {
            Session session = HibernateUtils.sessionFactory.openSession();
            session.beginTransaction();
            session.delete(id);
            session.getTransaction().commit();
            session.close();
            return "Успешно удален";
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "Ой что-то пошло не так попробуйте снова";
    }

    @Override
    public NewsEntity changeNewsTextAndHeaderById(NewsEntity newsEntity, Long id) {
        try {
            Session session = HibernateUtils.sessionFactory.openSession();
            session.beginTransaction();
            NewsEntity newsEntity1 = (NewsEntity) session.load(NewsEntity.class, id);
            newsEntity1.setNewsHeader(newsEntity.getNewsHeader());
            newsEntity1.setNewsText(newsEntity.getNewsText());
            newsEntity1.setNewsCategory(newsEntity.getNewsCategory());
            newsEntity1.setPostTime(newsEntity.getPostTime());
            session.beginTransaction().commit();
            session.close();
            System.out.println("Успешно изменен " + newsEntity);
            return newsEntity;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<NewsEntity> search(String text){
        try {
            Session session = HibernateUtils.sessionFactory.openSession();
            List<NewsEntity> newsEntities = session
                    .createQuery("from entity.NewsEntity d where d.newsHeader like :text ", NewsEntity.class)
                    .setParameter("text","%" + text + "%")
                    .list();
            session.close();
            System.out.println("Найдено " + newsEntities.size() + " вариантов");
            System.out.println(newsEntities);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
