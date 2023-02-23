package ai.kudi.agent.core.util;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.login.domain.LoginParams;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.C1291a;
import androidx.core.content.C1335a;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.Priority;
import com.google.android.gms.common.C2832e;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p215c.p216b.C7513a;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: AppCompatActivityExt.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\u0007\u001a\"\u0010\t\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\n\u0010\u0010\u001a\u00020\u0006*\u00020\u0007\u001a\u0012\u0010\u0011\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\r\u001a\u0012\u0010\u0013\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u0013\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u0014\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\r\u001a\u0012\u0010\u0016\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\r\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r\u001a\u0012\u0010\u0019\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\r\u001a\u0012\u0010\u0019\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\r\u001a\u0012\u0010\u001b\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\r\u001a\u001a\u0010\u001c\u001a\u00020\u0003*\u00020\u00072\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e\u001a\u0016\u0010\u001f\u001a\u00020\u0003*\u00020\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r\u001a\n\u0010!\u001a\u00020\u0003*\u00020\u0007\u001a&\u0010\"\u001a\u00020\u0003*\u00020\u00072\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u000f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r\u001a\n\u0010%\u001a\u00020\u0003*\u00020\u0007\u001a\u0012\u0010%\u001a\u00020\u0003*\u00020\u00072\u0006\u0010&\u001a\u00020'\u001a:\u0010(\u001a\u00020\u0003*\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\u0006\u001a:\u0010,\u001a\u00020\u0003*\u00020\u00012\b\u0010#\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\u0006\u001a6\u0010-\u001a\u00020\u0003*\u00020.2\b\u0010#\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002\u001a&\u0010-\u001a\u00020\u0003*\u00020.2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000300¢\u0006\u0002\b2H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082.¢\u0006\u0002\n\u0000¨\u00063"}, m10421d2 = {"currentFragment", "Landroidx/fragment/app/Fragment;", "callSupport", "", "Landroid/app/Activity;", "checkPlayServicesWithDialog", "", "Landroidx/appcompat/app/AppCompatActivity;", "closeFragment", "dialTelephone", "context", "Landroid/content/Context;", "phoneNumber", "", "requestCode", "", "isActivityStarted", "launchAnotherApp", "app_id", "makeCall", "openAppStore", "appId", "openLink", "link", "errorMessage", "openTermsAndConditions", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "openUrlInApp", "pop", "callback", "Lkotlin/Function0;", "popAllFragmentsInActivity", "tag", "popBackStackImm", "replaceFragmentInActivity", "fragment", "frameId", "showKeyboard", "view", "Landroid/view/View;", "startFragment", "addToBackStack", "allowStateLoss", "isToApplyAnimation", "startFragmentInFragment", "transact", "Landroidx/fragment/app/FragmentManager;", "action", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AppCompatActivityExtKt {
    private static Fragment currentFragment;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void add(AppCompatActivity appCompatActivity, InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(appCompatActivity, "<this>");
        Log_OC.getArray(interfaceC11756a, "callback");
        FragmentManager $r2 = appCompatActivity.getSupportFragmentManager();
        int $i0 = $r2.m35920m0();
        if ($i0 <= 0) {
            interfaceC11756a.invoke();
            return;
        }
        FragmentManager $r22 = appCompatActivity.getSupportFragmentManager();
        $r22.m35966V0();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void callSupport(Activity activity) {
        Log_OC.getArray(activity, "<this>");
        boolean $z0 = activity instanceof AppCompatActivity;
        if ($z0) {
            AppCompatActivity $r1 = (AppCompatActivity) activity;
            makeCall($r1, LoginParams.ONBOARDING_SUPPORT);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean checkPlayServicesWithDialog(AppCompatActivity appCompatActivity) {
        Log_OC.getArray(appCompatActivity, "<this>");
        C2832e $r1 = C2832e.m31864o();
        Log_OC.loadImage($r1, "getInstance()");
        int $i0 = $r1.mo31846g(appCompatActivity);
        if ($i0 != 0) {
            boolean $z0 = $r1.mo31843j($i0);
            if ($z0) {
                Dialog $r2 = $r1.m31867l(appCompatActivity, $i0, 9000);
                $r2.show();
                return false;
            }
            ContextExtKt.toast$default(appCompatActivity, "This device is not supported.", 0, 2, (Object) null);
            appCompatActivity.finish();
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void closeFragment(AppCompatActivity appCompatActivity) {
        Log_OC.getArray(appCompatActivity, "<this>");
        FragmentManager $r1 = appCompatActivity.getSupportFragmentManager();
        Log_OC.loadImage($r1, "supportFragmentManager");
        int $i0 = $r1.m35920m0();
        if ($i0 > 0) {
            boolean $z0 = isActivityStarted(appCompatActivity);
            if ($z0) {
                ContextExtKt.hideKeyboard(appCompatActivity);
                boolean $z02 = $r1.m35984M0();
                if ($z02) {
                    return;
                }
                $r1.m35966V0();
                return;
            }
        }
        ContextExtKt.hideKeyboard(appCompatActivity);
        appCompatActivity.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void dialTelephone(AppCompatActivity appCompatActivity, Context context, String str, int i) {
        Log_OC.getArray(appCompatActivity, "<this>");
        Log_OC.getArray(context, "context");
        Log_OC.getArray(str, "phoneNumber");
        String $r3 = Log_OC.m10359a("Code to dial ", (Object) str);
        Object[] $r4 = new Object[0];
        Timber.m1627e($r3, $r4);
        int $i1 = C1335a.m36327a(context, "android.permission.CALL_PHONE");
        if ($i1 != 0) {
            String[] $r7 = {"android.permission.CALL_PHONE"};
            C1291a.m36466q(appCompatActivity, $r7, i);
            return;
        }
        Intent $r5 = new Intent("android.intent.action.CALL");
        String $r2 = Log_OC.m10359a("tel:", (Object) str);
        Uri $r6 = Uri.parse($r2);
        $r5.setData($r6);
        context.startActivity($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean isActivityStarted(AppCompatActivity appCompatActivity) {
        Log_OC.getArray(appCompatActivity, "<this>");
        AbstractC1565i $r1 = appCompatActivity.getLifecycle();
        Priority $r2 = $r1.mo35505b();
        Priority $r3 = Priority.f4718F;
        boolean $z0 = $r2.m35575c($r3);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void launchAnotherApp(AppCompatActivity appCompatActivity, String str) {
        Log_OC.getArray(appCompatActivity, "<this>");
        Log_OC.getArray(str, "app_id");
        PackageManager $r2 = appCompatActivity.getPackageManager();
        Intent $r3 = $r2.getLaunchIntentForPackage(str);
        PackageManager $r22 = appCompatActivity.getPackageManager();
        try {
            $r22.getPackageInfo(str, 0);
            appCompatActivity.startActivity($r3);
        } catch (PackageManager.NameNotFoundException $r4) {
            $r4.printStackTrace();
            ContextExtKt.toast$default(appCompatActivity, "Seems you do not have the appropriate app installed.", 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void makeCall(AppCompatActivity appCompatActivity, String str) {
        Log_OC.getArray(appCompatActivity, "<this>");
        Log_OC.getArray(str, "phoneNumber");
        Intent $r2 = new Intent("android.intent.action.DIAL");
        String $r1 = Log_OC.m10359a("tel:", (Object) str);
        Uri $r3 = Uri.parse($r1);
        $r2.setData($r3);
        appCompatActivity.startActivity($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void makeCall(Fragment fragment, String str) {
        Log_OC.getArray(fragment, "<this>");
        Log_OC.getArray(str, "phoneNumber");
        FragmentActivity $r2 = fragment.getActivity();
        boolean $z0 = $r2 instanceof AppCompatActivity;
        if ($z0) {
            FragmentActivity $r22 = fragment.requireActivity();
            AppCompatActivity $r3 = (AppCompatActivity) $r22;
            makeCall($r3, str);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void openAppStore(Activity activity, String str) {
        Log_OC.getArray(activity, "<this>");
        Log_OC.getArray(str, "appId");
        try {
            String $r3 = Log_OC.m10359a("market://details?id=", (Object) str);
            Uri $r4 = Uri.parse($r3);
            Intent $r2 = new Intent("android.intent.action.VIEW", $r4);
            activity.startActivity($r2);
        } catch (ActivityNotFoundException $r5) {
            CrashlyticsReport.logException($r5);
            String $r1 = Log_OC.m10359a("http://play.google.com/store/apps/details?id=", (Object) str);
            Uri $r42 = Uri.parse($r1);
            Intent $r22 = new Intent("android.intent.action.VIEW", $r42);
            activity.startActivity($r22);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void openLink(Activity activity, String str) {
        Log_OC.getArray(activity, "<this>");
        Log_OC.getArray(str, "link");
        boolean $z0 = activity instanceof AppCompatActivity;
        if ($z0) {
            AppCompatActivity $r2 = (AppCompatActivity) activity;
            openLink$default($r2, str, null, 2, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void openLink(AppCompatActivity appCompatActivity, String str, String str2) {
        Log_OC.getArray(appCompatActivity, "<this>");
        Log_OC.getArray(str, "link");
        Log_OC.getArray(str2, "errorMessage");
        try {
            Uri $r2 = Uri.parse(str);
            Intent $r5 = new Intent("android.intent.action.VIEW", $r2);
            appCompatActivity.startActivity($r5);
        } catch (ClassNotFoundException e) {
            ContextExtKt.toast$default(appCompatActivity, str2, 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void openLink$default(AppCompatActivity appCompatActivity, String str, String $r3, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r3 = "Unable to open link";
        }
        openLink(appCompatActivity, str, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void openTermsAndConditions(AppCompatActivity appCompatActivity, String str) {
        Log_OC.getArray(appCompatActivity, "<this>");
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Uri $r3 = Uri.parse(str);
        C7513a.C7514a $r4 = new C7513a.C7514a();
        int $i0 = C0038R.color.colorPrimary;
        $r4.m18523c(C1335a.m36324d(appCompatActivity, $i0));
        int $i02 = C0038R.color.colorPrimaryDark;
        $r4.m18524b(C1335a.m36324d(appCompatActivity, $i02));
        try {
            C7513a $r5 = $r4.m18525a();
            $r5.m18526a(appCompatActivity, $r3);
        } catch (ActivityNotFoundException e) {
            ContextExtKt.toast$default(appCompatActivity, "You do not have any browser installed.", 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void openTermsAndConditions(Fragment fragment, String str) {
        Log_OC.getArray(fragment, "<this>");
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        FragmentActivity $r1 = fragment.requireActivity();
        AppCompatActivity $r3 = (AppCompatActivity) $r1;
        openTermsAndConditions($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void openUrlInApp(Context context, String str) {
        Log_OC.getArray(context, "<this>");
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Uri $r3 = Uri.parse(str);
        C7513a.C7514a $r4 = new C7513a.C7514a();
        int $i0 = C0038R.color.colorPrimary;
        $r4.m18523c(C1335a.m36324d(context, $i0));
        int $i02 = C0038R.color.colorPrimaryDark;
        $r4.m18524b(C1335a.m36324d(context, $i02));
        try {
            C7513a $r5 = $r4.m18525a();
            $r5.m18526a(context, $r3);
        } catch (ActivityNotFoundException e) {
            ContextExtKt.toast$default(context, "You do not have any browser installed.", 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void pop$default(AppCompatActivity appCompatActivity, InterfaceC11756a interfaceC11756a, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            interfaceC11756a = AppCompatActivityExtKt$pop$1.INSTANCE;
        }
        InterfaceC11756a r3 = interfaceC11756a;
        add(appCompatActivity, r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void popAllFragmentsInActivity(AppCompatActivity appCompatActivity, String str) {
        Log_OC.getArray(appCompatActivity, "<this>");
        FragmentManager $r2 = appCompatActivity.getSupportFragmentManager();
        boolean $z0 = $r2.m35984M0();
        if ($z0) {
            return;
        }
        FragmentManager $r22 = appCompatActivity.getSupportFragmentManager();
        $r22.m35962X0(str, 1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void popAllFragmentsInActivity$default(AppCompatActivity appCompatActivity, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = null;
        }
        popAllFragmentsInActivity(appCompatActivity, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void popBackStackImm(AppCompatActivity appCompatActivity) {
        Log_OC.getArray(appCompatActivity, "<this>");
        FragmentManager $r1 = appCompatActivity.getSupportFragmentManager();
        boolean $z0 = $r1.m35984M0();
        if ($z0) {
            return;
        }
        FragmentManager $r12 = appCompatActivity.getSupportFragmentManager();
        $r12.m35960Y0();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void replaceFragmentInActivity(AppCompatActivity appCompatActivity, Fragment fragment, int i, String str) {
        Log_OC.getArray(appCompatActivity, "<this>");
        Log_OC.getArray(fragment, "fragment");
        FragmentManager $r3 = appCompatActivity.getSupportFragmentManager();
        Log_OC.loadImage($r3, "supportFragmentManager");
        AbstractC1449b0 $r4 = $r3.m35924l();
        Log_OC.loadImage($r4, "");
        $r4.m35820s(i, fragment, str);
        $r4.mo35805i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void replaceFragmentInActivity$default(AppCompatActivity appCompatActivity, Fragment fragment, int i, String $r3, int i2, Object obj) {
        int $i1 = i2 & 4;
        if ($i1 != 0) {
            $r3 = null;
        }
        replaceFragmentInActivity(appCompatActivity, fragment, i, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void showKeyboard(AppCompatActivity appCompatActivity) {
        Log_OC.getArray(appCompatActivity, "<this>");
        View $r1 = appCompatActivity.getCurrentFocus();
        if ($r1 == null) {
            return;
        }
        showKeyboard(appCompatActivity, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void showKeyboard(AppCompatActivity appCompatActivity, View view) {
        Log_OC.getArray(appCompatActivity, "<this>");
        Log_OC.getArray(view, "view");
        Object $r2 = appCompatActivity.getSystemService("input_method");
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            throw $r5;
        }
        InputMethodManager $r3 = (InputMethodManager) $r2;
        IBinder $r4 = view.getWindowToken();
        $r3.hideSoftInputFromWindow($r4, 2);
        $r3.showSoftInput(view, 2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void startFragment(AppCompatActivity appCompatActivity, Fragment fragment, int i, boolean z, boolean z2, boolean z3) {
        Log_OC.getArray(appCompatActivity, "<this>");
        FragmentManager $r2 = appCompatActivity.getSupportFragmentManager();
        Log_OC.loadImage($r2, "supportFragmentManager");
        transact($r2, fragment, z3, i, z, z2);
        ContextExtKt.hideKeyboard(appCompatActivity);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void startFragment$default(AppCompatActivity appCompatActivity, Fragment fragment, int i, boolean $z1, boolean $z2, boolean $z0, int i2, Object obj) {
        int $i2 = i2 & 4;
        if ($i2 != 0) {
            $z1 = true;
        }
        int $i22 = i2 & 8;
        if ($i22 != 0) {
            $z2 = false;
        }
        int $i1 = i2 & 16;
        if ($i1 != 0) {
            $z0 = true;
        }
        startFragment(appCompatActivity, fragment, i, $z1, $z2, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void startFragmentInFragment(Fragment fragment, Fragment fragment2, int i, boolean z, boolean z2, boolean z3) {
        Log_OC.getArray(fragment, "<this>");
        FragmentManager $r1 = fragment.getChildFragmentManager();
        Log_OC.loadImage($r1, "childFragmentManager");
        transact($r1, fragment2, z3, i, z, z2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void startFragmentInFragment$default(Fragment fragment, Fragment fragment2, int i, boolean $z1, boolean $z2, boolean $z0, int i2, Object obj) {
        int $i2 = i2 & 4;
        if ($i2 != 0) {
            $z1 = true;
        }
        int $i22 = i2 & 8;
        if ($i22 != 0) {
            $z2 = false;
        }
        int $i1 = i2 & 16;
        if ($i1 != 0) {
            $z0 = true;
        }
        startFragmentInFragment(fragment, fragment2, i, $z1, $z2, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static final void transact(FragmentManager fragmentManager, Fragment fragment, boolean z, int i, boolean z2, boolean z3) {
        if (fragment != null) {
            Fragment $r2 = currentFragment;
            if ($r2 != null) {
                if ($r2 == null) {
                    Log_OC.LogError("currentFragment");
                    NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r6;
                }
                boolean $z3 = Log_OC.append($r2, fragment);
                if ($z3) {
                    return;
                }
            }
            currentFragment = fragment;
            Class $r3 = fragment.getClass();
            String $r4 = $r3.getCanonicalName();
            boolean $z32 = fragmentManager.m35984M0();
            if ($z32) {
                return;
            }
            AbstractC1449b0 $r5 = fragmentManager.m35924l();
            Log_OC.loadImage($r5, "beginTransaction()");
            if (z) {
                int $i3 = C0038R.anim.enter_from_right;
                int $i4 = C0038R.anim.exit_to_left;
                int $i1 = C0038R.anim.enter_from_left;
                int $i2 = C0038R.anim.exit_to_right;
                $r5.m35819t($i3, $i4, $i1, $i2);
            }
            $r5.m35820s(i, fragment, $r4);
            if (z2) {
                $r5.m35824g($r4);
            }
            if (z3) {
                $r5.mo35804j();
            } else {
                $r5.mo35805i();
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static final void transact(FragmentManager fragmentManager, InterfaceC11767l interfaceC11767l) {
        AbstractC1449b0 $r1 = fragmentManager.m35924l();
        Log_OC.loadImage($r1, "");
        interfaceC11767l.invoke($r1);
        $r1.mo35805i();
    }
}
