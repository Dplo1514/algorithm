package com.designPattern.Adapter.AdaptorRobotExample;

import java.util.ArrayList;

public class RobotKit {
    private Robot robot = new Robot();
    // 1. Command를 상속한 클래스를 담을 List
    private ArrayList<Command> commands = new ArrayList<Command>();
    // 2. 명령들을 추가함
    public void addCommand(Command command){
        commands.add(command);
    }
    // 3. 추가된 명령들을 하나씩 실행함
    public void start(){
        for (Command command : commands){
            command.setRobot(robot);
            command.execute();
        }
    }
}
