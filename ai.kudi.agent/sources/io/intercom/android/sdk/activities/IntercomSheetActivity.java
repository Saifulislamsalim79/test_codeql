package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.conversation.JavascriptRunner;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.imageloader.WallpaperLoader;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.models.events.CardUpdatedEvent;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.sheets.SheetListener;
import io.intercom.android.sdk.sheets.SheetWebViewPresenter;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.views.IntercomErrorView;
import io.intercom.android.sdk.views.IntercomToolbar;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.retrofit2.Call;
import io.intercom.retrofit2.Callback;
import io.intercom.retrofit2.Response;
import java.util.HashMap;
import java.util.Map;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class IntercomSheetActivity extends IntercomBaseActivity implements IntercomToolbar.Listener, SheetListener {
    private static final int ENTRANCE_ANIMATION_TIME_MS = 250;
    private static final int EXIT_ANIMATION_TIME_MS = 200;
    private static final String PARCEL_CARD_URI = "parcel_card_uri";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_IS_HOME_SCREEN = "parcel_is_home_screen";
    private static final String PARCEL_PARAMS = "parcel_params";
    private static final String PARCEL_SHEET_URL = "parcel_sheet_url";
    private static final int WEBVIEW_FADE_IN_TIME_MS = 300;
    private Provider<AppConfig> appConfigProvider;
    private String cardUri;
    private View containerView;
    private IntercomErrorView intercomErrorView;
    private IntercomToolbar intercomToolbar;
    private boolean isHomeScreen;
    private JavascriptRunner jsRunner;
    ProgressBar loadingBar;
    private MetricTracker metricTracker;
    private HashMap params;
    private SheetWebViewPresenter presenter;
    private int secondaryColor;
    private WallpaperLoader wallpaperLoader;
    WebView webView;
    private String sheetUrl = "";
    private String conversationId = "";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IntercomSheetActivity() {
        HashMap $r1 = new HashMap();
        this.params = $r1;
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
        AccelerateInterpolator $r4 = new AccelerateInterpolator();
        $r32.setInterpolator($r4).setDuration(250L).start();
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
        $r2.y($f0).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomSheetActivity $r22 = IntercomSheetActivity.this;
                $r22.finish();
                IntercomSheetActivity $r23 = IntercomSheetActivity.this;
                $r23.overridePendingTransition(0, 0);
            }
        }).start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Intent buildIntent(Context context, String str, Map map, String str2, String str3) {
        Intent $r3 = new Intent(context, IntercomSheetActivity.class);
        $r3.putExtra(PARCEL_SHEET_URL, str);
        HashMap $r6 = new HashMap(map);
        $r3.putExtra(PARCEL_PARAMS, $r6);
        $r3.putExtra(PARCEL_CARD_URI, str2);
        $r3.putExtra(PARCEL_CONVERSATION_ID, str3);
        return $r3;
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
        int $i0 = C10110R.C10112id.intercom_sheet_webview;
        $r24.setId($i0);
        WebView $r25 = this.webView;
        FrameLayout.LayoutParams $r4 = new FrameLayout.LayoutParams(-1, -1);
        $r25.setLayoutParams($r4);
        int $i02 = C10110R.C10112id.sheet_view;
        View $r5 = findViewById($i02);
        FrameLayout $r6 = (FrameLayout) $r5;
        WebView $r26 = this.webView;
        $r6.addView($r26, 0);
        WebView $r27 = this.webView;
        $r27.setWebChromeClient(new WebChromeClient() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                IntercomSheetActivity $r28 = IntercomSheetActivity.this;
                ProgressBar $r32 = $r28.loadingBar;
                $r32.setProgress(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void loadSheet(FeedbackDialog feedbackDialog) {
        ProgressBar $r2 = this.loadingBar;
        $r2.setVisibility(0);
        RelativeLayout $r3 = this.intercomErrorView;
        RelativeLayout r7 = $r3;
        r7.setVisibility(8);
        HashMap $r4 = this.params;
        feedbackDialog.fetchSheet($r4, new Callback<Sheet.Builder>() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.retrofit2.Callback
            public void onFailure(Call<Sheet.Builder> call, Throwable th) {
                IntercomSheetActivity $r32 = IntercomSheetActivity.this;
                $r32.showErrorView();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.retrofit2.Callback
            public void onResponse(Call<Sheet.Builder> call, Response<Sheet.Builder> response) {
                boolean $z0 = response.isSuccessful();
                if ($z0) {
                    Object $r32 = response.body();
                    if ($r32 != null) {
                        IntercomSheetActivity $r42 = IntercomSheetActivity.this;
                        RelativeLayout $r5 = $r42.intercomErrorView;
                        RelativeLayout r12 = $r5;
                        r12.setVisibility(8);
                        Object $r33 = response.body();
                        Sheet.Builder $r6 = (Sheet.Builder) $r33;
                        Sheet $r7 = $r6.build();
                        IntercomSheetActivity $r43 = IntercomSheetActivity.this;
                        SheetWebViewPresenter $r8 = $r43.presenter;
                        String $r9 = $r7.getBody();
                        $r8.loadBundle($r9);
                        IntercomSheetActivity $r44 = IntercomSheetActivity.this;
                        MetricTracker $r10 = $r44.metricTracker;
                        IntercomSheetActivity $r45 = IntercomSheetActivity.this;
                        String $r92 = $r45.conversationId;
                        IntercomSheetActivity $r46 = IntercomSheetActivity.this;
                        String $r11 = $r46.sheetUrl;
                        IntercomSheetActivity $r47 = IntercomSheetActivity.this;
                        boolean $z02 = $r47.isHomeScreen;
                        $r10.viewedMessengerSheet($r92, $r11, $z02);
                        return;
                    }
                }
                IntercomSheetActivity $r48 = IntercomSheetActivity.this;
                $r48.showErrorView();
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setUpToolbar(Provider provider) {
        Object $r2 = provider.get();
        AppConfig $r3 = (AppConfig) $r2;
        int $i0 = C10110R.C10112id.intercom_toolbar;
        View $r4 = findViewById($i0);
        IntercomToolbar $r5 = (IntercomToolbar) $r4;
        this.intercomToolbar = $r5;
        $r5.updateToolbarColors($r3);
        this.intercomToolbar.setListener(this);
        this.intercomToolbar.setSubtitleVisibility(8);
        ViewGroup $r52 = this.intercomToolbar;
        int $i02 = this.secondaryColor;
        ViewGroup r17 = $r52;
        r17.setBackgroundColor($i02);
        this.intercomToolbar.setLeftNavigationItemVisibility(0);
        this.intercomToolbar.setCloseButtonVisibility(8);
        IntercomToolbar $r53 = this.intercomToolbar;
        int $i03 = C10110R.C10111drawable.intercom_close;
        Drawable $r6 = C1335a.m36322f(this, $i03);
        $r53.setLeftNavigationIcon($r6);
        this.intercomToolbar.updateToolbarSize();
        C10486i $r7 = ComponentCallbacks2C10478c.u(this);
        WallpaperLoader $r8 = WallpaperLoader.create(this, provider, $r7);
        this.wallpaperLoader = $r8;
        this.intercomToolbar.loadWallpaper($r8);
        ViewGroup $r54 = this.intercomToolbar;
        int $i04 = C10110R.C10112id.toolbar_progress_bar;
        ViewGroup r172 = $r54;
        View $r42 = r172.findViewById($i04);
        ProgressBar $r9 = (ProgressBar) $r42;
        this.loadingBar = $r9;
        int $i05 = $r3.getSecondaryColorDark();
        ColorDrawable r14 = new ColorDrawable($i05);
        ColorDrawable r142 = new ColorDrawable(-1);
        ScaleDrawable r15 = new ScaleDrawable(r142, 3, 1.0f, -1.0f);
        Drawable[] $r11 = {r14, r15};
        LayerDrawable r16 = new LayerDrawable($r11);
        $r9.setProgressDrawable(r16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void showErrorView() {
        ProgressBar $r1 = this.loadingBar;
        $r1.setVisibility(8);
        RelativeLayout $r2 = this.intercomErrorView;
        RelativeLayout r3 = $r2;
        r3.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void showSubmitActionError(final Map map) {
        DialogInterfaceC0936d.C0937a r9 = new DialogInterfaceC0936d.C0937a(this);
        int $i0 = C10110R.string.intercom_couldnt_load_content;
        DialogInterfaceC0936d.C0937a $r3 = r9.setTitle($i0);
        int $i02 = C10110R.string.intercom_give_it_another_try;
        DialogInterfaceC0936d.C0937a $r32 = $r3.setMessage($i02);
        int $i03 = C10110R.string.intercom_reload;
        DialogInterfaceC0936d $r4 = $r32.setPositiveButton($i03, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IntercomSheetActivity $r2 = IntercomSheetActivity.this;
                Map $r33 = map;
                $r2.onSubmitSheetAction($r33);
            }
        }).create();
        DialogInterfaceC0936d r11 = $r4;
        r11.show();
        Button $r5 = $r4.m37786a(-1);
        Provider $r6 = this.appConfigProvider;
        Object $r7 = $r6.get();
        AppConfig $r8 = (AppConfig) $r7;
        int $i04 = ColorUtils.primaryOrDarkColor(this, $r8);
        $r5.setTextColor($i04);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void closeSheet() {
        MetricTracker $r1 = this.metricTracker;
        String $r2 = this.conversationId;
        String $r3 = this.sheetUrl;
        boolean $z0 = this.isHomeScreen;
        $r1.closedMessengerSheet($r2, $r3, $z0);
        hideKeyboard();
        animateWindowOut();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        WebView $r1 = this.webView;
        boolean $z0 = $r1.canGoBack();
        if (!$z0) {
            closeSheet();
            return;
        }
        WebView $r12 = this.webView;
        $r12.goBack();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onCloseClicked() {
    }

    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onCloseSheetAction() {
        closeSheet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b7, code lost:
        if (r0 == null) goto L11;
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r33) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.activities.IntercomSheetActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IntercomToolbar $r1 = this.intercomToolbar;
        WallpaperLoader $r2 = this.wallpaperLoader;
        $r1.closeWallpaperLoader($r2);
        super.onDestroy();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onInboxClicked() {
        closeSheet();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onSheetTitleAction(String str) {
        IntercomToolbar $r2 = this.intercomToolbar;
        $r2.setTitle(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onSubmitSheetAction(final Map map) {
        Injector $r4 = Injector.get();
        FeedbackDialog $r5 = $r4.getApi();
        String $r2 = this.cardUri;
        $r5.submitSheet($r2, map, new Callback<Void>() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.retrofit2.Callback
            public void onFailure(Call<Void> call, Throwable th) {
                IntercomSheetActivity $r3 = IntercomSheetActivity.this;
                Map $r42 = map;
                $r3.showSubmitActionError($r42);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.retrofit2.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                boolean $z0 = response.isSuccessful();
                if (!$z0) {
                    IntercomSheetActivity $r6 = IntercomSheetActivity.this;
                    Map $r7 = map;
                    $r6.showSubmitActionError($r7);
                    return;
                }
                Injector $r3 = Injector.get();
                C11129b $r42 = $r3.getBus();
                CardUpdatedEvent $r52 = new CardUpdatedEvent();
                $r42.post($r52);
                IntercomSheetActivity $r62 = IntercomSheetActivity.this;
                $r62.closeSheet();
            }
        });
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onToolbarClicked() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onWebViewFinishedLoad() {
        JavascriptRunner $r1 = this.jsRunner;
        $r1.runPendingScripts();
        WebView $r2 = this.webView;
        ViewPropertyAnimator $r3 = $r2.animate();
        $r3.alpha(1.0f).setDuration(300L).start();
        ProgressBar $r4 = this.loadingBar;
        $r4.setVisibility(8);
    }
}
