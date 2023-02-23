package com.google.firebase.messaging;

import com.google.android.gms.common.util.p103q.ThreadFactoryC2978a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p272h.p286c.p287a.p300b.p307d.p313f.C8440i;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.n */
/* loaded from: classes2.dex */
class C6520n {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ScheduledExecutorService m21727a() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC2978a("Firebase-Messaging-Init"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ExecutorService m21726b() {
        C8440i.m16102a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2978a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ExecutorService m21725c() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC2978a("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static ExecutorService m21724d() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC2978a("Firebase-Messaging-Task"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static ScheduledExecutorService m21723e() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC2978a("Firebase-Messaging-Topics-Io"));
    }
}
