/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {


    public static final int kDriverControllerPort = 0;

    // Motors
    public static final int DRIVER_BACK_ID = 3;
    public static final int PASSNGER_FRONT_ID =2;
    public static final int PASSNGER_BACK_ID = 1;
    public static final int DRIVER_FRONT_ID = 4;
    public static final int INTAKE_ID = 5;
    public static final int FIRST_PIVOT_ID = 6;
    public static final int SECOND_PIVOT_ID = 7;
    public static final int EXTEND_ID = 8;
   
    //solionds 
   

    

   
  

    

   

   
    // Speed controller groups.
    public static final boolean LEFT_MOTORS_INVERTED = false;
    public static final boolean RIGHT_MOTORS_INVERTED = false;

    
    
    
    // Controllers.
    public static final int XBOX_CONTROLLER_PORT_0 = 0;
    public static final int XBOX_CONTROLLER_PORT_1 = 1;
 

    // Gyro.
    public static final double GYRO_CYCLE_TIME = 0.02;
    public static final int ENCODER_VALUE_PER_FOOT = 2440;

    //Claw
    public static final int CLAW_SOLIOND_0 = 4;
    public static final int CLAW_SOLIOND_1 = 1;

    //Hopper
    public static final int HOPPER_SOLIOND_0 = 0;
    public static final int HOPPER_SOLIOND_1 = 5;

    //Sliding
    public static final int SLIDING_SOLIOND_0 = 2;
    public static final int SLIDING_SOLIOND_1 = 3;
}

   
    