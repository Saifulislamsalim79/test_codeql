package retrofit2.adapter.rxjava2;

import j.e.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import retrofit2.C14840l;
import retrofit2.C14841m;
import retrofit2.InterfaceC14802c;
/* compiled from: RxJava2CallAdapterFactory.java */
/* renamed from: retrofit2.adapter.rxjava2.g */
/* loaded from: classes3.dex */
public final class C14800g extends InterfaceC14802c.AbstractC14803a {

    /* renamed from: a */
    private final v f33078a;

    /* renamed from: b */
    private final boolean f33079b;

    private C14800g(v vVar, boolean z) {
        this.f33078a = vVar;
        this.f33079b = z;
    }

    /* renamed from: d */
    public static C14800g m330d() {
        return new C14800g(null, false);
    }

    @Override // retrofit2.InterfaceC14802c.AbstractC14803a
    /* renamed from: a */
    public InterfaceC14802c<?, ?> mo325a(Type type, Annotation[] annotationArr, C14841m c14841m) {
        Type type2;
        boolean z;
        boolean z2;
        Class<?> m328c = InterfaceC14802c.AbstractC14803a.m328c(type);
        if (m328c == AbstractC11271b.class) {
            return new C14799f(Void.class, this.f33078a, this.f33079b, false, true, false, false, false, true);
        }
        boolean z3 = m328c == AbstractC11293f.class;
        boolean z4 = m328c == AbstractC11696w.class;
        boolean z5 = m328c == AbstractC11677k.class;
        if (m328c == AbstractC11688p.class || z3 || z4 || z5) {
            if (!(type instanceof ParameterizedType)) {
                String str = !z3 ? !z4 ? z5 ? "Maybe" : "Observable" : "Single" : "Flowable";
                throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
            }
            Type m329b = InterfaceC14802c.AbstractC14803a.m329b(0, (ParameterizedType) type);
            Class<?> m328c2 = InterfaceC14802c.AbstractC14803a.m328c(m329b);
            if (m328c2 == C14840l.class) {
                if (m329b instanceof ParameterizedType) {
                    type2 = InterfaceC14802c.AbstractC14803a.m329b(0, (ParameterizedType) m329b);
                    z = false;
                } else {
                    throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                }
            } else if (m328c2 == C14796d.class) {
                if (m329b instanceof ParameterizedType) {
                    type2 = InterfaceC14802c.AbstractC14803a.m329b(0, (ParameterizedType) m329b);
                    z = true;
                } else {
                    throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                }
            } else {
                type2 = m329b;
                z = false;
                z2 = true;
                return new C14799f(type2, this.f33078a, this.f33079b, z, z2, z3, z4, z5, false);
            }
            z2 = false;
            return new C14799f(type2, this.f33078a, this.f33079b, z, z2, z3, z4, z5, false);
        }
        return null;
    }
}
