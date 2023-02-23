package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.conversation.JavascriptRunner;
import io.intercom.android.sdk.experimental.Intercom;
import io.intercom.android.sdk.helpcenter.HelpCenterListener;
import io.intercom.android.sdk.helpcenter.HelpCenterWebViewPresenter;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.views.IntercomToolbar;
import io.intercom.com.google.gson.C10916e;
import p201g.p249m.p250a.p251a.C7805b;
/* loaded from: classes.dex */
public class IntercomHelpCenterActivity extends IntercomBaseActivity implements IntercomToolbar.Listener, HelpCenterListener {
    private static final int ENTRANCE_ANIMATION_TIME_MS = 300;
    private static final int EXIT_ANIMATION_TIME_MS = 150;
    public static final String LINK_TRANSITION_KEY = "link_background";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    public static final String PARCEL_DISPLAY_MODE = "parcel_display_mode";
    private static final String PARCEL_HELP_CENTER_URL = "parcel_help_center_url";
    private View containerView;
    private C10916e gson;
    private IntercomToolbar intercomToolbar;
    private JavascriptRunner jsRunner;
    ProgressBar loadingView;
    MetricTracker metricTracker;
    private HelpCenterWebViewPresenter presenter;
    WebView webView;
    @DisplayMode
    int displayMode = 1;
    String conversationId = "";

    /* loaded from: classes.dex */
    public @interface DisplayMode {
        public static final int FULL_SCREEN = 1;
        public static final int POP_UP = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void animateWindowIn() {
        View $r1 = this.containerView;
        $r1.setVisibility(0);
        View $r12 = this.containerView;
        View $r2 = findViewById(16908290);
        int $i0 = $r2.getMeasuredHeight();
        float $f0 = $i0;
        $r12.setY($f0);
        View $r13 = this.containerView;
        ViewPropertyAnimator $r3 = $r13.animate();
        ViewPropertyAnimator $r32 = $r3.y(0.0f);
        OvershootInterpolator $r4 = new OvershootInterpolator(0.6f);
        $r32.setInterpolator($r4).setDuration(350L).start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void animateWindowOut() {
        View $r1 = this.containerView;
        ViewPropertyAnimator $r2 = $r1.animate();
        Window $r3 = getWindow();
        View $r12 = $r3.getDecorView();
        int $i0 = $r12.getHeight();
        float $f0 = $i0;
        ViewPropertyAnimator $r22 = $r2.y($f0);
        OvershootInterpolator $r4 = new OvershootInterpolator();
        $r22.setInterpolator($r4).setDuration(600L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomHelpCenterActivity.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomHelpCenterActivity $r23 = IntercomHelpCenterActivity.this;
                $r23.finish();
                IntercomHelpCenterActivity $r24 = IntercomHelpCenterActivity.this;
                $r24.overridePendingTransition(0, 0);
            }
        }).start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Intent buildIntent(Context context, String str, int i, String str2) {
        Intent $r2 = new Intent(context, IntercomHelpCenterActivity.class);
        $r2.putExtra(PARCEL_HELP_CENTER_URL, str);
        $r2.putExtra(PARCEL_DISPLAY_MODE, i);
        $r2.putExtra(PARCEL_CONVERSATION_ID, str2);
        $r2.setFlags(268435456);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Transition enterTransition() {
        ChangeBounds r3 = new ChangeBounds();
        TimeInterpolator r4 = new C7805b();
        TimeInterpolator r5 = r4;
        r3.setInterpolator(r5);
        r3.setDuration(300L);
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void fadeOutView(View view) {
        ViewPropertyAnimator $r2 = view.animate();
        $r2.alpha(0.0f).setDuration(150L).start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void hideKeyboard() {
        View $r1 = getCurrentFocus();
        if ($r1 != null) {
            Object $r2 = getSystemService("input_method");
            InputMethodManager $r3 = (InputMethodManager) $r2;
            IBinder $r4 = $r1.getWindowToken();
            $r3.hideSoftInputFromWindow($r4, 0);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void insertWebView() {
        try {
            WebView $r2 = new WebView(this);
            this.webView = $r2;
        } catch (Resources.NotFoundException e) {
            Context $r3 = getApplicationContext();
            WebView $r22 = new WebView($r3);
            this.webView = $r22;
        }
        WebView $r23 = this.webView;
        $r23.setAlpha(0.0f);
        WebView $r24 = this.webView;
        int $i0 = C10110R.C10112id.intercom_help_center_webview;
        $r24.setId($i0);
        WebView $r25 = this.webView;
        FrameLayout.LayoutParams $r4 = new FrameLayout.LayoutParams(-1, -1);
        $r25.setLayoutParams($r4);
        int $i02 = C10110R.C10112id.link_view;
        View $r5 = findViewById($i02);
        FrameLayout $r6 = (FrameLayout) $r5;
        WebView $r26 = this.webView;
        $r6.addView($r26, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean isFullScreenWithExperimentalMessenger() {
        int $i0 = this.displayMode;
        if ($i0 == 1) {
            boolean $z0 = Intercom.isBooted();
            return $z0;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Transition returnTransition() {
        ChangeBounds r3 = new ChangeBounds();
        TimeInterpolator r4 = new C7805b();
        TimeInterpolator r5 = r4;
        r3.setInterpolator(r5);
        r3.setDuration(150L);
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void closeHelpCenter() {
        hideKeyboard();
        boolean $z0 = isFullScreenWithExperimentalMessenger();
        if (!$z0) {
            WebView $r3 = this.webView;
            fadeOutView($r3);
            supportFinishAfterTransition();
            return;
        }
        HelpCenterWebViewPresenter $r1 = this.presenter;
        Intercom $r2 = Intercom.client();
        $r1.resetMessengerToHostState($r2);
        animateWindowOut();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        WebView $r2 = this.webView;
        boolean $z0 = $r2.canGoBack();
        if ($z0) {
            WebView $r22 = this.webView;
            $r22.goBack();
            return;
        }
        MetricTracker $r3 = this.metricTracker;
        String $r1 = this.conversationId;
        $r3.closedHelpCenter($r1, 1);
        closeHelpCenter();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onCloseClicked() {
        MetricTracker $r1 = this.metricTracker;
        String $r2 = this.conversationId;
        $r1.closedHelpCenter($r2, 0);
        closeHelpCenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        String $r9;
        super.onCreate(bundle);
        Injector $r3 = Injector.get();
        MetricTracker $r4 = $r3.getMetricTracker();
        this.metricTracker = $r4;
        Provider $r5 = $r3.getAppConfigProvider();
        Object $r6 = $r5.get();
        AppConfig appConfig = (AppConfig) $r6;
        int $i0 = appConfig.getHelpCenterBaseColor();
        Intent $r8 = getIntent();
        Bundle $r1 = $r8.getExtras();
        if ($r1 != null) {
            $r9 = $r1.getString(PARCEL_HELP_CENTER_URL, "");
            String $r10 = $r1.getString(PARCEL_CONVERSATION_ID, "");
            this.conversationId = $r10;
            int $i1 = $r1.getInt(PARCEL_DISPLAY_MODE, 1);
            this.displayMode = $i1;
        } else {
            $r9 = "";
        }
        int $i12 = this.displayMode;
        if ($i12 == 1) {
            int $i13 = C10110R.C10113layout.intercom_activity_help_center_fullscreen;
            setContentView($i13);
            insertWebView();
            int $i14 = C10110R.C10112id.intercom_toolbar;
            View $r11 = findViewById($i14);
            IntercomToolbar $r12 = (IntercomToolbar) $r11;
            this.intercomToolbar = $r12;
            int $i15 = C10110R.string.intercom_help_center;
            $r12.setTitle($i15);
            this.intercomToolbar.setUpHelpCenterToolbar(appConfig);
            this.intercomToolbar.setListener(this);
            this.intercomToolbar.setSubtitleVisibility(8);
            ViewGroup r31 = this.intercomToolbar;
            r31.setBackgroundColor($i0);
            ViewGroup r312 = this.intercomToolbar;
            r312.setBackgroundColor($i0);
            this.intercomToolbar.updateToolbarSize();
            View $r112 = findViewById(C10110R.C10112id.link_root);
            this.containerView = $r112;
            $r112.setVisibility(8);
            View $r113 = this.containerView;
            $r113.post(new Runnable() { // from class: io.intercom.android.sdk.activities.IntercomHelpCenterActivity.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public void run() {
                    IntercomHelpCenterActivity $r13 = IntercomHelpCenterActivity.this;
                    $r13.animateWindowIn();
                }
            });
        } else {
            setContentView(C10110R.C10113layout.intercom_activity_help_center);
            insertWebView();
            WebView $r14 = this.webView;
            $r14.setBackgroundResource(C10110R.C10111drawable.intercom_conversation_card_background);
            View $r114 = findViewById(C10110R.C10112id.dismiss);
            $r114.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomHelpCenterActivity.2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IntercomHelpCenterActivity $r32 = IntercomHelpCenterActivity.this;
                    MetricTracker $r13 = $r32.metricTracker;
                    String $r42 = $r32.conversationId;
                    $r13.closedHelpCenter($r42, 0);
                    IntercomHelpCenterActivity.this.closeHelpCenter();
                }
            });
        }
        boolean $z0 = TextUtils.isEmpty($r9);
        if ($z0) {
            closeHelpCenter();
        }
        View $r115 = findViewById(C10110R.C10112id.loading_view);
        ProgressBar $r16 = (ProgressBar) $r115;
        this.loadingView = $r16;
        WebView $r142 = this.webView;
        JavascriptRunner r29 = new JavascriptRunner($r142);
        this.jsRunner = r29;
        C10916e $r18 = $r3.getGson();
        this.gson = $r18;
        WebView $r143 = this.webView;
        JavascriptRunner $r17 = this.jsRunner;
        MetricTracker $r42 = this.metricTracker;
        Provider $r52 = $r3.getAppConfigProvider();
        Store $r19 = $r3.getStore();
        Provider $r20 = $r3.getApiProvider();
        UserIdentity $r21 = $r3.getUserIdentity();
        AppIdentity $r22 = $r3.getAppIdentity();
        CookieManager $r23 = CookieManager.getInstance();
        HelpCenterWebViewPresenter r30 = new HelpCenterWebViewPresenter($r143, $r17, $r9, $r18, $r42, $r52, $r19, $r20, $r21, $r22, $r23, this);
        this.presenter = r30;
        boolean $z02 = isFullScreenWithExperimentalMessenger();
        if ($z02) {
            HelpCenterWebViewPresenter $r2 = this.presenter;
            Intercom $r24 = Intercom.client();
            $r2.setUpMessenger($r24);
        }
        HelpCenterWebViewPresenter $r25 = this.presenter;
        $r25.setUpWebView();
        if (Build.VERSION.SDK_INT >= 21) {
            Window $r252 = getWindow();
            Transition $r26 = enterTransition();
            $r252.setSharedElementEnterTransition($r26);
            Window $r253 = getWindow();
            Transition $r262 = returnTransition();
            $r253.setSharedElementReturnTransition($r262);
            View $r116 = findViewById(C10110R.C10112id.link_view);
            $r116.setTransitionName("link_background");
        }
        HelpCenterWebViewPresenter $r27 = this.presenter;
        $r27.loadBundle();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onInboxClicked() {
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onToolbarClicked() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.helpcenter.HelpCenterListener
    public void onWebViewFinishedLoad() {
        JavascriptRunner $r1 = this.jsRunner;
        $r1.runPendingScripts();
        WebView $r2 = this.webView;
        ViewPropertyAnimator $r3 = $r2.animate();
        $r3.alpha(1.0f).setDuration(300L).start();
        ProgressBar $r4 = this.loadingView;
        $r4.setVisibility(8);
        MetricTracker $r5 = this.metricTracker;
        String $r6 = this.conversationId;
        $r5.viewedHelpCenter($r6);
    }
}
