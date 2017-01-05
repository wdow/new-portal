package gov.nist.healthcare.tools.hl7.v2.portal.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import gov.nist.healthcare.tools.hl7.v2.portal.domain.UsefulLinks;

public interface UsefulLinksRepository extends MongoRepository<UsefulLinks, String> {
	

}
