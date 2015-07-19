package demo;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = TestView.VIEW_NAME)
@UIScope
public class TestView  extends VerticalLayout implements View{
	
	private static final long serialVersionUID = 1L;
	
	public final static String VIEW_NAME = "test";
	
	@PostConstruct
	private void init() {
		this.addComponent(new Label("TEST VIEW"));
		System.out.println("POST CONSTRUCT");
	}

	@Override
	public void enter(ViewChangeEvent event) {
		System.out.println("ENTER TEST VIEW");
	}

}
