package th.kmitl.Traveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import th.kmitl.Traveler.model.Place;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PlaceControll {

    @RequestMapping("/place")
    public String getPlacePage(Model model) {
        List<Place> place = new ArrayList<>();
        place.add(new Place("วัดลิงขบ","https://goo.gl/maps/KYNaFUeNJKeaVQfAA","กรุงเทพ","วัด"));
        model.addAttribute("allPlace", place);
        return "place";
    }
}

