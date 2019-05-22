package pl.library.dao;

import org.springframework.data.repository.CrudRepository;
import pl.library.domain.Book;

import java.util.List;


public interface BookDao extends CrudRepository <Book, Integer> {

}
