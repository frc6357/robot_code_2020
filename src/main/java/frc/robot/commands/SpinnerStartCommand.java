package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SK20ColorWheel;

/**
 * A command that does three different parts. The first part extends the mechanism(assuming that the
 * driver is already at the position to spin the color panel). The second part is where the color sensor
 * monitors it's postion using isUnderControlPanel, this second part keeps running until the color sensor
 * detects if it is under the control panel. The third and final part is where it starts the motor to spin
 * the color panel.
 */
public class SpinnerStartCommand extends CommandBase {
  private final SK20ColorWheel m_subsystem;
  private boolean isFinished = false;

  /**
   * Creates a new SpinnerStartCommand instance that sets up the member subsystem
   * and sets startSpinner if the instance wants to start the motor.
   *
   * @param SK20ColorWheel The subsystem used by this command to see if the mechanism is extended.
   * @param startMotor     Checks to see if the instance wants to start the motor.
   */
  public SpinnerStartCommand(SK20ColorWheel subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
      isFinished = false;
  }

  /**
   * This command extends the lifter and keeps running until the color sensor is under the control
   * panel is which case it will turn on the motor.
   */
  @Override
  public void execute() {
      m_subsystem.activateSpinnerRoller();
      isFinished = true;
  }

  // Called once the command ends or is interrupted.
  // For safety if something were to happen then we should just deactivate the motor.
  @Override
  public void end(boolean interrupted) {
    // We deliberately leave the motor running when the command ends.
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return isFinished;
  }
}
