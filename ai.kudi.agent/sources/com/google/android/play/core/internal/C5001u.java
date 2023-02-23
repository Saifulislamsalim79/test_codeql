package com.google.android.play.core.internal;
/* renamed from: com.google.android.play.core.internal.u */
/* loaded from: classes2.dex */
final class C5001u extends AbstractC4995r {

    /* renamed from: a */
    private final C4999t f12653a = new C4999t();

    @Override // com.google.android.play.core.internal.AbstractC4995r
    /* renamed from: a */
    public final void mo25878a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f12653a.m25882a(th).add(th2);
    }
}
