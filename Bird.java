class Bird extends Animal{
    @Override
    public void eat(){
        System.out.print("Birds love to eat seeds");
    }
    @Override
    public void sleep(){
        System.out.println(" and sleep for 10-12 hours a day.");
    }@Override
    public void makeSound(){
        System.out.println("Tweet tweet");
    }
}
