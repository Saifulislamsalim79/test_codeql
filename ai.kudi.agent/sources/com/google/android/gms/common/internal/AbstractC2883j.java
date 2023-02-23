package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.j */
/* loaded from: classes2.dex */
public abstract class AbstractC2883j {

    /* renamed from: a */
    private static int f8014a = 4225;

    /* renamed from: b */
    private static final Object f8015b = new Object();

    /* renamed from: c */
    private static C2931w1 f8016c = null;

    /* renamed from: d */
    static HandlerThread f8017d = null;

    /* renamed from: e */
    private static boolean f8018e = false;

    /* renamed from: a */
    public static int m31725a() {
        return f8014a;
    }

    /* renamed from: b */
    public static AbstractC2883j m31724b(Context context) {
        Looper mainLooper;
        synchronized (f8015b) {
            if (f8016c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f8018e) {
                    mainLooper = m31723c().getLooper();
                } else {
                    mainLooper = context.getMainLooper();
                }
                f8016c = new C2931w1(applicationContext, mainLooper);
            }
        }
        return f8016c;
    }

    /* renamed from: c */
    public static HandlerThread m31723c() {
        synchronized (f8015b) {
            HandlerThread handlerThread = f8017d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f8017d = handlerThread2;
            handlerThread2.start();
            return f8017d;
        }
    }

    /* renamed from: d */
    protected abstract void mo31610d(C2915s1 c2915s1, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void m31722e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        mo31610d(new C2915s1(str, str2, i, z), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo31609f(C2915s1 c2915s1, ServiceConnection serviceConnection, String str, Executor executor);
}
