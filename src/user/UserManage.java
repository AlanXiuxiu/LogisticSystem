package user;

import tool.Data;
import tool.JDBC;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 向光性 on 2017/7/10.
 */
public class UserManage {
    // 注册用户
    public static boolean register(int id, String name, String password, String tel, int repositoryId) {
        //验证数据合法性

        //合法则存入数据库
        String sql = "INSERT INTO table user (`id`, `name`, `tel`, `password`, `reposity_id`) VALUES (?,?,?,?,?);";
        List<Data> list = new ArrayList<Data>();
        list.add(new Data("Integer", String.valueOf(id)));
        list.add(new Data("String", name));
        list.add(new Data("String", password));
        list.add(new Data("String", tel));
        list.add(new Data("Integer", String.valueOf(repositoryId)));

        JDBC jdbc = JDBC.getInstance();
        jdbc.excuteUpdate(sql);
        //上述操作失败则返回错误
        return false;
    }

    // 更改用户信息
    public static boolean updateUser(User currentUser, User user) {
        //判断当前用户是否是root用户，是则可以删除用户

        //如果是root，则删除

        return false;
    }

    // 删除用户
    public static boolean delUser(User currentUser, User user) {
        //判断当前用户是否是root用户，是则可以删除用户

        //如果是root，则删除

        return false;
    }
}
