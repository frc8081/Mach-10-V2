/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class DriveTrain extends SubsystemBase {
  /**
   * Class variables for storing data and objects that this subsystem needs to
   * operate.
   *
   * These variables are declared private to this class, because no other object
   * should need direct access to these objects. Any changes or commands to the 
   * drivetrain should come through public methods like the tankDrive() function.
   */

  private CANSparkMax driverfrontNEO;
  private CANSparkMax passagerfrontNEO;
  private CANSparkMax driverbackNEO;
  private CANSparkMax passagerbackNEO;
  private DifferentialDrive drive;
  private MotorControllerGroup leftSide;
  private MotorControllerGroup rightSide;

  public DriveTrain() {
    driverfrontNEO = new CANSparkMax(Constants.DRIVER_FRONT_ID, MotorType.kBrushless);
    passagerfrontNEO = new CANSparkMax(Constants.PASSNGER_FRONT_ID, MotorType.kBrushless);
    passagerbackNEO = new CANSparkMax(Constants.PASSNGER_BACK_ID, MotorType.kBrushless);
    driverbackNEO = new CANSparkMax(Constants.DRIVER_BACK_ID, MotorType.kBrushless);
    // set all NEOs to factory defaults
    driverfrontNEO.restoreFactoryDefaults();
    driverbackNEO.restoreFactoryDefaults();
    passagerfrontNEO.restoreFactoryDefaults();
    passagerbackNEO.restoreFactoryDefaults();

    // driverbackNEO.setInverted(true);
    // assign each motor to a MotorControllerGroup
    leftSide = new MotorControllerGroup(driverfrontNEO, driverbackNEO);
    rightSide = new MotorControllerGroup(passagerfrontNEO, passagerbackNEO);


    // create our DifferentialDrive class
    drive = new DifferentialDrive(leftSide, rightSide);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void arcadeDrive(double xSpeed, double zRotation) {
    drive.arcadeDrive(zRotation, xSpeed);
  }

  public void tankDrive(double leftSpeed, double rightSpeed) {
    drive.tankDrive(leftSpeed, rightSpeed);
  }
}