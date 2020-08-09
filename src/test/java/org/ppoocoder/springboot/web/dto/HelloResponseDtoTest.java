package org.ppoocoder.springboot.web.dto;
// assertj의 assertThat 사용 :  추가적인 라이브러리가 필요하지 않음, 자동완성이 확실히 지원
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.ppoocoder.springboot.web.HelloController;

public class HelloResponseDtoTest {

    @Test
    public void 롬북_기능_테스트() {
        //given
        String name ="test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}