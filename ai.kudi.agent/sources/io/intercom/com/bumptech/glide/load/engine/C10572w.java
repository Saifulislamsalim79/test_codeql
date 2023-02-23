package io.intercom.com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.intercom.com.bumptech.glide.p416r.C10893i;
/* compiled from: ResourceRecycler.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.w */
/* loaded from: classes3.dex */
class C10572w {

    /* renamed from: a */
    private boolean f24333a;

    /* renamed from: b */
    private final Handler f24334b = new Handler(Looper.getMainLooper(), new C10573a());

    /* compiled from: ResourceRecycler.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.w$a */
    /* loaded from: classes3.dex */
    private static final class C10573a implements Handler.Callback {
        C10573a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((InterfaceC10569t) message.obj).mo12303b();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12720a(InterfaceC10569t<?> interfaceC10569t) {
        C10893i.m12011b();
        if (this.f24333a) {
            this.f24334b.obtainMessage(1, interfaceC10569t).sendToTarget();
            return;
        }
        this.f24333a = true;
        interfaceC10569t.mo12303b();
        this.f24333a = false;
    }
}
