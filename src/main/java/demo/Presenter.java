package demo;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;

@SpringComponent
@UIScope
public class Presenter {
	
	public String saySomething() {
		return "hi!";
	}

}
