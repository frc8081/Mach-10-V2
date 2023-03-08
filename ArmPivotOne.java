// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmPivotOne extends SubsystemBase {
  /** Creates a new ArmPivotOne. */
  private CANSparkMax first_pivot;

  public ArmPivotOne() {
    first_pivot = new CANSparkMax(Constants.FIRST_PIVOT_ID, MotorType.kBrushless);
    first_pivot.setIdleMode(IdleMode.kBrake);
    first_pivot.restoreFactoryDefaults();
  }

  public void move_pivot_one (double speed) {
    first_pivot.set(speed);
  }

  public void home_first_pivot_encoder(){
    first_pivot.getEncoder().setPosition(0.0);
  }

  public double get_first_pivot_encoder(){
    return first_pivot.getEncoder().getPosition();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
