package io.intercom.android.sdk.homescreen;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewPresenter;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.com.google.gson.C10916e;
import java.io.File;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class MessengerAppCardViewHolder extends RecyclerView.AbstractC1620e0 {
    private final Activity activity;
    private final Provider<AppConfig> appConfigProvider;
    private final C11129b commit;
    private final C10916e gson;
    private final ProgressBar loadingView;
    private final MetricTracker metricTracker;
    private final CardWebView webView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MessengerAppCardViewHolder(View view, C11129b c11129b, Provider provider, C10916e c10916e, MetricTracker metricTracker, Activity activity) {
        super(view);
        Context $r7 = view.getContext();
        CardWebView $r8 = MessengerCardWebViewPresenter.createCardWebView($r7);
        this.webView = $r8;
        FrameLayout $r9 = (FrameLayout) view;
        $r9.addView($r8);
        CardWebView $r82 = this.webView;
        CardWebView $r11 = this.webView;
        Resources $r12 = $r11.getResources();
        int $i0 = C10110R.dimen.intercom_home_app_card_min_height;
        FrameLayout.LayoutParams $r10 = new FrameLayout.LayoutParams(-1, $r12.getDimensionPixelSize($i0));
        $r82.setLayoutParams($r10);
        int $i02 = C10110R.C10112id.loading_view;
        View $r13 = view.findViewById($i02);
        ProgressBar $r14 = (ProgressBar) $r13;
        this.loadingView = $r14;
        this.commit = c11129b;
        this.appConfigProvider = provider;
        this.gson = c10916e;
        this.metricTracker = metricTracker;
        this.activity = activity;
        int $i03 = C10110R.C10112id.messenger_card_layout;
        View $r5 = view.findViewById($i03);
        FrameLayout $r92 = (FrameLayout) $r5;
        Object $r15 = provider.get();
        AppConfig $r16 = (AppConfig) $r15;
        ColorUtils.updateInnerBorderColor($r16, $r92);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void bindCard(String str) {
        CardWebView $r2 = this.webView;
        ProgressBar $r3 = this.loadingView;
        C11129b $r4 = this.commit;
        Provider $r9 = this.appConfigProvider;
        Object $r10 = $r9.get();
        int $i0 = ((AppConfig) $r10).getPrimaryColor();
        C10916e $r5 = this.gson;
        MetricTracker $r6 = this.metricTracker;
        CardWebView $r12 = this.webView;
        Context $r13 = $r12.getContext();
        File $r14 = $r13.getCacheDir();
        Activity $r7 = this.activity;
        MessengerCardWebViewPresenter $r8 = new MessengerCardWebViewPresenter($r2, $r3, str, $r4, $i0, $r5, $r6, $r14, "", true, $r7);
        $r8.setUpWebView();
        boolean $z0 = TextUtils.isEmpty(str);
        if ($z0) {
            return;
        }
        CardWebView $r22 = this.webView;
        $r22.loadUrl(str);
    }
}
