package sdp.ratajo.amaderbari.dao;
import java.util.List;

import sdp.ratajo.amaderbari.dto.*;
public interface FlatSearcher {

	List<Flat> search(Address addr);
}
