package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: ResourceRecycler.java */
/* renamed from: com.bumptech.glide.load.engine.x */
/* loaded from: classes2.dex */
class C2090x {

    /* renamed from: a */
    private boolean f6358a;

    /* renamed from: b */
    private final Handler f6359b = new Handler(Looper.getMainLooper(), new C2091a());

    /* compiled from: ResourceRecycler.java */
    /* renamed from: com.bumptech.glide.load.engine.x$a */
    /* loaded from: classes2.dex */
    private static final class C2091a implements Handler.Callback {
        C2091a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((InterfaceC2087u) message.obj).mo33303b();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m33752a(InterfaceC2087u<?> interfaceC2087u, boolean z) {
        if (!this.f6358a && !z) {
            this.f6358a = true;
            interfaceC2087u.mo33303b();
            this.f6358a = false;
        }
        this.f6359b.obtainMessage(1, interfaceC2087u).sendToTarget();
    }
}
