//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//Shape s1=new Shape(); //error Shape is an abstract class
    Shape s1;
    s1=new Square(1,"Red", 12.3);
    IO.println(s1);
    IO.println("area of the square = "+s1.area());
    IO.println("perimeter of the square = "+s1.perimeter());

    //create a point using @RequiredArgsConstructor annotation with of
    Point p1=Point.of(1,2);
    Point p2=Point.of(11.2,3.5);
    Point p3=Point.of(7.8,9.3);

    s1=new Triangle(2,"Green", p1,p2,p3);
    IO.println(s1);
    IO.println("area of the triangle = "+s1.area());
    IO.println("perimeter of the triangle = "+s1.perimeter());

}
