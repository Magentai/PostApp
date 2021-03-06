@Entity
@Table(name = "TRANSFER")
public class Transfer {

    int id;
    int package_id;
    Date date;
    int status_id;
    int office_id;

    public Transfer() {
    }

    public Transfer(int id, int package_id, Date date, int status_id, int office_id) {
        this.id = id;
        this.package_id = package_id;
        this.date = date;
        this.status_id = status_id;
        this.office_id = office_id;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "PACKAGE_ID")
    public int getPackage_id() {
        return package_id;
    }

    public void setPackage_id(int package_id) {
        this.package_id = package_id;
    }

    @Column(name = "DATE")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "STATUS")
    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    @Column(name = "OFFICE_ID")
    public int getOffice_id() {
        return office_id;
    }

    public void setOffice_id(int office_id) {
        this.office_id = office_id;
    }
}