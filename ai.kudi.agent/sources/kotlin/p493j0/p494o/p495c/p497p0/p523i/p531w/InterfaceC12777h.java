package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import java.util.Collection;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
/* compiled from: MemberScope.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.h */
/* loaded from: classes3.dex */
public interface InterfaceC12777h extends InterfaceC12783k {

    /* renamed from: a */
    public static final C12778a f28667a = C12778a.f28668a;

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.h$a */
    /* loaded from: classes3.dex */
    public static final class C12778a {

        /* renamed from: a */
        static final /* synthetic */ C12778a f28668a = new C12778a();

        /* renamed from: b */
        private static final InterfaceC11767l<C12614f, Boolean> f28669b = C12779a.f28670c;

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.i.w.h$a$a */
        /* loaded from: classes3.dex */
        static final class C12779a extends AbstractC11802m implements InterfaceC11767l<C12614f, Boolean> {

            /* renamed from: c */
            public static final C12779a f28670c = new C12779a();

            C12779a() {
                super(1);
            }

            /* renamed from: a */
            public final boolean m6776a(C12614f c12614f) {
                l.f(c12614f, "it");
                return true;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            public /* bridge */ /* synthetic */ Boolean invoke(C12614f c12614f) {
                m6776a(c12614f);
                return Boolean.TRUE;
            }
        }

        private C12778a() {
        }

        /* renamed from: a */
        public final InterfaceC11767l<C12614f, Boolean> m6777a() {
            return f28669b;
        }
    }

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.h$b */
    /* loaded from: classes3.dex */
    public static final class C12780b extends AbstractC12781i {

        /* renamed from: b */
        public static final C12780b f28671b = new C12780b();

        private C12780b() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
        /* renamed from: b */
        public Set<C12614f> mo5116b() {
            Set<C12614f> m3831b;
            m3831b = C13741y0.m3831b();
            return m3831b;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
        /* renamed from: d */
        public Set<C12614f> mo5114d() {
            Set<C12614f> m3831b;
            m3831b = C13741y0.m3831b();
            return m3831b;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
        /* renamed from: e */
        public Set<C12614f> mo5113e() {
            Set<C12614f> m3831b;
            m3831b = C13741y0.m3831b();
            return m3831b;
        }
    }

    /* renamed from: a */
    Collection<? extends InterfaceC13543t0> mo5117a(C12614f c12614f, InterfaceC12112b interfaceC12112b);

    /* renamed from: b */
    Set<C12614f> mo5116b();

    /* renamed from: c */
    Collection<? extends InterfaceC13518o0> mo5115c(C12614f c12614f, InterfaceC12112b interfaceC12112b);

    /* renamed from: d */
    Set<C12614f> mo5114d();

    /* renamed from: e */
    Set<C12614f> mo5113e();
}
