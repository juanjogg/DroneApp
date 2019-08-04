package com.juan.AppDron;

import java.util.List;

public class DroneController {
    private static final char GO_STRAIGHT = 'A';
    private static final char TURN_LEFT = 'I';
    private static final char TURN_RIGHT = 'D';
    private List<String> commands;
    private FlyingObject drone;
    private String finalPosition;

    public DroneController(List<String> commands, FlyingObject drone){
        this.commands = commands;
        this.drone = drone;
    }

    public String guideDrone(){
        for(int j = 0; j < commands.size(); j++){
        	//if(j % 3 == 0) {
        	//	drone.restartPosition();
        	//}
            for(int i = 0; i < commands.get(j).length(); i++){
            	char var = commands.get(j).charAt(i);
                switch (var){
                    case GO_STRAIGHT:{
                        drone.goStraight();
                        break;
                    }
                    case TURN_LEFT:{
                        drone.turnLeft();
                        break;
                    }
                    case TURN_RIGHT:{
                        drone.turnRight();
                        break;
                    }
                }
            }
            System.out.println(drone.toString()+ "\n");
            finalPosition += drone.toString() + "\n";
        }
        
        return finalPosition;
    }


}
