package Sixth_Chapter.Connect_Simulator;

import Sixth_Chapter.Connect_Simulator.Connection;

///Sixth_Chapter/Connect_Simulator/ConnectionManager.java
//Manage the connections
public class ConnectionMannager {
    private static int  connectionCounter=-1;


    private static Connection[] connectionGroup=new Connection[]{new Connection(),new Connection(),new Connection(),new Connection()};
    public static Connection getConnection()
    {
        connectionCounter+=1;
        if(connectionCounter>=connectionGroup.length){
            return null;
        }
        return connectionGroup[connectionCounter];
    }
}

