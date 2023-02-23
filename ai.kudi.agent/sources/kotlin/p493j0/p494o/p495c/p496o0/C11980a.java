package kotlin.p493j0.p494o.p495c.p496o0;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13474b;
/* compiled from: AnnotationConstructorCaller.kt */
/* renamed from: kotlin.j0.o.c.o0.a */
/* loaded from: classes3.dex */
public final class C11980a implements InterfaceC11990d {

    /* renamed from: a */
    private final List<Type> f26686a;

    /* renamed from: b */
    private final List<Class<?>> f26687b;

    /* renamed from: c */
    private final List<Object> f26688c;

    /* renamed from: d */
    private final Class<?> f26689d;

    /* renamed from: e */
    private final List<String> f26690e;

    /* renamed from: f */
    private final EnumC11981a f26691f;

    /* renamed from: g */
    private final List<Method> f26692g;

    /* compiled from: AnnotationConstructorCaller.kt */
    /* renamed from: kotlin.j0.o.c.o0.a$a */
    /* loaded from: classes3.dex */
    public enum EnumC11981a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    /* renamed from: kotlin.j0.o.c.o0.a$b */
    /* loaded from: classes3.dex */
    public enum EnumC11982b {
        JAVA,
        KOTLIN
    }

    public C11980a(Class<?> cls, List<String> list, EnumC11981a enumC11981a, EnumC11982b enumC11982b, List<Method> list2) {
        int m3867o;
        int m3867o2;
        int m3867o3;
        List m3787k0;
        l.f(cls, "jClass");
        l.f(list, "parameterNames");
        l.f(enumC11981a, "callMode");
        l.f(enumC11982b, "origin");
        l.f(list2, "methods");
        this.f26689d = cls;
        this.f26690e = list;
        this.f26691f = enumC11981a;
        this.f26692g = list2;
        m3867o = C13728s.m3867o(list2, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (Method method : list2) {
            arrayList.add(method.getGenericReturnType());
        }
        this.f26686a = arrayList;
        List<Method> list3 = this.f26692g;
        m3867o2 = C13728s.m3867o(list3, 10);
        ArrayList arrayList2 = new ArrayList(m3867o2);
        for (Method method2 : list3) {
            Class<?> returnType = method2.getReturnType();
            l.e(returnType, "it");
            Class<?> m4888f = C13474b.m4888f(returnType);
            if (m4888f != null) {
                returnType = m4888f;
            }
            arrayList2.add(returnType);
        }
        this.f26687b = arrayList2;
        List<Method> list4 = this.f26692g;
        m3867o3 = C13728s.m3867o(list4, 10);
        ArrayList arrayList3 = new ArrayList(m3867o3);
        for (Method method3 : list4) {
            arrayList3.add(method3.getDefaultValue());
        }
        this.f26688c = arrayList3;
        if (this.f26691f == EnumC11981a.POSITIONAL_CALL && enumC11982b == EnumC11982b.JAVA) {
            m3787k0 = C13742z.m3787k0(this.f26690e, "value");
            if (!m3787k0.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: a */
    public Object mo9985a(Object[] objArr) {
        List m3815I0;
        Map m3872t;
        l.f(objArr, "args");
        m10016b(objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = objArr[i];
            int i3 = i2 + 1;
            Object m10009f = (obj == null && this.f26691f == EnumC11981a.CALL_BY_NAME) ? this.f26688c.get(i2) : C11983b.m10009f(obj, this.f26687b.get(i2));
            if (m10009f == null) {
                C11983b.m10014a(i2, this.f26690e.get(i2), this.f26687b.get(i2));
                throw null;
            }
            arrayList.add(m10009f);
            i++;
            i2 = i3;
        }
        Class<?> cls = this.f26689d;
        m3815I0 = C13742z.m3815I0(this.f26690e, arrayList);
        m3872t = C13727r0.m3872t(m3815I0);
        return C11983b.m10012c(cls, m3872t, this.f26692g);
    }

    /* renamed from: b */
    public void m10016b(Object[] objArr) {
        l.f(objArr, "args");
        InterfaceC11990d.C11991a.m10006a(this, objArr);
    }

    /* renamed from: c */
    public Void m10015c() {
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: j */
    public Type mo9983j() {
        return this.f26689d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: k */
    public List<Type> mo9982k() {
        return this.f26686a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: l */
    public /* bridge */ /* synthetic */ Member mo9981l() {
        return (Member) m10015c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C11980a(java.lang.Class r7, java.util.List r8, kotlin.p493j0.p494o.p495c.p496o0.C11980a.EnumC11981a r9, kotlin.p493j0.p494o.p495c.p496o0.C11980a.EnumC11982b r10, java.util.List r11, int r12, kotlin.e0.d.g r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L2a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.p557z.C13722p.m3921o(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L13:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L2a
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r11.add(r13)
            goto L13
        L2a:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.C11980a.<init>(java.lang.Class, java.util.List, kotlin.j0.o.c.o0.a$a, kotlin.j0.o.c.o0.a$b, java.util.List, int, kotlin.e0.d.g):void");
    }
}
