// Copyright 2011 Google Inc. All Rights Reserved.

package com.google.api.ads.common.lib.utils.logging;

import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Module for logging.
 */
public class LoggingModule extends AbstractModule {

  private final String loggerPrefix;

  /**
   * Constructor.
   *
   * @param loggerPrefix the logger prefix.
   */
  public LoggingModule(String loggerPrefix) {
    this.loggerPrefix = loggerPrefix;
  }

  @Override
  protected void configure() {
    bind(AdsServiceLoggers.class);
    bind(PrettyPrinterInterface.class).to(PrettyPrinter.class).in(Singleton.class);
    bind(Logger.class)
        .annotatedWith(Names.named("libLogger")).toInstance(AdsServiceLoggers.ADS_API_LIB_LOG);
    configureLogger(loggerPrefix, "soapXmlLogger");
    configureLogger(loggerPrefix, "requestInfoLogger");
  }

  protected void configureLogger(String prefix, String name) {
    bind(Logger.class).annotatedWith(Names.named(name)).toProvider(
        new LoggerProvider(prefix, name)).asEagerSingleton();
  }

  /**
   * Provider for Loggers.
   */
  protected static class LoggerProvider implements Provider<Logger> {

    private final String loggerPrefix;
    private final String logType;

    /**
     * Constructor.
     *
     * @param loggerPrefix the logger prefix
     * @param logType the log type (i.e. soap_xml)
     */
    public LoggerProvider(String loggerPrefix, String logType) {
      this.loggerPrefix = loggerPrefix;
      this.logType = logType;
    }

    @Override
    public Logger get() {
      return LoggerFactory.getLogger(loggerPrefix + "." + logType);
    }
  }
}
