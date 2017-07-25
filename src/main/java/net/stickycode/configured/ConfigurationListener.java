package net.stickycode.configured;

/**
 * Contract for responding to the configuration lifecycle 
 */
public interface ConfigurationListener {

  /**
   * Resolve the configuration values, this happens first to fail fast
   */
  void resolve();
  
  void preConfigure();

  void configure();

  void postConfigure();

  default void beforeConfiguration() {}
  default void afterConfiguration() {}
}

  