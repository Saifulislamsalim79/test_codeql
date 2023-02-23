package io.intercom.android.sdk.helpcenter;

import android.net.Uri;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebView;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.conversation.JavascriptRunner;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.state.OverlayState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.com.google.gson.C10916e;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes2.dex */
public class HelpCenterWebViewPresenter {
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final AppIdentity appIdentity;
    private final CookieManager cookieManager;
    private final C10916e gson;
    private final Map<String, String> headers = Collections.singletonMap("MobileClient", "AndroidIntercomWebView");
    private final String helpCenterUrl;
    Intercom.Visibility hostInAppsVisibility;
    Intercom.Visibility hostLauncherVisibility;
    private final JavascriptRunner jsRunner;
    private final HelpCenterListener listener;
    private final MetricTracker metricTracker;
    private final Store<State> store;
    private final UserIdentity userIdentity;
    private final WebView webView;

    public HelpCenterWebViewPresenter(WebView webView, JavascriptRunner javascriptRunner, String str, C10916e c10916e, MetricTracker metricTracker, Provider<AppConfig> provider, Store<State> store, Provider<Api> provider2, UserIdentity userIdentity, AppIdentity appIdentity, CookieManager cookieManager, HelpCenterListener helpCenterListener) {
        this.webView = webView;
        this.jsRunner = javascriptRunner;
        this.helpCenterUrl = str;
        this.gson = c10916e;
        this.metricTracker = metricTracker;
        this.appConfigProvider = provider;
        this.store = store;
        this.apiProvider = provider2;
        this.userIdentity = userIdentity;
        this.appIdentity = appIdentity;
        this.listener = helpCenterListener;
        this.cookieManager = cookieManager;
    }

    private void setCookie() {
        String encryptedUserId = this.userIdentity.getEncryptedUserId();
        CookieManager cookieManager = this.cookieManager;
        String str = this.helpCenterUrl;
        cookieManager.setCookie(str, ("intercom-session-" + this.appIdentity.appId()) + "=" + encryptedUserId);
    }

    private boolean shouldForceShowMessengerInHelpCenter() {
        return !this.appConfigProvider.get().hasFeature(FeatureFlag.DISABLE_FORCE_SHOW_HELP_CENTER_MESSENGER);
    }

    private void storeHostVisibilitySettings() {
        OverlayState overlayState = (OverlayState) this.store.select(Selectors.OVERLAY);
        this.hostLauncherVisibility = overlayState.launcherVisibility();
        this.hostInAppsVisibility = overlayState.notificationVisibility();
    }

    public void loadBundle() {
        this.jsRunner.reset();
        setCookie();
        this.webView.loadUrl(this.helpCenterUrl, this.headers);
    }

    public void resetMessengerToHostState(io.intercom.android.sdk.experimental.Intercom intercom) {
        if (shouldForceShowMessengerInHelpCenter()) {
            intercom.setLauncherVisibility(this.hostLauncherVisibility);
            intercom.setInAppMessageVisibility(this.hostInAppsVisibility);
        }
    }

    public void setUpMessenger(io.intercom.android.sdk.experimental.Intercom intercom) {
        if (shouldForceShowMessengerInHelpCenter()) {
            storeHostVisibilitySettings();
            intercom.setLauncherVisibility(Intercom.VISIBLE);
            intercom.setInAppMessageVisibility(Intercom.VISIBLE);
        }
    }

    public void setUpWebView() {
        this.webView.setVerticalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT >= 21) {
            this.webView.setClipToOutline(true);
        }
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.addJavascriptInterface(new HelpCenterWebViewInterface(this.webView, this.gson, this.metricTracker, this.apiProvider.get()), "AndroidHost");
        this.webView.setWebViewClient(new HelpCenterWebViewClient(Uri.parse(this.helpCenterUrl).getHost(), this.headers, this.listener));
    }
}
