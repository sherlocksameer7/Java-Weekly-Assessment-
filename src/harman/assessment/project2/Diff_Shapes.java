package harman.assessment.project2;

abstract class Diff_Shapes
    {
        abstract double get_value_of_parameters();  // Double can be used for the float values !!!
    }



    class Rectangle extends Diff_Shapes

    {
        double length;
        double breadth;
        Rectangle(double len, double br)

        {
            this.length = len;
            this.breadth = br;
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
        Circle(double rad)

        {
            this.radius = rad;
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



            System.out.println("Rectangle Value of Area : " + rec_value.get_value_of_parameters());

            System.out.println("Square Value of Area : " + sqr_value.get_value_of_parameters());

            System.out.println("Circle Value of Area : " + cir_value.get_value_of_parameters());

        }
}
