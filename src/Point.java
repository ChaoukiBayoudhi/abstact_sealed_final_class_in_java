import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@Getter
@Setter
@RequiredArgsConstructor(staticName = "of")
//using of on the @RequiredArgsConstructor annotation, provide the possibility to create a Point object without using the new keyword
//so we can create a point using the syntax Point.of(x,y)
public class Point {
    @NonNull
    double x;
    @NonNull
    double y;
}
