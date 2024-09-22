public class Designer extends Employee implements DesignerRole{
    
    private String tool;

    public Designer(String name, String tool) {
        super(name, "Illustrator");
        this.tool = tool;
    }

    public void designInterface(){
        System.out.println("디자이너" + name + "는" + tool + "도구로 인터페이스를 디자인 합니다");
    }

    public void reviewDesign(){
        System.out.println("디자이너" + name + "는" + tool + "도구로 디자인을 리뷰합니다");
    }
    

}
