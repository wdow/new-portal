/**
 * This software was developed at the National Institute of Standards and Technology by employees of
 * the Federal Government in the course of their official duties. Pursuant to title 17 Section 105
 * of the United States Code this software is not subject to copyright protection and is in the
 * public domain. This is an experimental system. NIST assumes no responsibility whatsoever for its
 * use by other parties, and makes no guarantees, expressed or implied, about its quality,
 * reliability, or any other characteristic. We would appreciate acknowledgement if the software is
 * used. This software can be redistributed and/or modified freely provided that any derivative
 * works bear some notice that they are derived from it, and any modified versions bear some notice
 * that they have been modified.
 */
package gov.nist.healthcare.tools.hl7.v2.portal.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gov.nist.healthcare.nht.acmgt.repo.AccountRepository;
import gov.nist.healthcare.nht.acmgt.service.UserService;
import gov.nist.healthcare.tools.hl7.v2.portal.domain.ProfileOverview;
import gov.nist.healthcare.tools.hl7.v2.portal.repo.ProfileOverviewRepository;

/**
 * @author Harold Affo (harold.affo@nist.gov) Mar 17, 2015
 */

@RestController
@RequestMapping("/profileOverviews")
public class ProfileOverviewController {

  Logger log = LoggerFactory.getLogger(ProfileOverviewController.class);

  @Autowired
  private ProfileOverviewRepository profileOverviewRepository;

  @Autowired
  UserService userService;

  @Autowired
  AccountRepository accountRepository;

  @RequestMapping(value = "/findAll", method = RequestMethod.POST, produces = "application/json")
  public List<ProfileOverview> findAll() {

    List<ProfileOverview> result = profileOverviewRepository.findAll();
    return result;
  }
  
  @RequestMapping(value = "/save", method = RequestMethod.POST)
  public ProfileOverview save(@RequestBody ProfileOverview profileOverview) {
	  ProfileOverview result= profileOverviewRepository.save(profileOverview);
	  return result;
  }
  
  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  public void delete(@RequestBody ProfileOverview profileOverview) {
	  profileOverviewRepository.delete(profileOverview);
  }
}