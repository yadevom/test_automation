package co.com.choucair.certificacion.academy.model;

import co.com.choucair.certificacion.academy.tasks.Login;
import co.com.choucair.certificacion.academy.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AcademyChoucairData {

    private String strUser;
    private String strPassword;
    private String strCourse;

    public AcademyChoucairData() {
    }

    public AcademyChoucairData(String strUser, String strPassword, String strCourse) {
        this.strUser = strUser;
        this.strPassword = strPassword;
        this.strCourse = strCourse;
    }

    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void perfomAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(ChoucairLoginPage.USER),
                Enter.thevalue((strPassword)).into(ChoucairLoginPage.PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }

    public String getStrUser() {
        return strUser;
    }

    public void setStrUser(String strUser) {
        this.strUser = strUser;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrCourse() {
        return strCourse;
    }

    public void setStrCourse(String strCourse) {
        this.strCourse = strCourse;
    }
}
