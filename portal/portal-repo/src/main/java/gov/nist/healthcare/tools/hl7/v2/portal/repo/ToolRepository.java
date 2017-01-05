package gov.nist.healthcare.tools.hl7.v2.portal.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import gov.nist.healthcare.tools.hl7.v2.portal.domain.Tool;

public interface ToolRepository extends MongoRepository<Tool, String> {
	

}
