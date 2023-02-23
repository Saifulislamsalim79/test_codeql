package com.google.android.play.core.assetpacks;
/* renamed from: com.google.android.play.core.assetpacks.c2 */
/* loaded from: classes2.dex */
final /* synthetic */ class RunnableC4847c2 implements Runnable {

    /* renamed from: c */
    private final C4840b0 f12272c;

    private RunnableC4847c2(C4840b0 c4840b0) {
        this.f12272c = c4840b0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Runnable m26129a(C4840b0 c4840b0) {
        return new RunnableC4847c2(c4840b0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12272c.m26145p();
    }
}
