package co.edu.uniandes.csw.mpfreelancer.dtos;

import javax.xml.bind.annotation.XmlRootElement;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import co.edu.uniandes.csw.auth.model.DateAdapter;
import uk.co.jemos.podam.common.PodamStrategyValue;
import co.edu.uniandes.csw.crud.api.podam.strategy.DateStrategy;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 */
@XmlRootElement
public class FreelancerDTO {

    private Long id;
    private String name;
    private Integer rate;
    @XmlJavaTypeAdapter(DateAdapter.class)
    @PodamStrategyValue(DateStrategy.class)
    private Date bithday;
    private String picture;
    @PodamExclude
    private List<SkillDTO> skills = new ArrayList<>();
    
    private List<EducationDTO> titles = new ArrayList<>();

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
    public Integer getRate() {
        return rate;
    }

    /**
     * @generated
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * @generated
     */
    public Date getBithday() {
        return bithday;
    }

    /**
     * @generated
     */
    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }

    /**
     * @generated
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @generated
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * @generated
     */
    public List<SkillDTO> getSkills() {
        return skills;
    }

    /**
     * @generated
     */
    public void setSkills(List<SkillDTO> skills) {
        this.skills = skills;
    }

    /**
     * @generated
     */
    public List<EducationDTO> getTitles() {
        return titles;
    }

    /**
     * @generated
     */
    public void setTitles(List<EducationDTO> titles) {
        this.titles = titles;
    }

}
