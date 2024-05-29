package pratice.ex07.lib;

public class OracleDB implements DB{
    private String url;
    public int execute(String sql){
        if (sql.equals("select")){
            System.out.println("query execute : "+ url + "/" + sql);
            return 1;
        } else {
            System.out.println("query fail : systax error");
            return -1;
        }
    }

    public void setUrl(String url){
        this.url = url;
    }
}
