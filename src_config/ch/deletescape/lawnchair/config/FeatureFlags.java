/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.deletescape.lawnchair.config;

import android.content.Context;

import com.google.firebase.analytics.FirebaseAnalytics;

import ch.deletescape.lawnchair.Launcher;
import ch.deletescape.lawnchair.R;
import ch.deletescape.lawnchair.Utilities;

/**
 * Defines a set of flags used to control various launcher behaviors
 */
public final class FeatureFlags {

    private static final String KEY_PREF_LIGHT_STATUS_BAR = "pref_lightStatusBar";
    private static final String KEY_PREF_PINCH_TO_OVERVIEW = "pref_pinchToOverview";
    private static final String KEY_PREF_PULLDOWN_NOTIS = "pref_pulldownNotis";
    private static final String KEY_PREF_HOTSEAT_EXTRACTED_COLORS = "pref_hotseatShouldUseExtractedColors";
    private static final String KEY_PREF_HAPTIC_FEEDBACK = "pref_enableHapticFeedback";
    private static final String KEY_PREF_KEEP_SCROLL_STATE = "pref_keepScrollState";
    private static final String KEY_FULL_WIDTH_SEARCHBAR = "pref_fullWidthSearchbar";
    private static final String KEY_SHOW_PIXEL_BAR = "pref_showPixelBar";
    private static final String KEY_HOME_OPENS_DRAWER = "pref_homeOpensDrawer";
    public static final String KEY_SHOW_VOICE_SEARCH_BUTTON = "pref_showMic";
    private static final String KEY_PREF_PIXEL_STYLE_ICONS = "pref_pixelStyleIcons";
    private static final String KEY_PREF_HIDE_APP_LABELS = "pref_hideAppLabels";
    private static final String KEY_PREF_FULL_WIDTH_WIDGETS = "pref_fullWidthWidgets";
    private static final String KEY_PREF_SHOW_NOW_TAB = "pref_showGoogleNowTab";
    private static final String KEY_PREF_TRANSPARENT_HOTSEAT = "pref_isHotseatTransparent";
    private static final String KEY_PREF_ENABLE_DYNAMIC_UI = "pref_enableDynamicUi";
    private static final String KEY_PREF_ENABLE_BLUR = "pref_enableBlur";
    public static final String KEY_PREF_WHITE_GOOGLE_ICON = "pref_enableWhiteGoogleIcon";
    private static final String KEY_PREF_DARK_THEME = "pref_enableDarkTheme";

    private FeatureFlags() {
    }

    // When enabled fling down gesture on the first workspace triggers search.
    public static boolean pulldownOpensNotifications(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_PULLDOWN_NOTIS, true);
        FirebaseAnalytics.getInstance(context).setUserProperty("pulldown_notifis_enabled", String.valueOf(enabled));
        return enabled;
    }

    public static boolean pinchToOverview(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_PINCH_TO_OVERVIEW, true);
        FirebaseAnalytics.getInstance(context).setUserProperty("pinch_overview_enabled", String.valueOf(enabled));
        return enabled;
    }

    // When enabled the status bar may show dark icons based on the top of the wallpaper.
    public static boolean lightStatusBar(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_LIGHT_STATUS_BAR, false);
        FirebaseAnalytics.getInstance(context).setUserProperty("light_statusbar_enabled", String.valueOf(enabled));
        return enabled;
    }

    public static boolean hotseatShouldUseExtractedColors(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_HOTSEAT_EXTRACTED_COLORS, true);
        FirebaseAnalytics.getInstance(context).setUserProperty("hotseat_extract_enabled", String.valueOf(enabled));
        return enabled;
    }

    public static boolean enableHapticFeedback(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_HAPTIC_FEEDBACK, false);
        FirebaseAnalytics.getInstance(context).setUserProperty("haptic_feedback_enabled", String.valueOf(enabled));
        return enabled;
    }

    public static boolean keepScrollState(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_KEEP_SCROLL_STATE, false);
        FirebaseAnalytics.getInstance(context).setUserProperty("keep_scrollstate", String.valueOf(enabled));
        return enabled;
    }

    public static boolean useFullWidthSearchbar(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_FULL_WIDTH_SEARCHBAR, false);
        FirebaseAnalytics.getInstance(context).setUserProperty("full_width_searchbar", String.valueOf(enabled));
        return enabled;
    }

    public static boolean showVoiceSearchButton(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_SHOW_VOICE_SEARCH_BUTTON, false);
        FirebaseAnalytics.getInstance(context).setUserProperty("show_voice_search", String.valueOf(enabled));
        return enabled;
    }

    public static boolean showPixelBar(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_SHOW_PIXEL_BAR, true);
        FirebaseAnalytics.getInstance(context).setUserProperty("show_pixel_bar", String.valueOf(enabled));
        return enabled;
    }

    public static boolean homeOpensDrawer(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_HOME_OPENS_DRAWER, true);
        FirebaseAnalytics.getInstance(context).setUserProperty("home_opens_drawer", String.valueOf(enabled));
        return enabled;
    }

    public static boolean usePixelIcons(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_PIXEL_STYLE_ICONS, true);
        FirebaseAnalytics.getInstance(context).setUserProperty("pixel_style_icons", String.valueOf(enabled));
        return enabled;
    }

    public static boolean hideAppLabels(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_HIDE_APP_LABELS, false);
        FirebaseAnalytics.getInstance(context).setUserProperty("hide_app_labels", String.valueOf(enabled));
        return enabled;
    }

    public static boolean allowFullWidthWidgets(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_FULL_WIDTH_WIDGETS, false);
        FirebaseAnalytics.getInstance(context).setUserProperty("full_width_widgets", String.valueOf(enabled));
        return enabled;
    }

    public static boolean showGoogleNowTab(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_SHOW_NOW_TAB, true);
        FirebaseAnalytics.getInstance(context).setUserProperty("google_now_tab", String.valueOf(enabled));
        return enabled;
    }

    public static boolean isTransparentHotseat(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_TRANSPARENT_HOTSEAT, false);
        FirebaseAnalytics.getInstance(context).setUserProperty("hotseat_transparent", String.valueOf(enabled));
        return enabled;
    }

    public static boolean isDynamicUiEnabled(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_ENABLE_DYNAMIC_UI, false);
        FirebaseAnalytics.getInstance(context).setUserProperty("dynamic_ui_enabled", String.valueOf(enabled));
        return enabled;
    }

    public static boolean isBlurEnabled(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_ENABLE_BLUR, false);
        FirebaseAnalytics.getInstance(context).setUserProperty("blur_enabled", String.valueOf(enabled));
        return enabled;
    }

    public static boolean useWhiteGoogleIcon(Context context) {
        boolean enabled = Utilities.getPrefs(context).getBoolean(KEY_PREF_WHITE_GOOGLE_ICON, false);
        FirebaseAnalytics.getInstance(context).setUserProperty("white_google_icon", String.valueOf(enabled));
        return enabled;
    }

    public static boolean useDarkTheme = true;

    public static void applyDarkThemePreference(Launcher launcher) {
        useDarkTheme = Utilities.getPrefs(launcher).getBoolean(KEY_PREF_DARK_THEME, false);
        FirebaseAnalytics.getInstance(launcher).setUserProperty("use_dark_theme", String.valueOf(useDarkTheme));
        if (useDarkTheme)
            launcher.setTheme(R.style.LauncherTheme_Dark);
    }

    public static boolean isVibrancyEnabled(Context context) {
        return true;
    }
}
