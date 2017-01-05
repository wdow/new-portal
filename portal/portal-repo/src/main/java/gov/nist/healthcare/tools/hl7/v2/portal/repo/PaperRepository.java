package gov.nist.healthcare.tools.hl7.v2.portal.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import gov.nist.healthcare.tools.hl7.v2.portal.domain.Paper;

public interface PaperRepository extends MongoRepository<Paper, String> {

}