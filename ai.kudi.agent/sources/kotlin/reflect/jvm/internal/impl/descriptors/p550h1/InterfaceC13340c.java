package kotlin.reflect.jvm.internal.impl.descriptors.p550h1;

import java.util.Map;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
/* compiled from: AnnotationDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.c */
/* loaded from: classes3.dex */
public interface InterfaceC13340c {

    /* compiled from: AnnotationDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.c$a */
    /* loaded from: classes3.dex */
    public static final class C13341a {
        /* renamed from: a */
        public static C12609c m5325a(InterfaceC13340c interfaceC13340c) {
            l.f(interfaceC13340c, "this");
            InterfaceC13312e m6864f = C12747a.m6864f(interfaceC13340c);
            if (m6864f == null) {
                return null;
            }
            if (C13118t.m5803r(m6864f)) {
                m6864f = null;
            }
            if (m6864f == null) {
                return null;
            }
            return C12747a.m6865e(m6864f);
        }
    }

    /* renamed from: a */
    Map<C12614f, AbstractC12712g<?>> mo5312a();

    /* renamed from: c */
    AbstractC12965b0 mo5310c();

    /* renamed from: f */
    C12609c mo5309f();

    /* renamed from: m */
    InterfaceC13545u0 mo5308m();
}
