package tw.edu.ncu.cc.course.data.v1;


public class Course {

    public static enum FullHalf {
        full, half
    }

    public static enum RequireType {
        required, elective
    }

    public static enum PasswordCard {
        no, optional, all
    }

    private String no;
    private String classNo;
    private String name;
    private String memo;
    private String language;
    private String teachers;
    private String classRooms;
    private String time;
    private boolean isMasterDoctor;
    private boolean isClosed;
    private boolean isFirstRun;
    private boolean isPreSelect;
    private RequireType type;
    private FullHalf fullHalf;
    private PasswordCard passwordCard;
    private int serialNo;
    private int maxStudents;
    private int credit;

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo( int serialNo ) {
        this.serialNo = serialNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo( String no ) {
        this.no = no;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo( String classNo ) {
        this.classNo = classNo;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo( String memo ) {
        this.memo = memo;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage( String language ) {
        this.language = language;
    }

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers( String teachers ) {
        this.teachers = teachers;
    }

    public String getClassRooms() {
        return classRooms;
    }

    public void setClassRooms( String classRooms ) {
        this.classRooms = classRooms;
    }

    public String getTime() {
        return time;
    }

    public void setTime( String time ) {
        this.time = time;
    }

    public boolean isMasterDoctor() {
        return isMasterDoctor;
    }

    public void setMasterDoctor( boolean isMasterDoctor ) {
        this.isMasterDoctor = isMasterDoctor;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed( boolean isClosed ) {
        this.isClosed = isClosed;
    }

    public boolean isFirstRun() {
        return isFirstRun;
    }

    public void setFirstRun( boolean isFirstRun ) {
        this.isFirstRun = isFirstRun;
    }

    public boolean isPreSelect() {
        return isPreSelect;
    }

    public void setPreSelect( boolean isPreSelect ) {
        this.isPreSelect = isPreSelect;
    }

    public RequireType getType() {
        return type;
    }

    public void setType( RequireType type ) {
        this.type = type;
    }

    public FullHalf getFullHalf() {
        return fullHalf;
    }

    public void setFullHalf( FullHalf fullHalf ) {
        this.fullHalf = fullHalf;
    }

    public PasswordCard getPasswordCard() {
        return passwordCard;
    }

    public void setPasswordCard( PasswordCard passwordCard ) {
        this.passwordCard = passwordCard;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents( int maxStudents ) {
        this.maxStudents = maxStudents;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit( int credit ) {
        this.credit = credit;
    }

}
