package io.intercom.android.sdk.sheets;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.HelpCenterWebViewInterface;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.com.google.gson.C10916e;
import java.util.Map;
/* loaded from: classes3.dex */
public class SheetWebViewInterface {
    private static final String CLOSE_SHEET = "close";
    private static final String PAYLOAD_SHEET_TITLE = "title";
    private static final String SHEET_TITLE = "set-title";
    private static final String SUBMIT_SHEET = "submit-sheet";
    private final Api api;
    private final C10916e gson;
    private final SheetListener listener;
    private final MetricTracker metricTracker;
    private final WebView webView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SheetWebViewInterface(WebView webView, C10916e c10916e, MetricTracker metricTracker, Api api, SheetListener sheetListener) {
        this.webView = webView;
        this.gson = c10916e;
        this.listener = sheetListener;
        this.metricTracker = metricTracker;
        this.api = api;
    }

    private boolean isHelpCenterMetric(String str) {
        return HelpCenterWebViewInterface.METRIC_EVENT.equals(str) || HelpCenterWebViewInterface.TRACK_REACTION.equals(str);
    }

    @JavascriptInterface
    public void handleAction(String str) {
        SheetWebViewAction sheetWebViewAction = (SheetWebViewAction) this.gson.m11961j(str, SheetWebViewAction.class);
        String type = sheetWebViewAction.getType();
        final Map<String, Object> payload = sheetWebViewAction.getPayload();
        if (isHelpCenterMetric(type)) {
            new HelpCenterWebViewInterface(this.webView, this.gson, this.metricTracker, this.api).handleAction(str);
        } else if (type == null || payload == null) {
        } else {
            char c = 65535;
            int hashCode = type.hashCode();
            if (hashCode != -498753235) {
                if (hashCode != 94756344) {
                    if (hashCode == 227622762 && type.equals(SUBMIT_SHEET)) {
                        c = 2;
                    }
                } else if (type.equals(CLOSE_SHEET)) {
                    c = 1;
                }
            } else if (type.equals(SHEET_TITLE)) {
                c = 0;
            }
            if (c == 0) {
                this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.sheets.SheetWebViewInterface.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SheetWebViewInterface.this.listener.onSheetTitleAction(payload.get("title").toString());
                    }
                });
            } else if (c == 1) {
                this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.sheets.SheetWebViewInterface.2
                    @Override // java.lang.Runnable
                    public void run() {
                        SheetWebViewInterface.this.listener.onCloseSheetAction();
                    }
                });
            } else if (c != 2) {
            } else {
                this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.sheets.SheetWebViewInterface.3
                    @Override // java.lang.Runnable
                    public void run() {
                        SheetWebViewInterface.this.listener.onSubmitSheetAction(payload);
                    }
                });
            }
        }
    }
}
