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
//or implement all abstract methods of the super-class
//for example, if one abstract-method is not overloaded, the child class is abstact
public class Square extends Shape {
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
