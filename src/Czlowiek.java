import javax.persistence.*;

@Entity(name = "Czlowieki")
@Table(name = "Ludzie")
public class Czlowiek {

    @Id
    @GeneratedValue
    @Column(name = "IdentyfikatorC")
    private int idC;

    @Column(name = "NazwiskoC")
    private String _nazwisko;


    public void set_nazwisko(String _nazwisko) {
        this._nazwisko = _nazwisko;
    }

    public String get_nazwisko() {
        return _nazwisko;
    }


}
