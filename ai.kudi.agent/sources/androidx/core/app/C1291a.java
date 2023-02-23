package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.AbstractC1330p;
import androidx.core.content.C1335a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ActivityCompat.java */
/* renamed from: androidx.core.app.a */
/* loaded from: classes2.dex */
public class C1291a extends C1335a {

    /* renamed from: d */
    private static InterfaceC1294d f4055d;

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$a */
    /* loaded from: classes2.dex */
    class RunnableC1292a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ String[] f4056c;

        /* renamed from: d */
        final /* synthetic */ Activity f4057d;

        /* renamed from: e */
        final /* synthetic */ int f4058e;

        RunnableC1292a(String[] strArr, Activity activity, int i) {
            this.f4056c = strArr;
            this.f4057d = activity;
            this.f4058e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f4056c.length];
            PackageManager packageManager = this.f4057d.getPackageManager();
            String packageName = this.f4057d.getPackageName();
            int length = this.f4056c.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f4056c[i], packageName);
            }
            this.f4057d.onRequestPermissionsResult(this.f4058e, this.f4056c, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$b */
    /* loaded from: classes2.dex */
    class RunnableC1293b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Activity f4059c;

        RunnableC1293b(Activity activity) {
            this.f4059c = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4059c.isFinishing() || C1299c.m36447i(this.f4059c)) {
                return;
            }
            this.f4059c.recreate();
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC1294d {
        /* renamed from: a */
        boolean m36459a(Activity activity, String[] strArr, int i);
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$f */
    /* loaded from: classes2.dex */
    private static class SharedElementCallbackC1295f extends SharedElementCallback {

        /* renamed from: a */
        private final AbstractC1330p f4060a;

        /* compiled from: ActivityCompat.java */
        /* renamed from: androidx.core.app.a$f$a */
        /* loaded from: classes2.dex */
        class C1296a implements AbstractC1330p.InterfaceC1331a {
            C1296a(SharedElementCallbackC1295f sharedElementCallbackC1295f, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            }
        }

        SharedElementCallbackC1295f(AbstractC1330p abstractC1330p) {
            this.f4060a = abstractC1330p;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f4060a.m36343a(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f4060a.m36342b(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f4060a.m36341c(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f4060a.m36340d(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f4060a.m36339e(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f4060a.m36338f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f4060a.m36337g(list, list2, new C1296a(this, onSharedElementsReadyListener));
        }
    }

    /* renamed from: m */
    public static void m36470m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: n */
    public static void m36469n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    /* renamed from: o */
    public static void m36468o(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    /* renamed from: p */
    public static void m36467p(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
        } else if (i <= 23) {
            new Handler(activity.getMainLooper()).post(new RunnableC1293b(activity));
        } else if (C1299c.m36447i(activity)) {
        } else {
            activity.recreate();
        }
    }

    /* renamed from: q */
    public static void m36466q(Activity activity, String[] strArr, int i) {
        InterfaceC1294d interfaceC1294d = f4055d;
        if (interfaceC1294d == null || !interfaceC1294d.m36459a(activity, strArr, i)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).validateRequestPermissionsRequestCode(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1292a(strArr, activity, i));
            }
        }
    }

    /* renamed from: r */
    public static void m36465r(Activity activity, AbstractC1330p abstractC1330p) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(abstractC1330p != null ? new SharedElementCallbackC1295f(abstractC1330p) : null);
        }
    }

    /* renamed from: s */
    public static void m36464s(Activity activity, AbstractC1330p abstractC1330p) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(abstractC1330p != null ? new SharedElementCallbackC1295f(abstractC1330p) : null);
        }
    }

    /* renamed from: t */
    public static boolean m36463t(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: u */
    public static void m36462u(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: v */
    public static void m36461v(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    /* renamed from: w */
    public static void m36460w(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }
}
