package pl.library.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.library.dao.BookDao;
import pl.library.domain.Book;

import java.util.List;

@Service
public class BookImpl {

    @Autowired
    private BookDao bookDao;

    @Autowired
    public List<Book> findAll(){
        return (List<Book>) bookDao.findAll();
    }
}
