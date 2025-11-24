import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode(of="id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shape {
    int id;
    String color;

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }

}
