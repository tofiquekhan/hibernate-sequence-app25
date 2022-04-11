package myproject.sequencegenerator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "emp5")
public class Employee {

	@Id
	@Column(name = "eno")
//	@SequenceGenerator(name = "seqGenerator",sequenceName = "my_sequence")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eno;
	@Column(name = "ename")
	private String ename;
	@Column(name = "esal")
	private float esal;
	@Column(name = "eaddr")
	private String eaddr;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
	 
}
