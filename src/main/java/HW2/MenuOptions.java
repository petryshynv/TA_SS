package HW2;

public enum MenuOptions {
    z("Continue"), a("add car"), b("remove car"), c("show car"),
    d("sort car"), q("Quit");

    // field
    private String meaning;

    // constructor
    MenuOptions(String meaning)
    {
        this.meaning = meaning;
    }

    // getters
    public String getMeaning()
    {
        return meaning;
    }
}

