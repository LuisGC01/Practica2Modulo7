package mx.unam.dgtic.practica2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author Luis Angel Garcia Cervantes
 *
 */

@Controller
@RequestMapping("/paises")
public class CountryController {
	@Autowired
	private CountryRepository countryRepository;

	@RequestMapping(value = "/buscartodos")
	public String buscarTodos(Model model) {
		System.out.println("buscarTodos(Model model)");
		Iterable<Country> countries = null;
		countries = countryRepository.findAll();
		model.addAttribute("paises", countries);
		return "paises";
	}

	@RequestMapping(value = "/buscartodos", params = "nombre")
	public String buscarPorNombre(String nombre, Model model) {
		System.out.println("buscarPorNombre(String nombre, Model model)");
		Iterable<Country> countries = null;
		countries = countryRepository.getByName(nombre);
		model.addAttribute("paises", countries);
		return "paises";
	}

	@RequestMapping(value = "/buscartodos", params = "continente")
	public String buscarPorContinente(String continente, Model model) {
		System.out.println("buscarPorContinente(String continente, Model model)");
		Iterable<Country> countries = null;
		countries = countryRepository.getByContinent(continente);
		model.addAttribute("paises", countries);
		return "paises";
	}

	@RequestMapping(value = "/buscartodos", params = "superficie")
	public String buscarPorSuperficie(String superficie, Model model) {
		System.out.println("buscarPorSuperficie(String superficie, Model model)");
		Iterable<Country> countries = null;
		float surface = 0f;
		try {
			surface = Float.parseFloat(superficie);
			countries = countryRepository.getBySurfaceareaGreaterThan(surface);
			model.addAttribute("paises", countries);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "paises";
	}
	@RequestMapping(value = "/buscartodos", params = "esperanza")
	public String buscarPorMenorEsperanzaDeVida(String esperanza, Model model) {
		System.out.println("buscarPorMenorEsperanzaDeVida(String esperanza, Model model)");
		Iterable<Country> countries = null;
		float lifeex = 0f;
		try {
			lifeex = Float.parseFloat(esperanza);
			countries = countryRepository.getByLifeexpectancyLessThan(lifeex);
			model.addAttribute("paises", countries);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "paises";
	}
	@RequestMapping(value = "/buscartodos", params = {"continente","gnp"})
	public String buscarPaisesMasPobresPorContinente(String continente,String gnp, Model model) {
		System.out.println("buscarPaisesMasPobresPorContinente(String continente,String gnp, Model model)");
		Iterable<Country> countries = null;
		float pib = 10f;
		try {
			pib= Float.parseFloat(gnp);
			countries = countryRepository.getByGnpLessThanAndContinent(pib, continente);
			model.addAttribute("paises", countries);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "paises";
	}
	@RequestMapping(value = "/buscartodos", params = "gnp")
	public String buscarPaisesPorPIBMayor(String gnp, Model model) {
		System.out.println("buscarPaisesPorPIBMayor(String gnp, Model model)");
		Iterable<Country> countries = null;
		float pib = 10f;
		try {
			pib= Float.parseFloat(gnp);
			countries = countryRepository.obtenerPorPibMayor(pib);
			model.addAttribute("paises", countries);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "paises";
	}
	@RequestMapping(value = "/buscartodos", params = {"continente","esperanza"})
	public String buscarPaisesMasLongevosPorContinente(String continente,String esperanza, Model model) {
		System.out.println("buscarPaisesMasLongevosPorContinente(String continente,String esperanza, Model model)");
		Iterable<Country> countries = null;
		float lifeex = 10f;
		try {
			lifeex= Float.parseFloat(esperanza);
			countries = countryRepository.getByLifeexpectancyGreaterThanAndContinent(lifeex, continente);
			model.addAttribute("paises", countries);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "paises";
	}

	@RequestMapping(value = "/buscartodos", params = "orden")
	public String buscarTodos(@RequestParam(name = "orden", defaultValue = "code") String orden, Model model) {
		System.out.println("buscarTodos(String orden, Model model)");
		Iterable<Country> countries = null;
		countries = countryRepository.findAll(Sort.by(orden));
		model.addAttribute("paises", countries);
		return "paises";
	}
}
