package ai.kudi.commons.refresh.activities;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p198f.p199a.objectweb.asm.R$string;
import p198f.p199a.objectweb.asm.commons.C7445b;
/* compiled from: ForceUpdateActivity.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/commons/refresh/activities/ForceUpdateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lai/kudi/commons/refresh/databinding/ActivityForceUpdateBinding;", "getBinding", "()Lai/kudi/commons/refresh/databinding/ActivityForceUpdateBinding;", "setBinding", "(Lai/kudi/commons/refresh/databinding/ActivityForceUpdateBinding;)V", "exitApp", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openAppStore", "appId", "", "Companion", "refresh_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ForceUpdateActivity extends AppCompatActivity {

    /* renamed from: c */
    public C7445b f2120c;

    /* renamed from: b */
    private final void m38057b() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m38055c(ForceUpdateActivity forceUpdateActivity, View view) {
        Log_OC.getArray(forceUpdateActivity, "this$0");
        forceUpdateActivity.m38057b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void onClick(ForceUpdateActivity forceUpdateActivity, View view) {
        String $r4;
        Log_OC.getArray(forceUpdateActivity, "this$0");
        Intent $r2 = forceUpdateActivity.getIntent();
        String $r3 = "";
        if ($r2 != null && ($r4 = $r2.getStringExtra("extra.package.forceUpdateActivity")) != null) {
            $r3 = $r4;
        }
        forceUpdateActivity.openBrowser($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openBrowser(String str) {
        try {
            String $r4 = Log_OC.m10359a("market://details?id=", (Object) str);
            Uri $r5 = Uri.parse($r4);
            Intent $r3 = new Intent("android.intent.action.VIEW", $r5);
            startActivity($r3);
        } catch (ActivityNotFoundException e) {
            String $r2 = Log_OC.m10359a("http://play.google.com/store/apps/details?id=", (Object) str);
            Uri $r52 = Uri.parse($r2);
            Intent $r32 = new Intent("android.intent.action.VIEW", $r52);
            startActivity($r32);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C7445b m38058a() {
        C7445b $r1 = this.f2120c;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("binding");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* renamed from: d */
    public final void m38054d(C7445b c7445b) {
        Log_OC.getArray(c7445b, "<set-?>");
        this.f2120c = c7445b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater $r3 = getLayoutInflater();
        C7445b $r4 = C7445b.m18702a($r3);
        Log_OC.loadImage($r4, "inflate(layoutInflater)");
        m38054d($r4);
        View $r5 = m38058a().m18703a();
        View r17 = $r5;
        setContentView(r17);
        Button $r6 = m38058a().f17664c;
        $r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.commons.refresh.activities.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForceUpdateActivity $r2 = ForceUpdateActivity.this;
                ForceUpdateActivity.onClick($r2, view);
            }
        });
        TextView $r8 = m38058a().f17663b;
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.commons.refresh.activities.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForceUpdateActivity $r2 = ForceUpdateActivity.this;
                ForceUpdateActivity.m38055c($r2, view);
            }
        });
        TextView $r82 = m38058a().f17662a;
        int $i0 = R$string.version_code;
        String $r10 = getString($i0);
        Log_OC.loadImage($r10, "getString(R.string.version_code)");
        Application $r11 = getApplication();
        PackageManager $r12 = $r11.getPackageManager();
        Application $r112 = getApplication();
        String $r13 = $r112.getPackageName();
        PackageInfo $r14 = $r12.getPackageInfo($r13, 0);
        String $r132 = $r14.versionName;
        Object[] $r1 = {$r132};
        String $r102 = String.format($r10, Arrays.copyOf($r1, 1));
        Log_OC.loadImage($r102, "java.lang.String.format(this, *args)");
        $r82.setText($r102);
    }
}
