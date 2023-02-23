package kotlin.p493j0.p494o.p495c;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.AbstractC11890d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12385u;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12433i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.C12470a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12497g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12596e;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12598g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12615g;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.C12826d;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.C12872j;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12845f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13474b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h;
/* compiled from: RuntimeTypeMapper.kt */
/* renamed from: kotlin.j0.o.c.e */
/* loaded from: classes3.dex */
public abstract class AbstractC11900e {

    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: kotlin.j0.o.c.e$a */
    /* loaded from: classes3.dex */
    public static final class C11901a extends AbstractC11900e {

        /* renamed from: a */
        private final Field f26578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11901a(Field field) {
            super(null);
            l.f(field, "field");
            this.f26578a = field;
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11900e
        /* renamed from: a */
        public String mo10184a() {
            StringBuilder sb = new StringBuilder();
            String name = this.f26578a.getName();
            l.e(name, "field.name");
            sb.append(C12385u.m9080a(name));
            sb.append("()");
            Class<?> type = this.f26578a.getType();
            l.e(type, "field.type");
            sb.append(C13474b.m4892b(type));
            return sb.toString();
        }

        /* renamed from: b */
        public final Field m10193b() {
            return this.f26578a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: kotlin.j0.o.c.e$b */
    /* loaded from: classes3.dex */
    public static final class C11902b extends AbstractC11900e {

        /* renamed from: a */
        private final Method f26579a;

        /* renamed from: b */
        private final Method f26580b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11902b(Method method, Method method2) {
            super(null);
            l.f(method, "getterMethod");
            this.f26579a = method;
            this.f26580b = method2;
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11900e
        /* renamed from: a */
        public String mo10184a() {
            String m10049b;
            m10049b = C11966k0.m10049b(this.f26579a);
            return m10049b;
        }

        /* renamed from: b */
        public final Method m10192b() {
            return this.f26579a;
        }

        /* renamed from: c */
        public final Method m10191c() {
            return this.f26580b;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: kotlin.j0.o.c.e$c */
    /* loaded from: classes3.dex */
    public static final class C11903c extends AbstractC11900e {

        /* renamed from: a */
        private final String f26581a;

        /* renamed from: b */
        private final InterfaceC13518o0 f26582b;

        /* renamed from: c */
        private final C12542n f26583c;

        /* renamed from: d */
        private final C12470a.C12478d f26584d;

        /* renamed from: e */
        private final InterfaceC12593c f26585e;

        /* renamed from: f */
        private final C12598g f26586f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11903c(InterfaceC13518o0 interfaceC13518o0, C12542n c12542n, C12470a.C12478d c12478d, InterfaceC12593c interfaceC12593c, C12598g c12598g) {
            super(null);
            String str;
            l.f(interfaceC13518o0, "descriptor");
            l.f(c12542n, "proto");
            l.f(c12478d, "signature");
            l.f(interfaceC12593c, "nameResolver");
            l.f(c12598g, "typeTable");
            this.f26582b = interfaceC13518o0;
            this.f26583c = c12542n;
            this.f26584d = c12478d;
            this.f26585e = interfaceC12593c;
            this.f26586f = c12598g;
            if (c12478d.m8761E()) {
                StringBuilder sb = new StringBuilder();
                InterfaceC12593c interfaceC12593c2 = this.f26585e;
                C12470a.C12475c m8765A = this.f26584d.m8765A();
                l.e(m8765A, "signature.getter");
                sb.append(interfaceC12593c2.getString(m8765A.m8779y()));
                InterfaceC12593c interfaceC12593c3 = this.f26585e;
                C12470a.C12475c m8765A2 = this.f26584d.m8765A();
                l.e(m8765A2, "signature.getter");
                sb.append(interfaceC12593c3.getString(m8765A2.m8780x()));
                str = sb.toString();
            } else {
                AbstractC12491d.C12492a m8637d = C12497g.m8637d(C12497g.f27759a, this.f26583c, this.f26585e, this.f26586f, false, 8, null);
                if (m8637d != null) {
                    String m8647d = m8637d.m8647d();
                    str = C12385u.m9080a(m8647d) + m10189c() + "()" + m8637d.m8646e();
                } else {
                    throw new C11899d0("No field signature for property: " + this.f26582b);
                }
            }
            this.f26581a = str;
        }

        /* renamed from: c */
        private final String m10189c() {
            InterfaceC13513m mo4687d = this.f26582b.mo4687d();
            l.e(mo4687d, "descriptor.containingDeclaration");
            if (l.b(this.f26582b.mo4659i(), C13530t.f29891d) && (mo4687d instanceof C12826d)) {
                C12509c m6666i1 = ((C12826d) mo4687d).m6666i1();
                AbstractC13580h.C13587f<C12509c, Integer> c13587f = C12470a.f27660i;
                l.e(c13587f, "JvmProtoBuf.classModuleName");
                Integer num = (Integer) C12596e.m7430a(m6666i1, c13587f);
                String str = (num == null || (str = this.f26585e.getString(num.intValue())) == null) ? "main" : "main";
                return "$" + C12615g.m7345a(str);
            } else if (l.b(this.f26582b.mo4659i(), C13530t.f29888a) && (mo4687d instanceof InterfaceC13320f0)) {
                InterfaceC13518o0 interfaceC13518o0 = this.f26582b;
                if (interfaceC13518o0 != null) {
                    InterfaceC12845f mo6539m0 = ((C12872j) interfaceC13518o0).mo6539m0();
                    if (mo6539m0 instanceof C12433i) {
                        C12433i c12433i = (C12433i) mo6539m0;
                        if (c12433i.m8922e() != null) {
                            return "$" + c12433i.m8920g().m7353b();
                        }
                        return "";
                    }
                    return "";
                }
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            } else {
                return "";
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11900e
        /* renamed from: a */
        public String mo10184a() {
            return this.f26581a;
        }

        /* renamed from: b */
        public final InterfaceC13518o0 m10190b() {
            return this.f26582b;
        }

        /* renamed from: d */
        public final InterfaceC12593c m10188d() {
            return this.f26585e;
        }

        /* renamed from: e */
        public final C12542n m10187e() {
            return this.f26583c;
        }

        /* renamed from: f */
        public final C12470a.C12478d m10186f() {
            return this.f26584d;
        }

        /* renamed from: g */
        public final C12598g m10185g() {
            return this.f26586f;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: kotlin.j0.o.c.e$d */
    /* loaded from: classes3.dex */
    public static final class C11904d extends AbstractC11900e {

        /* renamed from: a */
        private final AbstractC11890d.C11898e f26587a;

        /* renamed from: b */
        private final AbstractC11890d.C11898e f26588b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11904d(AbstractC11890d.C11898e c11898e, AbstractC11890d.C11898e c11898e2) {
            super(null);
            l.f(c11898e, "getterSignature");
            this.f26587a = c11898e;
            this.f26588b = c11898e2;
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11900e
        /* renamed from: a */
        public String mo10184a() {
            return this.f26587a.mo10196a();
        }

        /* renamed from: b */
        public final AbstractC11890d.C11898e m10183b() {
            return this.f26587a;
        }

        /* renamed from: c */
        public final AbstractC11890d.C11898e m10182c() {
            return this.f26588b;
        }
    }

    private AbstractC11900e() {
    }

    /* renamed from: a */
    public abstract String mo10184a();

    public /* synthetic */ AbstractC11900e(g gVar) {
        this();
    }
}
