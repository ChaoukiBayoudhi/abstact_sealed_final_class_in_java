import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode(of="id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//abstract class: contains at least 1 abstract method
//We can't instantiate an abstract class
//an abstract class is defined to be used as a base or super class for other classes
public abstract class Shape {
    int id;
    String color;

    //abstract methods
    public abstract double area();
    public abstract double perimeter();

}
