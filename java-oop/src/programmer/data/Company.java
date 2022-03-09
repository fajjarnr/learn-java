package programmer.data;

public class Company {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * inner class
     */
    public class Employee{
        String name;

        public String getCompany(){
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
