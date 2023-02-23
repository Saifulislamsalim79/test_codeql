package ai.kudi.agent.kcash;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityKcashBinding;
import ai.kudi.agent.databinding.WalletLoaderViewBinding;
import ai.kudi.agent.kcash.data.KCashViewData;
import ai.kudi.agent.kcash.viewmodels.KCashViewModel;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AbstractC0925a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: KCashActivity.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0014J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/kcash/KCashActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/kcash/viewmodels/KCashViewModel;", "Lai/kudi/agent/kcash/data/KCashViewData;", "Lai/kudi/agent/databinding/ActivityKcashBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityKcashBinding;", "vm", "getVm", "()Lai/kudi/agent/kcash/viewmodels/KCashViewModel;", "setVm", "(Lai/kudi/agent/kcash/viewmodels/KCashViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "setupWebView", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KCashActivity extends BaseMVVMActivity<KCashViewModel, KCashViewData, ActivityKcashBinding> {
    public KCashViewModel srv;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupWebView(String str) {
        InterfaceC8209a $r2 = getBinding();
        ActivityKcashBinding $r3 = (ActivityKcashBinding) $r2;
        WalletLoaderViewBinding $r4 = $r3.loaderView;
        final ConstraintLayout $r5 = $r4.getRoot();
        Log_OC.loadImage($r5, "binding.loaderView.root");
        ConstraintLayout r12 = $r5;
        ViewExtKt.show(r12);
        InterfaceC8209a $r22 = getBinding();
        ActivityKcashBinding $r32 = (ActivityKcashBinding) $r22;
        WebView $r6 = $r32.webView;
        Log_OC.loadImage($r6, "binding.webView");
        WebSettings $r7 = $r6.getSettings();
        Log_OC.loadImage($r7, "webView.settings");
        $r7.setJavaScriptEnabled(true);
        $r7.setDomStorageEnabled(true);
        $r6.clearCache(true);
        $r6.loadUrl(str);
        $r6.setWebViewClient(new WebViewClient() { // from class: ai.kudi.agent.kcash.KCashActivity$setupWebView$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                View $r33 = ConstraintLayout.this;
                View r4 = $r33;
                ViewExtKt.hide$default(r4, false, 1, null);
                super.onPageFinished(webView, str2);
            }
        });
        $r6.setWebChromeClient(new WebChromeClient() { // from class: ai.kudi.agent.kcash.KCashActivity$setupWebView$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView webView) {
                super.onCloseWindow(webView);
                KCashActivity $r23 = KCashActivity.this;
                $r23.onBackPressed();
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        KCashViewData $r2 = (KCashViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(KCashViewData kCashViewData) {
        Log_OC.getArray(kCashViewData, "viewData");
        boolean $z0 = kCashViewData.isLoading();
        if ($z0) {
            InterfaceC8209a $r2 = getBinding();
            ActivityKcashBinding $r3 = (ActivityKcashBinding) $r2;
            WalletLoaderViewBinding $r4 = $r3.loaderView;
            View $r5 = $r4.getRoot();
            Log_OC.loadImage($r5, "binding.loaderView.root");
            View r7 = $r5;
            ViewExtKt.show(r7);
        } else {
            InterfaceC8209a $r22 = getBinding();
            ActivityKcashBinding $r32 = (ActivityKcashBinding) $r22;
            WalletLoaderViewBinding $r42 = $r32.loaderView;
            View $r52 = $r42.getRoot();
            Log_OC.loadImage($r52, "binding.loaderView.root");
            View r72 = $r52;
            ViewExtKt.hide$default(r72, false, 1, null);
        }
        String $r6 = kCashViewData.getUrl();
        if ($r6 == null) {
            return;
        }
        setupWebView($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        KCashViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public KCashViewModel createViewModel() {
        KCashViewModel $r1 = getVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivityKcashBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivityKcashBinding $r2 = ActivityKcashBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityKcashBinding $r1 = getActivityBinding();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return KCashViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KCashViewModel getVm() {
        KCashViewModel $r1 = this.srv;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("vm");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r7;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        AbstractC0925a $r5 = getSupportActionBar();
        if ($r5 != null) {
            $r5.mo37602u(true);
        }
        setTitle("K-Cash");
        KCashViewModel $r6 = getVm();
        $r6.getUrlToLoad();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onSupportNavigateUp() {
        KCashActivity$onSupportNavigateUp$1 $r1 = new KCashActivity$onSupportNavigateUp$1(this);
        AppCompatActivityExtKt.add(this, $r1);
        boolean $z0 = super.onSupportNavigateUp();
        return $z0;
    }

    public final void setVm(KCashViewModel kCashViewModel) {
        Log_OC.getArray(kCashViewModel, "<set-?>");
        this.srv = kCashViewModel;
    }
}
