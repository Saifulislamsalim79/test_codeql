package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h;
/* compiled from: ExtensionRegistryLite.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f */
/* loaded from: classes3.dex */
public class C13575f {

    /* renamed from: b */
    private static final C13575f f29947b = new C13575f(true);

    /* renamed from: a */
    private final Map<C13576a, AbstractC13580h.C13587f<?, ?>> f29948a;

    /* compiled from: ExtensionRegistryLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f$a */
    /* loaded from: classes3.dex */
    private static final class C13576a {

        /* renamed from: a */
        private final Object f29949a;

        /* renamed from: b */
        private final int f29950b;

        C13576a(Object obj, int i) {
            this.f29949a = obj;
            this.f29950b = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C13576a) {
                C13576a c13576a = (C13576a) obj;
                return this.f29949a == c13576a.f29949a && this.f29950b == c13576a.f29950b;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f29949a) * 65535) + this.f29950b;
        }
    }

    C13575f() {
        this.f29948a = new HashMap();
    }

    /* renamed from: c */
    public static C13575f m4477c() {
        return f29947b;
    }

    /* renamed from: d */
    public static C13575f m4476d() {
        return new C13575f();
    }

    /* renamed from: a */
    public final void m4479a(AbstractC13580h.C13587f<?, ?> c13587f) {
        this.f29948a.put(new C13576a(c13587f.m4412b(), c13587f.m4410d()), c13587f);
    }

    /* renamed from: b */
    public <ContainingType extends InterfaceC13601o> AbstractC13580h.C13587f<ContainingType, ?> m4478b(ContainingType containingtype, int i) {
        return (AbstractC13580h.C13587f<ContainingType, ?>) this.f29948a.get(new C13576a(containingtype, i));
    }

    private C13575f(boolean z) {
        this.f29948a = Collections.emptyMap();
    }
}
