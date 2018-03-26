package j1220;

//자식인터페이스  extends 부모인터페이스
public interface AdvanceVolume extends Volume{
   /*
    * public void volumeUp(int level);
	   public void volumeDown(int level);
    */
	abstract public void turnOn();//전원스위치 on
	public abstract void turnOff();//전원스위치 off
}
