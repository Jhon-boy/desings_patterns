package creational_patterns.builder_method_example1;

public class UserExample {

    private String name;
    private String identification;
    private String email;
    private String address;

    private UserExample(UserBuilder builder) {
        this.name = builder.name;
        this.identification = builder.identification;
        this.email = builder.email;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + ", address='" + address + "'}";
    }

    //Static class Builder class
    public static class UserBuilder {
        private String name;
        private String identification;
        private String email;
        private String address;

        public UserBuilder(String name, String identification){
            this.name = name;
            this.identification = identification;
        }
        public  UserBuilder  setEmail(String email){
            this.email = email;
            return this;
        }

        public UserBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public  UserExample build(){
            return new UserExample(this);
        }
    }
    public void showData(){
        Thread t1 = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("User EMAIL: " +email);
                System.out.println("User NAME: " +name);
                System.out.println("User IDENTIFICACION: " +identification);
            }
        });
        t1.start();
    }
}
