// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class ControlIntake extends CommandBase {
  /** Creates a new ControlIntake. */
  public ControlIntake() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = -RobotContainer.driveController.getLeftTriggerAxis()+RobotContainer.driveController.getRightTriggerAxis();
    if(RobotContainer.intake.get_intake_encoder() <= -13.0 && speed<0.0){
      speed = 0.0;
    }else if(RobotContainer.intake.get_intake_encoder() >= -1.0 && speed>0.0){
      speed = 0.0;
    }
    RobotContainer.intake.moveIntake(speed*0.25);
  
    System.out.println(RobotContainer.intake.get_intake_encoder());
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
