// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.drive.RobotDriveBase;
import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  TalonSRX motors = new TalonSRX;
  public Drivetrain() {
    /* Initialize motors
      Motors: SIM
      Motor controllers: Talon SRX
      Encoders: Unknown
    */
    
    

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
