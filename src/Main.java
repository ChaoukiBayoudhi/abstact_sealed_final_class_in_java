//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //create instance or objects in java
    //first way: using new

    //Point p1 = new Point(11.2, 23.5);
    //IO.println(p1);

    //second way: using chain property of the lombok's annotation @Accessors(fluent = true, chain = true)
    //used when the order of properties is not important or not known
    Point p2 = new Point()
            .y(33.2)
            .x(44.5);
    IO.println(p2);

    //third way: using the lombok's annotation @Builder

    Point p3 = Point.builder()
            .x(55.2)
            .y(66.5)
            .build();
    IO.println(p3);

    //fourth way: using the staticName option of @RequiredArgsConstructor
    Point p4 = Point.of(77.2, 88.5);
    IO.println(p4);


//Shape s1=new Shape(); //error Shape is an abstract class
    Shape s1;
    s1=new Square(1,"Red", 12.3);
    IO.println(s1);
    IO.println("area of the square = "+s1.area());
    IO.println("perimeter of the square = "+s1.perimeter());

    //create a point using @RequiredArgsConstructor annotation with of
    Point p5=Point.of(1,2);
    Point p6=Point.of(11.2,3.5);
    Point p7=Point.of(7.8,9.3);

    s1=new Triangle(2,"Green", p5,p6,p7);
    IO.println(s1);
    IO.println("area of the triangle = "+s1.area());
    IO.println("perimeter of the triangle = "+s1.perimeter());

}
