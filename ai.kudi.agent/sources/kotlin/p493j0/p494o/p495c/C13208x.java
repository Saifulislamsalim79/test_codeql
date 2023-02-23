package kotlin.p493j0.p494o.p495c;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.AbstractC13198w;
import kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12497g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.C12872j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
/* compiled from: KPropertyImpl.kt */
/* renamed from: kotlin.j0.o.c.x */
/* loaded from: classes3.dex */
public final class C13208x {

    /* compiled from: KPropertyImpl.kt */
    /* renamed from: kotlin.j0.o.c.x$a */
    /* loaded from: classes3.dex */
    public static final class C13209a extends AbstractC11802m implements InterfaceC11756a<Boolean> {

        /* renamed from: c */
        final /* synthetic */ AbstractC13198w.AbstractC13199a f29351c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13209a(AbstractC13198w.AbstractC13199a abstractC13199a) {
            super(0);
            this.f29351c = abstractC13199a;
        }

        /* renamed from: a */
        public final boolean m5638a() {
            return this.f29351c.mo5655n().mo5650h().mo4956y().mo5304Q(C11972m0.m10034h());
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m5638a());
        }
    }

    /* compiled from: KPropertyImpl.kt */
    /* renamed from: kotlin.j0.o.c.x$b */
    /* loaded from: classes3.dex */
    public static final class C13210b extends AbstractC11802m implements InterfaceC11756a<Boolean> {

        /* renamed from: c */
        final /* synthetic */ AbstractC13198w.AbstractC13199a f29352c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13210b(AbstractC13198w.AbstractC13199a abstractC13199a) {
            super(0);
            this.f29352c = abstractC13199a;
        }

        /* renamed from: a */
        public final boolean m5637a() {
            return !C12974c1.m6290l(this.f29352c.mo5655n().mo5650h().mo5121c());
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m5637a());
        }
    }

    /* compiled from: KPropertyImpl.kt */
    /* renamed from: kotlin.j0.o.c.x$c */
    /* loaded from: classes3.dex */
    public static final class C13211c extends AbstractC11802m implements InterfaceC11767l<Field, AbstractC11992e<? extends Field>> {

        /* renamed from: c */
        final /* synthetic */ AbstractC13198w.AbstractC13199a f29353c;

        /* renamed from: d */
        final /* synthetic */ boolean f29354d;

        /* renamed from: e */
        final /* synthetic */ C13210b f29355e;

        /* renamed from: f */
        final /* synthetic */ C13209a f29356f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13211c(AbstractC13198w.AbstractC13199a abstractC13199a, boolean z, C13210b c13210b, C13209a c13209a) {
            super(1);
            this.f29353c = abstractC13199a;
            this.f29354d = z;
            this.f29355e = c13210b;
            this.f29356f = c13209a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final AbstractC11992e<Field> invoke(Field field) {
            l.f(field, "field");
            return (C13208x.m5639e(this.f29353c.mo5655n().mo5650h()) || !Modifier.isStatic(field.getModifiers())) ? this.f29354d ? this.f29353c.mo5656l() ? new AbstractC11992e.AbstractC11998f.C11999a(field, C13208x.m5640d(this.f29353c)) : new AbstractC11992e.AbstractC11998f.C12001c(field) : this.f29353c.mo5656l() ? new AbstractC11992e.AbstractC12004g.C12005a(field, this.f29355e.m5637a(), C13208x.m5640d(this.f29353c)) : new AbstractC11992e.AbstractC12004g.C12007c(field, this.f29355e.m5637a()) : this.f29356f.m5638a() ? this.f29354d ? this.f29353c.mo5656l() ? new AbstractC11992e.AbstractC11998f.C12000b(field) : new AbstractC11992e.AbstractC11998f.C12002d(field) : this.f29353c.mo5656l() ? new AbstractC11992e.AbstractC12004g.C12006b(field, this.f29355e.m5637a()) : new AbstractC11992e.AbstractC12004g.C12008d(field, this.f29355e.m5637a()) : this.f29354d ? new AbstractC11992e.AbstractC11998f.C12003e(field) : new AbstractC11992e.AbstractC12004g.C12009e(field, this.f29355e.m5637a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0127  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d<?> m5641c(kotlin.p493j0.p494o.p495c.AbstractC13198w.AbstractC13199a<?, ?> r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.C13208x.m5641c(kotlin.j0.o.c.w$a, boolean):kotlin.j0.o.c.o0.d");
    }

    /* renamed from: d */
    public static final Object m5640d(AbstractC13198w.AbstractC13199a<?, ?> abstractC13199a) {
        l.f(abstractC13199a, "$this$boundReceiver");
        return abstractC13199a.mo5655n().m5663n();
    }

    /* renamed from: e */
    public static final boolean m5639e(InterfaceC13518o0 interfaceC13518o0) {
        InterfaceC13513m mo4687d = interfaceC13518o0.mo4687d();
        l.e(mo4687d, "containingDeclaration");
        if (C12673d.m7011x(mo4687d)) {
            InterfaceC13513m mo4687d2 = mo4687d.mo4687d();
            return !(C12673d.m7045C(mo4687d2) || C12673d.m7015t(mo4687d2)) || ((interfaceC13518o0 instanceof C12872j) && C12497g.m8635f(((C12872j) interfaceC13518o0).mo6548K()));
        }
        return false;
    }
}
