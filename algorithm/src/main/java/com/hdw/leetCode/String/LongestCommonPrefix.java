package com.hdw.leetCode.String;

/**
 * 返回字符串数组中的最长前缀。
 * ["flower","flow","flight"]
 * 返回："fl"
 * user:hudawei1
 * date:2018/11/6
 * time:17:12
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"aca","cba"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length<1)
            return "";
        if(strs.length == 1){
            return strs[0];
        }
        int min = strs[0].length();
        for(String str : strs){
            min = min<str.length()?min:str.length();
        }
        int pos = 0;
        StringBuffer prefix = new StringBuffer("");
        while(pos<min){
            char c = strs[0].charAt(pos);
            boolean flag = true;
            char s = ' ';
            for(int i=1;i<strs.length;i++){
                s = strs[i].charAt(pos);
                if(c != s){
                    flag = false;
                    break;
                }
            }
            pos++;
            if(flag){
                prefix.append(s);
            }else{
                break;
            }
        }
        return prefix.toString();


    }

}
