package mx.unam.dgtic.practica2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
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

}