package softuni.exersice1.mobilele.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Brand extends BaseEntity{
    @Column(nullable = false,unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BrandEntity{" +
                "id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                ", name='" + name + '\'' +
                '}';
    }
}
