package com.fourroro.nolleogasil.service.users;

import org.springframework.stereotype.Service;

@Service
public class KakaoService {
    //어노테이션 추가하기
    //rest api key
    private String KAKAO_CLIENT_ID;
    //client secret key
    private String KAKAO_CLIENT_SECRET;
    //redirect uri
    private String KAKAO_REDIRECT_URL;

    private final static String KAKAO_AUTH_URI = "https://kauth.kakao.com";
    private final static String KAKAO_API_URI = "https://kapi.kakao.com";

    public String getKakaoLogin(){
        return KAKAO_AUTH_URI + "/oauth/authorize"
                + "?client_id=" + KAKAO_CLIENT_ID
                + "&redirect_uri=" + KAKAO_REDIRECT_URL
                + "&response_type=code";
    }
}
