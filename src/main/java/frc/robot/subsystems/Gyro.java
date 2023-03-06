// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import org.opencv.photo.CalibrateCRF;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Gyro extends SubsystemBase {
  /** Creates a new Gyro. */
  AHRS gyro;
  public Gyro() {
    gyro = new AHRS(SPI.Port.kMXP);
  }

  public double getYaw(){
    return gyro.getAngle();
  }

  public double getPitch(){
    return gyro.getPitch();
  }

  public double getRoll(){
    return gyro.getRoll();
  }

  public void CalibrateGyro() {
    gyro.calibrate();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
