import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
@Builder
@Getter
@Setter
@NoArgsConstructor
//when using staticName option of the lombok.RequiredArgsConstructor annotation,
//we can create a Point object using Point.of(double x, double y)

@RequiredArgsConstructor(staticName = "of")
@ToString
@EqualsAndHashCode
@Accessors(fluent = true, chain = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Point {
    @NonNull
    double x;
    @NonNull
    double y;
}
