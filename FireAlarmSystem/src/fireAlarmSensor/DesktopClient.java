
package fireAlarmSensor;

import FireAlarmViews.Home;
import fireAlarmSensor.FireAlarm;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */

//desktop client invocation
public class DesktopClient extends JFrame {

    /**
     * @param args the command line arguments
     */

     private static FireAlarm lookUp;

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        DesktopClient client = new DesktopClient();
        client.connectRemote();

       //JFrame frame = new JFrame();
        Home home=new Home();
        home.setVisible(true);
   }

    private void connectRemote() throws RemoteException, NotBoundException {

        Registry reg = LocateRegistry.getRegistry("localhost", 9999);
        lookUp =(FireAlarm) reg.lookup("Desktop client success");
        
        
 
       
    }
}
