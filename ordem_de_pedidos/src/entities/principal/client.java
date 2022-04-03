package entities.principal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Instant;
public class client {
    private String name;
    private String email;
    private Date birthDate;
    public SimpleDateFormat padraoData = new SimpleDateFormat("dd/MM/yyyy");

    public client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "name: " + name + '\'' +
                ", email: " + email + '\'' +
                ", birthDate: " + "(" + padraoData.format(birthDate) + ")";
    }
}
