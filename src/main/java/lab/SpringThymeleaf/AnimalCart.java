package lab.SpringThymeleaf;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Component
@SessionScope
public class AnimalCart {
    private Set<Animal> animals = new HashSet<>();
    public void add(Animal animal){
        animals.add(animal);
    }
    public void clear(){
        animals.clear();
    }

    public Set<Animal> getAnimals() {
        return animals;
    }
//    public Set<Animal> getAnimalsNames() {
//        for (int i = 0; i < animals.size(); i++) {
//            return animals[i];
//        }
//    }
}
