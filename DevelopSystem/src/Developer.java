public class Developer extends Employee implements DeveloperRole {
    private String language;

    public Developer(String name, String language) {
        super(name, "개발자");
        this.language = language;
    }
    public void writeCode(){
        System.out.println("개발자" + name + "는" + language + "언어로 코드를 작성합니다");
    }

    public void debugCode(){
        System.out.println("개발자" + name + "는" + language + "언어로 디버깅 합니다");
    }
    
}