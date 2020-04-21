import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="mobile")
public class Mobile {
	@Id
	@SequenceGenerator(name = "seqgen", sequenceName = "my_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqgen")
	@Column(name="MID")
	private int mid;
	@Column(name="MNAME")
	private String mname;
	@Column(name="MPRICE")
	private float mprice;
	@Column(name="MCOLOR")
	private String mcolor;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public float getMprice() {
		return mprice;
	}
	public void setMprice(float mprice) {
		this.mprice = mprice;
	}
	public String getMcolor() {
		return mcolor;
	}
	public void setMcolor(String mcolor) {
		this.mcolor = mcolor;
	}
	

}
