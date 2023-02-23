package io.intercom.android.sdk.blocks.messengercard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.app.DialogInterfaceC0936d;
import io.intercom.android.sdk.activities.IntercomSheetActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.com.google.gson.C10916e;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes.dex */
class MessengerCardWebViewInterface {
    private static final String HEIGHT_CHANGE_EVENT = "HEIGHT_CHANGE_EVENT";
    private static final String INPUT_TEXT = "INPUT_TEXT";
    private static final String METRIC_EVENT = "METRIC_EVENT";
    private static final String OPEN_SHEET = "OPEN_SHEET";
    private static final String OPEN_URL = "OPEN_URL";
    private final Activity activity;
    private final String conversationId;
    private final C10916e gson;
    private final Boolean isHomescreen;
    private final View loadingView;
    private final MetricTracker metricTracker;
    private final int primaryColor;
    private final WebView webView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MessengerCardWebViewInterface(WebView webView, View view, C10916e c10916e, int i, MetricTracker metricTracker, String str, boolean z, Activity activity) {
        this.webView = webView;
        this.loadingView = view;
        this.gson = c10916e;
        this.primaryColor = i;
        this.metricTracker = metricTracker;
        this.conversationId = str;
        Boolean $r6 = Boolean.valueOf(z);
        this.isHomescreen = $r6;
        this.activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void openSheet(Map map, Context context) {
        Object $r3;
        String $r6;
        Object $r32 = map.get(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        String $r4 = (String) $r32;
        boolean $z0 = map.containsKey("params");
        if ($z0) {
            Object $r33 = map.get("params");
            $r3 = (Map) $r33;
        } else {
            $r3 = r9;
            Object r9 = new HashMap();
        }
        Map $r2 = (Map) $r3;
        boolean $z02 = $r2.containsKey("uri");
        if ($z02) {
            Map $r22 = (Map) $r3;
            Object $r5 = $r22.get("uri");
            $r6 = $r5.toString();
        } else {
            $r6 = "";
        }
        boolean $z03 = TextUtils.isEmpty($r4);
        if ($z03) {
            return;
        }
        boolean $z04 = TextUtils.isEmpty($r6);
        if ($z04) {
            return;
        }
        String $r7 = this.conversationId;
        Map $r23 = (Map) $r3;
        Intent $r8 = IntercomSheetActivity.buildIntent(context, $r4, $r23, $r6, $r7);
        context.startActivity($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void openUrl(Map map, Context context) {
        Object $r3 = map.get(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        String $r4 = (String) $r3;
        Uri $r6 = Uri.parse($r4);
        Intent $r5 = new Intent("android.intent.action.VIEW", $r6);
        context.startActivity($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void showTextInputDialog(Map map, Context context) {
        int $i0 = this.primaryColor;
        WebView $r1 = this.webView;
        MessengerCardAlertDialogBuilder r8 = new MessengerCardAlertDialogBuilder(context, map, $i0, $r1);
        DialogInterfaceC0936d $r5 = r8.create();
        DialogInterfaceC0936d r9 = $r5;
        r9.show();
        DialogInterfaceC0936d r92 = $r5;
        Window $r6 = r92.getWindow();
        $r6.setSoftInputMode(5);
        Button $r7 = $r5.m37786a(-2);
        int $i02 = this.primaryColor;
        $r7.setTextColor($i02);
        Button $r72 = $r5.m37786a(-1);
        int $i03 = this.primaryColor;
        $r72.setTextColor($i03);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void handleAction(String str) {
        C10916e $r2 = this.gson;
        Object $r3 = $r2.m11961j(str, MessengerCardWebViewAction.class);
        final MessengerCardWebViewAction $r4 = (MessengerCardWebViewAction) $r3;
        final Map $r5 = $r4.getPayload();
        String $r1 = $r4.getType();
        if ($r1 == null || $r5 == null) {
            return;
        }
        byte $b0 = -1;
        int $i1 = $r1.hashCode();
        switch ($i1) {
            case 279273946:
                boolean $z0 = $r1.equals(OPEN_URL);
                if ($z0) {
                    $b0 = 0;
                    break;
                }
                break;
            case 387980611:
                boolean $z02 = $r1.equals(HEIGHT_CHANGE_EVENT);
                if ($z02) {
                    $b0 = 3;
                    break;
                }
                break;
            case 899662635:
                boolean $z03 = $r1.equals("METRIC_EVENT");
                if ($z03) {
                    $b0 = 4;
                    break;
                }
                break;
            case 1901318306:
                boolean $z04 = $r1.equals(INPUT_TEXT);
                if ($z04) {
                    $b0 = 2;
                    break;
                }
                break;
            case 2092140298:
                boolean $z05 = $r1.equals(OPEN_SHEET);
                if ($z05) {
                    $b0 = 1;
                    break;
                }
                break;
        }
        if ($b0 == 0) {
            WebView $r6 = this.webView;
            $r6.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public void run() {
                    MessengerCardWebViewInterface $r12 = MessengerCardWebViewInterface.this;
                    Map $r22 = $r5;
                    Activity $r32 = $r12.activity;
                    $r12.openUrl($r22, $r32);
                }
            });
        } else if ($b0 == 1) {
            WebView $r62 = this.webView;
            $r62.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public void run() {
                    MessengerCardWebViewInterface $r12 = MessengerCardWebViewInterface.this;
                    Map $r22 = $r5;
                    Activity $r32 = $r12.activity;
                    $r12.openSheet($r22, $r32);
                }
            });
        } else if ($b0 == 2) {
            WebView $r63 = this.webView;
            $r63.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public void run() {
                    MessengerCardWebViewInterface $r12 = MessengerCardWebViewInterface.this;
                    Map $r22 = $r5;
                    Activity $r32 = $r12.activity;
                    $r12.showTextInputDialog($r22, $r32);
                }
            });
        } else if ($b0 != 3) {
            if ($b0 != 4) {
                return;
            }
            WebView $r64 = this.webView;
            $r64.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.5
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public void run() {
                    Map $r22;
                    MessengerCardWebViewAction $r12 = $r4;
                    Map $r23 = $r12.getPayload();
                    Object $r32 = $r23.get("action");
                    String $r42 = (String) $r32;
                    Object $r33 = $r23.get("object");
                    String $r52 = (String) $r33;
                    Object $r34 = $r23.get("place");
                    String $r65 = (String) $r34;
                    Object $r35 = $r23.get("metadata");
                    boolean $z06 = $r35 instanceof Map;
                    if ($z06) {
                        Object $r36 = $r23.get("metadata");
                        $r22 = (Map) $r36;
                    } else {
                        $r22 = null;
                    }
                    MessengerCardWebViewInterface $r7 = MessengerCardWebViewInterface.this;
                    MetricTracker $r8 = $r7.metricTracker;
                    MessengerCardWebViewInterface $r72 = MessengerCardWebViewInterface.this;
                    Boolean $r9 = $r72.isHomescreen;
                    boolean $z07 = $r9.booleanValue();
                    $r8.messengerCardWebViewEvent($r42, $r52, $r65, $r22, $z07);
                }
            });
        } else {
            View $r8 = this.loadingView;
            int $i12 = $r8.getVisibility();
            if ($i12 == 0) {
                WebView $r65 = this.webView;
                $r65.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface.4
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // java.lang.Runnable
                    public void run() {
                        MessengerCardWebViewInterface $r12 = MessengerCardWebViewInterface.this;
                        View $r22 = $r12.loadingView;
                        $r22.setVisibility(8);
                        MessengerCardWebViewInterface $r13 = MessengerCardWebViewInterface.this;
                        WebView $r32 = $r13.webView;
                        FrameLayout.LayoutParams $r42 = new FrameLayout.LayoutParams(-1, -2);
                        $r32.setLayoutParams($r42);
                    }
                });
            }
        }
    }
}
