package com.juan.AppDron;

import java.util.List;

public class DroneController {
    private static final char GO_STRAIGHT = 'A';
    private static final char TURN_LEFT = 'I';
    private static final char TURN_RIGHT = 'D';
    private List<String> commands;
    private FlyingObject drone;

    public DroneController(List<String> commands){
        this.commands = commands;
        drone = new Drone();
    }

    public void guideDrone(){
        for(String command : commands){
            for(int i = 0; i < command.length(); i++){
                switch (command.charAt(i)){
                    case GO_STRAIGHT:{
                        drone.goStraight();
                    }
                    case TURN_LEFT:{
                        drone.turnLeft();
                    }
                    case TURN_RIGHT:{
                        drone.turnRight();
                    }
                }
            }
        }
    }


}
