package com.google.firebase.inappmessaging.display.internal;

import android.os.CountDownTimer;
/* compiled from: RenewableTimer.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.n */
/* loaded from: classes2.dex */
public class C6066n {

    /* renamed from: a */
    private CountDownTimer f14817a;

    /* compiled from: RenewableTimer.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.n$a */
    /* loaded from: classes2.dex */
    class CountDownTimerC6067a extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6068b f14818a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CountDownTimerC6067a(C6066n c6066n, long j, long j2, InterfaceC6068b interfaceC6068b) {
            super(j, j2);
            this.f14818a = interfaceC6068b;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f14818a.mo22813a();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* compiled from: RenewableTimer.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.n$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC6068b {
        /* renamed from: a */
        void mo22813a();
    }

    /* renamed from: a */
    public void m22815a() {
        CountDownTimer countDownTimer = this.f14817a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f14817a = null;
        }
    }

    /* renamed from: b */
    public void m22814b(InterfaceC6068b interfaceC6068b, long j, long j2) {
        this.f14817a = new CountDownTimerC6067a(this, j, j2, interfaceC6068b).start();
    }
}
