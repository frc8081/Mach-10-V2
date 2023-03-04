// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class ArmExtend extends SubsystemBase {
  /** Creates a new WholeArm. */
  private CANSparkMax extend;


  
  public ArmExtend() {
    extend = new CANSparkMax(Constants.EXTEND_ID, MotorType.kBrushless);
  // set all NEOs to factory defaults
    extend.setIdleMode(IdleMode.kBrake);
    extend.restoreFactoryDefaults();
  }

  public void extend (double speed) {
    extend.set(speed);

  }
  public double get_extend_encoder(){
    return extend.getEncoder().getPosition();
  }
  public void home_extend_encoder(){
    extend.getEncoder().setPosition(0.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
