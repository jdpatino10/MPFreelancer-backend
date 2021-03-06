package co.edu.uniandes.csw.mpfreelancer.dtos;

import javax.xml.bind.annotation.XmlRootElement;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import co.edu.uniandes.csw.auth.model.DateAdapter;
import uk.co.jemos.podam.common.PodamStrategyValue;
import co.edu.uniandes.csw.crud.api.podam.strategy.DateStrategy;

/**
 * @generated
 */
@XmlRootElement
public class EducationDTO {

    private Long id;
    private String name;
    @XmlJavaTypeAdapter(DateAdapter.class)
    @PodamStrategyValue(DateStrategy.class)
    private Date startDate;
    @XmlJavaTypeAdapter(DateAdapter.class)
    @PodamStrategyValue(DateStrategy.class)
    private Date endDate;
    private String institution;
    private String title;
    private String description;
    @PodamExclude
    private FreelancerDTO freelancer;

    /**
     * @generated
     */
    public Long getId() {
        return id;
    }

    /**
     * @generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * @generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @generated
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @generated
     */
    public void setStartDate(Date startdate) {
        this.startDate = startdate;
    }

    /**
     * @generated
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @generated
     */
    public void setEndDate(Date enddate) {
        this.endDate = enddate;
    }

    /**
     * @generated
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * @generated
     */
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    /**
     * @generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * @generated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * @generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @generated
     */
    public FreelancerDTO getFreelancer() {
        return freelancer;
    }

    /**
     * @generated
     */
    public void setFreelancer(FreelancerDTO freelancer) {
        this.freelancer = freelancer;
    }

}
