import com.miau.javassmwms.util.PassUtils;
import org.testng.annotations.Test;

public class test1 {
    @Test
    public void t3() {
        // 1.生成密钥
        String key = PassUtils.createAESKey();
        System.out.println(key);
        String str = "123456";
        // 2.加密  enc加密  key 生成的密钥  str要加密的字符串
        String p = PassUtils.aesenc(key,str);
        System.out.println("密文："+p);
        // 3.解密  dec 解密
        System.out.println("解密:"+PassUtils.aesdec(key,p));
    }
        }

