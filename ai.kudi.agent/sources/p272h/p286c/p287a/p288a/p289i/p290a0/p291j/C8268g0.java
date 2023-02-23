package p272h.p286c.p287a.p288a.p289i.p290a0.p291j;

import p272h.p286c.p287a.p288a.p289i.AbstractC8342j;
import p272h.p286c.p287a.p288a.p289i.AbstractC8352p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_PersistedEvent.java */
/* renamed from: h.c.a.a.i.a0.j.g0 */
/* loaded from: classes2.dex */
public final class C8268g0 extends AbstractC8290p0 {

    /* renamed from: a */
    private final long f19867a;

    /* renamed from: b */
    private final AbstractC8352p f19868b;

    /* renamed from: c */
    private final AbstractC8342j f19869c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8268g0(long j, AbstractC8352p abstractC8352p, AbstractC8342j abstractC8342j) {
        this.f19867a = j;
        if (abstractC8352p != null) {
            this.f19868b = abstractC8352p;
            if (abstractC8342j != null) {
                this.f19869c = abstractC8342j;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8290p0
    /* renamed from: b */
    public AbstractC8342j mo16390b() {
        return this.f19869c;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8290p0
    /* renamed from: c */
    public long mo16389c() {
        return this.f19867a;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8290p0
    /* renamed from: d */
    public AbstractC8352p mo16388d() {
        return this.f19868b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8290p0) {
            AbstractC8290p0 abstractC8290p0 = (AbstractC8290p0) obj;
            return this.f19867a == abstractC8290p0.mo16389c() && this.f19868b.equals(abstractC8290p0.mo16388d()) && this.f19869c.equals(abstractC8290p0.mo16390b());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f19867a;
        return this.f19869c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f19868b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f19867a + ", transportContext=" + this.f19868b + ", event=" + this.f19869c + "}";
    }
}
