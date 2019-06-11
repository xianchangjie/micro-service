package com.example.configserver;

//import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
//import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CryptController {

//    @Value("${jasypt.encryptor.password}")
//    private String password;
//
//    @GetMapping("/enCrype")
//    public String enCrype(String value){
//        //加密
//        return encyptPwd(password,value);
//    }
//
//    @GetMapping("/deCrype")
//    public String deCrype(String value){
//        //解密
//        return decyptPwd(password,value);
//    }
//    /**
//     * Jasypt生成加密结果
//     * @param password 配置文件中设定的加密密码 jasypt.encryptor.password
//     * @param value 待加密值
//     * @return
//     */
//    public static String encyptPwd(String password,String value){
//        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
//        encryptor.setConfig(cryptor(password));
//        String result = encryptor.encrypt(value);
//        return result;
//    }
//
//    /**
//     * 解密
//     * @param password 配置文件中设定的加密密码 jasypt.encryptor.password
//     * @param value 待解密密文
//     * @return
//     */
//    public static String decyptPwd(String password,String value){
//        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
//        encryptor.setConfig(cryptor(password));
//        String result = encryptor.decrypt(value);
//        return result;
//    }
//
//    public static SimpleStringPBEConfig cryptor(String password){
//        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
//        config.setPassword(password);
//        config.setAlgorithm("PBEWithMD5AndDES");
//        config.setKeyObtentionIterations("1000");
//        config.setPoolSize("1");
//        config.setProviderName("SunJCE");
//        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
//        config.setStringOutputType("base64");
//        return config;
//    }
}
