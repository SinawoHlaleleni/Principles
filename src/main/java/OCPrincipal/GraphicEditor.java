package OCPrincipal;

// Good Example of OCPrinciple
class GraphicEditor1 {
    public void drawShape(Shape p) {
        p.draw();
    }

    abstract class Shape {
        abstract void draw();
    }

    class Rectangle extends Shape  {
        public void draw() {
            // draw the rectangle
        }
    }
}
//Bad example of OCP
class GraphicEditor {

    public void drawShape(Shapes s) {
        if (s.m_type==1)
            drawRectangle(s);
        else if (s.m_type==2)
            drawCircle(s);
    }
    public void drawCircle(Shapes r) {
        //....
    }
    public void drawRectangle(Shapes r) {
        //	....
    }
}

class Shapes {
    int m_type;
}

class Rectangle extends Shapes {
    Rectangle() {
        super.m_type=1;
    }
}

class Circle extends Shapes {
    Circle() {
        super.m_type=2;
    }
}



