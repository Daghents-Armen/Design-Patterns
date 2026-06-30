class UserService{
    private Database database;

    public UserService(){
        this.database = Database.getInstance();
    }

    public void createUser(){
        this.database.connect();
        System.out.println("Creating user");
    }
}