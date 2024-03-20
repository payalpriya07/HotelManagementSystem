package ourproject.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Receptionist {
    public Receptionist() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
    @Column(name="receptionist_id", length=50)
    private int receptionistId;

    @Column(name="name", length=50)
    private String name;

    @Column(name="phone", length=50)
    private String phone;

    public Receptionist(int receptionistId, String name, String phone) {
        super();
        this.receptionistId = receptionistId;
        this.name = name;
        this.phone = phone;
    }

    public int getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(int receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
