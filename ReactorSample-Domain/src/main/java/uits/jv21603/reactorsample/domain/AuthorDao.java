package uits.jv21603.reactorsample.domain;

import java.util.List;


public interface AuthorDao {
    Author byId(Integer id);
    void save(Author a);
    void update(Author a);
    void delete(Author a);
    List<Author> list();
}
