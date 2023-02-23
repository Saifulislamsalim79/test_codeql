package com.google.android.play.core.internal;

import com.google.android.play.core.tasks.C5021m;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.internal.d */
/* loaded from: classes2.dex */
public final class C4967d extends AbstractRunnableC4960b {

    /* renamed from: d */
    final /* synthetic */ AbstractRunnableC4960b f12625d;

    /* renamed from: e */
    final /* synthetic */ C4983l f12626e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4967d(C4983l c4983l, C5021m c5021m, AbstractRunnableC4960b abstractRunnableC4960b) {
        super(c5021m);
        this.f12626e = c4983l;
        this.f12625d = abstractRunnableC4960b;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC4960b
    /* renamed from: a */
    public final void mo15013a() {
        C4983l.m25935e(this.f12626e, this.f12625d);
    }
}
