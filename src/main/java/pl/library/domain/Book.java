package pl.library.domain;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
//@Table(name="Ksiazki");
public class Book  {


    //@TableGenerator(name = "Ksiazki", allocationSize = 1)
    @Id
    //@GeneratedValue(generator = "Ksiazki")
    private int id;

    private String tytul;
    private String ISBN;
    private String kategoria;
    private String opis;
    private String autor;
    private String wydawnictwo;
    private Date rokWydania;
    private Boolean status;


/*    @OneToMany(mappedBy="book" ,cascade=CascadeType.ALL , fetch = FetchType.LAZY)
    private Collection<Book> books =new ArrayList<Book>();*/

    public Book() {

    }

    public Book(int id, String tytul, String ISBN, String kategoria, String opis, String autor, String wydawnictwo, Date rokWydania, Boolean status) {
        this.id = id;
        this.tytul = tytul;
        this.ISBN = ISBN;
        this.kategoria = kategoria;
        this.opis = opis;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public Date getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(Date rokWydania) {
        this.rokWydania = rokWydania;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(tytul, book.tytul) &&
                Objects.equals(ISBN, book.ISBN) &&
                Objects.equals(kategoria, book.kategoria) &&
                Objects.equals(opis, book.opis) &&
                Objects.equals(autor, book.autor) &&
                Objects.equals(wydawnictwo, book.wydawnictwo) &&
                Objects.equals(rokWydania, book.rokWydania) &&
                Objects.equals(status, book.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tytul, ISBN, kategoria, opis, autor, wydawnictwo, rokWydania, status);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", tytul='" + tytul + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", kategoria='" + kategoria + '\'' +
                ", opis='" + opis + '\'' +
                ", autor='" + autor + '\'' +
                ", wydawnictwo='" + wydawnictwo + '\'' +
                ", rokWydania=" + rokWydania +
                ", status=" + status +
                '}';
    }
}
