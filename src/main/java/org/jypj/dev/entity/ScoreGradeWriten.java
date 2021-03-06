package org.jypj.dev.entity;
import java.util.Date;

/**
 * 统一笔试成绩表
 * @author
 */
public class ScoreGradeWriten implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
    private String id; //主键ID
    private String studentId; //学生ID
    private String grade; //统一笔试成绩
    private String projectId; //招聘主题ID
    private String positionId; //学校招聘岗位ID
    private String schoolId; //招聘单位ID
    private String scorePublishStatus; //成绩发布状态（1是 0否）
    private String listPublishStatus; //名单发布状态（1是 0否）
    private String type; //类型（1单位面试 2统一笔试 3统一试讲 4体检 5考察 6公式）
    private String isReset; //是否调整名单（1是 0否）
    
    //不与数据库关联
    private String name;//学生姓名
    private String ticketnum;//准考证号
    private String postName;//岗位名称
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScoreGradeWriten other = (ScoreGradeWriten) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	private Date createtime; //创建时间
    private Date modifytime; //更新时间
    private String createuser; //创建人
    private String modifyuser; //更新人
    private String remark; //备注

    public String getId(){
        return this.id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    public String getStudentId(){
        return this.studentId;
    }
    
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }
    public String getGrade(){
        return this.grade;
    }
    
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getProjectId(){
        return this.projectId;
    }
    
    public void setProjectId(String projectId){
        this.projectId = projectId;
    }
    public String getPositionId(){
        return this.positionId;
    }
    
    public void setPositionId(String positionId){
        this.positionId = positionId;
    }
    public String getSchoolId(){
        return this.schoolId;
    }
    
    public void setSchoolId(String schoolId){
        this.schoolId = schoolId;
    }
    public String getScorePublishStatus(){
        return this.scorePublishStatus;
    }
    
    public void setScorePublishStatus(String scorePublishStatus){
        this.scorePublishStatus = scorePublishStatus;
    }
    public String getListPublishStatus(){
        return this.listPublishStatus;
    }
    
    public void setListPublishStatus(String listPublishStatus){
        this.listPublishStatus = listPublishStatus;
    }
    public String getType(){
        return this.type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    public String getIsReset(){
        return this.isReset;
    }
    
    public void setIsReset(String isReset){
        this.isReset = isReset;
    }
    public Date getCreatetime(){
        return this.createtime;
    }
    
    public void setCreatetime(Date createtime){
        this.createtime = createtime;
    }
    public Date getModifytime(){
        return this.modifytime;
    }
    
    public void setModifytime(Date modifytime){
        this.modifytime = modifytime;
    }
    public String getCreateuser(){
        return this.createuser;
    }
    
    public void setCreateuser(String createuser){
        this.createuser = createuser;
    }
    public String getModifyuser(){
        return this.modifyuser;
    }
    
    public void setModifyuser(String modifyuser){
        this.modifyuser = modifyuser;
    }
    public String getRemark(){
        return this.remark;
    }
    
    public void setRemark(String remark){
        this.remark = remark;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTicketnum() {
		return ticketnum;
	}

	public void setTicketnum(String ticketnum) {
		this.ticketnum = ticketnum;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public ScoreGradeWriten() {
		super();
	}

	public ScoreGradeWriten(String grade, String projectId, String name, String ticketnum, String postName,
			String modifyuser) {
		super();
		this.grade = grade;
		this.projectId = projectId;
		this.name = name;
		this.ticketnum = ticketnum;
		this.postName = postName;
		this.modifyuser = modifyuser;
	}

}