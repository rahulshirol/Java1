//constrctor overload

class Load {

  String language;
  Load() {
    this.language = "Java";
  }
  Load(String language) {
    this.language = language;
  }

  public void getName() {
    System.out.println("Programming Langauage: " + this.language);
  }

  public static void main(String[] args) 
  {
    Load obj1 = new Load();
    Load obj2 = new Load("Python");

    obj1.getName();
    obj2.getName();
  }
}