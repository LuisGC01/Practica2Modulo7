package mx.unam.dgtic.practica2;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
	@Id
	private String code;
	private String name;
	private String continent;
	private String region;
	private Float surfacearea;
	private Short indepyear;
	private Long population;
	private Float lifeexpectancy;
	private Float gnp;
	private Float gnpold;
	private String localname;
	private String governmentform;
	private String headofstate;
	private Long capital;
	private String code2;

	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Country(String code) {
		super();
		this.code = code;
	}

	public Country(String code, String name, String continent, String region, Float surfacearea, Short indepyear,
			Long population, Float lifeexpectancy, Float gnp, Float gnpold, String localname, String governmentform,
			String headofstate, Long capital, String code2) {
		super();
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.surfacearea = surfacearea;
		this.indepyear = indepyear;
		this.population = population;
		this.lifeexpectancy = lifeexpectancy;
		this.gnp = gnp;
		this.gnpold = gnpold;
		this.localname = localname;
		this.governmentform = governmentform;
		this.headofstate = headofstate;
		this.capital = capital;
		this.code2 = code2;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Float getSurfacearea() {
		return surfacearea;
	}

	public void setSurfacearea(Float surfacearea) {
		this.surfacearea = surfacearea;
	}

	public Short getIndepyear() {
		return indepyear;
	}

	public void setIndepyear(Short indepyear) {
		this.indepyear = indepyear;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Float getLifeexpectancy() {
		return lifeexpectancy;
	}

	public void setLifeexpectancy(Float lifeexpectancy) {
		this.lifeexpectancy = lifeexpectancy;
	}

	public Float getGnp() {
		return gnp;
	}

	public void setGnp(Float gnp) {
		this.gnp = gnp;
	}

	public Float getGnpold() {
		return gnpold;
	}

	public void setGnpold(Float gnpold) {
		this.gnpold = gnpold;
	}

	public String getLocalname() {
		return localname;
	}

	public void setLocalname(String localname) {
		this.localname = localname;
	}

	public String getGovernmentform() {
		return governmentform;
	}

	public void setGovernmentform(String governmentform) {
		this.governmentform = governmentform;
	}

	public String getHeadofstate() {
		return headofstate;
	}

	public void setHeadofstate(String headofstate) {
		this.headofstate = headofstate;
	}

	public Long getCapital() {
		return capital;
	}

	public void setCapital(Long capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", continent=" + continent + ", region=" + region
				+ ", surfacearea=" + surfacearea + ", indepyear=" + indepyear + ", population=" + population
				+ ", lifeexpectancy=" + lifeexpectancy + ", gnp=" + gnp + ", gnpold=" + gnpold + ", localname="
				+ localname + ", governmentform=" + governmentform + ", headofstate=" + headofstate + ", capital="
				+ capital + ", code2=" + code2 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(code, other.code);
	}
}