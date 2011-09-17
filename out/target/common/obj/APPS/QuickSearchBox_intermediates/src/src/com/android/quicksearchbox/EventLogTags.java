/* This file is auto-generated.  DO NOT MODIFY.
 * Source file: packages/apps/QuickSearchBox/src/com/android/quicksearchbox/EventLogTags.logtags
 */

package com.android.quicksearchbox;

/**
 * @hide
 */
public class EventLogTags {
  private EventLogTags() { }  // don't instantiate

  /** 71001 qsb_start (name|3),(version|1),(start_method|3),(latency|1|3),(search_source|3),(enabled_sources|3) */
  public static final int QSB_START = 71001;

  /** 71002 qsb_click (position|1),(suggestions|3),(queried_sources|3),(num_chars|1),(click_type|1) */
  public static final int QSB_CLICK = 71002;

  /** 71003 qsb_search (search_source|3),(method|1),(num_chars|1) */
  public static final int QSB_SEARCH = 71003;

  /** 71004 qsb_voice_search (search_source|3) */
  public static final int QSB_VOICE_SEARCH = 71004;

  /** 71005 qsb_exit (suggestions|3),(num_chars|1) */
  public static final int QSB_EXIT = 71005;

  /** 71006 qsb_latency (corpus|3),(latency|1|3),(num_chars|1) */
  public static final int QSB_LATENCY = 71006;

  public static void writeQsbStart(String name, int version, String startMethod, int latency, String searchSource, String enabledSources) {
    android.util.EventLog.writeEvent(QSB_START, name, version, startMethod, latency, searchSource, enabledSources);
  }

  public static void writeQsbClick(int position, String suggestions, String queriedSources, int numChars, int clickType) {
    android.util.EventLog.writeEvent(QSB_CLICK, position, suggestions, queriedSources, numChars, clickType);
  }

  public static void writeQsbSearch(String searchSource, int method, int numChars) {
    android.util.EventLog.writeEvent(QSB_SEARCH, searchSource, method, numChars);
  }

  public static void writeQsbVoiceSearch(String searchSource) {
    android.util.EventLog.writeEvent(QSB_VOICE_SEARCH, searchSource);
  }

  public static void writeQsbExit(String suggestions, int numChars) {
    android.util.EventLog.writeEvent(QSB_EXIT, suggestions, numChars);
  }

  public static void writeQsbLatency(String corpus, int latency, int numChars) {
    android.util.EventLog.writeEvent(QSB_LATENCY, corpus, latency, numChars);
  }
}
