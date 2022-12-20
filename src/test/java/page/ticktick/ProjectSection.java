package page.ticktick;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class ProjectSection {
    public Button addNewProjecButton = new Button(By.xpath("//div[@id='project-list-scroller']/div[2]/section[1]/div[1]/li/a/button[2]/div"));
    public TextBox nameProjectTxtBox= new TextBox(By.id("edit-project-name"));
    public Button addButton = new Button(By.xpath("//button[@class='ap-button ap-button-middle ap-button-primary']"));
    public Button menuProject = new Button(By.xpath("//ul[@id=\"project-ul\"]/div/li/div/button/div[3]/div"));
    public Button deleteProject = new Button(By.xpath("//div[13]/div/div/div[2]/ul/li[6]/a"));
    public Button confirmDelete = new Button(By.xpath("//button[@class='rounded-[4px] leading-none transition-colors duration-200 ease-in text-center cursor-pointer inline-block relative disabled:cursor-not-allowed btn btn-primary bg-primary text-white border border-[transparent] border-solid disabled:bg-btn-disable-color hover:bg-btn-hover-color focus:bg-btn-hover-color  active:bg-btn-active-color med h-[32px] text-[14px] px-[18px] min-w-[80px]']"));
    public ProjectSection(){}

    public void clickOnProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//td[text()='"+nameProject+"']"));
        projectCreated.click();
    }

    public boolean isProjectDisplayedInList(String nameProject){
        Label projectCreated = new Label(By.xpath("//td[text()='"+nameProject+"']"));
        return projectCreated.isControlDisplayed();
    }

    public Label getProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//td[text()='"+nameProject+"']"));
        return projectCreated;
    }

}
