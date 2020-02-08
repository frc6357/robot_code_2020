package frc.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SK20Climb;

/**
 * An example command that uses an example subsystem.
 */
public class WinchRobotCommand extends CommandBase {
    private final SK20Climb m_subsystem;
    private boolean startWinch; // tells whether or not winch is turned on or not
    private double time;
    private String debugger;

    /**
     * WinchRobot command tells whether or not to winch or stop winching the robot.
     * 
     * @param subsytem   is the SK20Climb subsystem
     * @param startMotor tells whether or not the winch motor should be on or off
     */
    public WinchRobotCommand(SK20Climb subsystem, Boolean startMotor) {
        m_subsystem = subsystem;
        startWinch = startMotor;
        time = DriverStation.getInstance().getMatchTime();
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        debugger = DriverStation.getInstance().getGameSpecificMessage();

        if (time <= 30 || debugger == "D") {
            // when true start winch
            if (startWinch) {
                m_subsystem.startWinchRobot();
            }
            // when false stop winch
            else {
                m_subsystem.stopWinchRobot();
            }
        } else if (time > 30) {
            // For Testing reasons
            System.out.println("Time is not for climb");
        } else {
            // For Testing reasons
            System.out.println("Time is not known");
        }
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return true;
    }
}