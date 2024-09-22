public class TeamLeader extends Employee implements DeveloperRole, DesignerRole, ManagerRole{

    private String teamName;
    private String language;
    private String tool;

    public TeamLeader(String name,String language,String tool, String teamName) {
        super(name,"Beta");
        this.teamName = teamName;
        this.language = language;
        this.tool = tool;
    }
    public void writeCode(){
        System.out.println("리더" + name + "는" + language + "언어로 코드를 작성합니다");
    }

    public void debugCode(){
        System.out.println("리더" + name + "는" + language + "언어로 디버깅 합니다");
    }
    public void designInterface(){
        System.out.println("리더" + name + "는" + tool + "도구로 인터페이스를 디자인 합니다");
    }

    public void reviewDesign(){
        System.out.println("리더" + name + "는" + tool + "도구로 디자인을 리뷰합니다");
    }
    public void manageProject(){
        System.out.println("리더" + name + "는" + teamName + "팀의 프로젝트를 관리합니다");
    }

    public void evaluateTeam(){
        System.out.println("리더" + name + "는" + teamName + "팀을 평가합니다.");
    }

}
