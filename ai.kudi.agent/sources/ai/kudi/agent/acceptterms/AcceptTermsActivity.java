package ai.kudi.agent.acceptterms;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.databinding.ActivityAcceptTermsBinding;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: AcceptTermsActivity.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/acceptterms/AcceptTermsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lai/kudi/agent/core/databinding/ActivityAcceptTermsBinding;", "getBinding", "()Lai/kudi/agent/core/databinding/ActivityAcceptTermsBinding;", "setBinding", "(Lai/kudi/agent/core/databinding/ActivityAcceptTermsBinding;)V", "countDownHandler", "Landroid/os/Handler;", "getCountDownHandler", "()Landroid/os/Handler;", "setCountDownHandler", "(Landroid/os/Handler;)V", "countDownRunnable", "Ljava/lang/Runnable;", "getCountDownRunnable", "()Ljava/lang/Runnable;", "setCountDownRunnable", "(Ljava/lang/Runnable;)V", "loadTerms", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AcceptTermsActivity extends AppCompatActivity {
    public static final String BUNDLE_KEY_ACCEPTED = "BUNDLE_KEY_ACCEPTED";
    private static final String BUNDLE_KEY_URL = "BUNDLE_KEY_URL";
    public static final Companion Companion;
    public ActivityAcceptTermsBinding binding;
    private Handler countDownHandler;
    private Runnable countDownRunnable;

    /* compiled from: AcceptTermsActivity.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/acceptterms/AcceptTermsActivity$Companion;", "", "()V", AcceptTermsActivity.BUNDLE_KEY_ACCEPTED, "", AcceptTermsActivity.BUNDLE_KEY_URL, "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Intent getIntent(Context context, String str) {
            Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
            Intent $r3 = new Intent(context, AcceptTermsActivity.class);
            $r3.putExtra(AcceptTermsActivity.BUNDLE_KEY_URL, str);
            return $r3;
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
    private final void loadTerms() {
        Intent $r2 = getIntent();
        String $r3 = $r2.getStringExtra(BUNDLE_KEY_URL);
        Log_OC.append($r3);
        Log_OC.loadImage($r3, "intent.getStringExtra(BUNDLE_KEY_URL)!!");
        ActivityAcceptTermsBinding $r4 = getBinding();
        WebView $r5 = $r4.termsWebView;
        AcceptTermsActivity$loadTerms$1 $r1 = new AcceptTermsActivity$loadTerms$1(this);
        $r5.setWebViewClient($r1);
        ActivityAcceptTermsBinding $r42 = getBinding();
        WebView $r52 = $r42.termsWebView;
        $r52.loadUrl($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-4$lambda-1$lambda-0  reason: not valid java name */
    public static final void m38997onCreate$lambda4$lambda1$lambda0(AcceptTermsActivity acceptTermsActivity, View view) {
        Log_OC.getArray(acceptTermsActivity, "this$0");
        Intent $r2 = new Intent();
        $r2.putExtra(BUNDLE_KEY_ACCEPTED, true);
        acceptTermsActivity.setResult(-1, $r2);
        acceptTermsActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-4$lambda-3$lambda-2  reason: not valid java name */
    public static final void m38998onCreate$lambda4$lambda3$lambda2(AcceptTermsActivity acceptTermsActivity, View view) {
        Log_OC.getArray(acceptTermsActivity, "this$0");
        acceptTermsActivity.setResult(0);
        acceptTermsActivity.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityAcceptTermsBinding getBinding() {
        ActivityAcceptTermsBinding $r1 = this.binding;
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
    public final Handler getCountDownHandler() {
        Handler r1 = this.countDownHandler;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Runnable getCountDownRunnable() {
        Runnable r1 = this.countDownRunnable;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater $r3 = getLayoutInflater();
        ActivityAcceptTermsBinding $r4 = ActivityAcceptTermsBinding.inflate($r3);
        Log_OC.loadImage($r4, "inflate(layoutInflater)");
        setBinding($r4);
        LinearLayout $r5 = getBinding().getRoot();
        setContentView($r5);
        AbstractC0925a $r6 = getSupportActionBar();
        if ($r6 != null) {
            int $i0 = C0038R.string.terms_and_conditions_title;
            String $r7 = getString($i0);
            $r6.mo37631C($r7);
        }
        loadTerms();
        ActivityAcceptTermsBinding $r42 = getBinding();
        KudiButton $r8 = $r42.acceptTerms;
        $r8.m38035c();
        KudiButton r12 = $r8;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.acceptterms.ActivityMain$18
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AcceptTermsActivity $r2 = AcceptTermsActivity.this;
                AcceptTermsActivity.m38997onCreate$lambda4$lambda1$lambda0($r2, view);
            }
        });
        KudiButton $r82 = $r42.rejectTerms;
        $r82.m38035c();
        KudiButton r122 = $r82;
        r122.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.acceptterms.EditActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AcceptTermsActivity $r2 = AcceptTermsActivity.this;
                AcceptTermsActivity.m38998onCreate$lambda4$lambda3$lambda2($r2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Handler $r2;
        Runnable $r1 = this.countDownRunnable;
        if ($r1 != null && ($r2 = getCountDownHandler()) != null) {
            $r2.removeCallbacks($r1);
        }
        super.onDestroy();
    }

    public final void setBinding(ActivityAcceptTermsBinding activityAcceptTermsBinding) {
        Log_OC.getArray(activityAcceptTermsBinding, "<set-?>");
        this.binding = activityAcceptTermsBinding;
    }

    public final void setCountDownHandler(Handler handler) {
        this.countDownHandler = handler;
    }

    public final void setCountDownRunnable(Runnable runnable) {
        this.countDownRunnable = runnable;
    }
}
