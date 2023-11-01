// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {

  /** State variables */
  private boolean isActive = false;
  private boolean isSensingTarget = false;

  /** Simulation related variables */
  private long simNextEventTime = 0;

  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {}

  /**
   * 
   * @return
   */
  public void exampleDoSomething() {
    if (isActive) {
      // Do something
      System.out.println("Sensing target, do something");
    }
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * Builds a method that activates the subsystem
   *
   * @return a command
   */
  public CommandBase exampleActivateCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          System.out.println("Example Activated");
          isActive = true;
        });
  }

  /**
   * Builds a method that deactivates the subsystem
   *
   * @return a command
   */
  public CommandBase exampleDeactivateCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          System.out.println("Example Deactivated");
          isActive = false;
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return isSensingTarget;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  /**
   * Toggle whether the subsystem is sensing a target
   */
  private void simEvent() {
    // Toggle the sensing state
    isSensingTarget = !isSensingTarget;
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
    long now = System.currentTimeMillis();

    if (now >= simNextEventTime) {
      simEvent();
      simNextEventTime = now + (1000 * 2);
    }
  }
}
