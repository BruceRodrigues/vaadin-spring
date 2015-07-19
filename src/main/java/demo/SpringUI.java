package demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@com.vaadin.spring.annotation.SpringUI
public class SpringUI extends UI {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private SpringViewProvider viewProvider;

	@Override
	protected void init(VaadinRequest request) {
		
		final VerticalLayout root = new VerticalLayout();
		root.setSizeFull();
		root.setMargin(true);
		root.setSpacing(true);
		this.setContent(root);
		
		CssLayout navigationBar = new CssLayout();
		navigationBar.addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
		navigationBar.addComponent(this.createButton("DefaultView", ScopedView.VIEW_NAME));
		navigationBar.addComponent(this.createButton("TEST", TestView.VIEW_NAME));
		root.addComponent(navigationBar);
		
		final Panel viewContainer = new Panel();
		viewContainer.setSizeFull();
		root.addComponent(viewContainer);
		root.setExpandRatio(viewContainer, 1.0f);
		
		Navigator navigator = new Navigator(this, viewContainer);
		navigator.addProvider(this.viewProvider);
	}
	
	private Button createButton(String caption, final String viewName) {
		Button b = new Button(caption);
		b.addStyleName(ValoTheme.BUTTON_SMALL);
		b.addClickListener(event -> this.getUI().getNavigator().navigateTo(viewName));
		return b;
	}
	

}
