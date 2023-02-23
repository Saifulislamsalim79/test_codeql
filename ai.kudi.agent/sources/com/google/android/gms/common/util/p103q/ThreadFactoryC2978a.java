package com.google.android.gms.common.util.p103q;

import com.google.android.gms.common.internal.s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.util.q.a */
/* loaded from: classes2.dex */
public class ThreadFactoryC2978a implements ThreadFactory {

    /* renamed from: c */
    private final String f8152c;

    /* renamed from: d */
    private final ThreadFactory f8153d = Executors.defaultThreadFactory();

    public ThreadFactoryC2978a(String str) {
        s.k(str, "Name must not be null");
        this.f8152c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f8153d.newThread(new RunnableC2979b(runnable, 0));
        newThread.setName(this.f8152c);
        return newThread;
    }
}
