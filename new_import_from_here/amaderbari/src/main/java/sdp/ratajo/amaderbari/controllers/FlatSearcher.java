package sdp.ratajo.amaderbari.controllers;
import java.util.List;
import sdp.ratajo.amaderbari.dto.addresspack.Address;
import sdp.ratajo.amaderbari.dto.flatpack.Flat;


public interface FlatSearcher {
	List<Flat> search();
}
