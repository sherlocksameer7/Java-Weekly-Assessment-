package harman.assessment.project2;

abstract class Diff_Shapes
    {
        abstract double get_value_of_parameters();  // Double can be used for the float values !!!
    }



    class Rectangle extends Diff_Shapes

    {
        double length;
        double breadth;
        Rectangle(double length, double breadth)

        {
            this.length = length;
            this.breadth = breadth;
        }

        double get_value_of_parameters()
        {
            return length * breadth;
        }
    }



    class Square extends Diff_Shapes

    {
        double side;
        Square(double side)

        {
            this.side = side;
        }

        double get_value_of_parameters()
        {
            return side * side;
        }
    }



    class Circle extends Diff_Shapes

    {
        double radius;
        Circle(double radius)

        {
            this.radius = radius;
        }

        double get_value_of_parameters()
        {
            return (22.0/7.0) * radius * radius;  // Circle Formula Value !!!
        }
    }


    class Area
    {

        public static void main(String[] args)

        {

            Rectangle rec_value = new Rectangle(16, 4);

            Square sqr_value = new Square(8);

            Circle cir_value = new Circle(7);



            System.out.println("Rectangle Area : " + rec_value.get_value_of_parameters());

            System.out.println("Square Area : " + sqr_value.get_value_of_parameters());

            System.out.println("Circle Area : " + cir_value.get_value_of_parameters());

        }
}
