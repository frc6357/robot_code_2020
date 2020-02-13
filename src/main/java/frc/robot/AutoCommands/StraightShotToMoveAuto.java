package frc.robot.AutoCommands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.TuningParams;
import frc.robot.commands.DriveStraightCommand;
import frc.robot.commands.FireNumberBallsCommand;
import frc.robot.subsystems.SK20Drive;
import frc.robot.subsystems.SK20Launcher;

public class StraightShotToMoveAuto
{
    private SequentialCommandGroup commandGroup;

    public StraightShotToMoveAuto(SK20Drive m_driveSubsystem, SK20Launcher m_launcherSubsystem)
    {
        m_launcherSubsystem.setLauncherSpeed(TuningParams.MAX_RPM);
        commandGroup = new SequentialCommandGroup(new FireNumberBallsCommand(3, m_launcherSubsystem));
        commandGroup.addCommands(new DriveStraightCommand(m_driveSubsystem, TuningParams.AUTO_STRAIGHTSTMOVE_DRIVE_DISTANCE));
    }
}