package co.edu.uniandes.csw.mpfreelancer.api;

import co.edu.uniandes.csw.mpfreelancer.entities.ProjectEntity;
import co.edu.uniandes.csw.mpfreelancer.entities.SkillEntity;
import java.util.List;

public interface IProjectLogic {
    public int countProjects();
    public List<ProjectEntity> getProjects();
    public List<ProjectEntity> getProjects(Integer page, Integer maxRecords);
    public ProjectEntity getProject(Long id);
    public ProjectEntity createProject(ProjectEntity entity);
    public ProjectEntity updateProject(ProjectEntity entity);
    public void deleteProject(Long id);
    public List<SkillEntity> listExpectedskills(Long projectId);
    public SkillEntity getExpectedskills(Long projectId, Long expectedskillsId);
    public SkillEntity addExpectedskills(Long projectId, Long expectedskillsId);
    public List<SkillEntity> replaceExpectedskills(Long projectId, List<SkillEntity> list);
    public void removeExpectedskills(Long projectId, Long expectedskillsId);
}
