package seventhChapter.Components;

//: seventhChapter/Components/Root.java
 class Root extends Component{
    Component1 c1;
    Component2 c2;
    Component3 c3;
    Root(){
        super(1);
        {
            c1=new Component1(1);
            c2=new Component2(1);
            c3=new Component3(1);
        }
        System.out.println("Root constructor");
    }

    void erase(){
        c1.erase();
        c2.erase();
        c3.erase();
        super.erase();
    }






}
