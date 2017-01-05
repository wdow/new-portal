package gov.nist.healthcare.tools.hl7.v2.portal.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import gov.nist.healthcare.tools.hl7.v2.portal.domain.SourceCodeLinks;

public interface SourceCodeLinksRepository extends MongoRepository<SourceCodeLinks, String> {
	

}
