package co.edu.uniandes.csw.mpfreelancer.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import co.edu.uniandes.csw.crud.spi.entity.BaseEntity;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import uk.co.jemos.podam.common.PodamStrategyValue;
import co.edu.uniandes.csw.crud.api.podam.strategy.DateStrategy;
import uk.co.jemos.podam.common.PodamExclude;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.CascadeType;

/**
 * @generated
 */
@Entity
public class FreelancerEntity extends BaseEntity implements Serializable {

    private Integer rate;

    @Temporal(TemporalType.DATE)
    @PodamStrategyValue(DateStrategy.class)
    private Date bithday;

    private String picture;

    
    @OneToMany(mappedBy = "freelancer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EducationEntity> titles = new ArrayList<>();

    @PodamExclude
    @ManyToMany(mappedBy = "freelancers")
    private List<SkillEntity> skills = new ArrayList<>();

    /**
     * @generated
     */
    public Integer getRate(){
        return rate;
    }

    /**
     * @generated
     */
    public void setRate(Integer rate){
        this.rate = rate;
    }

    /**
     * @generated
     */
    public Date getBithday(){
        return bithday;
    }

    /**
     * @generated
     */
    public void setBithday(Date bithday){
        this.bithday = bithday;
    }

    /**
     * @generated
     */
    public String getPicture(){
        return picture;
    }

    /**
     * @generated
     */
    public void setPicture(String picture){
        this.picture = picture;
    }

    /**
     * @generated
     */
    public List<EducationEntity> getTitles() {
        return titles;
    }

    /**
     * @generated
     */
    public void setTitles(List<EducationEntity> titles) {
        this.titles = titles;
    }

    /**
     * @generated
     */
    public List<SkillEntity> getSkills() {
        return skills;
    }

    /**
     * @generated
     */
    public void setSkills(List<SkillEntity> skills) {
        this.skills = skills;
    }
}
