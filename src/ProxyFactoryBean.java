import java.awt.List;

public class ProxyFactoryBean {
	private Object target;  
	private List interceptorNames;
	public List getInterceptorNames() {
		return interceptorNames;
	}
	public void setInterceptorNames(List interceptorNames) {
		this.interceptorNames = interceptorNames;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}  

}
