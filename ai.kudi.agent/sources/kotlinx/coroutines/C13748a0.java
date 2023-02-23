package kotlinx.coroutines;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: CancellableContinuationImpl.kt */
/* renamed from: kotlinx.coroutines.a0 */
/* loaded from: classes3.dex */
final class C13748a0 {

    /* renamed from: a */
    public final Object f30185a;

    /* renamed from: b */
    public final AbstractC13920k f30186b;

    /* renamed from: c */
    public final InterfaceC11767l<Throwable, C13666w> f30187c;

    /* renamed from: d */
    public final Object f30188d;

    /* renamed from: e */
    public final Throwable f30189e;

    /* JADX WARN: Multi-variable type inference failed */
    public C13748a0(Object obj, AbstractC13920k abstractC13920k, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l, Object obj2, Throwable th) {
        this.f30185a = obj;
        this.f30186b = abstractC13920k;
        this.f30187c = interfaceC11767l;
        this.f30188d = obj2;
        this.f30189e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C13748a0 m3764b(C13748a0 c13748a0, Object obj, AbstractC13920k abstractC13920k, InterfaceC11767l interfaceC11767l, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = c13748a0.f30185a;
        }
        if ((i & 2) != 0) {
            abstractC13920k = c13748a0.f30186b;
        }
        AbstractC13920k abstractC13920k2 = abstractC13920k;
        InterfaceC11767l<Throwable, C13666w> interfaceC11767l2 = interfaceC11767l;
        if ((i & 4) != 0) {
            interfaceC11767l2 = c13748a0.f30187c;
        }
        InterfaceC11767l interfaceC11767l3 = interfaceC11767l2;
        if ((i & 8) != 0) {
            obj2 = c13748a0.f30188d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = c13748a0.f30189e;
        }
        return c13748a0.m3765a(obj, abstractC13920k2, interfaceC11767l3, obj4, th);
    }

    /* renamed from: a */
    public final C13748a0 m3765a(Object obj, AbstractC13920k abstractC13920k, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l, Object obj2, Throwable th) {
        return new C13748a0(obj, abstractC13920k, interfaceC11767l, obj2, th);
    }

    /* renamed from: c */
    public final boolean m3763c() {
        return this.f30189e != null;
    }

    /* renamed from: d */
    public final void m3762d(C13935n<?> c13935n, Throwable th) {
        AbstractC13920k abstractC13920k = this.f30186b;
        if (abstractC13920k != null) {
            c13935n.m3370q(abstractC13920k, th);
        }
        InterfaceC11767l<Throwable, C13666w> interfaceC11767l = this.f30187c;
        if (interfaceC11767l == null) {
            return;
        }
        c13935n.m3369r(interfaceC11767l, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13748a0) {
            C13748a0 c13748a0 = (C13748a0) obj;
            return kotlin.e0.d.l.b(this.f30185a, c13748a0.f30185a) && kotlin.e0.d.l.b(this.f30186b, c13748a0.f30186b) && kotlin.e0.d.l.b(this.f30187c, c13748a0.f30187c) && kotlin.e0.d.l.b(this.f30188d, c13748a0.f30188d) && kotlin.e0.d.l.b(this.f30189e, c13748a0.f30189e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f30185a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC13920k abstractC13920k = this.f30186b;
        int hashCode2 = (hashCode + (abstractC13920k == null ? 0 : abstractC13920k.hashCode())) * 31;
        InterfaceC11767l<Throwable, C13666w> interfaceC11767l = this.f30187c;
        int hashCode3 = (hashCode2 + (interfaceC11767l == null ? 0 : interfaceC11767l.hashCode())) * 31;
        Object obj2 = this.f30188d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f30189e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f30185a + ", cancelHandler=" + this.f30186b + ", onCancellation=" + this.f30187c + ", idempotentResume=" + this.f30188d + ", cancelCause=" + this.f30189e + ')';
    }

    public /* synthetic */ C13748a0(Object obj, AbstractC13920k abstractC13920k, InterfaceC11767l interfaceC11767l, Object obj2, Throwable th, int i, kotlin.e0.d.g gVar) {
        this(obj, (i & 2) != 0 ? null : abstractC13920k, (i & 4) != 0 ? null : interfaceC11767l, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
