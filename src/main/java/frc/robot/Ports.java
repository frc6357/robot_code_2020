/** 
 * Definitions of all hardware connections and hardware-related
 * IDs on the robot. This class should be included in any other
 * class which needs to interact with the robot hardware. The
 * values here form part of the robot's control system configuration
 * specification.
 */

package frc.robot;

public class Ports 
{

    //////////////////////////////
    // Robot Infrastructure
    //////////////////////////////
    public static final int pcm1                        = 1;    // CAN ID
    public static final int pcm2                        = 2;    // CAN ID

    //////////////////////////////
    // I2C device addresses
    //////////////////////////////
    public static final int i2cColorSensor              = 0x52;

    //////////////////////////////
    // Drivetrain Addresses
    //////////////////////////////
    public static final int frontLeftDrive              = 10; // CAN ID 10
    public static final int frontRightDrive             = 11; // CAN ID 11
    public static final int backLeftDrive               = 12; // CAN ID 12
    public static final int backRightDrive              = 13; // CAN ID 13

    public static final int leftEncoderA                = 0; // DIO
    public static final int leftEncoderB                = 1; // DIO
    public static final int rightEncoderA               = 2; // DIO
    public static final int rightEncoderB               = 3; // DIO

    //////////////////////////////
    // Intake Addresses
    //////////////////////////////
    public static final int intakeMotor                 = 20; // CAN ID 20

    public static final int intakeMoverExtend           = 0; // PCM 1, Output 0
    public static final int intakeMoverRetract          = 1; // PCM 1, Output 1

    public static final int intakeOpenCheck             = 4; // DIO
    public static final int intakeSpeedCheckA           = 5; // DIO
    public static final int intakeSpeedCheckB           = 6; // DIO
    public static final int intakeBallCheck             = 7; // DIO

    ///////////////////////////////
    // Ball Handling Addresses
    ///////////////////////////////
    public static final int ballHandlingBelt            = 21; // CAN ID 21
    public static final int ballHandlingBelt2           = 22; // CAN ID 22

    public static final int ballSensor1                 = 8;  // DIO
    public static final int ballSensor2                 = 9;  // DIO
    public static final int ballSensor3                 = 10; // DIO
    public static final int ballSensor4                 = 11; // DIO
    public static final int ballSensor5                 = 12; // DIO

    ///////////////////////////////
    // Ball Launcher Addresses
    ///////////////////////////////
    public static final int ballLauncherMotor           = 23; // CAN ID 22
    public static final int ballLoaderMotor             = 24; // CAN ID 23
    public static final int ballReleaseMotor            = 25; // CAN ID 24

    public static final int launcherHoodExtend          = 4; // PCM 1, Output 4
    public static final int launcherHoodRetract         = 5; // PCM 1, Output 5

    ///////////////////////////////
    // Climb Addresses
    ///////////////////////////////
    public static final int winchClimbLeft              = 30; // CAN ID 30
    public static final int winchClimbRight             = 31; // CAN ID 31

    public static final int armLockDown                 = 6; // PCM 1, Output 6

    ///////////////////////////////
    // Control Wheel Addresses
    ///////////////////////////////
    public static final int colorWheelSpinner           = 40; // CAN ID 40

    public static final int colorSpinnerExtend          = 0;    // PCM 2, Output 0
    public static final int colorSpinnerRetract         = 1;    // PCM 2, Output 1



    ///////////////////////////////
    // Additional hardware
    ///////////////////////////////
    public static final int MindSensorsCANLight         = 3; // CAN ID of LED strip controller

    ///////////////////////////////
    // Operator Interface
    ///////////////////////////////
    public static final int OIDriverJoystick            = 0;

    public static final int OIDriverLeftDrive           = 1;    // Left Joystick Y
    public static final int OIDriverRightDrive          = 5;    // Right Joystick Y

    public static final int OIDriverSetLowGear          = 1;    // Sets the low gear (A)
    public static final int OIDriverSetHighGear         = 4;    // Sets the high gear (Y) 

    public static final int OIDriverSetSlowmodeLeft     = 5;    // Set slowmode (LeftBumper)
    public static final int OIDriverSetSlowmodeRight    = 6;    // Set slowmode (RightBumper)



    public static final int OIOperatorJoystick          = 1;

    public static final int OIOperatorStopColorWheel    = 1;    // Button A
    public static final int OIOperatorStartThreeRotate  = 9;    // Left Joystick press button
    public static final int OIOperatorStartSetColor     = 10;   // Right Joystick press button
    public static final int OIOperatorColorWheelSpin    = 8;    // Start button
    public static final int OIOperatorColorWheelLift    = 7;    // Back button

    public static final int OIOperatorShootBall         = 2;    // Button B
    public static final int OIOperatorToggleIntake      = 3;    // Button X

    public static final int OIOperatorSetHighAngle      = 0;    // POV 0

    public static final int OIOperatorArmClimb          = 4;    // Button Y
    public static final int OIOperatorDeployArm         = 5;    // Pneumatic for releasing the arm (Left Bumper)
    public static final int OIOperatorRunWinchArm       = 6;    // Motor for Winching arm while held (RightBumper)




    
}