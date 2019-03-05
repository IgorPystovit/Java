package Fiveth_Chapter;

public class Constructor_training {
    Constructor_training(String str){
        System.out.println("Here is "+str);
    }
    Constructor_training(){
        System.out.println("Here is default");
    }
    Constructor_training(short a){
        System.out.println("Here is short "+a);
    }
    Constructor_training(byte b){
        this((short)b);
        System.out.println("Here is byte "+b);
    }

}
