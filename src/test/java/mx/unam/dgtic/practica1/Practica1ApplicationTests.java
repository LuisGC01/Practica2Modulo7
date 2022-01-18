package mx.unam.dgtic.practica1;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import mx.unam.dgtic.practica2.Country;
import mx.unam.dgtic.practica2.CountryRepository;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
//@Sql({ "/schema.sql", "/data.sql" })

//Luis Angel Garcia Cervantes
class Practica1ApplicationTests {

	@Autowired
	private CountryRepository countryRepository;

	@Test
	void buscarPorNombreTest() {
		List<Country> countries = countryRepository.getByName("Canada");
		System.out.println("getByName");
		countries.forEach(System.out::println);
		assertThat(countries.size(), greaterThan(0));
	}

	@Test
	void buscarPorContinenteTest() {
		List<Country> countries = countryRepository.getByContinent("Europe");
		System.out.println("getByContinent");
		countries.forEach(System.out::println);
		assertThat(countries.size(), greaterThan(0));
	}

	@Test
	void buscarPorNoIndependienteTest() {
		List<Country> countries = countryRepository.getByIndepyearIsNull();
		System.out.println("getByIndepyearIsNull");
		countries.forEach(System.out::println);
		assertThat(countries.size(), greaterThan(0));
	}

	@Test
	void buscarPorPorSuperficieTest() {
		List<Country> countries = countryRepository.getBySurfaceareaGreaterThan(2000);
		System.out.println("getBySurfaceareaGreaterThan");
		countries.forEach(System.out::println);
		assertThat(countries.size(), greaterThan(0));
	}

	@Test
	void buscarPorEsperanzaDeVidaTest() {
		List<Country> countries = countryRepository.getByLifeexpectancyLessThan(50);
		System.out.println("getByLifeexpectancyLessThan");
		countries.forEach(System.out::println);
		assertThat(countries.size(), greaterThan(0));
	}

	@Test
	void buscarPorGnpYContinenteTest() {
		List<Country> countries = countryRepository.getByGnpLessThanAndContinent(2000, "Europe");
		System.out.println("getByGnpLessThanAndContinent");
		countries.forEach(System.out::println);
		assertThat(countries.size(), greaterThan(0));
	}

	@Test
	void buscarElMasRicoDeUnContinenteTest() {
		List<Country> countries = countryRepository.getFirstByContinentOrderByGnp("europe");
		System.out.println("getFirstByContinentOrderByGnp");
		countries.forEach(System.out::println);
		assertThat(countries.size(), greaterThan(0));
	}

	@Test
	void buscarPaisesSinCapitalTest() {
		List<Country> countries = countryRepository.getByCapitalIsNotNull();
		System.out.println("getByCapitalIsNotNull");
		countries.forEach(System.out::println);
		assertThat(countries.size(), greaterThan(0));
	}

	@Test
	void buscarPorEsperanzaDeVidaEnContinenteTest() {
		List<Country> countries = countryRepository.getByLifeexpectancyGreaterThanAndContinent(18,"europe");
		System.out.println("getByLifeexpectancyGreaterThanAndContinent");
		countries.forEach(System.out::println);
		assertThat(countries.size(), greaterThan(0));
	}

	@Test
	void buscarPorPaisSinGovernanteTest() {
		List<Country> countries = countryRepository.getByHeadofstateIsNull();
		System.out.println("getByHeadofstateIsNull");
		countries.forEach(System.out::println);
		assertThat(countries.size(), greaterThan(0));
	}

}
