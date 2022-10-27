/*
Created By 21343008-Maharani Safitri
 */
package jobsheet9;

public class ElevatorTest {
    public static void main(String[] args) {
        Elevator myElevator = new Elevator();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.setFloor(myElevator.TOP_Floor);
        myElevator.openDoor();
    }
  
}
