package com.fourroro.nolleogasil.dto.users;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class KakaoDto {
    private long id;
    private String email;
    private String name;
    //그외 필요한 정보
}
