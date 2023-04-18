
package bytestreams3;


public class Lab1 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        RedShapeDecorator circleDecorator=new RedShapeDecorator(c1);
        circleDecorator.draw();
        
        Rectangle r1=new Rectangle();
        RedShapeDecorator rectangleDecorator=new RedShapeDecorator(r1);
        rectangleDecorator.draw();
    }
            
}
