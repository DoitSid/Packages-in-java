import java.util.Scanner;
Interface shape
{
    void draw();
    }
class circle implements shape
{
void draw()
{
    System.out.println("Drawing a circle");
}

}


public class Circle
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        circle c1= new circle();
        
        
        c1.draw();
    }
}