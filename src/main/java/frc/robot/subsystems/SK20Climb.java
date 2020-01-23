package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Ports;
import frc.robot.TuningParams;
import frc.robot.Constants.ClimbPolarity;

/* 
The SK20Climb class is a subsystem that interacts with the climbing mechanism in order to deploy the arm and winch the robot up
*/
public class SK20Climb extends SubsystemBase {

    private WPI_VictorSPX winchClimbLeft;
    private WPI_VictorSPX winchClimbRight;
    private SpeedControllerGroup winchMotorGroup;
    private Solenoid armReleaseSolenoid = null;
    private ClimbPolarity climbPolarity = ClimbPolarity.CLIMB_IS_OFF;

    public SK20Climb() {
        armReleaseSolenoid = new Solenoid(Ports.armLockDown);
        winchClimbLeft = new WPI_VictorSPX(Ports.winchClimbLeft);
        winchClimbRight = new WPI_VictorSPX(Ports.winchClimbRight);
        winchMotorGroup = new SpeedControllerGroup(winchClimbLeft, winchClimbRight);

    }

    /*
     * When deployArm is called the spring will release, deploying the arm in the
     * procress. After the First arm is deployed the second arm will deploy after
     * which the entire climb mechanism will lock into position
     */
    public void deployArm() {
        switch (climbPolarity) {
        case CLIMB_IS_ON:
            armReleaseSolenoid.set(true);
            break;
        case CLIMB_IS_OFF:
            armReleaseSolenoid.set(false);
            break;
        }
    }

    /*
     * When the startWinchRobot method is called a motor will start to winch the
     * entirity of the robot upwards
     */
    public void startWinchRobot() {

        winchMotorGroup.set(TuningParams.WINCH_MOTOR_SPEED);
    }

    /*
     * When the stopWinchRobot method is called the motor winching the robot will be
     * stopped.
     */
    public void stopWinchRobot() {
        winchMotorGroup.stopMotor();
        //make sure there is the rachet
    }

}