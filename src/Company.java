
import javax.persistence.*;

@Entity
public class Company {

    @Id
    @GeneratedValue
    @Column(name = "Identyfikator Firmy")
    private int _idC;

    @Column(name = "Nazwa Firmy")
    private String _companysName;

    @OneToOne
    private Miasto miasto;

    public Company() {
    }

    public void setMiasto(Miasto miasto) {
        this.miasto = miasto;
    }

    public Miasto getMiasto() {
        return miasto;
    }

    public Company(String _companysName) {
        this._companysName = _companysName;
    }

    public int get_idC() {
        return _idC;
    }

    public void set_idC(int _idC) {
        this._idC = _idC;
    }

    public String get_companysName() {
        return _companysName;
    }

    public void set_companysName(String _companysName) {
        this._companysName = _companysName;
    }
}
