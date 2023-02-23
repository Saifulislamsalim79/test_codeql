package com.google.firebase.database.p131s;

import java.lang.Thread;
/* compiled from: ThreadInitializer.java */
/* renamed from: com.google.firebase.database.s.x */
/* loaded from: classes2.dex */
public interface InterfaceC5890x {

    /* renamed from: a */
    public static final InterfaceC5890x f14478a = new C5891a();

    /* compiled from: ThreadInitializer.java */
    /* renamed from: com.google.firebase.database.s.x$a */
    /* loaded from: classes2.dex */
    class C5891a implements InterfaceC5890x {
        C5891a() {
        }

        @Override // com.google.firebase.database.p131s.InterfaceC5890x
        /* renamed from: a */
        public void mo23386a(Thread thread, String str) {
            thread.setName(str);
        }

        @Override // com.google.firebase.database.p131s.InterfaceC5890x
        /* renamed from: b */
        public void mo23385b(Thread thread, boolean z) {
            thread.setDaemon(z);
        }

        @Override // com.google.firebase.database.p131s.InterfaceC5890x
        /* renamed from: c */
        public void mo23384c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    /* renamed from: a */
    void mo23386a(Thread thread, String str);

    /* renamed from: b */
    void mo23385b(Thread thread, boolean z);

    /* renamed from: c */
    void mo23384c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler);
}
