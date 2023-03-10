package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Drivetrain;

public class StopDrive extends InstantCommand {
    public StopDrive(Drivetrain drivetrain) {
        super(drivetrain::stop, drivetrain);
    }
}
