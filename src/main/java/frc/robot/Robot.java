/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot 
{
    private enum testModeChoice 
    {
        DRIVE, LAUNCHER, CLIMB, INTAKE, COLOR_WHEEL, OTHER
    };

    

    // private enum driveTestModeChoice{TestStraightCommandGroup,
    // TestStraightInterruptCommandGroup, TestTurnCommandGroup,
    // TestTurnInterruptCommandGroup}
    private Command m_autonomousCommand;
    private RobotContainer m_robotContainer;

    SendableChooser<testModeChoice> testModeSelector = new SendableChooser<testModeChoice>();
    
    // SendableChooser<driveTestModeChoice> driveTestModeSelector = new
    // SendableChooser<driveTestModeChoice>();

    // public Robot() {
    // WPI_VictorSPX frontLeft = new WPI_VictorSPX(Ports.frontLeftDrive);
    // WPI_VictorSPX backLeft = new WPI_VictorSPX(Ports.backLeftDrive);
    // WPI_VictorSPX frontRight = new WPI_VictorSPX(Ports.frontRightDrive);
    // WPI_VictorSPX backRight = new WPI_VictorSPX(Ports.backRightDrive);
    // SpeedControllerGroup motorGroupLeft = new SpeedControllerGroup(frontLeft,
    // backLeft);
    // SpeedControllerGroup motorGroupRight = new SpeedControllerGroup(frontRight,
    // backRight);
    // ScaledEncoder encoderLeft = null;
    // ScaledEncoder encoderRight = null;
    // Solenoid gearShiftSolenoid = null;
    // ShiftPolarity shiftPolarity = ShiftPolarity.PRESSURE_IS_LOW;
    // BaseDrive drive = new BaseDrive(motorGroupLeft, motorGroupRight, encoderLeft,
    // encoderRight, gearShiftSolenoid,
    // shiftPolarity);
    // smoothDrive = new SmoothDrive(drive);
    // }

    /**
     * This function is run when the robot is first started up and should be used
     * for any initialization code.
     */
    public Robot() 
    {

        // m_driveStraightCommand = command;

        // Drive
        // driveTestModeSelector.addOption("TestStraightCommandGroup",
        // driveTestModeChoice.TestStraightCommandGroup);
        // driveTestModeSelector.addOption("TestStraightInterruptCommandGroup",
        // driveTestModeChoice.TestStraightInterruptCommandGroup);
        // driveTestModeSelector.addOption("TestTurnCommandGroup",
        // driveTestModeChoice.TestTurnCommandGroup);
        // driveTestModeSelector.addOption("TestTurnInterruptCommandGroup",
        // driveTestModeChoice.TestTurnInterruptCommandGroup);

        

    }

    @Override
    public void robotInit() 
    {
        SmartDashboard.putBoolean("Ball Management Toggle", true);
        SmartDashboard.putBoolean("Spin Color Wheel Manually", false);
        m_robotContainer = new RobotContainer();

    }

    /**
     * This function is called every robot packet, no matter the mode. Use this for
     * items like diagnostics that you want ran during disabled, autonomous,
     * teleoperated and test.
     *
     * <p>
     * This runs after the mode specific periodic functions, but before LiveWindow
     * and SmartDashboard integrated updating.
     */
    @Override
    public void robotPeriodic() 
    {
        // Runs the Scheduler. This is responsible for polling buttons, adding
        // newly-scheduled
        // commands, running already-scheduled commands, removing finished or
        // interrupted commands,
        // and running subsystem periodic() methods. This must be called from the
        // robot's periodic
        // block in order for anything in the Command-based framework to work.
        CommandScheduler.getInstance().run();
        // boolean IBMToggle = SmartDashboard.getBoolean("Ball Mangement Toggle", true);
        // RobotContainer.toggleBallManagement.setPressed(IBMToggle);
        boolean colorWheelActivate = SmartDashboard.getBoolean("Spin Color Wheel Manually", false);
        RobotContainer.spinColorWheel.setPressed(colorWheelActivate);
    }

    /**
     * This autonomous (along with the chooser code above) shows how to select
     * between different autonomous modes using the dashboard. The sendable chooser
     * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
     * remove all of the chooser code and uncomment the getString line to get the
     * auto name from the text box below the Gyro
     *
     * <p>
     * You can add additional auto modes by adding additional comparisons to the
     * switch structure below with additional strings. If using the SendableChooser
     * make sure to add them to the chooser code above as well.
     */
    @Override
    public void autonomousInit() 
    {
        
        m_autonomousCommand = m_robotContainer.getAutonomousCommand();
        // TODO: GET A REAL AUTO CHOOSER IN LATER!!!
        
        // schedule the autonomous command (example)
        if (m_autonomousCommand != null) 
        {
            m_autonomousCommand.schedule();
        }
        



        

        }

        // switch(){
        // case driveTestModeChoice.TestStraightCommandGroup:

        // break;
        // case driveTestModeChoice.TestStraightInterruptCommandGroup:

        // break;
        // case driveTestModeChoice.TestTurnCommandGroup:

        // break;
        // case driveTestModeChoice.TestTurnInterruptCommandGroup:

        // break;
        // }
        
        
    

    /**
     * This function is called periodically during autonomous.
     */
    @Override
    public void autonomousPeriodic() {
      
    }

    @Override
    public void teleopInit() 
    {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (m_autonomousCommand != null) {
            m_autonomousCommand.cancel();
        }
    }

    /**
     * This function is called periodically during operator control.
     */
    @Override
    public void teleopPeriodic() 
    {

    }

    @Override
    public void testInit() 
    {
        // Cancels all running commands at the start of test mode.
        CommandScheduler.getInstance().cancelAll();
    }

    /**
     * This function is called periodically during test mode.
     */
    @Override
    public void testPeriodic() 
    {
    }
}
