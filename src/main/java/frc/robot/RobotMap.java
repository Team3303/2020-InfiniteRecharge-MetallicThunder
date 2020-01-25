/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static final int WHEEL_CONTROLLER_PORT = 0;
  //Drive
  public static final int TALON_FL_ID = 1;
  public static final int TALON_FR_ID = 2;
  public static final int TALON_BL_ID = 3;
  public static final int TALON_BR_ID = 4;

  public static TalonSRX talon_FL;
  public static TalonSRX talon_FR;
  public static TalonSRX talon_BL;
  public static TalonSRX talon_BR;

  public static void init() {
    //Wheel motercontrollers
    talon_FL = new TalonSRX(RobotMap.TALON_FL_ID);
  }
}
