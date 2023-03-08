package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class pneumatics extends SubsystemBase {
  /** Creates a new pneumatics. */
  Compressor pcmcompressor = new Compressor(PneumaticsModuleType.CTREPCM);
  boolean pressureSwitch;
  public pneumatics() {}


  public void PressureControl(){
    pressureSwitch = pcmcompressor.getPressureSwitchValue();
    // System.out.println(pressureSwitch);
    if (pressureSwitch) {
      pcmcompressor.disable();
    }
    else {
      pcmcompressor.enableDigital();
    }
  }

  @Override
  public void periodic() {
    
    // This method will be called once per scheduler run
  }
}