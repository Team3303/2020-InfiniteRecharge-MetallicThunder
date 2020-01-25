/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  TalonSRX talon_FL;
  TalonSRX talon_FR;
  TalonSRX talon_BL;
  TalonSRX talon_BR;

  DifferentialDrive differentialDrive;

  public DriveTrain() {
    talon_FL = RobotMap.talon_FL;
    talon_FR = RobotMap.talon_FR;
    talon_BL = RobotMap.talon_BL;
    talon_BR = RobotMap.talon_BR;

    differentialDrive = new DifferentialDrive(talon_BL, talon_BR);

    talon_FL.follow(talon_BL);
    talon_FR.follow(talon_BR);

    /* Disable all moter controllers */
    talon_BL.set(ControlMode.PercentOutput, 0);
    talon_BR.set(ControlMode.PercentOutput, 0);

    /* Factory default all hardware to prevent unexpected behaivor */
    talon_BL.configFactoryDefault();
    talon_BR.configFactoryDefault();

    /* Set neutral mode */
    talon_BL.setNeutralMode(NeutralMode.Brake);
    talon_BR.setNeutralMode(NeutralMode.Brake);

  }

  public void tankDrive( double leftValue, double rightValue) {
    differentialDrive.tankDrive(leftValue, rightValue);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
