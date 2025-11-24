import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Triangle extends Shape{
    Point A;
    Point B;
    Point C;
}
