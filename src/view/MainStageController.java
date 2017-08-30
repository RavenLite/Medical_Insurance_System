package view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;
import stage.ApproveStage;
import stage.ChargeStage;
import stage.InfoStage;
import stage.MainStage;
import stage.PublicsStage;
import stage.SearchStage;
import stage.SettingStage;

public class MainStageController {
	public void charge() {
		MainStage.getStage().close();
		ChargeStage.getStage();
	}
	public void approve() {
		MainStage.getStage().close();
		ApproveStage.getStage();
	}
	public void search() {
		MainStage.getStage().close();
		SearchStage.getStage();
	}
	public void publics() {
		MainStage.getStage().close();
		PublicsStage.getStage();
	}
	public void info() {
		MainStage.getStage().close();
		InfoStage.getStage();
	}
	public void refresh() {
		MainStage.getStage().close();
		MainStage.getStage();
	}
	public void setting() {
		SettingStage.getStage();
	}
	@FXML
	private WebView webComponent;
	@FXML 
	private Label time;
	@FXML
	private Label name;
	@FXML
	private Label status;
	
	private String accountName;
	@FXML
	public void initialize() {
		name.setText(accountName);
		webComponent.getEngine().load("http://www.syyb.gov.cn/");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");// 设置日期格式
		time.setText(df.format(new Date()));// new Date()为获取当前系统时间
	}
	public void setMain(String accountName) {
		this.accountName=accountName;
		webComponent.getEngine().load("http://www.syyb.gov.cn/");
		initialize();
	}
}
