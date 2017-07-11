package test;

import static tool.Regex.isProperPassword;

/**
 * Created by 向光性 on 2017/7/10.
 */
public class RegexTest {
    public static void main(String[] args) {
        System.out.println(isProperPassword("12312__erre"));
        System.out.println(isProperPassword("12312ZhZahz抓获rre"));
    }
}
