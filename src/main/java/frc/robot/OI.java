/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    /*
    * Gamepad Button IDs;
    * 1: A
    * 2: B
    * 3: X
    * 4: Y
    * 5: Left Bumper
    * 6: Right Bumper
    * 7: Back
    * 8: Start
    */

  public Joystick gamepad = new Joystick(0);
  Joystick joystick_left = new Joystick(1);
  Joystick joystick_right = new Joystick(2);


  public OI() {}

  //Left joystick
  public double getLeftJoystickX() { return joystick_left.getX(); }
  public double getLeftJoystickY() { return joystick_left.getY(); }
  public double getLeftJoystickZ() { return joystick_left.getZ(); }
  //Right joystick
  public double getRightJoystickX() { return joystick_right.getX(); }
  public double getRightJoystickY() { return joystick_right.getY(); }
  public double getRightJoystickZ() { return joystick_right.getZ(); }
}
