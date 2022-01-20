package mx.unam.dgtic.practica2;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryRepository extends PagingAndSortingRepository<Country, String> {

	public abstract List<Country> getByName(String name);

	public abstract List<Country> getByContinent(String continent);

	public abstract List<Country> getByIndepyearIsNull();

	public abstract List<Country> getBySurfaceareaGreaterThan(float surfacearea);

	public abstract List<Country> getByLifeexpectancyLessThan(float lifeexpectancy);

	public abstract List<Country> getByGnpLessThanAndContinent(float gnp, String continent);

	public abstract List<Country> getFirstByContinentOrderByGnp(String continent);

	public abstract List<Country> getByCapitalIsNotNull();

	public abstract List<Country> getByLifeexpectancyGreaterThanAndContinent(float lifeexpectancy, String continent);

	public abstract List<Country> getByHeadofstateIsNull();

	@Query(value = "select * from countries where gnp >= ? order by gnp desc", nativeQuery = true)
	public abstract List<Country> obtenerPorPibMayor(float pib);

}
