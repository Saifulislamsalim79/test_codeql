package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0929b;
import androidx.appcompat.widget.C1168w0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import p201g.p202a.p209o.AbstractC7485b;
import p201g.p218e.C7523b;
/* loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* renamed from: c */
    private static final C7523b<WeakReference<g>> f2536c;

    /* renamed from: d */
    private static final Object f2537d;
    private static int sDefaultNightMode;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C7523b $r0 = new C7523b();
        f2536c = $r0;
        Object $r1 = new Object();
        f2537d = $r1;
    }

    AppCompatDelegate() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m37804a(androidx.appcompat.app.AppCompatDelegate r10) {
        /*
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.f2537d
            monitor-enter(r0)
            g.e.b<java.lang.ref.WeakReference<androidx.appcompat.app.g>> r1 = androidx.appcompat.app.AppCompatDelegate.f2536c     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L29
        L9:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L27
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L29
            r6 = r4
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6     // Catch: java.lang.Throwable -> L29
            r5 = r6
            java.lang.Object r4 = r5.get()     // Catch: java.lang.Throwable -> L29
            r8 = r4
            androidx.appcompat.app.AppCompatDelegate r8 = (androidx.appcompat.app.AppCompatDelegate) r8     // Catch: java.lang.Throwable -> L29
            r7 = r8
            if (r7 == r10) goto L23
            if (r7 != 0) goto L9
        L23:
            r2.remove()     // Catch: java.lang.Throwable -> L29
            goto L9
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            goto L2c
        L2c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegate.m37804a(androidx.appcompat.app.AppCompatDelegate):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AppCompatDelegate create(Activity activity, AppCompatCallback appCompatCallback) {
        LayoutInflater$Factory2C0938h r3 = new LayoutInflater$Factory2C0938h(activity, appCompatCallback);
        AppCompatDelegate r4 = (AppCompatDelegate) r3;
        return r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AppCompatDelegate create(Dialog dialog, AppCompatCallback appCompatCallback) {
        LayoutInflater$Factory2C0938h r3 = new LayoutInflater$Factory2C0938h(dialog, appCompatCallback);
        AppCompatDelegate r4 = (AppCompatDelegate) r3;
        return r4;
    }

    /* renamed from: f */
    public static void m37802f(boolean z) {
        C1168w0.m36907b(z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static int getDefaultNightMode() {
        int i0 = sDefaultNightMode;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static void onCreate(AppCompatDelegate appCompatDelegate) {
        Object $r0 = f2537d;
        synchronized ($r0) {
            m37804a(appCompatDelegate);
            C7523b $r1 = f2536c;
            WeakReference $r2 = new WeakReference(appCompatDelegate);
            $r1.add($r2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static void setTitle(AppCompatDelegate appCompatDelegate) {
        Object $r0 = f2537d;
        synchronized ($r0) {
            m37804a(appCompatDelegate);
        }
    }

    /* renamed from: a */
    public abstract AbstractC7485b m37803a(AbstractC7485b.InterfaceC7486a interfaceC7486a);

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    public int compare() {
        return -100;
    }

    public void create(Context context) {
    }

    public abstract View findViewById(int i);

    public abstract C0929b.InterfaceC0931b getDrawerToggleDelegate();

    public abstract MenuInflater getMenuInflater();

    public abstract AbstractC0925a getSupportActionBar();

    public abstract void invalidateOptionsMenu();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled();

    public abstract void setSupportActionBar(Toolbar toolbar);

    public abstract void setTitle();

    public void setTitle(int i) {
    }

    public abstract void setTitle(CharSequence charSequence);

    public Context wrap(Context context) {
        create(context);
        return context;
    }
}
