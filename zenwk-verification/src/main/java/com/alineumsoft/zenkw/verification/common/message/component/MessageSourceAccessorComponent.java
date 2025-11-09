package com.alineumsoft.zenkw.verification.common.message.component;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import lombok.Data;

/**
 * @author <a href="mailto:alineumsoft@gmail.com">C. Alegria</a>
 * @project SecurityUser
 * @class MessageSourceAccessorComponent
 */
@Component
@Data
public class MessageSourceAccessorComponent {

  private final MessageSource messageSource;

  /**
   * <p>
   * <b> Util </b> Constructor inyectado
   * </p>
   *
   * @param messageSource Fuente de mensajes internacionalizados.
   */
  public MessageSourceAccessorComponent(MessageSource messageSource) {
    this.messageSource = messageSource;
    MessageSourceHolder.set(messageSource);
  }

  /**
   * <p>
   * <b> Util </b> Obtener mensaje con internacionalización
   * </p>
   */
  public static String getMessage(String key) {
    return MessageSourceHolder.get().getMessage(key, null, LocaleContextHolder.getLocale());
  }

  /**
   * <p>
   * <b> Util</b> Obtener mensaje formateado con parámetros opcionales.
   * </p>
   */
  public static String getMessage(String key, String... params) {
    return MessageSourceHolder.get().getMessage(key, params, LocaleContextHolder.getLocale());
  }

  /**
   * Clase interna estática que mantiene una referencia segura al MessageSource.
   */
  private static final class MessageSourceHolder {
    private static MessageSource source;

    private MessageSourceHolder() {}

    static void set(MessageSource messageSource) {
      if (source == null) {
        source = messageSource;
      }
    }

    static MessageSource get() {
      if (source == null) {
        throw new IllegalStateException("MessageSource not initialized yet.");
      }
      return source;
    }
  }
}
