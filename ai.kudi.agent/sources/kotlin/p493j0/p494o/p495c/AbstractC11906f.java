package kotlin.p493j0.p494o.p495c;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p474a0.C11703b;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.InterfaceC11862a;
import kotlin.p493j0.InterfaceC11868g;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.InterfaceC12149a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p557z.C13706j;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13734v;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13453l0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: KCallableImpl.kt */
/* renamed from: kotlin.j0.o.c.f */
/* loaded from: classes3.dex */
public abstract class AbstractC11906f<R> implements InterfaceC11862a<R>, InterfaceC11889c0 {

    /* renamed from: c */
    private final C11916f0.C11917a<ArrayList<InterfaceC11868g>> f26590c;

    /* compiled from: KCallableImpl.kt */
    /* renamed from: kotlin.j0.o.c.f$a */
    /* loaded from: classes3.dex */
    static final class C11907a extends AbstractC11802m implements InterfaceC11756a<List<? extends Annotation>> {
        C11907a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<Annotation> invoke() {
            return C11972m0.m10039c(AbstractC11906f.this.mo5650h());
        }
    }

    /* compiled from: KCallableImpl.kt */
    /* renamed from: kotlin.j0.o.c.f$b */
    /* loaded from: classes3.dex */
    static final class C11908b extends AbstractC11802m implements InterfaceC11756a<ArrayList<InterfaceC11868g>> {

        /* compiled from: Comparisons.kt */
        /* renamed from: kotlin.j0.o.c.f$b$a */
        /* loaded from: classes3.dex */
        public static final class C11909a<T> implements Comparator<T> {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int m10416a;
                m10416a = C11703b.m10416a(((InterfaceC11868g) t).mo5706b(), ((InterfaceC11868g) t2).mo5706b());
                return m10416a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KCallableImpl.kt */
        /* renamed from: kotlin.j0.o.c.f$b$b */
        /* loaded from: classes3.dex */
        public static final class C11910b extends AbstractC11802m implements InterfaceC11756a<InterfaceC13453l0> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC13524r0 f26593c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11910b(InterfaceC13524r0 interfaceC13524r0) {
                super(0);
                this.f26593c = interfaceC13524r0;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final InterfaceC13453l0 invoke() {
                return this.f26593c;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KCallableImpl.kt */
        /* renamed from: kotlin.j0.o.c.f$b$c */
        /* loaded from: classes3.dex */
        public static final class C11911c extends AbstractC11802m implements InterfaceC11756a<InterfaceC13453l0> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC13524r0 f26594c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11911c(InterfaceC13524r0 interfaceC13524r0) {
                super(0);
                this.f26594c = interfaceC13524r0;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final InterfaceC13453l0 invoke() {
                return this.f26594c;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KCallableImpl.kt */
        /* renamed from: kotlin.j0.o.c.f$b$d */
        /* loaded from: classes3.dex */
        public static final class C11912d extends AbstractC11802m implements InterfaceC11756a<InterfaceC13453l0> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC13300b f26595c;

            /* renamed from: d */
            final /* synthetic */ int f26596d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11912d(InterfaceC13300b interfaceC13300b, int i) {
                super(0);
                this.f26595c = interfaceC13300b;
                this.f26596d = i;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final InterfaceC13453l0 invoke() {
                InterfaceC13307c1 interfaceC13307c1 = this.f26595c.mo5072k().get(this.f26596d);
                l.e(interfaceC13307c1, "descriptor.valueParameters[i]");
                return interfaceC13307c1;
            }
        }

        C11908b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final ArrayList<InterfaceC11868g> invoke() {
            int i;
            InterfaceC13300b mo5650h = AbstractC11906f.this.mo5650h();
            ArrayList<InterfaceC11868g> arrayList = new ArrayList<>();
            int i2 = 0;
            if (AbstractC11906f.this.mo5656l()) {
                i = 0;
            } else {
                InterfaceC13524r0 m10035g = C11972m0.m10035g(mo5650h);
                if (m10035g != null) {
                    arrayList.add(new C13178q(AbstractC11906f.this, 0, InterfaceC11868g.EnumC11869a.INSTANCE, new C11910b(m10035g)));
                    i = 1;
                } else {
                    i = 0;
                }
                InterfaceC13524r0 mo5056w0 = mo5650h.mo5056w0();
                if (mo5056w0 != null) {
                    arrayList.add(new C13178q(AbstractC11906f.this, i, InterfaceC11868g.EnumC11869a.EXTENSION_RECEIVER, new C11911c(mo5056w0)));
                    i++;
                }
            }
            List<InterfaceC13307c1> mo5072k = mo5650h.mo5072k();
            l.e(mo5072k, "descriptor.valueParameters");
            int size = mo5072k.size();
            while (i2 < size) {
                arrayList.add(new C13178q(AbstractC11906f.this, i, InterfaceC11868g.EnumC11869a.VALUE, new C11912d(mo5650h, i2)));
                i2++;
                i++;
            }
            if (AbstractC11906f.this.m10176j() && (mo5650h instanceof InterfaceC12149a) && arrayList.size() > 1) {
                C13734v.m3854u(arrayList, new C11909a());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KCallableImpl.kt */
    /* renamed from: kotlin.j0.o.c.f$c */
    /* loaded from: classes3.dex */
    public static final class C11913c extends AbstractC11802m implements InterfaceC11756a<C13213z> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KCallableImpl.kt */
        /* renamed from: kotlin.j0.o.c.f$c$a */
        /* loaded from: classes3.dex */
        public static final class C11914a extends AbstractC11802m implements InterfaceC11756a<Type> {
            C11914a() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final Type invoke() {
                Type m10178e = AbstractC11906f.this.m10178e();
                return m10178e != null ? m10178e : AbstractC11906f.this.mo5651f().mo9983j();
            }
        }

        C11913c() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C13213z invoke() {
            AbstractC12965b0 mo4943j = AbstractC11906f.this.mo5650h().mo4943j();
            l.d(mo4943j);
            l.e(mo4943j, "descriptor.returnType!!");
            return new C13213z(mo4943j, new C11914a());
        }
    }

    /* compiled from: KCallableImpl.kt */
    /* renamed from: kotlin.j0.o.c.f$d */
    /* loaded from: classes3.dex */
    static final class C11915d extends AbstractC11802m implements InterfaceC11756a<List<? extends C11885b0>> {
        C11915d() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<C11885b0> invoke() {
            int m3867o;
            List<InterfaceC13562z0> mo4942l = AbstractC11906f.this.mo5650h().mo4942l();
            l.e(mo4942l, "descriptor.typeParameters");
            m3867o = C13728s.m3867o(mo4942l, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (InterfaceC13562z0 interfaceC13562z0 : mo4942l) {
                AbstractC11906f abstractC11906f = AbstractC11906f.this;
                l.e(interfaceC13562z0, "descriptor");
                arrayList.add(new C11885b0(abstractC11906f, interfaceC13562z0));
            }
            return arrayList;
        }
    }

    public AbstractC11906f() {
        l.e(C11916f0.m10164d(new C11907a()), "ReflectProperties.lazySo…or.computeAnnotations() }");
        C11916f0.C11917a<ArrayList<InterfaceC11868g>> m10164d = C11916f0.m10164d(new C11908b());
        l.e(m10164d, "ReflectProperties.lazySo…ze()\n        result\n    }");
        this.f26590c = m10164d;
        l.e(C11916f0.m10164d(new C11913c()), "ReflectProperties.lazySo…eturnType\n        }\n    }");
        l.e(C11916f0.m10164d(new C11915d()), "ReflectProperties.lazySo…this, descriptor) }\n    }");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final Type m10178e() {
        Type[] lowerBounds;
        InterfaceC13300b mo5650h = mo5650h();
        if (!(mo5650h instanceof InterfaceC13554x)) {
            mo5650h = null;
        }
        InterfaceC13554x interfaceC13554x = (InterfaceC13554x) mo5650h;
        if (interfaceC13554x == null || !interfaceC13554x.mo4692G0()) {
            return null;
        }
        Object m3940e0 = C13722p.m3940e0(mo5651f().mo9982k());
        if (!(m3940e0 instanceof ParameterizedType)) {
            m3940e0 = null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) m3940e0;
        if (l.b(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC11714d.class)) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            l.e(actualTypeArguments, "continuationType.actualTypeArguments");
            Object m4106N = C13706j.m4106N(actualTypeArguments);
            if (!(m4106N instanceof WildcardType)) {
                m4106N = null;
            }
            WildcardType wildcardType = (WildcardType) m4106N;
            if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
                return null;
            }
            return (Type) C13706j.m4076w(lowerBounds);
        }
        return null;
    }

    @Override // kotlin.p493j0.InterfaceC11862a
    /* renamed from: a */
    public R mo10180a(Object... objArr) {
        l.f(objArr, "args");
        try {
            return (R) mo5651f().mo9985a(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    /* renamed from: f */
    public abstract InterfaceC11990d<?> mo5651f();

    /* renamed from: g */
    public abstract AbstractC11952j mo5657g();

    /* renamed from: h */
    public abstract InterfaceC13300b mo5650h();

    /* renamed from: i */
    public List<InterfaceC11868g> m10177i() {
        ArrayList<InterfaceC11868g> invoke = this.f26590c.invoke();
        l.e(invoke, "_parameters()");
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean m10176j() {
        return l.b(mo4699b(), "<init>") && mo5657g().mo9979a().isAnnotation();
    }

    /* renamed from: l */
    public abstract boolean mo5656l();
}
