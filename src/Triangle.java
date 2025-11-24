import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.Objects;
@SuperBuilder
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter

//2 triangles are equals when they have the same points
//1st method: using lombok annotation
//@EqualsAndHashCode(callSuper = false, of={"A","B", "C"})
@NoArgsConstructor
@AllArgsConstructor
//the triangle is rectangle in A
public class Triangle extends Shape{
    //define Point into Triangle is called composition
    Point A;
    Point B;
    Point C;

    public Triangle(int id, String color, Point a, Point b, Point c) {
        super(id, color);
        A = a;
        B = b;
        C = c;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Triangle tr)) return false;
        if (!super.equals(o)) return false;
        //return Objects.equals(A, tr.A) && Objects.equals(B, tr.B) && Objects.equals(C, tr.C);
        return this.A.equals(tr.A) && this.B.equals(tr.B) && this.C.equals(tr.C);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), A, B, C);
    }

    private double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x()-p2.x(),2) + Math.pow(p1.y()-p2.y(),2));
    }

    @Override
    public double area() {
        return (distance(A,B)*distance(A,C))/2;
    }
    @Override
    public double perimeter() {
        return distance(A,B) + distance(B,C) + distance(C,A);
    }
}
