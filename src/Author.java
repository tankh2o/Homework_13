import java.util.Objects;

public class Author {
    public Author (String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String name;
    public String family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String toString() { return "Имя: " + this.name + ". Фамилия: " + this.family; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(family, author.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family);

    }
}
