package com.hdw.number;

/**
 * 字节数组转long值
 * user:hudawei1
 * date:2018/4/20
 * time:17:14
 */
public class ByteArray2Long {
    static byte[] byteArray = new byte[]{0x01,0x02,0x03};

    static byte[] testByteArray = new byte[]{0x00,0x00,0x00,0x00,0x00,0x01,0x02,0x03};

    public static void main(String[] args){
        System.out.println(byteArray2Long());
        System.out.println(bytes2Long(testByteArray));
    }


    /**
     * byte数组转long值 66051
     */
    public static long byteArray2Long(){
        long result = 0L;
        for(int i=0;i<byteArray.length;i++){
            result = result + (byteArray[i]<<(8*(byteArray.length-i-1)));
        }
        return result;
    }

    public static long bytes2Long(byte[] byteNum) {
        long num = 0;
        for (int ix = 0; ix < 8; ++ix) {
            num <<= 8;
            num |= (byteNum[ix] & 0xff);
        }
        return num;
    }
}
