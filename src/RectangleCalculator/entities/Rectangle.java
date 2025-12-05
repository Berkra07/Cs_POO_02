package RectangleCalculator.entities;

public class Rectangle  {

    //Variaveis
    public double Width;
    public double Height;

    //Métodos

    public double Area(){
        return Width * Height;
    }

    public double Perimeter(){
        return 2 * (Width + Height);
    }

    public double Diagonal(){
        return Math.sqrt (                      //rais quadrada
                Math.pow (Width,2) +            //Width elevado a 2
                Math.pow (Height,2) );          //Height elevado a 2
    }

    public String toString(){
        return  String.format(
                "Area = %.2f\nPerímeter = %.2f\nDiagonal = %.2f",
                Area(),
                Perimeter(),
                Diagonal()
        );
    }

}
