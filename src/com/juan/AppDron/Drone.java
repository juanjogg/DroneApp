package com.juan.AppDron;

public class Drone implements FlyingObject {
    private static final int BOUND_LIMIT = 10;
    private static final int SPIN_LIMIT = 3;
    private int posX;
    private int posY;
    private byte mapDirection;
    private DronePosition position;

    public Drone(){
        this.position = DronePosition.NORTH;
        this.posX = 0;
        this.posY = 0;
        this.mapDirection = 0;
    }

    @Override
    public void goStraight() {
        if(!isOutOfBounds()){
    		switch(this.position) {
    			case NORTH:{
    				this.posY++;
    				break;
    			}
    			case SOUTH:{
    				this.posY--;
    				break;
    			}
    			case EAST:{
    				this.posX++;
    				break;
    			}
    			case WEST:{
    				this.posX--;
    				break;
    			}
    		}
        }

    }

    @Override
    public void turnRight() {
        //this.mapDirection = (isOutOfSpin())? 0 : this.mapDirection++;
    	if(!isOutOfSpin()) {
    		this.mapDirection++;
    	}
    	else {
    		this.mapDirection = 0;
    	}
    	turnObject();
    }

    @Override
    public void turnLeft() {
        //this.mapDirection = (isOutOfSpin())? 0 : this.mapDirection--;
    	if(!isOutOfSpin()) {
    		this.mapDirection--;
    	}
    	else {
    		this.mapDirection = 0;
    	}
    	turnObject();

    }

    private boolean isOutOfBounds(){
        return (this.posX > BOUND_LIMIT || this.posY > BOUND_LIMIT);
    }
    private boolean isOutOfSpin(){
        return (Math.abs(mapDirection) >= SPIN_LIMIT);
    }
    @Override
    public void restartPosition() {
    	this.posX = 0;
    	this.posY = 0;
    	this.position = DronePosition.NORTH;
    }
    
    @Override
    public String toString() {
    	return "(" + this.posX + ","+ this.posY +") " + this.position;
    }
    @Override
    public void turnObject() {
    	if(!isOutOfBounds()){
            switch (this.mapDirection){
                case -3:{
                    this.position = DronePosition.EAST;
                    
                    break;
                }
                case -2:{
                    this.position = DronePosition.SOUTH;
                    
                    break;
                }
                case -1:{
                    this.position = DronePosition.WEST;
                    
                    break;
                }
                case 0:{
                    this.position = DronePosition.NORTH;
                    
                    break;
                }
                case 1:{
                    this.position = DronePosition.EAST;
                    
                    break;
                }
                case 2:{
                    this.position = DronePosition.SOUTH;
                    
                    break;
                }
                case 3:{
                    this.position = DronePosition.WEST;
                    
                    break;
                }
            }
        }
    }


}

enum DronePosition{
    NORTH,
    SOUTH,
    EAST,
    WEST
}