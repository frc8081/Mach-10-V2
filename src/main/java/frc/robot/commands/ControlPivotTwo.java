// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class ControlPivotTwo extends CommandBase {
  /** Creates a new ControlPivotTwo. */
  public ControlPivotTwo() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.pivotTwo);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = RobotContainer.getRightY(RobotContainer.OpController);
  if(RobotContainer.pivotTwo.get_second_pivot_encoder() >= -3.0 && speed>0.0){
    speed = 0.0;
  }else if(RobotContainer.pivotTwo.get_second_pivot_encoder() <= -235.0 && speed<0.0){
    speed = 0.0;
  }
  RobotContainer.pivotTwo.move_pivot_two(speed*0.5);

  // System.out.println(RobotContainer.pivotTwo.get_second_pivot_encoder());
  }
  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
