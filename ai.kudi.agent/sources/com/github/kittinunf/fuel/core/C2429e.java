package com.github.kittinunf.fuel.core;

import java.util.concurrent.Executor;
/* compiled from: Environment.kt */
/* renamed from: com.github.kittinunf.fuel.core.e */
/* loaded from: classes2.dex */
public final class C2429e implements InterfaceC2446j {

    /* renamed from: a */
    private Executor f6972a = ExecutorC2430a.f6973c;

    /* compiled from: Environment.kt */
    /* renamed from: com.github.kittinunf.fuel.core.e$a */
    /* loaded from: classes2.dex */
    static final class ExecutorC2430a implements Executor {

        /* renamed from: c */
        public static final ExecutorC2430a f6973c = new ExecutorC2430a();

        ExecutorC2430a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // com.github.kittinunf.fuel.core.InterfaceC2446j
    /* renamed from: a */
    public Executor mo32874a() {
        return this.f6972a;
    }
}
