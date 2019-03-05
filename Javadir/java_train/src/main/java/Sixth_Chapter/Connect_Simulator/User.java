package Sixth_Chapter.Connect_Simulator;

import static Sixth_Chapter.Connect_Simulator.ConnectionMannager.getConnection;
///Sixth_Chapter/Connect_Simulator/User.java
public class User {
    public static void main(String[] args) {
      ConnectionMannager manage=new ConnectionMannager();
        for(int i=0;i<9;i++)
        {
            System.out.println(getConnection());

        }
    }
}///:~
