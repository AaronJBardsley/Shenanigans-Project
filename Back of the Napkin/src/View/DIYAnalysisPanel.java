package View;

import Model.Project;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class DIYAnalysisPanel {
	
	private static final Label HEADER = new Label("Header");
	
	private static final Label COST = new Label("Cost");
	
	private static final Label COST_PER_KHW = new Label("Cost Per KHW");
	
	private static final Label COST_PER_MONTH = new Label("Cost Per Month");
	
	private static final Label WEIGHT = new Label("Weight");
	
	private static final Label MAN_HOURS = new Label("Man Hours");
	
	private static final Label COST_PER_MAN_HOUR = new Label("Cost Per Man Hour");
	
	private Label myHeader;
	
	private Label myCostLabel;
	
	private Label myCostPerKHWLabel;
	
	private Label myCostPerMonthLabel;
	
	private Label myWeightLabel;
	
	private Label myManHoursLabel;
	
	private Label myCostPerManHourLabel;
	
	private GridPane myAnalysisPanel;
	
	public DIYAnalysisPanel(Project theProject) {
		myHeader = new Label(theProject.getName());
		myCostLabel = new Label(theProject.getTotalUpfrontCost().toString());
		myCostPerKHWLabel = new Label(theProject.getPowerCost().toString());
		myCostPerMonthLabel = new Label(theProject.getCostPerMonth().toString());
		myWeightLabel = new Label(theProject.getMiscCost().toString());
		myManHoursLabel = new Label(theProject.getManHrs() + "");
		myCostPerManHourLabel = new Label(theProject.getCostPerMonth().toString());
		
		myAnalysisPanel = buildAnalysisPanel();
	}
	
	private GridPane buildAnalysisPanel() {
		GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);
        
        GridPane.setConstraints(HEADER, 0, 0);
        GridPane.setConstraints(myHeader, 1, 0);
        GridPane.setConstraints(COST, 0, 1);
        GridPane.setConstraints(myCostLabel, 1, 1);
        GridPane.setConstraints(COST_PER_KHW, 0, 2);
        GridPane.setConstraints(myCostPerKHWLabel, 1, 2);
        GridPane.setConstraints(COST_PER_MONTH, 0, 3);
        GridPane.setConstraints(myCostPerMonthLabel, 1, 3);
        GridPane.setConstraints(WEIGHT, 0, 4);
        GridPane.setConstraints(myWeightLabel, 1, 4);
        GridPane.setConstraints(MAN_HOURS, 0, 5);
        GridPane.setConstraints(myManHoursLabel, 1, 5);
        GridPane.setConstraints(COST_PER_MAN_HOUR, 0, 6);
        GridPane.setConstraints(myCostPerManHourLabel, 1, 6);
        grid.getChildren().addAll(HEADER, myHeader, COST, myCostLabel,
        		COST_PER_KHW, myCostPerKHWLabel, COST_PER_MONTH, myCostPerMonthLabel,
        		WEIGHT, myWeightLabel, MAN_HOURS, myManHoursLabel,
        		COST_PER_MAN_HOUR, myCostPerManHourLabel);
        
        return grid;
	}
	
	public Label getHeader() {
		return myHeader;
	}
	
	public Label getCostLabel() {
		return myCostLabel;
	}
	
	public Label getCostPerKHWLabel() {
		return myCostPerKHWLabel;
	}
	
	public Label getCostPerMonthLabel() {
		return myCostPerMonthLabel;
	}
	
	public Label getWeightLabel() {
		return myWeightLabel;
	}
	
	public Label getManHoursLabel() {
		return myManHoursLabel;
	}
	
	public Label getCostPerManHourLabel() {
		return myCostPerManHourLabel;
	}
	
	public GridPane getPanel() {
		return myAnalysisPanel;
	}
}