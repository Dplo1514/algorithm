package com.designPattern.Adapter.AdaptorRobotExample;

abstract class Command {
    protected Robot robot;

    public void setRobot(Robot _robot) {
        this.robot = _robot;
    }

    public abstract void execute();
}

// 전진 명령
class MoveForwardCommand extends Command{
    // 1. 칸 수를 의미하는 정수
    int space;
    // 2. 생성자
    public MoveForwardCommand(int _space){
        this.space = _space;
    }
    // 3. 상수 값 만큼 전진하는 동작을 하게된다.
    @Override
    public void execute() {
        robot.moveForward(space);
    }
}
// 회전 명령
class TurnCommand extends Command{
    Robot.Direction direction;
    public TurnCommand (Robot.Direction _direction){
        this.direction = _direction;
    }
    @Override
    public void execute(){
        robot.turn(direction);
    }
}

// 집기 명령
class PickUpCommand extends Command{
    public void execute(){
        robot.pickUp();
    }
}

class CommandOrderAdapter extends Command{
    private Order order;

    public CommandOrderAdapter(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.run(robot);
    }
}
