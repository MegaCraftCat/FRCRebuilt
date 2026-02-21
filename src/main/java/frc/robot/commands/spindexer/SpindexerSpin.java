package frc.robot.commands.spindexer;

import frc.robot.subsystems.Spindexer;
import frc.robot.testingdashboard.Command;
import frc.robot.utils.Configuration;

public class SpindexerSpin extends Command{

    Spindexer m_spindexer;
    Configuration cfg;
    

    public SpindexerSpin(){
        super(Spindexer.getInstance(), "Spindexer", "Measured Current");

        m_spindexer = Spindexer.getInstance();
        cfg = Configuration.getInstance();
    }

    @Override 
    public void initialize() {}

    @Override
    public void execute() {
        
        m_spindexer.spinIn(cfg.getInt("Spindex", "spindexSpeed"));
    }

    @Override
    public void end(boolean interrupted) {
        m_spindexer.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
    
}
