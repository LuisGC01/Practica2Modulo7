package mx.unam.dgtic.practica1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paises")
public class CountryController {
	@Autowired
	private CountryRepository countryRepository;

	@RequestMapping(value = "/buscartodos")
	public String buscarTodos(Model model) {
		Iterable<Country> countries = null;
		countries = countryRepository.findAll();
		model.addAttribute("paises", countries);
		return "paises";
	}

}
