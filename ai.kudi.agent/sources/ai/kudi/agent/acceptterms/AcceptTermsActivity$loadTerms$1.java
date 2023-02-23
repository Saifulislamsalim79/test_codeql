package ai.kudi.agent.acceptterms;

import ai.kudi.agent.core.databinding.ActivityAcceptTermsBinding;
import ai.kudi.dip.library.button.KudiButton;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: AcceptTermsActivity.kt */
@Metadata(m10422d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, m10421d2 = {"ai/kudi/agent/acceptterms/AcceptTermsActivity$loadTerms$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AcceptTermsActivity$loadTerms$1 extends WebViewClient {
    final /* synthetic */ AcceptTermsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AcceptTermsActivity$loadTerms$1(AcceptTermsActivity acceptTermsActivity) {
        this.this$0 = acceptTermsActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onPageFinished$lambda-0  reason: not valid java name */
    public static final void m38999onPageFinished$lambda0(AcceptTermsActivity acceptTermsActivity) {
        Log_OC.getArray(acceptTermsActivity, "this$0");
        Object[] $r1 = new Object[0];
        Timber.wtf("after 5 secs", $r1);
        ActivityAcceptTermsBinding $r2 = acceptTermsActivity.getBinding();
        KudiButton $r3 = $r2.acceptTerms;
        $r3.m38034d();
        ActivityAcceptTermsBinding $r22 = acceptTermsActivity.getBinding();
        KudiButton $r32 = $r22.rejectTerms;
        $r32.m38034d();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.this$0.setCountDownHandler(new Handler());
        final AcceptTermsActivity $r3 = this.this$0;
        $r3.setCountDownRunnable(new Runnable() { // from class: ai.kudi.agent.acceptterms.CordovaWebViewClient$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                AcceptTermsActivity $r1 = AcceptTermsActivity.this;
                AcceptTermsActivity$loadTerms$1.m38999onPageFinished$lambda0($r1);
            }
        });
        Handler $r4 = this.this$0.getCountDownHandler();
        if ($r4 == null) {
            return;
        }
        Runnable $r6 = this.this$0.getCountDownRunnable();
        Log_OC.append($r6);
        $r4.postDelayed($r6, 5000L);
    }
}
