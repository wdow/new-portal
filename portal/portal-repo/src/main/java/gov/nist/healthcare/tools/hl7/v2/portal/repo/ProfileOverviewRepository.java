package gov.nist.healthcare.tools.hl7.v2.portal.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import gov.nist.healthcare.tools.hl7.v2.portal.domain.ProfileOverview;

public interface ProfileOverviewRepository extends MongoRepository<ProfileOverview, String> {
	
}