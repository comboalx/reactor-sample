package uits.jv21603.reactorsample.service;

import java.util.List;
import uits.jv21603.reactorsample.domain.Author;
import uits.jv21603.reactorsample.domain.AuthorDaoImpl;


public class AuthorServiceImpl implements AuthorService{
    
    private AuthorDaoImpl authorDao;

    public AuthorServiceImpl() {
        authorDao = new AuthorDaoImpl();
    }

    @Override
    public Author byId(Integer id) {
        return authorDao.byId(id);
    }

    @Override
    public void save(Author a) {
        authorDao.save(a);
    }
    
    @Override
    public List<Author> list() {
        return authorDao.list();
    }
    
    
}
