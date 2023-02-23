package kotlin.p548k0;

import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _SequencesJvm.kt */
/* renamed from: kotlin.k0.m */
/* loaded from: classes3.dex */
public class C13240m extends C13234l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: _SequencesJvm.kt */
    /* renamed from: kotlin.k0.m$a */
    /* loaded from: classes3.dex */
    public static final class C13241a extends AbstractC11802m implements InterfaceC11767l<Object, Boolean> {

        /* renamed from: c */
        final /* synthetic */ Class f29399c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13241a(Class cls) {
            super(1);
            this.f29399c = cls;
        }

        /* renamed from: a */
        public final boolean m5578a(Object obj) {
            return this.f29399c.isInstance(obj);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.valueOf(m5578a(obj));
        }
    }

    /* renamed from: i */
    public static <R> InterfaceC13230h<R> m5579i(InterfaceC13230h<?> interfaceC13230h, Class<R> cls) {
        InterfaceC13230h<R> m5574m;
        l.f(interfaceC13230h, "$this$filterIsInstance");
        l.f(cls, "klass");
        m5574m = C13242n.m5574m(interfaceC13230h, new C13241a(cls));
        if (m5574m != null) {
            return m5574m;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
    }
}
