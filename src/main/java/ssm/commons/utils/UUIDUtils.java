package ssm.commons.utils;

import java.util.UUID;

public class UUIDUtils {

    private UUIDUtils() {
    }

    // 返回一个识别码
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", ""); // 去掉字符串的"-"
    }

    // 返回一个识别码+"_"+文件名的新文件名(防止上传文件名重复问题) 例:dasda_aaa.txt
    public static String getUUIDFileName(String fileName) {
        return getUUID() + "_" + fileName;
    }
}
