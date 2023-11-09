// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ArmSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An Arm command that uses an Arm subsystem. */
public class ArmCommand extends CommandBase {

  private final ArmSubsystem m_subsystem;

  /**
   * Creates a new ArmCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ArmCommand(ArmSubsystem subsystem) {
    m_subsystem = subsystem;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_subsystem.ArmDoSomething();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    ArmSubsystem.
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    upMotor(0);
    }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}