package com.alineumsoft.zenkw.verification;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import com.alineumsoft.zenkw.verification.config.MockAmqpConfig;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@Import(MockAmqpConfig.class)
class VerificationZenwkApplicationTests {

  @Test
  void authServiceCase1() {
    System.out.print("Ejecución authServiceCase1...... ");
    boolean dataOut = true;
    assertThat(dataOut).isTrue();
  }

}
