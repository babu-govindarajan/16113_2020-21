package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "JustAnotherTeleOPcode", group = "")
public class JustAnotherTeleOPcode extends LinearOpMode {

    private DcMotor leftFront;
    private DcMotor rightFront;
    private DcMotor leftBack;
    private DcMotor rightBack;

    //private DcMotor intake;
    //private DcMotor carousel;
    //private DcMotor shooter;
    //private DcMotor wobble;

    //private Servo claw;

    //private final double robotSpeedCarousel = -0.75;
    //private final float robotSpeedRamp = 0.36f;
    //private final float robotSpeedLowGoal = 0.28f;
    //private final float robotSpeedClaw = 0.15f;
    //private final float robotSpeedArm = 0.14f;


    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        float speed = 0.0f;
        double turnspeed = 0.0f;

        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");

        //wobble = hardwareMap.dcMotor.get("wobble");
        //intake = hardwareMap.dcMotor.get("intake");
        //shooter = hardwareMap.dcMotor.get("shooter");
        //carousel = hardwareMap.dcMotor.get("carousel");
        //claw = hardwareMap.servo.get("claw");

        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            speed = 0.25f;
            leftFront.setPower(-speed);
            leftBack.setPower(-speed);
            rightFront.setPower(-speed);
            rightBack.setPower(speed);
            // Put run blocks here.
            while (opModeIsActive()) {

                //Right Trigger makes robot go forward

                leftFront.setPower(-gamepad1.left_stick_y);
                leftBack.setPower(-gamepad1.left_stick_y);
                rightFront.setPower(gamepad1.left_stick_y);
                rightBack.setPower(gamepad1.left_stick_y);
                telemetry.addData("Moving", "Backward %f", gamepad1.left_stick_y);
                telemetry.update();
                telemetry.addData("Moving", "Backward %f", gamepad1.left_stick_y);


                //Left Trigger makes robot go backward

                //    leftFront.setPower(gamepad1.left_stick_y);
                //  leftBack.setPower(gamepad1.left_stick_y);
                //    rightFront.setPower(-gamepad1.left_stick_y);
                //  rightBack.setPower(-gamepad1.left_stick_y);
                //    telemetry.addData("Moving", "Forward %f", gamepad1.left_stick_y);
                //  telemetry.update();
                //Dpad right makes robot shuffle right
                if (gamepad1.dpad_left) {
                    leftFront.setPower(1);
                    leftBack.setPower(-1);
                    rightFront.setPower(1);
                    rightBack.setPower(1);
                }
                //Dpad left makes robot shuffle left
                if (gamepad1.dpad_right) {
                    leftFront.setPower(-1);
                    leftBack.setPower(1);
                    rightFront.setPower(-1);
                    rightBack.setPower(-1);
                }

                //Left Joystick makes robot turn

                turnspeed = gamepad1.left_stick_x;
                leftFront.setPower(-turnspeed);
                leftBack.setPower(-turnspeed);
                rightFront.setPower(-turnspeed);
                rightBack.setPower(turnspeed);
                //Grip and Lift Wobble Goal
/*
                if (gamepad2.dpad_up) {
                    //claw.setPosition(50);
                    wobble.setPower(-0.3);

                }
                //Release and Drop Wobble Goal


                if (gamepad2.dpad_down){
                }
                    //claw.setPosition(20);
                    wobble.setPower(0.3);

                }*/
                /*while (gamepad1.a) {
                    leftFront.setPower(0.5);
                    sleep(1000);
                    leftFront.setPower(0);
                }
                //Suck in ring with right bumper
                if (gamepad2.right_bumper) {
                    carousel.setPower(0.75);
                    intake.setPower(-0.5);
                    telemetry.addData("Moving", "Attachment");
                    telemetry.update();
                }
                shooter.setPower(gamepad2.right_trigger);
                //Shoot with Left Bumper
                if (gamepad2.left_bumper) {
                    shooter.setPower(-0.70);
                }
                // if neither of the bumpers are pressed, stop all attachments
                else {
                    shooter.setPower(0);
                    carousel.setPower(0);
                    intake.setPower(0);
                    wobble.setPower(0);
                    claw.setPosition(0);
                }
                telemetry.update();
                sleep(100);*/
            }
        }
    }
}
