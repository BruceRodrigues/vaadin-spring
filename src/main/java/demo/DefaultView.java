package demo;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = DefaultView.VIEW_NAME)
public class DefaultView extends VerticalLayout implements View {
	
	private static final long serialVersionUID = 1L;
	
	protected static final String VIEW_NAME = "";
	
	@PostConstruct
	private void init() {
		this.addComponent(new Label("DEFAULT VIEW"));
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}

}
