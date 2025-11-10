package com.alineumsoft.zenkw.verification.config;

import static org.mockito.Mockito.mock;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Simula arranque de rabbith mq
 * 
 * @author <a href="mailto:alineumsoft@gmail.com">C. Alegria</a>
 * @project zenwk-verification
 * @class MockAmqpConfig
 */
@TestConfiguration
public class MockAmqpConfig {

  @Bean
  public AmqpTemplate amqpTemplate() {
    // Retorna un mock, así el contexto arranca sin error
    return mock(AmqpTemplate.class);
  }
}
