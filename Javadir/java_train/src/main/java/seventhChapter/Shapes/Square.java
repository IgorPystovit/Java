package seventhChapter.Shapes;

public class Square extends Shape {


        @Override
        protected void draw(){
            System.out.println("Square draw");
        }

        @Override
        protected void erase(){
            System.out.println("Erase square");
        }
    }

