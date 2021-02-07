package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;


@TeleOp(name = "TeleOpsBanana", group = "TeleOp")
public class TeleOpsCode extends LinearOpMode {
    HardwarePushbot robot = new  HardwarePushbot();
    private static final boolean PHONE_IS_PORTRAIT = true;

    @Override
    public void runOpMode() {
        float speed = 0.0f;
        double turnspeed = 0.0f;

        robot.init(hardwareMap);

        telemetry.addData("Driver", "Waiting for you to Start");
        telemetry.update();

        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.dpad_right) {
                robot.leftFront.setPower(0.75);
                robot.leftBack.setPower(-0.75);
                robot.rightFront.setPower(-0.75);
                robot.rightBack.setPower(0.75);
                telemetry.addData("D-Pad", "Right");
                telemetry.update();
            }

            if (gamepad1.dpad_up) {
                robot.leftFront.setPower(0.2);
                robot.leftBack.setPower(0.2);
                robot.rightFront.setPower(0.2);
                robot.rightBack.setPower(0.2);
                telemetry.addData("D-Pad", "Up");
                telemetry.update();
            }

            if (gamepad1.dpad_left) {
                robot.leftFront.setPower(-0.75);
                robot.leftBack.setPower(0.75);
                robot.rightFront.setPower(0.75);
                robot.rightBack.setPower(-0.75);
                telemetry.addData("D-Pad", "Left");
                telemetry.update();
            }

            if (gamepad1.dpad_down) {
                robot.leftFront.setPower(-0.2);
                robot.leftBack.setPower(-0.2);
                robot.rightFront.setPower(-0.2);
                robot.rightBack.setPower(-0.2);
                telemetry.addData("D-Pad", "Down");
                telemetry.update();
            }


        }
    }
}

