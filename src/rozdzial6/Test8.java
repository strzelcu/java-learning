/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozdzial6;

import static util.Print.print;

/**
 *
 * @author Strzelcu
 */

class Connection {
    
    private Connection() {}
    
    public static Connection makeConnection() {
        return new Connection();
    }
    
}

class ConnectionManager {
    
    int counter = 0;
    
    Connection[] connection = new Connection[5];
    
    public Connection establishConnection() {
        if(counter < 5) {
            connection[counter] = Connection.makeConnection();
            counter += 1;
            return connection[counter-1];
        } else {
            return null;
        }
    }
    
}

public class Test8 {
    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        for(int i = 0; i < 10; i++) {
            print("" + cm.establishConnection());
        }
    }
}
