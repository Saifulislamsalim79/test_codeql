package io.intercom.android.sdk.helpcenter;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.com.google.gson.C10916e;
import java.util.Map;
/* loaded from: classes2.dex */
public class HelpCenterWebViewInterface {
    public static final String METRIC_EVENT = "METRIC_EVENT";
    public static final String TRACK_REACTION = "TRACK_REACTION";
    private final Api api;
    private final C10916e gson;
    private final MetricTracker metricTracker;
    private final WebView webView;

    public HelpCenterWebViewInterface(WebView webView, C10916e c10916e, MetricTracker metricTracker, Api api) {
        this.webView = webView;
        this.gson = c10916e;
        this.metricTracker = metricTracker;
        this.api = api;
    }

    @JavascriptInterface
    public void handleAction(String str) {
        HelpCenterWebViewAction helpCenterWebViewAction = (HelpCenterWebViewAction) this.gson.m11961j(str, HelpCenterWebViewAction.class);
        String type = helpCenterWebViewAction.getType();
        final Map<String, Object> value = helpCenterWebViewAction.getValue();
        if (type == null || value == null) {
            return;
        }
        char c = 65535;
        int hashCode = type.hashCode();
        if (hashCode != 9315005) {
            if (hashCode == 899662635 && type.equals(METRIC_EVENT)) {
                c = 0;
            }
        } else if (type.equals(TRACK_REACTION)) {
            c = 1;
        }
        if (c == 0) {
            this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.helpcenter.HelpCenterWebViewInterface.1
                @Override // java.lang.Runnable
                public void run() {
                    HelpCenterWebViewInterface.this.metricTracker.educateWebviewMetric((String) value.get("action"), (String) value.get("object"), (String) value.get("place"), value.get("metadata") instanceof Map ? (Map) value.get("metadata") : null);
                }
            });
        } else if (c != 1) {
        } else {
            this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.helpcenter.HelpCenterWebViewInterface.2
                @Override // java.lang.Runnable
                public void run() {
                    Double d = (Double) value.get("article_id");
                    Double d2 = (Double) value.get("article_content_id");
                    Double d3 = (Double) value.get("reaction_index");
                    if (d == null || d2 == null || d3 == null) {
                        return;
                    }
                    HelpCenterWebViewInterface.this.api.reactToLink(String.valueOf(d.intValue()), String.valueOf(d2.intValue()), d3.intValue(), true);
                }
            });
        }
    }
}
