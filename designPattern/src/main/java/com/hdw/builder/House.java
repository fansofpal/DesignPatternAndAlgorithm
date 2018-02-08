package com.hdw.builder;

/**
 * user:hudawei1
 * date:2018/2/8
 * time:9:37
 */
public class House {
    private String door;
    private String window;
    private String wall;


    public House(String door,String window,String wall){
        this.door = door;
        this.window = window;
        this.wall = wall;
    }


    public static class Builder{
        private String door;
        private String window;
        private String wall;

        public Builder buildDoor(String door){
            this.door = door;
            return this;
        }

        public Builder buildWindow(String window){
            this.window = window;
            return this;
        }

        public Builder buildWall(String wall){
            this.wall = wall;
            return this;
        }

        public House build(){
            return new House(this.door,this.window,this.wall);
        }
    }


    @Override
    public String toString() {
        return "House{" +
                "door='" + door + '\'' +
                ", window='" + window + '\'' +
                ", wall='" + wall + '\'' +
                '}';
    }
}
