package ai.kudi.agent.core.util;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.C2832e;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;
import java.net.URI;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p492io.C11843b;
/* compiled from: ContextExt.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\t\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\t\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0010\u001a\u0012\u0010\u000e\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0013\u001aC\u0010\u0014\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0015*\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00182\u0019\b\u0002\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\b\u001c\u001aC\u0010\u0014\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0015*\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00182\u0019\b\u0002\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\b\u001c\u001a\u001c\u0010\u001d\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\t\u001a \u0010\u001f\u001a\u0004\u0018\u00010\f*\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t\u001a\u0012\u0010 \u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u001e\u0010!\u001a\u00020\u000f*\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t\u001a\u001e\u0010!\u001a\u00020\u000f*\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010#\u001a\u00020\t¨\u0006%"}, m10421d2 = {"getFilePathFromUri", "", "uri", "Landroid/net/Uri;", "checkPlayServices", "", "Landroid/content/Context;", "getFileNameFromUri", "getKudiColor", "", "colorRes", "getKudiDrawable", "Landroid/graphics/drawable/Drawable;", "drawableRes", "hideKeyboard", "", "Landroid/app/Activity;", "view", "Landroid/view/View;", "Landroidx/fragment/app/Fragment;", "launchActivity", "T", "shouldInvalidatePrevActivities", "activityClass", "Ljava/lang/Class;", "extras", "Lkotlin/Function1;", "Landroid/os/Bundle;", "Lkotlin/ExtensionFunctionType;", "setKudiColorFilter", "context", "setKudiDrawableTint", "showKeyboard", "toast", "resId", "length", MetricTracker.Object.MESSAGE, "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ContextExtKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean checkPlayServices(Context context) {
        Log_OC.getArray(context, "<this>");
        C2832e $r1 = C2832e.m31864o();
        Log_OC.loadImage($r1, "getInstance()");
        int $i0 = $r1.mo31846g(context);
        return $i0 == 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String getFileNameFromUri(Context context, Uri uri) {
        Log_OC.getArray(context, "<this>");
        Log_OC.getArray(uri, "uri");
        String $r2 = uri.toString();
        Log_OC.loadImage($r2, "uri.toString()");
        ContentResolver $r3 = context.getContentResolver();
        Cursor $r4 = $r3.query(uri, null, null, null, null);
        if ($r4 == null) {
            return $r2;
        }
        try {
            int $i0 = $r4.getColumnIndex("_display_name");
            $r4.moveToFirst();
            String $r22 = $r4.getString($i0);
            Log_OC.loadImage($r22, "it.getString(nameIndex)");
            C13666w c13666w = C13666w.f30112a;
            C11843b.m10259a($r4, null);
            return $r22;
        } finally {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String getFilePathFromUri(Uri uri) {
        Log_OC.getArray(uri, "uri");
        URI $r0 = new URI(uri.getPath());
        File $r2 = new File($r0);
        String $r3 = $r2.getPath();
        Log_OC.loadImage($r3, "file.path");
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final int getKudiColor(Context context, int i) {
        Log_OC.getArray(context, "<this>");
        int $i0 = C1335a.m36324d(context, i);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Drawable getKudiDrawable(Context context, int i) {
        Log_OC.getArray(context, "<this>");
        Drawable $r0 = C1335a.m36322f(context, i);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void hideKeyboard(Activity activity) {
        Log_OC.getArray(activity, "<this>");
        View $r1 = activity.getCurrentFocus();
        View $r2 = $r1;
        if ($r1 == null) {
            $r2 = new View(activity);
        }
        hideKeyboard(activity, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void hideKeyboard(Context context, View view) {
        Log_OC.getArray(context, "<this>");
        Log_OC.getArray(view, "view");
        Object $r2 = context.getSystemService("input_method");
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            throw $r5;
        }
        InputMethodManager $r3 = (InputMethodManager) $r2;
        IBinder $r4 = view.getWindowToken();
        $r3.hideSoftInputFromWindow($r4, 0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void hideKeyboard(Fragment fragment) {
        Log_OC.getArray(fragment, "<this>");
        FragmentActivity $r1 = fragment.getActivity();
        if ($r1 == null) {
            return;
        }
        View $r2 = fragment.getView();
        Log_OC.append($r2);
        Log_OC.loadImage($r2, "view!!");
        hideKeyboard($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void launchActivity(Context context, boolean z, Class cls, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(context, "<this>");
        Log_OC.getArray(cls, "activityClass");
        Log_OC.getArray(interfaceC11767l, "extras");
        Intent $r3 = new Intent(context, cls);
        Bundle $r4 = new Bundle();
        interfaceC11767l.invoke($r4);
        $r3.putExtras($r4);
        if (z) {
            $r3.setFlags(268468224);
        }
        context.startActivity($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void launchActivity(Fragment fragment, boolean z, Class cls, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(fragment, "<this>");
        Log_OC.getArray(cls, "activityClass");
        Log_OC.getArray(interfaceC11767l, "extras");
        Context $r2 = fragment.requireContext();
        Log_OC.loadImage($r2, "requireContext()");
        launchActivity($r2, z, cls, interfaceC11767l);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void launchActivity$default(Context context, boolean $z0, Class cls, InterfaceC11767l interfaceC11767l, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = false;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            interfaceC11767l = ContextExtKt$launchActivity$1.INSTANCE;
        }
        InterfaceC11767l r4 = interfaceC11767l;
        launchActivity(context, $z0, cls, r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void launchActivity$default(Fragment fragment, boolean $z0, Class cls, InterfaceC11767l interfaceC11767l, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = false;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            interfaceC11767l = ContextExtKt$launchActivity$2.INSTANCE;
        }
        InterfaceC11767l r4 = interfaceC11767l;
        launchActivity(fragment, $z0, cls, r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void setKudiColorFilter(Drawable drawable, Context context, int i) {
        Log_OC.getArray(drawable, "<this>");
        Log_OC.getArray(context, "context");
        int $i0 = getKudiColor(context, i);
        PorterDuff.Mode $r3 = PorterDuff.Mode.SRC_IN;
        PorterDuffColorFilter $r2 = new PorterDuffColorFilter($i0, $r3);
        drawable.setColorFilter($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Drawable setKudiDrawableTint(Context context, int i, int i2) {
        Log_OC.getArray(context, "<this>");
        Drawable $r1 = getKudiDrawable(context, i);
        Log_OC.append($r1);
        int $i1 = getKudiColor(context, i2);
        C1365a.m36188n($r1, $i1);
        return $r1.mutate();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void showKeyboard(Context context, View view) {
        Log_OC.getArray(context, "<this>");
        Log_OC.getArray(view, "view");
        Object $r0 = context.getSystemService("input_method");
        if ($r0 == null) {
            NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            throw $r4;
        }
        InputMethodManager $r3 = (InputMethodManager) $r0;
        $r3.showSoftInput(view, 1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void toast(Context context, int i, int i2) {
        Log_OC.getArray(context, "<this>");
        String $r1 = context.getString(i);
        toast(context, $r1, i2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void toast(android.content.Context r7, java.lang.String r8, int r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.p483e0.p485d.Log_OC.getArray(r7, r0)
            r1 = 0
            if (r8 != 0) goto La
        L8:
            r2 = 0
            goto L14
        La:
            boolean r2 = kotlin.p549l0.C13265j.m5470u(r8)
            r3 = 1
            r2 = r2 ^ r3
            r3 = 1
            if (r2 != r3) goto L8
            r2 = 1
        L14:
            if (r2 == 0) goto L36
            boolean r2 = r7 instanceof android.app.Activity
            if (r2 == 0) goto L1f
            r5 = r7
            android.app.Activity r5 = (android.app.Activity) r5
            r4 = r5
            goto L20
        L1f:
            r4 = 0
        L20:
            if (r4 != 0) goto L23
            goto L2d
        L23:
            boolean r2 = r4.isFinishing()
            r3 = 1
            r2 = r2 ^ r3
            r3 = 1
            if (r2 != r3) goto L2d
            r1 = 1
        L2d:
            if (r1 == 0) goto L36
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r8, r9)
            r6.show()
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.ContextExtKt.toast(android.content.Context, java.lang.String, int):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toast$default(Context context, int i, int $i1, int i2, Object obj) {
        int $i2 = i2 & 2;
        if ($i2 != 0) {
            $i1 = 1;
        }
        toast(context, i, $i1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toast$default(Context context, String str, int $i0, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $i0 = 1;
        }
        toast(context, str, $i0);
    }
}
