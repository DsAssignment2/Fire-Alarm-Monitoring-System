
package FireAlarmModels;

import java.io.Serializable;

/**
 *
 * @author DELL
 */

/*** Model class for all sensor details ***/
public class AllSensorDetails implements Serializable{
    
    private static int Id;
    private static String floorNo;
    private static String roomNo;
    private static int co2Level;
    private static int smokeLevel;
    private static boolean sensorStatus;


    /*** default constructor ***/
    public AllSensorDetails() {
    }
    
    /*** override constructor with parameters ***/
    public AllSensorDetails(int Id, String floorNo, String roomNo, int co2Level, int smokeLevels) {
        this.Id = Id;
        this.floorNo = floorNo;
        this.roomNo = roomNo;
        this.co2Level = co2Level;
        this.smokeLevel = smokeLevel;
        //this.sensorStatus = sensorStatus;
    }

    /************************* getters and setters *****************************/
    public static int getId() {
        return Id;
    }

    public  void setId(int Id) {
        this.Id = Id;
    }

    public static String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public static String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public static int getCo2Level() {
        return co2Level;
    }

    public void setCo2Level(int co2Level) {
        this.co2Level = co2Level;
    }

    public static int getSmokeLevel() {
        return smokeLevel;
    }

    public void setSmokeLevel(int smokeLevel) {
        this.smokeLevel = smokeLevel;
    }

//    public static boolean isSensorStatus() {
//        return sensorStatus;
//    }
//
//    public void setSensorStatus(boolean sensorStatus) {
//        this.sensorStatus = sensorStatus;
//    }  
}
