public class EmployeeManageSystem {
    public static void main (String[] args){
        Employee[] employees = new Employee[]{
            new Developer("이찬우", "java"),
            new Designer("전유나", "photoshop"),
            new TeamLeader("송목수", "python", "illustrator", "kfc")
        };
        // 각 직원의 역할을 확인하고, 해당 역할에 맞는 메서드 호출
        for (Employee employee : employees) {
            // DeveloperRole 역할을 확인
            if (employee instanceof DeveloperRole) {
                DeveloperRole developer = (DeveloperRole) employee;
                developer.writeCode();
                developer.debugCode();
            }

            // DesignerRole 역할을 확인
            if (employee instanceof DesignerRole) {
                DesignerRole designer = (DesignerRole) employee;
                designer.designInterface();
                designer.reviewDesign();
            }

            // ManagerRole 역할을 확인
            if (employee instanceof ManagerRole) {
                ManagerRole manager = (ManagerRole) employee;
                manager.manageProject();
                manager.evaluateTeam();
            }
        }
    }
}
