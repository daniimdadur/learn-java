package bootcam.data;

public class Company { //outher class

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public class Employee { //inner class
        private String name;

        public String getCompany() {
            return Company.this.getName();
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
