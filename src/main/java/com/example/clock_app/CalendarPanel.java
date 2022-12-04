package com.example.clock_app;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class CalendarPanel extends Application {
            Label labelMonth, labelYearChange, selectedCellDate;
            Button previousButton, nextButton;
            TableView calendarTable;
            ComboBox <String> comboBoxYear;
            int year, month, day, currentYear, currentMonth;
            ScrollPane scrollPaneCalendar;

            @Override
            public void start(Stage primaryStage) throws Exception {
                        labelMonth = new Label();
                        labelYearChange = new Label("Change year: ");
                        selectedCellDate = new Label();
                        previousButton = new Button("<<");
                        nextButton = new Button(">>");
                        calendarTable = new TableView<Integer>();
                        comboBoxYear = new ComboBox<String>();
                        scrollPaneCalendar = new ScrollPane(calendarTable);

                        selectedCellDate.setPrefSize(200, 30);
                        selectedCellDate.setStyle(
                                    "-fx-background-color: #ffffff;" +
                                    "-fx-border-color: #000000;" +
                                    "-fx-border-width: 1px;" +
                                    "-fx-border-radius: 5px;" +
                                    "-fx-alignment: center;" +
                                    "-fx-font-size: 13;" +
                                    "-fx-font: Arial;"
                        );
                        selectedCellDate.setTextFill(javafx.scene.paint.Color.BLACK);
            }
}
