package bddshowcasepackage;

import io.cucumber.java.de.Angenommen;
import io.cucumber.java.de.Wenn;
import io.cucumber.java.de.Dann;

import static org.junit.Assert.*;

public class BDDShowcaseStepDefinitions {

    Employee aEmployee;
    String aStartTime, aEndTime;

    @Angenommen("Ein Mitarbeiter ist im System erfasst und einem Projekt zugeordnet")
    public void ein_mitarbeiter_ist_im_system_erfasst_und_einem_projekt_zugeordnet() {

        aEmployee = new Employee("das beste Projekt", EmployeeType.MA);

    }
    @Wenn("der Mitarbeiter die Kommenzeit {string} und Gehenzeit {string} erfasst")
    public void der_mitarbeiter_die_kommenzeit_und_gehenzeit_erfasst(String startTime, String endTime) {

        aStartTime = startTime;
        aEndTime = endTime;

    }
    @Dann("berechnet das System korrekt die neue gesetzlich vorgeschriebene Ruhepause von {int} Minuten")
    public void berechnet_das_system_korrekt_die_neue_gesetzlich_vorgeschriebene_ruhepause_von_minuten (Integer pauseTime) {

        assertEquals(pauseTime, aEmployee.getPauseTime(aStartTime, aEndTime), 0);
    }
}