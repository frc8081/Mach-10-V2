// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmPivotTwo extends SubsystemBase {
  /** Creates a new ArmPivotOne. */
  private CANSparkMax second_pivot;

  public ArmPivotTwo() {
    second_pivot = new CANSparkMax(Constants.SECOND_PIVOT_ID, MotorType.kBrushless);
    second_pivot.setIdleMode(IdleMode.kBrake);
    second_pivot.restoreFactoryDefaults();
  }

  public void move_pivot_two (double speed) {
    second_pivot.set(speed);
  }

  public void home_second_pivot_encoder(){
    second_pivot.getEncoder().setPosition(0.0);
  }

  public double get_second_pivot_encoder(){
    return second_pivot.getEncoder().getPosition();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
