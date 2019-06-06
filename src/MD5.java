import com.web.platform.utils.RsaUtil;

/**
 * @ClassName MD5
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/3/25 15:27
 * @Version 1.0
 */

public class MD5 {

    public static void main(String[] args) {
        //原始字符串
        String content = "测试";
        //他人的密钥
        String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCSevBBx6WBtOTmp3lVU7LwnO6L2cIESdei+uW+VsZIQI58BuzxoQcjaH8i131aZQp/Ch6zJS+9AHuO+mvSkueRlMDs4TBk3y5hZiXtcPd0+cf9Y/5IkSEXD+ZEVBjxlSkmCmdk5SO4UlZ8SvCCo3cXQHZi3s+ECJ8tm3eACTL3GQIDAQAB";
        //自己的密匙
        String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJJ68EHHpYG05OaneVVTsvCc7ovZwgRJ16L65b5WxkhAjnwG7PGhByNofyLXfVplCn8KHrMlL70Ae476a9KS55GUwOzhMGTfLmFmJe1w93T5x/1j/kiRIRcP5kRUGPGVKSYKZ2TlI7hSVnxK8IKjdxdAdmLez4QIny2bd4AJMvcZAgMBAAECgYAuF30uVbIgpFk6swwc619tExSE8Rp52vp9kFFmmUt/RMERCeTZC4CBhcornn8VSKIK45ZRbKwe3t4CWY5ADnXK/qc5Ha7thDxBYh3cxvOPYyAjAcZWZ0p6/l2+EIBk/XtbCTgY9x3Atvz2ixXIFrun91niOPRSHXvRuJqb9UZ4AQJBAPD1XujoqiiRduRnxNzp89hPRySWKufzm8EQR3gFMdzUkzq/M4mGOUPCG0KgWVCHvuFkKvqPPsBlp55khZYVQYECQQCbn8LXiB4vIVPlfFQqewQQeGmON+w7s1/v6O0Q7hEIZVnGQgx5M3vFPfviGVoN/byWwwwvJmMA5SS1MYJ1RVGZAkAVQT+3AdcIrxQyv6iQ6B43ZX7cDlcIkOebVylGwAaO+T1ngDg2mF1yyauH7AcU4HSJA0H7Sil55T2s7icOfx+BAkBvHfF3B1/V8wv+TXmjI1bRk8h6nX91WSxlFoE+l11eC0/AeaSCXbpAKXPSCpv8ZXHki7wFZnlGSFafcYxew3HxAkEAraW/ZzcGbV+MDHZ1FwtvHC5kFa8IaLZL/luhLXq8B/xp6cML0C6b1W5Sx3gF65iPCeaRBF+3JFiyxdWLod4HSQ==";
        //八位的字符串
        String desKey = null;
        //加密后的content = desKey + content
        String encryptionContent = null;
        //加密后的公匙 = desKey + publicKey
        String encryptionPublicKey = null;
        //签名数据串
        String sign = null;
        //MD5withRSA
        boolean verify;
        //加密过程
        try {
            desKey = RsaUtil.getDesKey(8);
            encryptionContent = RsaUtil.encryptByDes(content, desKey);
            encryptionPublicKey = RsaUtil.encryptByRsa(publicKey, desKey);
            sign = RsaUtil.sign(encryptionContent, privateKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //解密过后得到deskey
        String decryptDeskey = null;
        //解密过后的内容
        String decryptContent = null;
        //解密过程
        try {
            verify = RsaUtil.verify(encryptionContent, sign, publicKey);
            if (!verify) {
                System.out.println("来历不明的数据");
            } else {
                decryptDeskey = RsaUtil.decryptByRsa(privateKey, encryptionPublicKey);
                decryptContent = RsaUtil.decryptByDes(encryptionContent,decryptDeskey);
                System.out.println(decryptContent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
