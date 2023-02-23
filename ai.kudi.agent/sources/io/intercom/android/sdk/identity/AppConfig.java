package io.intercom.android.sdk.identity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.events.ConfigUpdateEvent;
import io.intercom.android.sdk.nexus.NexusConfig;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.HashSet;
import java.util.Set;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class AppConfig {
    private static final String APP_ATTACHMENTS_ENABLED = "app_user_conversation_attachments_enabled";
    private static final String APP_AUDIO_ENABLED = "app_audio_enabled";
    private static final String APP_BACKGROUND_REQUESTS_ENABLED = "app_background_requests_enabled";
    private static final String APP_BATCH_USER_UPDATE_PERIOD_MS = "batch_user_update_period_ms";
    private static final String APP_FEATURES = "features";
    private static final String APP_GIFS_ENABLED = "app_user_conversation_gifs_enabled";
    private static final String APP_HELP_CENTER_COLOR_RENDER_DARK_TEXT = "app_help_center_color_render_dark_text";
    private static final String APP_HELP_CENTER_PRIMARY_COLOR = "app_help_center_primary_color";
    private static final String APP_HELP_CENTER_URL = "help_center_url";
    private static final String APP_HOME_SCREEN_CARD_COUNT = "app_home_screen_card_count";
    private static final String APP_IDENTITY_VERIFICTION_ENABLED = "app_identity_verification_enabled";
    private static final String APP_INBOUND_MESSAGES = "app_inbound_messages";
    private static final String APP_INTERCOM_LINK = "app_intercom_link";
    private static final String APP_LOCALE = "app_locale";
    private static final String APP_MESSENGER_LOGO_URL = "app_messenger_logo_url";
    private static final String APP_METRICS_ENABLED = "app_metrics_enabled";
    private static final String APP_NAME = "app_name";
    private static final String APP_NEW_SESSION_THRESHOLD_MS = "new_session_threshold_ms";
    private static final String APP_PING_DELAY_MS = "ping_delay_ms";
    private static final String APP_PRIMARY_COLOR = "app_primary_color";
    private static final String APP_PRIMARY_COLOR_RENDER_DARK_TEXT = "app_primary_color_render_dark_text";
    private static final String APP_RATE_LIMIT_COUNT = "app_rate_limit_count";
    private static final String APP_RATE_LIMIT_PERIOD_MS = "app_rate_limit_period_ms";
    private static final String APP_RECEIVED_FROM_SERVER = "app_received_from_server";
    private static final String APP_SECONDARY_COLOR = "app_secondary_color";
    private static final String APP_SECONDARY_COLOR_RENDER_DARK_TEXT = "app_secondary_color_render_dark_text";
    private static final String APP_SOFT_RESET_TIMEOUT_MS = "app_soft_reset_timeout_ms";
    private static final String APP_TEAM_BIO = "app_team_bio";
    private static final String APP_TEAM_GREETING = "app_team_greeting";
    private static final String APP_TEAM_INTRO = "app_team_intro";
    private static final String APP_USER_UPDATE_CACHE_MAX_AGE_MS = "app_user_update_cache_max_age_ms";
    private static final String APP_WALLPAPER = "app_wallpaper";
    private boolean attachmentsEnabled;
    private boolean audioEnabled;
    private boolean backgroundRequestsEnabled;
    private long batchUserUpdatePeriodMs;
    private final int defaultColor;
    private Set<String> features;
    private boolean gifsEnabled;
    private int helpCenterBaseColor;
    private boolean helpCenterColorRenderDarkText;
    private String helpCenterUrl;
    private int homeScreenCardCount;
    private boolean identityVerificationEnabled;
    private boolean inboundMessages;
    private String locale;
    private String messengerLogoUrl;
    private boolean metricsEnabled;
    private String name;
    private long newSessionThresholdMs;
    private long pingDelayMs;
    private final SharedPreferences prefs;
    private int primaryColor;
    private int primaryColorDark;
    private boolean primaryColorRenderDarkText;
    private int rateLimitCount;
    private long rateLimitPeriodMs;
    private NexusConfig realTimeConfig;
    private boolean receivedFromServer;
    private int secondaryColor;
    private int secondaryColorDark;
    private boolean secondaryColorRenderDarkText;
    private boolean showIntercomLink;
    private long softResetTimeoutMs;
    private String teamGreeting;
    private String teamIntro;
    private String teamProfileBio;
    private long userUpdateCacheMaxAgeMs;
    private String wallpaper;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AppConfig(Context context) {
        NexusConfig $r2 = new NexusConfig();
        this.realTimeConfig = $r2;
        int $i0 = C10110R.color.intercom_main_blue;
        this.defaultColor = C1335a.m36324d(context, $i0);
        SharedPreferences $r3 = context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        this.prefs = $r3;
        String $r4 = $r3.getString(APP_NAME, "");
        this.name = $r4;
        SharedPreferences $r32 = this.prefs;
        int $i02 = this.defaultColor;
        int $i03 = $r32.getInt(APP_PRIMARY_COLOR, $i02);
        this.primaryColor = $i03;
        this.primaryColorDark = ColorUtils.darkenColor($i03);
        SharedPreferences $r33 = this.prefs;
        int $i04 = this.primaryColor;
        this.secondaryColor = $r33.getInt(APP_SECONDARY_COLOR, $i04);
        int $i05 = darkSecondaryColor();
        this.secondaryColorDark = $i05;
        boolean $z0 = this.prefs.getBoolean(APP_PRIMARY_COLOR_RENDER_DARK_TEXT, false);
        this.primaryColorRenderDarkText = $z0;
        boolean $z02 = this.prefs.getBoolean(APP_SECONDARY_COLOR_RENDER_DARK_TEXT, false);
        this.secondaryColorRenderDarkText = $z02;
        boolean $z03 = this.prefs.getBoolean(APP_HELP_CENTER_COLOR_RENDER_DARK_TEXT, false);
        this.helpCenterColorRenderDarkText = $z03;
        boolean $z04 = this.prefs.getBoolean(APP_INTERCOM_LINK, true);
        this.showIntercomLink = $z04;
        boolean $z05 = this.prefs.getBoolean(APP_INBOUND_MESSAGES, false);
        this.inboundMessages = $z05;
        boolean $z06 = this.prefs.getBoolean(APP_ATTACHMENTS_ENABLED, true);
        this.attachmentsEnabled = $z06;
        boolean $z07 = this.prefs.getBoolean(APP_GIFS_ENABLED, true);
        this.gifsEnabled = $z07;
        int $i06 = this.prefs.getInt(APP_RATE_LIMIT_COUNT, 100);
        this.rateLimitCount = $i06;
        SharedPreferences $r34 = this.prefs;
        long $l1 = Config.DEFAULT_RATE_LIMIT_PERIOD_MS;
        this.rateLimitPeriodMs = $r34.getLong(APP_RATE_LIMIT_PERIOD_MS, $l1);
        SharedPreferences $r35 = this.prefs;
        long $l12 = Config.DEFAULT_CACHE_MAX_AGE_MS;
        this.userUpdateCacheMaxAgeMs = $r35.getLong(APP_USER_UPDATE_CACHE_MAX_AGE_MS, $l12);
        SharedPreferences $r36 = this.prefs;
        long $l13 = Config.DEFAULT_SESSION_TIMEOUT_MS;
        this.newSessionThresholdMs = $r36.getLong(APP_NEW_SESSION_THRESHOLD_MS, $l13);
        SharedPreferences $r37 = this.prefs;
        long $l14 = Config.DEFAULT_SOFT_RESET_TIMEOUT_MS;
        this.softResetTimeoutMs = $r37.getLong(APP_SOFT_RESET_TIMEOUT_MS, $l14);
        SharedPreferences $r38 = this.prefs;
        long $l15 = Config.DEFAULT_BATCH_USER_UPDATE_PERIOD_MS;
        this.batchUserUpdatePeriodMs = $r38.getLong(APP_BATCH_USER_UPDATE_PERIOD_MS, $l15);
        SharedPreferences $r39 = this.prefs;
        long $l16 = Config.DEFAULT_PING_DELAY_MS;
        this.pingDelayMs = $r39.getLong(APP_PING_DELAY_MS, $l16);
        int $i07 = this.prefs.getInt(APP_HOME_SCREEN_CARD_COUNT, 0);
        this.homeScreenCardCount = $i07;
        boolean $z08 = this.prefs.getBoolean(APP_METRICS_ENABLED, true);
        this.metricsEnabled = $z08;
        boolean $z09 = this.prefs.getBoolean(APP_AUDIO_ENABLED, true);
        this.audioEnabled = $z09;
        String $r42 = this.prefs.getString(APP_TEAM_BIO, "");
        this.teamProfileBio = $r42;
        String $r43 = this.prefs.getString(APP_WALLPAPER, "");
        this.wallpaper = $r43;
        String $r44 = this.prefs.getString(APP_LOCALE, "");
        this.locale = $r44;
        boolean $z010 = this.prefs.getBoolean(APP_RECEIVED_FROM_SERVER, false);
        this.receivedFromServer = $z010;
        boolean $z011 = this.prefs.getBoolean(APP_BACKGROUND_REQUESTS_ENABLED, true);
        this.backgroundRequestsEnabled = $z011;
        String $r45 = this.prefs.getString(APP_HELP_CENTER_URL, "");
        this.helpCenterUrl = $r45;
        SharedPreferences $r310 = this.prefs;
        int $i08 = this.defaultColor;
        this.helpCenterBaseColor = $r310.getInt(APP_HELP_CENTER_PRIMARY_COLOR, $i08);
        SharedPreferences $r311 = this.prefs;
        HashSet $r5 = new HashSet();
        Set $r6 = $r311.getStringSet(APP_FEATURES, $r5);
        this.features = $r6;
        String $r46 = this.prefs.getString(APP_MESSENGER_LOGO_URL, "");
        this.messengerLogoUrl = $r46;
        String $r47 = this.prefs.getString(APP_TEAM_INTRO, "");
        this.teamIntro = $r47;
        String $r48 = this.prefs.getString(APP_TEAM_GREETING, "");
        this.teamGreeting = $r48;
        boolean $z012 = this.prefs.getBoolean(APP_IDENTITY_VERIFICTION_ENABLED, false);
        this.identityVerificationEnabled = $z012;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private int darkSecondaryColor() {
        int $i0 = this.secondaryColor;
        return ColorUtils.darkenColor($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private int getConfigColor(String str) {
        if (str == null) {
            int $i0 = this.defaultColor;
            return $i0;
        }
        int $i02 = Color.parseColor(str);
        return $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private String getWallpaperFromConfig(Config config) {
        String $r2 = config.getMessenger4Background();
        boolean $z0 = TextUtils.isEmpty($r2);
        return $z0 ? config.getMessengerBackground() : $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean isNewConfig(Config config) {
        String $r2 = config.getWelcomeMessage();
        String $r3 = this.teamProfileBio;
        boolean $z0 = $r2.equals($r3);
        if ($z0) {
            String $r22 = getWallpaperFromConfig(config);
            String $r32 = this.wallpaper;
            boolean $z02 = $r22.equals($r32);
            if ($z02) {
                String $r23 = config.getName();
                String $r33 = this.name;
                boolean $z03 = $r23.equals($r33);
                if ($z03) {
                    String $r24 = config.getLocale();
                    String $r34 = this.locale;
                    boolean $z04 = $r24.equals($r34);
                    if ($z04) {
                        String $r25 = config.getPrimaryColor();
                        int $i0 = getConfigColor($r25);
                        int $i1 = this.primaryColor;
                        if ($i0 == $i1) {
                            String $r26 = config.getSecondaryColor();
                            int $i02 = getConfigColor($r26);
                            int $i12 = this.secondaryColor;
                            if ($i02 == $i12) {
                                boolean $z05 = config.isPrimaryColorRenderDarkText();
                                boolean $z1 = this.primaryColorRenderDarkText;
                                if ($z05 == $z1) {
                                    boolean $z06 = config.isSecondaryColorRenderDarkText();
                                    boolean $z12 = this.secondaryColorRenderDarkText;
                                    if ($z06 == $z12) {
                                        boolean $z07 = config.isHelpCenterColorRenderDarkText();
                                        boolean $z13 = this.helpCenterColorRenderDarkText;
                                        if ($z07 == $z13) {
                                            long $l2 = config.getUserUpdateCacheMaxAge();
                                            long $l3 = this.userUpdateCacheMaxAgeMs;
                                            if ($l2 == $l3) {
                                                boolean $z08 = config.isMetricsEnabled();
                                                boolean $z14 = this.metricsEnabled;
                                                if ($z08 == $z14) {
                                                    boolean $z09 = config.isAudioEnabled();
                                                    boolean $z15 = this.audioEnabled;
                                                    if ($z09 == $z15) {
                                                        boolean $z010 = config.isShowPoweredBy();
                                                        boolean $z16 = this.showIntercomLink;
                                                        if ($z010 == $z16) {
                                                            boolean $z011 = config.isInboundMessages();
                                                            boolean $z17 = this.inboundMessages;
                                                            if ($z011 == $z17) {
                                                                boolean $z012 = config.isAttachmentsEnabled();
                                                                boolean $z18 = this.attachmentsEnabled;
                                                                if ($z012 == $z18) {
                                                                    boolean $z013 = config.isGifsEnabled();
                                                                    boolean $z19 = this.gifsEnabled;
                                                                    if ($z013 == $z19) {
                                                                        int $i03 = config.getRateLimitCount();
                                                                        int $i13 = this.rateLimitCount;
                                                                        if ($i03 == $i13) {
                                                                            long $l22 = config.getRateLimitPeriod();
                                                                            long $l32 = this.rateLimitPeriodMs;
                                                                            if ($l22 == $l32) {
                                                                                long $l23 = config.getNewSessionThreshold();
                                                                                long $l33 = this.newSessionThresholdMs;
                                                                                if ($l23 == $l33) {
                                                                                    long $l24 = config.getSoftResetTimeout();
                                                                                    long $l34 = this.softResetTimeoutMs;
                                                                                    if ($l24 == $l34) {
                                                                                        long $l25 = config.getBatchUserUpdatePeriod();
                                                                                        long $l35 = this.batchUserUpdatePeriodMs;
                                                                                        if ($l25 == $l35) {
                                                                                            long $l26 = config.getPingDelayMs();
                                                                                            long $l36 = this.pingDelayMs;
                                                                                            if ($l26 == $l36) {
                                                                                                int $i04 = config.getHomeScreenCardCount();
                                                                                                int $i14 = this.homeScreenCardCount;
                                                                                                if ($i04 == $i14) {
                                                                                                    boolean $z014 = config.isBackgroundRequestsEnabled();
                                                                                                    boolean $z110 = this.backgroundRequestsEnabled;
                                                                                                    if ($z014 == $z110) {
                                                                                                        String $r27 = config.getHelpCenterUrl();
                                                                                                        String $r35 = this.helpCenterUrl;
                                                                                                        boolean $z015 = $r27.equals($r35);
                                                                                                        if ($z015) {
                                                                                                            String $r28 = config.getHelpCenterBaseColor();
                                                                                                            int $i05 = getConfigColor($r28);
                                                                                                            int $i15 = this.helpCenterBaseColor;
                                                                                                            if ($i05 == $i15) {
                                                                                                                Set $r4 = config.getFeatures();
                                                                                                                Set $r5 = this.features;
                                                                                                                boolean $z016 = $r4.equals($r5);
                                                                                                                if ($z016) {
                                                                                                                    String $r29 = config.getMessengerLogoUrl();
                                                                                                                    String $r36 = this.messengerLogoUrl;
                                                                                                                    boolean $z017 = $r29.equals($r36);
                                                                                                                    if ($z017) {
                                                                                                                        String $r210 = config.getTeamIntro();
                                                                                                                        String $r37 = this.teamIntro;
                                                                                                                        boolean $z018 = $r210.equals($r37);
                                                                                                                        if ($z018) {
                                                                                                                            String $r211 = config.getTeamGreeting();
                                                                                                                            String $r38 = this.teamGreeting;
                                                                                                                            boolean $z019 = $r211.equals($r38);
                                                                                                                            if ($z019) {
                                                                                                                                String $r212 = config.getTeamGreeting();
                                                                                                                                String $r39 = this.teamGreeting;
                                                                                                                                boolean $z020 = $r212.equals($r39);
                                                                                                                                if ($z020) {
                                                                                                                                    boolean $z021 = config.getIdentityVerificationEnabled();
                                                                                                                                    boolean $z111 = this.identityVerificationEnabled;
                                                                                                                                    return $z021 != $z111;
                                                                                                                                }
                                                                                                                                return true;
                                                                                                                            }
                                                                                                                            return true;
                                                                                                                        }
                                                                                                                        return true;
                                                                                                                    }
                                                                                                                    return true;
                                                                                                                }
                                                                                                                return true;
                                                                                                            }
                                                                                                            return true;
                                                                                                        }
                                                                                                        return true;
                                                                                                    }
                                                                                                    return true;
                                                                                                }
                                                                                                return true;
                                                                                            }
                                                                                            return true;
                                                                                        }
                                                                                        return true;
                                                                                    }
                                                                                    return true;
                                                                                }
                                                                                return true;
                                                                            }
                                                                            return true;
                                                                        }
                                                                        return true;
                                                                    }
                                                                    return true;
                                                                }
                                                                return true;
                                                            }
                                                            return true;
                                                        }
                                                        return true;
                                                    }
                                                    return true;
                                                }
                                                return true;
                                            }
                                            return true;
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private String removeLineSeparator(String str) {
        String $r2 = System.getProperty("line.separator");
        String $r1 = str.replaceAll($r2, "");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean backgroundRequestsDisabled() {
        boolean $z0 = this.backgroundRequestsEnabled;
        return !$z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public long getBatchUserUpdatePeriodMs() {
        long l0 = this.batchUserUpdatePeriodMs;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int getHelpCenterBaseColor() {
        int i0 = this.helpCenterBaseColor;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getHelpCenterUrl() {
        String r1 = this.helpCenterUrl;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int getHomeScreenCardCount() {
        int i0 = this.homeScreenCardCount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getLocale() {
        String r1 = this.locale;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getMessengerLogoUrl() {
        String r1 = this.messengerLogoUrl;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getName() {
        String r1 = this.name;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public long getNewSessionThresholdMs() {
        long l0 = this.newSessionThresholdMs;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public long getPingDelayMs() {
        long l0 = this.pingDelayMs;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int getPrimaryColor() {
        int i0 = this.primaryColor;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int getPrimaryColorDark() {
        int i0 = this.primaryColorDark;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int getRateLimitCount() {
        int i0 = this.rateLimitCount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public long getRateLimitPeriodMs() {
        long l0 = this.rateLimitPeriodMs;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NexusConfig getRealTimeConfig() {
        NexusConfig r1 = this.realTimeConfig;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int getSecondaryColor() {
        int i0 = this.secondaryColor;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int getSecondaryColorDark() {
        int i0 = this.secondaryColorDark;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public long getSoftResetTimeoutMs() {
        long l0 = this.softResetTimeoutMs;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getTeamGreeting() {
        String r1 = this.teamGreeting;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getTeamIntro() {
        String $r1 = this.teamIntro;
        return removeLineSeparator($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getTeamProfileBio() {
        String $r1 = this.teamProfileBio;
        return removeLineSeparator($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public long getUserUpdateCacheMaxAgeMs() {
        long l0 = this.userUpdateCacheMaxAgeMs;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getWallpaper() {
        String r1 = this.wallpaper;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean hasFeature(String str) {
        Set $r1 = this.features;
        boolean $z0 = $r1.contains(str);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean helpCenterColorRenderDarkText() {
        boolean z0 = this.helpCenterColorRenderDarkText;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isAttachmentsEnabled() {
        boolean z0 = this.attachmentsEnabled;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isAudioEnabled() {
        boolean z0 = this.audioEnabled;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isGifsEnabled() {
        boolean z0 = this.gifsEnabled;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isIdentityVerificationEnabled() {
        boolean z0 = this.identityVerificationEnabled;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isInboundMessages() {
        boolean z0 = this.inboundMessages;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isMetricsEnabled() {
        boolean z0 = this.metricsEnabled;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isReceivedFromServer() {
        boolean z0 = this.receivedFromServer;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean primaryColorRenderDarkText() {
        boolean z0 = this.primaryColorRenderDarkText;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void resetRealTimeConfig() {
        NexusConfig $r1 = new NexusConfig();
        this.realTimeConfig = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean secondaryColorRenderDarkText() {
        boolean z0 = this.secondaryColorRenderDarkText;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean shouldShowIntercomLink() {
        boolean z0 = this.showIntercomLink;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void update(Config config, C11129b c11129b) {
        Config $r3 = Config.NULL;
        if (config == $r3) {
            return;
        }
        NexusConfig $r4 = config.getRealTimeConfig();
        this.realTimeConfig = $r4;
        this.receivedFromServer = true;
        boolean $z0 = isNewConfig(config);
        if ($z0) {
            String $r5 = config.getName();
            this.name = $r5;
            String $r52 = config.getWelcomeMessage();
            this.teamProfileBio = $r52;
            String $r53 = getWallpaperFromConfig(config);
            this.wallpaper = $r53;
            String $r54 = config.getPrimaryColor();
            int $i0 = getConfigColor($r54);
            this.primaryColor = $i0;
            this.primaryColorDark = ColorUtils.darkenColor($i0);
            String $r55 = config.getSecondaryColor();
            this.secondaryColor = getConfigColor($r55);
            boolean $z02 = config.isPrimaryColorRenderDarkText();
            this.primaryColorRenderDarkText = $z02;
            boolean $z03 = config.isSecondaryColorRenderDarkText();
            this.secondaryColorRenderDarkText = $z03;
            boolean $z04 = config.isHelpCenterColorRenderDarkText();
            this.helpCenterColorRenderDarkText = $z04;
            boolean $z05 = config.isInboundMessages();
            this.inboundMessages = $z05;
            boolean $z06 = config.isAttachmentsEnabled();
            this.attachmentsEnabled = $z06;
            boolean $z07 = config.isGifsEnabled();
            this.gifsEnabled = $z07;
            this.secondaryColorDark = darkSecondaryColor();
            boolean $z08 = config.isShowPoweredBy();
            this.showIntercomLink = $z08;
            boolean $z09 = config.isAudioEnabled();
            this.audioEnabled = $z09;
            boolean $z010 = config.isMetricsEnabled();
            this.metricsEnabled = $z010;
            long $l1 = config.getUserUpdateCacheMaxAge();
            this.userUpdateCacheMaxAgeMs = $l1;
            long $l12 = config.getRateLimitPeriod();
            this.rateLimitPeriodMs = $l12;
            this.rateLimitCount = config.getRateLimitCount();
            long $l13 = config.getNewSessionThreshold();
            this.newSessionThresholdMs = $l13;
            long $l14 = config.getSoftResetTimeout();
            this.softResetTimeoutMs = $l14;
            long $l15 = config.getBatchUserUpdatePeriod();
            this.batchUserUpdatePeriodMs = $l15;
            long $l16 = config.getPingDelayMs();
            this.pingDelayMs = $l16;
            this.homeScreenCardCount = config.getHomeScreenCardCount();
            boolean $z011 = config.isBackgroundRequestsEnabled();
            this.backgroundRequestsEnabled = $z011;
            String $r56 = config.getLocale();
            this.locale = $r56;
            String $r57 = config.getHelpCenterUrl();
            this.helpCenterUrl = $r57;
            String $r58 = config.getHelpCenterBaseColor();
            this.helpCenterBaseColor = getConfigColor($r58);
            Set $r6 = config.getFeatures();
            this.features = $r6;
            String $r59 = config.getMessengerLogoUrl();
            this.messengerLogoUrl = $r59;
            String $r510 = config.getTeamIntro();
            this.teamIntro = $r510;
            String $r511 = config.getTeamGreeting();
            this.teamGreeting = $r511;
            boolean $z012 = config.getIdentityVerificationEnabled();
            this.identityVerificationEnabled = $z012;
            SharedPreferences $r7 = this.prefs;
            SharedPreferences.Editor $r8 = $r7.edit();
            String $r512 = this.name;
            SharedPreferences.Editor $r82 = $r8.putString(APP_NAME, $r512);
            String $r513 = this.teamProfileBio;
            SharedPreferences.Editor $r83 = $r82.putString(APP_TEAM_BIO, $r513);
            String $r514 = this.wallpaper;
            SharedPreferences.Editor $r84 = $r83.putString(APP_WALLPAPER, $r514);
            String $r515 = this.locale;
            SharedPreferences.Editor $r85 = $r84.putString(APP_LOCALE, $r515);
            String $r516 = this.messengerLogoUrl;
            SharedPreferences.Editor $r86 = $r85.putString(APP_MESSENGER_LOGO_URL, $r516);
            String $r517 = this.teamIntro;
            SharedPreferences.Editor $r87 = $r86.putString(APP_TEAM_INTRO, $r517);
            String $r518 = this.teamGreeting;
            SharedPreferences.Editor $r88 = $r87.putString(APP_TEAM_GREETING, $r518).putInt(APP_PRIMARY_COLOR, this.primaryColor).putInt(APP_SECONDARY_COLOR, this.secondaryColor).putInt(APP_HELP_CENTER_PRIMARY_COLOR, this.helpCenterBaseColor).putInt(APP_RATE_LIMIT_COUNT, this.rateLimitCount);
            long $l17 = this.userUpdateCacheMaxAgeMs;
            SharedPreferences.Editor $r89 = $r88.putLong(APP_USER_UPDATE_CACHE_MAX_AGE_MS, $l17);
            long $l18 = this.rateLimitPeriodMs;
            SharedPreferences.Editor $r810 = $r89.putLong(APP_RATE_LIMIT_PERIOD_MS, $l18);
            long $l19 = this.newSessionThresholdMs;
            SharedPreferences.Editor $r811 = $r810.putLong(APP_NEW_SESSION_THRESHOLD_MS, $l19);
            long $l110 = this.batchUserUpdatePeriodMs;
            SharedPreferences.Editor $r812 = $r811.putLong(APP_BATCH_USER_UPDATE_PERIOD_MS, $l110);
            long $l111 = this.pingDelayMs;
            SharedPreferences.Editor $r813 = $r812.putLong(APP_PING_DELAY_MS, $l111).putInt(APP_HOME_SCREEN_CARD_COUNT, this.homeScreenCardCount);
            long $l112 = this.softResetTimeoutMs;
            SharedPreferences.Editor $r814 = $r813.putLong(APP_SOFT_RESET_TIMEOUT_MS, $l112);
            boolean $z013 = this.showIntercomLink;
            SharedPreferences.Editor $r815 = $r814.putBoolean(APP_INTERCOM_LINK, $z013);
            boolean $z014 = this.inboundMessages;
            SharedPreferences.Editor $r816 = $r815.putBoolean(APP_INBOUND_MESSAGES, $z014);
            boolean $z015 = this.attachmentsEnabled;
            SharedPreferences.Editor $r817 = $r816.putBoolean(APP_ATTACHMENTS_ENABLED, $z015);
            boolean $z016 = this.gifsEnabled;
            SharedPreferences.Editor $r818 = $r817.putBoolean(APP_GIFS_ENABLED, $z016);
            boolean $z017 = this.audioEnabled;
            SharedPreferences.Editor $r819 = $r818.putBoolean(APP_AUDIO_ENABLED, $z017);
            boolean $z018 = this.metricsEnabled;
            SharedPreferences.Editor $r820 = $r819.putBoolean(APP_METRICS_ENABLED, $z018).putBoolean(APP_RECEIVED_FROM_SERVER, true);
            boolean $z019 = this.backgroundRequestsEnabled;
            SharedPreferences.Editor $r821 = $r820.putBoolean(APP_BACKGROUND_REQUESTS_ENABLED, $z019);
            boolean $z020 = this.primaryColorRenderDarkText;
            SharedPreferences.Editor $r822 = $r821.putBoolean(APP_PRIMARY_COLOR_RENDER_DARK_TEXT, $z020);
            boolean $z021 = this.secondaryColorRenderDarkText;
            SharedPreferences.Editor $r823 = $r822.putBoolean(APP_SECONDARY_COLOR_RENDER_DARK_TEXT, $z021);
            boolean $z022 = this.helpCenterColorRenderDarkText;
            SharedPreferences.Editor $r824 = $r823.putBoolean(APP_HELP_CENTER_COLOR_RENDER_DARK_TEXT, $z022);
            String $r519 = this.helpCenterUrl;
            SharedPreferences.Editor $r825 = $r824.putString(APP_HELP_CENTER_URL, $r519);
            Set $r62 = this.features;
            $r825.putStringSet(APP_FEATURES, $r62).apply();
            ConfigUpdateEvent $r9 = new ConfigUpdateEvent();
            c11129b.post($r9);
        }
    }
}
