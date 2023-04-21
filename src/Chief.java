public class Chief {

    private String name;
    private int mood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMood() {
        return (int) (Math.random() * 6);
    }

    public Chief(String name) {
        this.name = name;
    }
}


