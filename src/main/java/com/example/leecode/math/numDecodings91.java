package com.example.leecode.math;

/**
 * @author baiyun@56p2b.com
 * @date 2018/11/23/023  13:15
 */

/**
 * 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 *
 * 示例 1:
 *
 * 输入: "12"
 * 输出: 2
 * 解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
 * 示例 2:
 *
 * 输入: "226"
 * 输出: 3
 * 解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
 */
public class numDecodings91 {
    public int numDecodings(String s) {
        int count = 1;
        char[] chars = s.toCharArray();

        return  0;
    }

    public static void main(String[] args) {
        String a = "1234";
        char[] chars = a.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }
}
