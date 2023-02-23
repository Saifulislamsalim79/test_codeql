package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.p104firebaseauthapi.HandlerC3498s9;
import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.x */
/* loaded from: classes2.dex */
public final class ExecutorC5251x implements Executor {

    /* renamed from: d */
    private static final ExecutorC5251x f13060d = new ExecutorC5251x();

    /* renamed from: c */
    private final Handler f13061c = new HandlerC3498s9(Looper.getMainLooper());

    private ExecutorC5251x() {
    }

    /* renamed from: a */
    public static ExecutorC5251x m25264a() {
        return f13060d;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13061c.post(runnable);
    }
}
