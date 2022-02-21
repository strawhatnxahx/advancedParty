package be.thomasmore.party.repos;

import be.thomasmore.party.model.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, Integer> {
}