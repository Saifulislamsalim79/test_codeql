package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2832e;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C2766f;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.i */
/* loaded from: classes2.dex */
public abstract class AbstractC2880i<T extends IInterface> extends AbstractC2854c<T> implements C2730a.InterfaceC2739f {

    /* renamed from: y */
    private final Set<Scope> f8009y;

    /* renamed from: z */
    private final Account f8010z;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public AbstractC2880i(Context context, Looper looper, int i, C2867e c2867e, AbstractC2743d.a aVar, AbstractC2743d.b bVar) {
        this(context, looper, i, c2867e, (C2766f) aVar, (com.google.android.gms.common.api.internal.l) bVar);
    }

    /* renamed from: j0 */
    private final Set<Scope> m31730j0(Set<Scope> set) {
        m31731i0(set);
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: B */
    protected final Set<Scope> mo31733B() {
        return this.f8009y;
    }

    @Override // com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: a */
    public Set<Scope> mo31732a() {
        return mo15467n() ? this.f8009y : Collections.emptySet();
    }

    /* renamed from: i0 */
    protected Set<Scope> m31731i0(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: t */
    public final Account mo31729t() {
        return this.f8010z;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: v */
    protected final Executor mo31728v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC2880i(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C2867e r13, com.google.android.gms.common.api.internal.C2766f r14, com.google.android.gms.common.api.internal.l r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.AbstractC2883j.m31724b(r10)
            com.google.android.gms.common.e r4 = com.google.android.gms.common.C2832e.m31864o()
            com.google.android.gms.common.internal.s.j(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.f r7 = (com.google.android.gms.common.api.internal.C2766f) r7
            com.google.android.gms.common.internal.s.j(r15)
            r8 = r15
            com.google.android.gms.common.api.internal.l r8 = (com.google.android.gms.common.api.internal.l) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC2880i.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.e, com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.internal.l):void");
    }

    protected AbstractC2880i(Context context, Looper looper, AbstractC2883j abstractC2883j, C2832e c2832e, int i, C2867e c2867e, C2766f c2766f, com.google.android.gms.common.api.internal.l lVar) {
        super(context, looper, abstractC2883j, c2832e, i, c2766f == null ? null : new C2887k0(c2766f), lVar == null ? null : new C2891l0(lVar), c2867e.m31756h());
        this.f8010z = c2867e.m31763a();
        Set<Scope> m31761c = c2867e.m31761c();
        m31730j0(m31761c);
        this.f8009y = m31761c;
    }
}
