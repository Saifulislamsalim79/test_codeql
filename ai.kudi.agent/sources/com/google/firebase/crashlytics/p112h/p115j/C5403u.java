package com.google.firebase.crashlytics.p112h.p115j;

import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.InterfaceC5331d;
import com.google.firebase.crashlytics.p112h.p122p.InterfaceC5587e;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* renamed from: com.google.firebase.crashlytics.h.j.u */
/* loaded from: classes2.dex */
class C5403u implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final InterfaceC5404a f13342a;

    /* renamed from: b */
    private final InterfaceC5587e f13343b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f13344c;

    /* renamed from: d */
    private final InterfaceC5331d f13345d;

    /* renamed from: e */
    private final AtomicBoolean f13346e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.u$a */
    /* loaded from: classes2.dex */
    interface InterfaceC5404a {
        /* renamed from: a */
        void mo24848a(InterfaceC5587e interfaceC5587e, Thread thread, Throwable th);
    }

    public C5403u(InterfaceC5404a interfaceC5404a, InterfaceC5587e interfaceC5587e, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC5331d interfaceC5331d) {
        this.f13342a = interfaceC5404a;
        this.f13343b = interfaceC5587e;
        this.f13344c = uncaughtExceptionHandler;
        this.f13345d = interfaceC5331d;
    }

    /* renamed from: b */
    private boolean m24849b(Thread thread, Throwable th) {
        if (thread == null) {
            C5335f.m25102f().m25104d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            C5335f.m25102f().m25104d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.f13345d.mo25113c()) {
            C5335f.m25102f().m25106b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m24850a() {
        return this.f13346e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.firebase.crashlytics.h.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.firebase.crashlytics.h.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ?? r0 = "Completed exception processing. Invoking default exception handler.";
        this.f13346e.set(true);
        try {
            try {
                if (m24849b(thread, th)) {
                    this.f13342a.mo24848a(this.f13343b, thread, th);
                } else {
                    C5335f.m25102f().m25106b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e) {
                C5335f.m25102f().m25103e("An error occurred in the uncaught exception handler", e);
            }
        } finally {
            C5335f.m25102f().m25106b(r0);
            this.f13344c.uncaughtException(thread, th);
            this.f13346e.set(false);
        }
    }
}
