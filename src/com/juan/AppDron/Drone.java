package com.juan.AppDron;

public class Drone implements FlyingObject {
    private static final int BOUND_LIMIT = 10;
    private static final int SPIN_LIMIT = 3;
    private int posX;
    private int posY;
    private byte mapDirection;
    private DronePosition position;

    public Drone(){
        this.position = position.NORTH;
        this.posX = 0;
        this.posY = 0;
        this.mapDirection = 0;
    }

    @Override
    public void goStraight() {
        if(!isOutOfBounds()){
            switch (this.mapDirection){
                case -3:{
                    this.position = DronePosition.EAST;
                    this.posX++;
                }
                case -2:{
                    this.position = DronePosition.SOUTH;
                    this.posY--;
                }
                case -1:{
                    this.position = DronePosition.WEST;
                    this.posX--;
                }
                case 0:{
                    this.position = DronePosition.NORTH;
                    this.posY++;
                }
                case 1:{
                    this.position = DronePosition.EAST;
                    this.posX++;
                }
                case 2:{
                    this.position = DronePosition.SOUTH;
                    this.posY--;
                }
                case 3:{
                    this.position = DronePosition.WEST;
                    this.posX--;
                }
            }
        }

    }

    @Override
    public void turnRight() {
        this.mapDirection = (isOutOfSpin())? 0 : this.mapDirection++;
    }

    @Override
    public void turnLeft() {
        this.mapDirection = (isOutOfSpin())? 0 : this.mapDirection--;

    }

    private boolean isOutOfBounds(){
        return (this.posX > BOUND_LIMIT || this.posY > BOUND_LIMIT);
    }
    private boolean isOutOfSpin(){
        return (Math.abs(mapDirection) > SPIN_LIMIT);
    }


}

enum DronePosition{
    NORTH,
    SOUTH,
    EAST,
    WEST
}