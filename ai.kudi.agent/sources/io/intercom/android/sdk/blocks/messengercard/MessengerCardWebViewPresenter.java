package io.intercom.android.sdk.blocks.messengercard;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.com.google.gson.C10916e;
import java.io.File;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class MessengerCardWebViewPresenter {
    private final Activity activity;
    private final File cache;
    private final String conversationId;
    private final String fallbackUrl;
    private final C10916e gson;
    private final boolean isHomeScreen;
    private final View loadingView;
    private final MetricTracker metricTracker;
    private final int primaryColor;
    private final C11129b refreshView;
    private final CardWebView webView;

    public MessengerCardWebViewPresenter(CardWebView cardWebView, View view, String str, C11129b c11129b, int i, C10916e c10916e, MetricTracker metricTracker, File file, String str2, boolean z, Activity activity) {
        this.webView = cardWebView;
        this.loadingView = view;
        this.fallbackUrl = str;
        this.refreshView = c11129b;
        this.primaryColor = i;
        this.gson = c10916e;
        this.metricTracker = metricTracker;
        this.conversationId = str2;
        this.cache = file;
        this.isHomeScreen = z;
        this.activity = activity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CardWebView createCardWebView(Context context) {
        CardWebView $r2;
        try {
            $r2 = new CardWebView(context);
        } catch (Resources.NotFoundException e) {
            Injector $r3 = Injector.get();
            Application $r4 = $r3.getApplication();
            $r2 = new CardWebView($r4);
        }
        $r2.setAlpha(0.0f);
        int $i0 = C10110R.C10112id.intercom_messenger_card_webview;
        $r2.setId($i0);
        FrameLayout.LayoutParams $r5 = new FrameLayout.LayoutParams(-2, -2);
        $r2.setLayoutParams($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setUpWebView() {
        CardWebView $r6 = this.webView;
        C11129b $r7 = this.refreshView;
        $r6.setUp($r7);
        CardWebView $r62 = this.webView;
        $r62.setBackgroundColor(0);
        CardWebView $r63 = this.webView;
        String $r4 = this.fallbackUrl;
        Uri $r9 = Uri.parse($r4);
        String $r42 = $r9.getHost();
        MessengerCardWebViewClient $r8 = new MessengerCardWebViewClient($r42);
        $r63.setWebViewClient($r8);
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        CardWebView $r64 = this.webView;
        WebSettings $r10 = $r64.getSettings();
        $r10.setJavaScriptEnabled(true);
        $r10.setUseWideViewPort(true);
        $r10.setAppCacheEnabled(true);
        File $r11 = this.cache;
        if ($r11 != null) {
            String $r43 = $r11.getAbsolutePath();
            $r10.setAppCachePath($r43);
        }
        $r10.setCacheMode(-1);
        int $i02 = Build.VERSION.SDK_INT;
        if ($i02 >= 21) {
            $r10.setMixedContentMode(0);
        }
        CardWebView $r65 = this.webView;
        WebSettings $r102 = $r65.getSettings();
        WebSettings.LayoutAlgorithm $r12 = WebSettings.LayoutAlgorithm.SINGLE_COLUMN;
        $r102.setLayoutAlgorithm($r12);
        CardWebView $r66 = this.webView;
        $r66.setVerticalScrollBarEnabled(false);
        CardWebView $r67 = this.webView;
        $r67.setHorizontalScrollBarEnabled(false);
        CardWebView $r68 = this.webView;
        View $r1 = this.loadingView;
        C10916e $r2 = this.gson;
        int $i03 = this.primaryColor;
        MetricTracker $r3 = this.metricTracker;
        String $r44 = this.conversationId;
        boolean $z0 = this.isHomeScreen;
        Activity $r5 = this.activity;
        MessengerCardWebViewInterface $r13 = new MessengerCardWebViewInterface($r68, $r1, $r2, $i03, $r3, $r44, $z0, $r5);
        CardWebView $r69 = this.webView;
        $r69.addJavascriptInterface($r13, "AndroidHost");
    }
}
