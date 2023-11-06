package enums;

public enum FurType{
    SHORT("Short"),
    MEDIUM("Medium"),
    LONG("Long");

    private String desc;
    FurType(String desc){
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }
}

