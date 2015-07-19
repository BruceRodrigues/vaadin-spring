package demo;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = ScopedView.VIEW_NAME)
public class ScopedView extends VerticalLayout implements View {
	
	public final static String VIEW_NAME = "scoped";
	
	@PostConstruct
	private void init() {
		this.addComponent(new Label("Scoped view"));
	}

	@Override
	public void enter(ViewChangeEvent event) {
		System.out.println("ENTER VIEW");
	}

}
