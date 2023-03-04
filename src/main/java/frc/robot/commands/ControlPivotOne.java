// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class ControlPivotOne extends CommandBase {
  /** Creates a new ControlPivotOne. */
  public ControlPivotOne() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.pivotOne);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = -RobotContainer.getLeftY(RobotContainer.OpController);
    if(RobotContainer.pivotOne.get_first_pivot_encoder() >= 42.0 && speed>0.0){
      speed = 0.0;
    }else if(RobotContainer.pivotOne.get_first_pivot_encoder() <= 2.0 && speed<0.0){
      speed = 0.0;
    }
    RobotContainer.pivotOne.move_pivot_one(speed*0.3);

    System.out.println(RobotContainer.pivotOne.get_first_pivot_encoder());
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
