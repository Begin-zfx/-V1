public enum  staticTest {

    TEST_ONE(2,"asd"),
    TeST_TWO(3,"zfx");

    private int code;
    private String comment;
    staticTest(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    static String getName(int code){
        for(staticTest comment:staticTest.values()){
            if(code == comment.getCode()){
                return comment.getComment();
            }
        }
        return null;
    }
}
