package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.pushwoosh.plugin.PushwooshPlugin;
import com.pushwoosh.pushwooshgeozones.PushwooshGeozonesPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    PushwooshPlugin.registerWith(registry.registrarFor("com.pushwoosh.plugin.PushwooshPlugin"));
    PushwooshGeozonesPlugin.registerWith(registry.registrarFor("com.pushwoosh.pushwooshgeozones.PushwooshGeozonesPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
