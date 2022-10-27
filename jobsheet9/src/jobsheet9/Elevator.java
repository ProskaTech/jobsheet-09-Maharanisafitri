/*
Created By 21343008-Maharani Safitri
 */
package jobsheet9;


public class Elevator {
     public boolean doorOpen= false;
    public int currentFloor = 5;
    public final int TOP_Floor = 5;
    public final int BOTTOM_Floor = 1;
    
    public void openDoor(){
        System.out.println("Opening door");
        doorOpen = true;
        System.out.println("Door is");
    }
    
    public void closeDoor(){
        System.out.println("Closing door");
        doorOpen = false;
        System.out.println("Door is close");
    }
    
    public void goUp () {
        System.err.println("Going up one floor");
        currentFloor++;
        System.out.println("Floor : " + currentFloor);
    }
    
    public void goDown() {
        System.err.println("Going down one floor");
        currentFloor--;
        System.out.println("Floor : " + currentFloor);
    }
     
    public void setFloor (int desiredFloor) {
        while (currentFloor != desiredFloor) {
             if (currentFloor < desiredFloor) {
                 goUp ();
             }
             else {
                 goDown ();
             }
             
        }
        
        
    }
    
    public int getFloor() {
        return currentFloor;
    }
    
    public boolean checkDoorStatus () {
        return doorOpen;
    }
     
}
