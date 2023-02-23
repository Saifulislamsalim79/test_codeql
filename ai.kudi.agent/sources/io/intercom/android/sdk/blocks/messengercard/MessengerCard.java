package io.intercom.android.sdk.blocks.messengercard;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.BlockAlignment;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.blockInterfaces.MessengerCardBlock;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.commons.utilities.HtmlCompat;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.com.google.gson.C10916e;
import java.io.File;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class MessengerCard implements MessengerCardBlock {
    private final Activity activity;
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private final C10916e gson;
    private final C11129b languageIndex;
    private final MetricTracker metricTracker;
    private final StyleType styleType;

    public MessengerCard(Provider provider, C10916e c10916e, C11129b c11129b, MetricTracker metricTracker, String str, StyleType styleType, Activity activity) {
        this.appConfigProvider = provider;
        this.gson = c10916e;
        this.languageIndex = c11129b;
        this.metricTracker = metricTracker;
        this.conversationId = str;
        this.styleType = styleType;
        this.activity = activity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean isWithinInAppMessage() {
        StyleType $r1 = this.styleType;
        StyleType $r2 = StyleType.NOTE;
        boolean $z0 = $r1.equals($r2);
        if ($z0) {
            return true;
        }
        StyleType $r12 = this.styleType;
        StyleType $r22 = StyleType.POST;
        boolean $z02 = $r12.equals($r22);
        if ($z02) {
            return true;
        }
        StyleType $r13 = this.styleType;
        StyleType $r23 = StyleType.CONTAINER_CARD;
        boolean $z03 = $r13.equals($r23);
        if ($z03) {
            return true;
        }
        StyleType $r14 = this.styleType;
        StyleType $r24 = StyleType.CHAT_FULL;
        boolean $z04 = $r14.equals($r24);
        return $z04;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void removeShadowAndMargin(FrameLayout frameLayout) {
        boolean $z0 = isWithinInAppMessage();
        if ($z0) {
            int $i0 = Build.VERSION.SDK_INT;
            if ($i0 >= 21) {
                frameLayout.setElevation(0.0f);
            }
            try {
                ViewGroup.LayoutParams $r3 = frameLayout.getLayoutParams();
                LinearLayout.LayoutParams $r4 = (LinearLayout.LayoutParams) $r3;
                int $i02 = ((ViewGroup.MarginLayoutParams) $r4).topMargin;
                int $i1 = ((ViewGroup.MarginLayoutParams) $r4).bottomMargin;
                $r4.setMargins(0, $i02, 0, $i1);
            } catch (ClassCastException e) {
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private View textFallback(String str, ViewGroup viewGroup) {
        Context $r6 = viewGroup.getContext();
        StyleType $r2 = StyleType.ADMIN;
        BlockAlignment $r3 = BlockAlignment.LEFT;
        Provider $r7 = this.appConfigProvider;
        Object $r8 = $r7.get();
        AppConfig $r9 = (AppConfig) $r8;
        View r11 = new ParagraphView($r6, $r2, $r3, $r9);
        CharSequence $r10 = HtmlCompat.fromHtml(str);
        TextView r12 = (TextView) r11;
        r12.setText($r10);
        View r13 = r11;
        return r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.MessengerCardBlock
    public View addCard(String str, String str2, boolean z, boolean z2, ViewGroup viewGroup) {
        boolean $z0 = TextUtils.isEmpty(str2);
        if ($z0) {
            View $r9 = textFallback(str, viewGroup);
            return $r9;
        }
        Context $r10 = viewGroup.getContext();
        LayoutInflater $r11 = LayoutInflater.from($r10);
        int $i0 = C10110R.C10113layout.intercom_messenger_card_block;
        View $r92 = $r11.inflate($i0, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) $r92;
        int $i02 = Build.VERSION.SDK_INT;
        if ($i02 >= 16) {
            LayoutTransition $r13 = frameLayout.getLayoutTransition();
            $r13.enableTransitionType(4);
        }
        removeShadowAndMargin(frameLayout);
        Provider $r14 = this.appConfigProvider;
        Object $r15 = $r14.get();
        AppConfig $r16 = (AppConfig) $r15;
        ColorUtils.updateInnerBorderColor($r16, frameLayout);
        int $i03 = C10110R.C10112id.loading_view;
        View $r93 = frameLayout.findViewById($i03);
        ProgressBar $r17 = (ProgressBar) $r93;
        CardWebView $r18 = MessengerCardWebViewPresenter.createCardWebView($r10);
        frameLayout.addView($r18);
        C11129b $r4 = this.languageIndex;
        Provider $r142 = this.appConfigProvider;
        Object $r152 = $r142.get();
        AppConfig $r162 = (AppConfig) $r152;
        int $i04 = $r162.getPrimaryColor();
        C10916e $r5 = this.gson;
        MetricTracker $r6 = this.metricTracker;
        File $r19 = $r10.getCacheDir();
        String $r1 = this.conversationId;
        Activity $r7 = this.activity;
        MessengerCardWebViewPresenter $r8 = new MessengerCardWebViewPresenter($r18, $r17, str2, $r4, $i04, $r5, $r6, $r19, $r1, false, $r7);
        $r8.setUpWebView();
        $r18.loadUrl(str2);
        return frameLayout;
    }
}
