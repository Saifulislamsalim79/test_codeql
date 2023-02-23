package com.google.android.play.core.internal;

import com.google.android.play.core.tasks.C5021m;
/* renamed from: com.google.android.play.core.internal.b */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC4960b implements Runnable {

    /* renamed from: c */
    private final C5021m<?> f12623c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC4960b() {
        this.f12623c = null;
    }

    public AbstractRunnableC4960b(C5021m<?> c5021m) {
        this.f12623c = c5021m;
    }

    /* renamed from: a */
    protected abstract void mo15013a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5021m<?> m25950b() {
        return this.f12623c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo15013a();
        } catch (Exception e) {
            C5021m<?> c5021m = this.f12623c;
            if (c5021m != null) {
                c5021m.m25856d(e);
            }
        }
    }
}
