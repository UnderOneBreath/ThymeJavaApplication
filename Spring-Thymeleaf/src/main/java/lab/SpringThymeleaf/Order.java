package lab.SpringThymeleaf;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    private String phone;
    private Date date=new Date();
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<Animal> animals=new HashSet<>();

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }

    public Object getAnimalNames() {
        return animals.stream()
                .map(Animal::getName);
    }
}