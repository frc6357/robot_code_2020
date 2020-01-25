package frc.robot;

import edu.wpi.first.wpilibj.util.Color;

public final class TuningParams 
{
    //////////////////////////////
    // Drive Params
    //////////////////////////////
    public static final double ACCEL_MAX_TOWARDS_FORWARD    = 0.075;
    public static final double ACCEL_MAX_TOWARDS_BACKWARD   = -0.075;
    public static final double DECEL_MAX_TOWARDS_FORWARD    = 0.075;
    public static final double DECEL_MAX_TOWARDS_BACKWARD   = -0.075;

    public static final double CONTROLLED_TURN_SPEED        = 0.5;
    public static final double ANGLE_TURN_TOLERANCE         = 1;

    public static final boolean ENCODER_LEFT_REVERSED       = false;
    public static final boolean ENCODER_RIGHT_REVERSED      = true;
    public static final int ENCODER_PULSES                  = 0;
    public static final double WHEEL_DIAMETER               = 0;    //In Centimeters

    public static final double AUTONOMOUS_DRIVE_SPEED          = 0.5;
    public static final double STRAIGHT_DRIVE_OFFSET_TOLERANCE = 1.0; //In Centimeters
    public static final double OFFSET_SPEED_INCREMENT          = 0.01;

    //////////////////////////////
    // Color Wheel Params
    //////////////////////////////
    public static final Color RGB_CYAN                      = new Color(0.1799, 0.4451, 0.3799);
    public static final Color RGB_GREEN                     = new Color(0.2199, 0.5200, 0.2300);
    public static final Color RGB_RED                       = new Color(0.4199, 0.3899, 0.1699);
    public static final Color RGB_YELLOW                    = new Color(0.3100, 0.5300, 0.1499);

    public static final int COLOR_WHEEL_PROXIMITY_THRESHOLD = 30;

    //////////////////////////////
    // Launcher Params
    //////////////////////////////
    public static final double LOADER_MAX_SPEED             = 0.75;
    public static final int MAX_RPM                         = 5700;
    public static final int P_VALUE                         = 1;
    public static final int I_VALUE                         = 1;
    public static final int D_VALUE                         = 1;

    //////////////////////////////
    // Intake Params
    //////////////////////////////
    public static final double INTAKE_MAX_SPEED             = 0.5;
    public static final int INTAKE_ENCODER_PULSES           = 2048;
    public static final double INTAKE_WHEEL_DIAMETER        = 2.0; // 2.0 Inches
    public static final boolean INTAKE_BALL_CHECK_INVERT    = false;

    //////////////////////////////
    // Ball Handling Params
    //////////////////////////////
    public static final double BALL_HANDLING_MAX_SPEED      = 0.75;
    public static final boolean BALL_SENSOR_1_INVERT        = false;
    public static final boolean BALL_SENSOR_2_INVERT        = false;
    public static final boolean BALL_SENSOR_3_INVERT        = false;
    public static final boolean BALL_SENSOR_4_INVERT        = false;
    public static final boolean BALL_SENSOR_5_INVERT        = false;


    ///////////////////////////////
    //Climb Params
    ///////////////////////////////
    public static final double WINCH_MOTOR_SPEED            = 0.5;
    public static final boolean DEPLOY_CLIMB_ARM            = true; //assumes that the solenoid needs to be energized be extended

}