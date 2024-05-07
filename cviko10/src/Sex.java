public enum Sex {
    MALE("M"), FEMALE("F");

    private String code;

    Sex(String code) {
        this.code = code;
    }

    public static Sex getByCode(String code){
        for(Sex value : values()){
            if(code.equals(value.code)){
                return value;
            }
        }
        return null;
    }
}
