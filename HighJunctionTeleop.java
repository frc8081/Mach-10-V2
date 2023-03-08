// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.RobotContainer;

import edu.wpi.first.wpilibj.Timer;

public class HighJunctionTeleop extends CommandBase {
  /** Creates a new GrabPosition. */
  double x;
  boolean flag;
  public HighJunctionTeleop() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.pivotOne);
    addRequirements(RobotContainer.pivotTwo);
    addRequirements(RobotContainer.extend);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    flag=false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    // ADJUSTING LENGTH VALUES MUST CHANGE OF EXTEND ENCODER
    //change x to actual values
    System.out.println(flag);
    if(!flag){
      if(RobotContainer.extend.get_extend_encoder() <= -3.0){
        RobotContainer.extend.extend(0.55);
      }else{
        flag= true;
        RobotContainer.extend.extend(0.0);
      }
    }else{
        RobotContainer.extend.extend(0.0);
        flag= true;

        if(RobotContainer.pivotOne.get_first_pivot_encoder() >= 47.0){
          RobotContainer.pivotOne.move_pivot_one(-0.4);
        }else if(RobotContainer.pivotOne.get_first_pivot_encoder() <= 42.0){
          RobotContainer.pivotOne.move_pivot_one(0.4);
        }else{
          RobotContainer.pivotOne.move_pivot_one(0.0);
        }

        if(RobotContainer.pivotTwo.get_second_pivot_encoder() >= -92.0){
          RobotContainer.pivotTwo.move_pivot_two(-0.45);
        }else if(RobotContainer.pivotTwo.get_second_pivot_encoder() <= -96.0){
          RobotContainer.pivotTwo.move_pivot_two(0.45);
        }else{
          RobotContainer.pivotTwo.move_pivot_two(0.0);
        }


      // System.out.println(((RobotContainer.pivotOne.get_first_pivot_encoder() >= (2.0-5.0)&&RobotContainer.pivotOne.get_first_pivot_encoder() <= (2.0+5.0))));
      if((RobotContainer.pivotTwo.get_second_pivot_encoder() <= (-94.0+5.0)&&RobotContainer.pivotTwo.get_second_pivot_encoder() >= (-94.0-5.0)) && (RobotContainer.pivotOne.get_first_pivot_encoder() >= (44.0-5.0)&&RobotContainer.pivotOne.get_first_pivot_encoder() <= (44.0+5.0))){
        if(RobotContainer.extend.get_extend_encoder() >= -42){
          RobotContainer.extend.extend(-0.55);
        }else{
          RobotContainer.extend.extend(0.0);
          end(true);
        } 
      }
    }
  }



  // }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.extend.extend(0.0);
    RobotContainer.pivotTwo.move_pivot_two(0.0);
    RobotContainer.pivotOne.move_pivot_one(0.0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
