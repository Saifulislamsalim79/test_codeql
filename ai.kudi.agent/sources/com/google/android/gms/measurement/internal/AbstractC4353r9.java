package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.r9 */
/* loaded from: classes2.dex */
public abstract class AbstractC4353r9 extends C4341q9 {

    /* renamed from: c */
    private boolean f10647c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4353r9(C4168ba c4168ba) {
        super(c4168ba);
        this.f10625b.m28347q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m27986i() {
        if (!m27984k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void m27985j() {
        if (!this.f10647c) {
            mo27835l();
            this.f10625b.m28352l();
            this.f10647c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean m27984k() {
        return this.f10647c;
    }

    /* renamed from: l */
    protected abstract boolean mo27835l();
}
