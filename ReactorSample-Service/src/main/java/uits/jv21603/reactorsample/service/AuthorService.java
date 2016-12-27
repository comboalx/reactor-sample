package uits.jv21603.reactorsample.service;

import java.util.List;
import uits.jv21603.reactorsample.domain.Author;


public interface AuthorService {
    Author byId(Integer id);
    void save(Author a);
    List<Author> list();
}
