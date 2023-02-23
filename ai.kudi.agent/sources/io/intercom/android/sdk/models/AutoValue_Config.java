package io.intercom.android.sdk.models;

import io.intercom.android.sdk.nexus.NexusConfig;
import java.util.Set;
/* loaded from: classes3.dex */
final class AutoValue_Config extends Config {
    private final boolean attachmentsEnabled;
    private final boolean audioEnabled;
    private final boolean backgroundRequestsEnabled;
    private final long batchUserUpdatePeriod;
    private final Set<String> features;
    private final boolean firstRequest;
    private final boolean gifsEnabled;
    private final String helpCenterBaseColor;
    private final boolean helpCenterColorRenderDarkText;
    private final String helpCenterUrl;
    private final int homeScreenCardCount;
    private final boolean identityVerificationEnabled;
    private final boolean inboundMessages;
    private final String locale;
    private final String messenger4Background;
    private final String messengerBackground;
    private final String messengerLogoUrl;
    private final boolean metricsEnabled;
    private final String name;
    private final long newSessionThreshold;
    private final long pingDelayMs;
    private final String primaryColor;
    private final boolean primaryColorRenderDarkText;
    private final int rateLimitCount;
    private final long rateLimitPeriod;
    private final NexusConfig realTimeConfig;
    private final String secondaryColor;
    private final boolean secondaryColorRenderDarkText;
    private final boolean showPoweredBy;
    private final long softResetTimeout;
    private final String teamGreeting;
    private final String teamIntro;
    private final long userUpdateCacheMaxAge;
    private final String welcomeMessage;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, long j, int i, long j2, long j3, long j4, long j5, long j6, int i2, NexusConfig nexusConfig, String str11, String str12, Set<String> set, boolean z12) {
        if (str != null) {
            this.name = str;
            this.primaryColor = str2;
            this.secondaryColor = str3;
            if (str4 != null) {
                this.welcomeMessage = str4;
                if (str5 != null) {
                    this.messengerBackground = str5;
                    if (str6 != null) {
                        this.messenger4Background = str6;
                        if (str7 != null) {
                            this.locale = str7;
                            if (str8 != null) {
                                this.messengerLogoUrl = str8;
                                if (str9 != null) {
                                    this.teamIntro = str9;
                                    if (str10 != null) {
                                        this.teamGreeting = str10;
                                        this.firstRequest = z;
                                        this.inboundMessages = z2;
                                        this.attachmentsEnabled = z3;
                                        this.gifsEnabled = z4;
                                        this.showPoweredBy = z5;
                                        this.audioEnabled = z6;
                                        this.metricsEnabled = z7;
                                        this.backgroundRequestsEnabled = z8;
                                        this.primaryColorRenderDarkText = z9;
                                        this.secondaryColorRenderDarkText = z10;
                                        this.helpCenterColorRenderDarkText = z11;
                                        this.rateLimitPeriod = j;
                                        this.rateLimitCount = i;
                                        this.batchUserUpdatePeriod = j2;
                                        this.userUpdateCacheMaxAge = j3;
                                        this.softResetTimeout = j4;
                                        this.newSessionThreshold = j5;
                                        this.pingDelayMs = j6;
                                        this.homeScreenCardCount = i2;
                                        if (nexusConfig != null) {
                                            this.realTimeConfig = nexusConfig;
                                            if (str11 != null) {
                                                this.helpCenterUrl = str11;
                                                this.helpCenterBaseColor = str12;
                                                if (set != null) {
                                                    this.features = set;
                                                    this.identityVerificationEnabled = z12;
                                                    return;
                                                }
                                                throw new NullPointerException("Null features");
                                            }
                                            throw new NullPointerException("Null helpCenterUrl");
                                        }
                                        throw new NullPointerException("Null realTimeConfig");
                                    }
                                    throw new NullPointerException("Null teamGreeting");
                                }
                                throw new NullPointerException("Null teamIntro");
                            }
                            throw new NullPointerException("Null messengerLogoUrl");
                        }
                        throw new NullPointerException("Null locale");
                    }
                    throw new NullPointerException("Null messenger4Background");
                }
                throw new NullPointerException("Null messengerBackground");
            }
            throw new NullPointerException("Null welcomeMessage");
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Config) {
            Config config = (Config) obj;
            return this.name.equals(config.getName()) && ((str = this.primaryColor) != null ? str.equals(config.getPrimaryColor()) : config.getPrimaryColor() == null) && ((str2 = this.secondaryColor) != null ? str2.equals(config.getSecondaryColor()) : config.getSecondaryColor() == null) && this.welcomeMessage.equals(config.getWelcomeMessage()) && this.messengerBackground.equals(config.getMessengerBackground()) && this.messenger4Background.equals(config.getMessenger4Background()) && this.locale.equals(config.getLocale()) && this.messengerLogoUrl.equals(config.getMessengerLogoUrl()) && this.teamIntro.equals(config.getTeamIntro()) && this.teamGreeting.equals(config.getTeamGreeting()) && this.firstRequest == config.isFirstRequest() && this.inboundMessages == config.isInboundMessages() && this.attachmentsEnabled == config.isAttachmentsEnabled() && this.gifsEnabled == config.isGifsEnabled() && this.showPoweredBy == config.isShowPoweredBy() && this.audioEnabled == config.isAudioEnabled() && this.metricsEnabled == config.isMetricsEnabled() && this.backgroundRequestsEnabled == config.isBackgroundRequestsEnabled() && this.primaryColorRenderDarkText == config.isPrimaryColorRenderDarkText() && this.secondaryColorRenderDarkText == config.isSecondaryColorRenderDarkText() && this.helpCenterColorRenderDarkText == config.isHelpCenterColorRenderDarkText() && this.rateLimitPeriod == config.getRateLimitPeriod() && this.rateLimitCount == config.getRateLimitCount() && this.batchUserUpdatePeriod == config.getBatchUserUpdatePeriod() && this.userUpdateCacheMaxAge == config.getUserUpdateCacheMaxAge() && this.softResetTimeout == config.getSoftResetTimeout() && this.newSessionThreshold == config.getNewSessionThreshold() && this.pingDelayMs == config.getPingDelayMs() && this.homeScreenCardCount == config.getHomeScreenCardCount() && this.realTimeConfig.equals(config.getRealTimeConfig()) && this.helpCenterUrl.equals(config.getHelpCenterUrl()) && ((str3 = this.helpCenterBaseColor) != null ? str3.equals(config.getHelpCenterBaseColor()) : config.getHelpCenterBaseColor() == null) && this.features.equals(config.getFeatures()) && this.identityVerificationEnabled == config.getIdentityVerificationEnabled();
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Config
    public long getBatchUserUpdatePeriod() {
        return this.batchUserUpdatePeriod;
    }

    @Override // io.intercom.android.sdk.models.Config
    public Set<String> getFeatures() {
        return this.features;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getHelpCenterBaseColor() {
        return this.helpCenterBaseColor;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    @Override // io.intercom.android.sdk.models.Config
    public int getHomeScreenCardCount() {
        return this.homeScreenCardCount;
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean getIdentityVerificationEnabled() {
        return this.identityVerificationEnabled;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getLocale() {
        return this.locale;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getMessenger4Background() {
        return this.messenger4Background;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getMessengerBackground() {
        return this.messengerBackground;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getMessengerLogoUrl() {
        return this.messengerLogoUrl;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getName() {
        return this.name;
    }

    @Override // io.intercom.android.sdk.models.Config
    public long getNewSessionThreshold() {
        return this.newSessionThreshold;
    }

    @Override // io.intercom.android.sdk.models.Config
    public long getPingDelayMs() {
        return this.pingDelayMs;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getPrimaryColor() {
        return this.primaryColor;
    }

    @Override // io.intercom.android.sdk.models.Config
    public int getRateLimitCount() {
        return this.rateLimitCount;
    }

    @Override // io.intercom.android.sdk.models.Config
    public long getRateLimitPeriod() {
        return this.rateLimitPeriod;
    }

    @Override // io.intercom.android.sdk.models.Config
    public NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getSecondaryColor() {
        return this.secondaryColor;
    }

    @Override // io.intercom.android.sdk.models.Config
    public long getSoftResetTimeout() {
        return this.softResetTimeout;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getTeamGreeting() {
        return this.teamGreeting;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getTeamIntro() {
        return this.teamIntro;
    }

    @Override // io.intercom.android.sdk.models.Config
    public long getUserUpdateCacheMaxAge() {
        return this.userUpdateCacheMaxAge;
    }

    @Override // io.intercom.android.sdk.models.Config
    public String getWelcomeMessage() {
        return this.welcomeMessage;
    }

    public int hashCode() {
        int hashCode = (this.name.hashCode() ^ 1000003) * 1000003;
        String str = this.primaryColor;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.secondaryColor;
        int hashCode3 = (((((((((((((((((((((((((((((((((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.welcomeMessage.hashCode()) * 1000003) ^ this.messengerBackground.hashCode()) * 1000003) ^ this.messenger4Background.hashCode()) * 1000003) ^ this.locale.hashCode()) * 1000003) ^ this.messengerLogoUrl.hashCode()) * 1000003) ^ this.teamIntro.hashCode()) * 1000003) ^ this.teamGreeting.hashCode()) * 1000003) ^ (this.firstRequest ? 1231 : 1237)) * 1000003) ^ (this.inboundMessages ? 1231 : 1237)) * 1000003) ^ (this.attachmentsEnabled ? 1231 : 1237)) * 1000003) ^ (this.gifsEnabled ? 1231 : 1237)) * 1000003) ^ (this.showPoweredBy ? 1231 : 1237)) * 1000003) ^ (this.audioEnabled ? 1231 : 1237)) * 1000003) ^ (this.metricsEnabled ? 1231 : 1237)) * 1000003) ^ (this.backgroundRequestsEnabled ? 1231 : 1237)) * 1000003) ^ (this.primaryColorRenderDarkText ? 1231 : 1237)) * 1000003) ^ (this.secondaryColorRenderDarkText ? 1231 : 1237)) * 1000003;
        int i = this.helpCenterColorRenderDarkText ? 1231 : 1237;
        long j = this.rateLimitPeriod;
        long j2 = this.batchUserUpdatePeriod;
        long j3 = this.userUpdateCacheMaxAge;
        long j4 = this.softResetTimeout;
        long j5 = this.newSessionThreshold;
        long j6 = this.pingDelayMs;
        int hashCode4 = (((((((((((((((((((((hashCode3 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.rateLimitCount) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.homeScreenCardCount) * 1000003) ^ this.realTimeConfig.hashCode()) * 1000003) ^ this.helpCenterUrl.hashCode()) * 1000003;
        String str3 = this.helpCenterBaseColor;
        return ((((hashCode4 ^ (str3 != null ? str3.hashCode() : 0)) * 1000003) ^ this.features.hashCode()) * 1000003) ^ (this.identityVerificationEnabled ? 1231 : 1237);
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean isAttachmentsEnabled() {
        return this.attachmentsEnabled;
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean isAudioEnabled() {
        return this.audioEnabled;
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean isBackgroundRequestsEnabled() {
        return this.backgroundRequestsEnabled;
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean isFirstRequest() {
        return this.firstRequest;
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean isGifsEnabled() {
        return this.gifsEnabled;
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean isHelpCenterColorRenderDarkText() {
        return this.helpCenterColorRenderDarkText;
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean isInboundMessages() {
        return this.inboundMessages;
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean isMetricsEnabled() {
        return this.metricsEnabled;
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean isPrimaryColorRenderDarkText() {
        return this.primaryColorRenderDarkText;
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean isSecondaryColorRenderDarkText() {
        return this.secondaryColorRenderDarkText;
    }

    @Override // io.intercom.android.sdk.models.Config
    public boolean isShowPoweredBy() {
        return this.showPoweredBy;
    }

    public String toString() {
        return "Config{name=" + this.name + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", welcomeMessage=" + this.welcomeMessage + ", messengerBackground=" + this.messengerBackground + ", messenger4Background=" + this.messenger4Background + ", locale=" + this.locale + ", messengerLogoUrl=" + this.messengerLogoUrl + ", teamIntro=" + this.teamIntro + ", teamGreeting=" + this.teamGreeting + ", firstRequest=" + this.firstRequest + ", inboundMessages=" + this.inboundMessages + ", attachmentsEnabled=" + this.attachmentsEnabled + ", gifsEnabled=" + this.gifsEnabled + ", showPoweredBy=" + this.showPoweredBy + ", audioEnabled=" + this.audioEnabled + ", metricsEnabled=" + this.metricsEnabled + ", backgroundRequestsEnabled=" + this.backgroundRequestsEnabled + ", primaryColorRenderDarkText=" + this.primaryColorRenderDarkText + ", secondaryColorRenderDarkText=" + this.secondaryColorRenderDarkText + ", helpCenterColorRenderDarkText=" + this.helpCenterColorRenderDarkText + ", rateLimitPeriod=" + this.rateLimitPeriod + ", rateLimitCount=" + this.rateLimitCount + ", batchUserUpdatePeriod=" + this.batchUserUpdatePeriod + ", userUpdateCacheMaxAge=" + this.userUpdateCacheMaxAge + ", softResetTimeout=" + this.softResetTimeout + ", newSessionThreshold=" + this.newSessionThreshold + ", pingDelayMs=" + this.pingDelayMs + ", homeScreenCardCount=" + this.homeScreenCardCount + ", realTimeConfig=" + this.realTimeConfig + ", helpCenterUrl=" + this.helpCenterUrl + ", helpCenterBaseColor=" + this.helpCenterBaseColor + ", features=" + this.features + ", identityVerificationEnabled=" + this.identityVerificationEnabled + "}";
    }
}
