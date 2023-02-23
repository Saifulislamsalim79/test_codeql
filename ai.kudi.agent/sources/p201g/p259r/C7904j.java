package p201g.p259r;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.e0.d.l;
/* compiled from: CombinedLoadStates.kt */
/* renamed from: g.r.j */
/* loaded from: classes2.dex */
public final class C7904j {

    /* renamed from: a */
    private final AbstractC8061y f18944a;

    /* renamed from: b */
    private final AbstractC8061y f18945b;

    /* renamed from: c */
    private final AbstractC8061y f18946c;

    /* renamed from: d */
    private final C7825a0 f18947d;

    /* renamed from: e */
    private final C7825a0 f18948e;

    public C7904j(AbstractC8061y abstractC8061y, AbstractC8061y abstractC8061y2, AbstractC8061y abstractC8061y3, C7825a0 c7825a0, C7825a0 c7825a02) {
        l.f(abstractC8061y, "refresh");
        l.f(abstractC8061y2, "prepend");
        l.f(abstractC8061y3, "append");
        l.f(c7825a0, TransactionField.TRANSACTION_CHANNEL);
        this.f18944a = abstractC8061y;
        this.f18945b = abstractC8061y2;
        this.f18946c = abstractC8061y3;
        this.f18947d = c7825a0;
        this.f18948e = c7825a02;
    }

    /* renamed from: a */
    public final AbstractC8061y m17083a() {
        return this.f18946c;
    }

    /* renamed from: b */
    public final AbstractC8061y m17082b() {
        return this.f18945b;
    }

    /* renamed from: c */
    public final C7825a0 m17081c() {
        return this.f18947d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (l.b(C7904j.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                C7904j c7904j = (C7904j) obj;
                return l.b(this.f18944a, c7904j.f18944a) && l.b(this.f18945b, c7904j.f18945b) && l.b(this.f18946c, c7904j.f18946c) && l.b(this.f18947d, c7904j.f18947d) && l.b(this.f18948e, c7904j.f18948e);
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((this.f18944a.hashCode() * 31) + this.f18945b.hashCode()) * 31) + this.f18946c.hashCode()) * 31) + this.f18947d.hashCode()) * 31;
        C7825a0 c7825a0 = this.f18948e;
        return hashCode + (c7825a0 == null ? 0 : c7825a0.hashCode());
    }

    public String toString() {
        return "CombinedLoadStates(refresh=" + this.f18944a + ", prepend=" + this.f18945b + ", append=" + this.f18946c + ", source=" + this.f18947d + ", mediator=" + this.f18948e + ')';
    }
}
