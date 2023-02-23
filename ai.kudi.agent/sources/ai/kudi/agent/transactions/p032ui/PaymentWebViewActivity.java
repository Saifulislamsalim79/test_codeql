package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.BaseAppCompactActivity;
import ai.kudi.agent.bills.p002ui.PerformPaymentActivity;
import ai.kudi.agent.databinding.ViewChatPaymentWebViewBinding;
import ai.kudi.agent.transactions.domain.dto.IncomingMessage;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.hwangjr.rxbus.Bus;
import com.hwangjr.rxbus.RxBus;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PaymentWebViewActivity.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/PaymentWebViewActivity;", "Lai/kudi/agent/BaseAppCompactActivity;", "()V", "binding", "Lai/kudi/agent/databinding/ViewChatPaymentWebViewBinding;", "getBinding", "()Lai/kudi/agent/databinding/ViewChatPaymentWebViewBinding;", "setBinding", "(Lai/kudi/agent/databinding/ViewChatPaymentWebViewBinding;)V", "loadingDialog", "Landroid/app/ProgressDialog;", "getLoadingDialog", "()Landroid/app/ProgressDialog;", "setLoadingDialog", "(Landroid/app/ProgressDialog;)V", "createPaymentIntent", "Landroid/content/Intent;", "handleIncomingMessage", "", MetricTracker.Object.MESSAGE, "Lai/kudi/agent/transactions/domain/dto/IncomingMessage;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "setupWebView", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.PaymentWebViewActivity */
/* loaded from: classes.dex */
public final class PaymentWebViewActivity extends BaseAppCompactActivity {
    public static final Companion Companion;
    public static final String EXTRA_PAYMENT_CANCELLED = "PaymentWebView_Extra_Cancelled";
    public static final String URL_EXTRA = "PaymentWebView_Extra";
    public ViewChatPaymentWebViewBinding binding;
    private ProgressDialog loadingDialog;

    /* compiled from: PaymentWebViewActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/PaymentWebViewActivity$Companion;", "", "()V", "EXTRA_PAYMENT_CANCELLED", "", "URL_EXTRA", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.PaymentWebViewActivity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Intent createPaymentIntent() {
        Intent $r1 = new Intent(this, PerformPaymentActivity.class);
        $r1.setFlags(67108864);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupWebView() {
        Intent $r1 = getIntent();
        if ($r1 == null) {
            Log.d("PaymentWebViewActivity", "No url provided for webview");
            return;
        }
        Intent $r12 = getIntent();
        String $r2 = $r12.getStringExtra(URL_EXTRA);
        String $r3 = $r2;
        if ($r2 == null) {
            $r3 = "";
        }
        ViewChatPaymentWebViewBinding $r4 = getBinding();
        WebView $r5 = $r4.webView;
        WebSettings $r6 = $r5.getSettings();
        Log_OC.loadImage($r6, "binding.webView.settings");
        $r6.setJavaScriptEnabled(true);
        ViewChatPaymentWebViewBinding $r42 = getBinding();
        WebView $r52 = $r42.webView;
        $r52.clearCache(true);
        ViewChatPaymentWebViewBinding $r43 = getBinding();
        WebView $r53 = $r43.webView;
        $r53.loadUrl($r3);
        ViewChatPaymentWebViewBinding $r44 = getBinding();
        WebView $r54 = $r44.webView;
        $r54.setWebViewClient(new WebViewClient() { // from class: ai.kudi.agent.transactions.ui.PaymentWebViewActivity$setupWebView$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                PaymentWebViewActivity $r45 = PaymentWebViewActivity.this;
                ProgressDialog $r32 = $r45.getLoadingDialog();
                if ($r32 != null) {
                    $r32.hide();
                }
                super.onPageFinished(webView, str);
            }
        });
        ViewChatPaymentWebViewBinding $r45 = getBinding();
        WebView $r55 = $r45.webView;
        $r55.setWebChromeClient(new WebChromeClient() { // from class: ai.kudi.agent.transactions.ui.PaymentWebViewActivity$setupWebView$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView webView) {
                super.onCloseWindow(webView);
                PaymentWebViewActivity $r22 = PaymentWebViewActivity.this;
                $r22.onBackPressed();
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ViewChatPaymentWebViewBinding getBinding() {
        ViewChatPaymentWebViewBinding $r1 = this.binding;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("binding");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProgressDialog getLoadingDialog() {
        ProgressDialog r1 = this.loadingDialog;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void handleIncomingMessage(IncomingMessage incomingMessage) {
        Log_OC.getArray(incomingMessage, MetricTracker.Object.MESSAGE);
        Intent $r2 = createPaymentIntent();
        $r2.putExtra(PerformPaymentActivity.EXTRA_COMPLETED, true);
        String $r3 = incomingMessage.getStatus();
        if ($r3 != null) {
            int $i0 = $r3.hashCode();
            if ($i0 == -62859513) {
                boolean $z0 = $r3.equals("WITHDRAWAL_FAILED");
                if ($z0) {
                    $r2.putExtra(PerformPaymentActivity.EXTRA_REASON, incomingMessage.getMessage());
                    $r2.putExtra(PerformPaymentActivity.EXTRA_SUCCESSFUL, false);
                    startActivity($r2);
                    return;
                }
            } else if ($i0 == 1695445092) {
                boolean $z02 = $r3.equals("WITHDRAWAL_SUCCESSFUL");
                if ($z02) {
                    $r2.putExtra(PerformPaymentActivity.EXTRA_REASON, incomingMessage.getMessage());
                    $r2.putExtra(PerformPaymentActivity.EXTRA_SUCCESSFUL, true);
                    startActivity($r2);
                    return;
                }
            } else if ($i0 == 2135143278) {
                boolean $z03 = $r3.equals("TRANSFER_SUCCESSFUL");
                if ($z03) {
                    startActivity($r2);
                    return;
                }
            }
        }
        $r2.putExtra(PerformPaymentActivity.EXTRA_REASON, incomingMessage.getStatus());
        startActivity($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProgressDialog $r2 = this.loadingDialog;
        if ($r2 != null) {
            $r2.dismiss();
        }
        Intent $r1 = createPaymentIntent();
        $r1.putExtra(EXTRA_PAYMENT_CANCELLED, true);
        startActivity($r1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.BaseAppCompactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater $r2 = getLayoutInflater();
        ViewChatPaymentWebViewBinding $r3 = ViewChatPaymentWebViewBinding.inflate($r2);
        Log_OC.loadImage($r3, "inflate(layoutInflater)");
        setBinding($r3);
        WebView $r4 = getBinding().getRoot();
        setContentView($r4);
        ProgressDialog $r5 = new ProgressDialog(this);
        this.loadingDialog = $r5;
        if ($r5 != null) {
            $r5.setMessage("Loading, please wait...");
        }
        ProgressDialog $r52 = this.loadingDialog;
        if ($r52 != null) {
            $r52.show();
        }
        setupWebView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Bus $r1 = RxBus.getBus();
        $r1.register(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Bus $r1 = RxBus.getBus();
        $r1.unregister(this);
        super.onStop();
    }

    public final void setBinding(ViewChatPaymentWebViewBinding viewChatPaymentWebViewBinding) {
        Log_OC.getArray(viewChatPaymentWebViewBinding, "<set-?>");
        this.binding = viewChatPaymentWebViewBinding;
    }

    public final void setLoadingDialog(ProgressDialog progressDialog) {
        this.loadingDialog = progressDialog;
    }
}
