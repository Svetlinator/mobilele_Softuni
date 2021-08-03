package softuni.exersice1.mobilele.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import softuni.exersice1.mobilele.service.BrandService;

@Controller
@RequestMapping("/brands")
public class BrandController {
    private final BrandService brandService;

    public BrandController(BrandService brandService) {

        this.brandService = brandService;
    }

    @GetMapping("/all")
    public String allBrands(Model model){
        model.addAttribute("allBrands",brandService.getAllBrands());
        return "brands";
    }
}
