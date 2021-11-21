package adapter;

import java.time.LocalDate;

public class PersonalData implements PersonalDataI{
    private String name;
    private LocalDate bDay;
    private String email;
    private String telephone;

    public PersonalData(String name, LocalDate bDay, String email, String telephone) {
        this.name = name;
        this.bDay = bDay;
        this.email = email;
        this.telephone = telephone;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getBDay() {
        return bDay;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }
}
