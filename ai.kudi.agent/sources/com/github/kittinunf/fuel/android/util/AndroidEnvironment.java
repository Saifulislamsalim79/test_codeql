package com.github.kittinunf.fuel.android.util;

import android.os.Handler;
import android.os.Looper;
import com.github.kittinunf.fuel.core.InterfaceC2446j;
import java.util.concurrent.Executor;
import kotlin.Metadata;
/* compiled from: AndroidEnvironment.kt */
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m10421d2 = {"Lcom/github/kittinunf/fuel/android/util/AndroidEnvironment;", "Lcom/github/kittinunf/fuel/core/j;", "Ljava/util/concurrent/Executor;", "callbackExecutor", "Ljava/util/concurrent/Executor;", "getCallbackExecutor", "()Ljava/util/concurrent/Executor;", "setCallbackExecutor", "(Ljava/util/concurrent/Executor;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "<init>", "()V", "fuel-android_release"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class AndroidEnvironment implements InterfaceC2446j {

    /* renamed from: a */
    private final Handler f6965a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private Executor f6966b = new ExecutorC2421a();

    /* compiled from: AndroidEnvironment.kt */
    /* renamed from: com.github.kittinunf.fuel.android.util.AndroidEnvironment$a */
    /* loaded from: classes2.dex */
    static final class ExecutorC2421a implements Executor {
        ExecutorC2421a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AndroidEnvironment.this.m32904b().post(runnable);
        }
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2446j
    /* renamed from: a */
    public Executor mo32874a() {
        return this.f6966b;
    }

    /* renamed from: b */
    public final Handler m32904b() {
        return this.f6965a;
    }
}
