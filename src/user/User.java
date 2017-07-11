package user;

/**
 * Created by 向光性 on 2017/7/10.
 */
public class User {
    private int id;              //共四位
    private String name;            //员工姓名（即用户名）
    private String tel;             //员工电话号码
    private String password;        //登录密码
    private String repositoryid;    //管理员管理的仓库id

    // 构造函数
    public User(int id, String name, String tel, String password, String repositoryid) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.password = password;
        this.repositoryid = repositoryid;
    }

    //set get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepository() {
        return repositoryid;
    }

    public void setRepository(String repository) {
        this.repositoryid = repository;
    }
}
