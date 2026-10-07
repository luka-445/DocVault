package ca.lukavincic.dms.repository;

import ca.lukavincic.dms.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    
}
