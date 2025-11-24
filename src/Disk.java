import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Disk extends Square {
    Point center;

    @Override
    public double area(){
        return Math.PI*super.area();
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*length;
    }
}
