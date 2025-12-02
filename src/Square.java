import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PROTECTED)
@ToString
@Getter
@Setter
@NoArgsConstructor()


//a subclass that inherits from abstract-class must be either abstract
//or implement all abstract methods of the super-class,
//for example, if one abstract-method is not overloaded, the child class is abstact
//if a class is a subclass of a sealed class,
//We have 3 possibilities :
//1. The class is sealed itself and must specify all the permits sub-classes
//2. The class is non-sealed so no need to specify permits sub-classes
//3. The class is a final class, so no possibility to extend
public sealed class Square extends Shape permits Disk, Rectangle {
    @NonNull
    double length;

    //override abstract methods
    @Override
    public double area() {
        return length * length;
        //or
        //return  Math.pow(length, 2);
    }
    @Override
    public double perimeter() {
        return 4 * length;
    }

    public Square(int id, String color, double length) {
        super(id, color);
        this.length = length;
    }


}
