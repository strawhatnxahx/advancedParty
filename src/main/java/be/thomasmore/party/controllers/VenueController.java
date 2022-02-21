package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Venue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class VenueController {
    @Autowired
    private be.thomasmore.party.repos.VenueRepository venueRepository;


    @GetMapping("/venuedetails")


    public String venueDetails(Model model) {
    ///    Venue venue = new Venue("VenueZonderNaam","www.venuezondernaam.org");
    ///    model.addAttribute("venue",venue);

        Optional<Venue> optionalVenue = venueRepository.findById(1);
        if (optionalVenue.isPresent()) {
            model.addAttribute("venue", optionalVenue.get());
        }
        return "venuedetails";
    }

}
