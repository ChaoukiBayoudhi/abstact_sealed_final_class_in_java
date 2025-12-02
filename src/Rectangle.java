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
public final class Rectangle extends Square {
    @NonNull
    double width;

    @Override
    public double area(){
        return width*length;
    }
    @Override
    public double perimeter() {
        return 2*(width+length);
    }
}
