// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.*;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class Auto1 extends SequentialCommandGroup {
  /** Creates a new Auto1. */
  public Auto1() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new GrabPositionAuto(),
      new closeClaw(),
      new HighJunctionAuto(),
      new OpenClaw(),
      new HomePosition()
      //DRIVE BACKWARDS
      //auto chooser 
    );
  }
}
//DriveTrain drive, ArmExtend extend, ArmPivotOne pivotOne, ArmPivotTwo pivotTwo, Claw claw 
