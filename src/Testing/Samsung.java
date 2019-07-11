package Testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	@Qualifier("snapDragon")
	MobileProcessor mp; 
	
	public MobileProcessor getMp() {
		return mp;
	}

	public void setMp(MobileProcessor mp) {
		this.mp = mp;
	}

	public void config() {
		System.out.println("Octa core, 4 gb, 12 mp Camera");
		mp.process();
	}
}
