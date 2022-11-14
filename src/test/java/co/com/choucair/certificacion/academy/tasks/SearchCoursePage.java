package co.com.choucair.certificacion.academy.tasks;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("Seleccion la universidad choucair")
            .located(By.xpath("//div[@id='universidad']//strong"));

    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.id("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));

    public static final Target NAME_COURSE = Target.the("Alguna cosa")
            .located(By.xpath("//h4[contains(text(),'Recursos NOMBRE DE ALGO....')]"));
}
