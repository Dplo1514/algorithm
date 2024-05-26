package com.designPattern.Adapter.AdaptorRobotExample;

public class Robot {
    public enum Direction{LEFT , RIGHT}

    public void moveForward(int space){
        System.out.println(space + " 칸 전진");
    }

    public void turn(Direction _dircetion){
        System.out.println(_dircetion == _dircetion.LEFT ? "왼쪽" : "오른쪽" + "으로 방향 전환");
    }

    public void pickUp(){
        System.out.println("앞의 물건 집어들기");
    }
}
