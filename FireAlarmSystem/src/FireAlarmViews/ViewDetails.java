
package FireAlarmViews;

import FireAlarmModels.AllSensorDetails;
import fireAlarmSensor.Server;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.json.simple.JSONArray;

/**
 *
 * @author DELL
 */
public class ViewDetails {
//         JFrame frame;
//         JTable table;
         
   public ViewDetails() throws RemoteException  
    { 
//           setLocationRelativeTo(null);
//           setSize(600,400);
//           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//          // setVisible(true);

        // Frame initiallization 
        JFrame frame = new JFrame(); 
        JTable table=new JTable();
        // Frame Title 
         frame.setTitle("All Registered Sensor Details"); 

//          for(AllSensorDetails sensor : sensorDetails){
//               System.out.println("*********Fetched Details*********");
//               System.out.println(sensor.getId());
//               System.out.println(sensor.getFloorNo());
//               System.out.println(sensor.getRoomNo());
//               System.out.println(sensor.getCo2Level());
//               System.out.println(sensor.getSmokeLevel());
//           }
        // Data to be displayed in the JTable 
        String[][] data = { 
            { "1", "4", "3","F1","F101","0","Deactive" }, 
            { "2", "5", "7","F2","F203","1","Active" },
            { "3", "2", "8","F3","F304","1","Active" },
            { "4", "4", "1","F3","F305","0","Deactive" }, 
            { "5", "5", "7","F1","F102","1","Active" },
            { "6", "6", "9","F2","F206","1","Active" }
        }; 
//                  
        // Column Names 
       String[] columnNames = { "Sensor ID", "Co2 Level", "Smoke Level","Floor Number","Room Number","Sensor status","Action" }; 


        // Initializing the JTable 
        table= new JTable(data, columnNames); 
        table.setBounds(30, 40, 200, 300);
//        
        Font font = new Font("Verdana", Font.PLAIN, 20);
        table.setFont(font);
        table.setRowHeight(50);
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(font);
        tableHeader.setBackground(Color.black);
        tableHeader.setForeground(Color.white);
  
        // adding it to JScrollPane 
        JScrollPane jScrollPane = new JScrollPane(table); 
        frame.add(jScrollPane); 
        // Frame Size 
        frame.setSize(500, 200); 
       // Frame Visible = true 
        frame.setVisible(true);  
    }    
    
    public static void main(String[] args) throws RemoteException { 
          new ViewDetails();
        
//       ViewDetails viewDetails= new ViewDetails();
//       Server s1=new Server();
//           
//           List<AllSensorDetails> sensorDetails = new ArrayList<>();
//           sensorDetails = s1.allRetrieveDetails();
//           
//       JTable table=new JTable();
//        DefaultTableModel defaultModel= new DefaultTableModel();
//        Object[] columnNames = new Object[5];
//        columnNames[0]= "Sensor Id";
//        columnNames[1]= "Floor No";
//        columnNames[2]= "Room No";
//        columnNames[3]= "Co2 Level";
//        columnNames[4]= "Smoke Level";
//////      columnNames[5]= "Sensor Id";
//
//
//        defaultModel.setColumnIdentifiers(columnNames);
//        Object[] rowData = new Object[5];
// 
//        for(int i=0; i< sensorDetails.size();i++){
//          System.out.println("for");
//          rowData[0]=sensorDetails.get(i).getId();
//          rowData[1]=sensorDetails.get(i).getFloorNo();
//          rowData[2]=sensorDetails.get(i).getRoomNo();
//          rowData[3]=sensorDetails.get(i).getCo2Level();
//          rowData[4]=sensorDetails.get(i).getSmokeLevel();
//          defaultModel.addRow(rowData);
//          System.out.println(rowData[0]);
//          System.out.println(rowData[1]);
//          System.out.println(rowData[2]);
//          System.out.println(rowData[3]);
//          System.out.println(rowData[4]);
//        }
//         table.setModel(defaultModel);
//      
//         
//        JPanel panel= new JPanel();
//        JScrollPane pane=new JScrollPane(table);
//        panel.setLayout(new BorderLayout());
//       
//        panel.add(pane, BorderLayout.CENTER);
//        viewDetails.setContentPane(panel);
//        viewDetails.setSize(600,400);
//        viewDetails.setVisible(true);
//        
  }
}
