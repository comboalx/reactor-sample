package uits.jv21603.reactorsample.domain;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class AuthorDaoImpl implements AuthorDao{

    @Override
    public Author byId(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Author)session.createCriteria(Author.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }

    @Override
    public void save(Author a) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        try{
            session.save(a);
            session.getTransaction().commit();
        }catch (Exception aex){
          session.getTransaction().rollback();
          throw new RuntimeException("Shit happens");
        }
    }

    @Override
    public void update(Author a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Author a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> list() {
        return HibernateUtil.getSessionFactory().openSession().
                createCriteria(Author.class).list();
    }
    
}
