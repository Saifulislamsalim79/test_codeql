package androidx.camera.core;

import android.os.Handler;
import androidx.camera.core.impl.C1231h;
import androidx.camera.core.impl.C1232i;
import androidx.camera.core.impl.C1233j;
import androidx.camera.core.impl.InterfaceC1224c;
import androidx.camera.core.impl.InterfaceC1225d;
import androidx.camera.core.impl.InterfaceC1227f;
import androidx.camera.core.impl.InterfaceC1230g;
import androidx.camera.core.impl.InterfaceC1235l;
import androidx.camera.core.internal.InterfaceC1241a;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* compiled from: CameraXConfig.java */
/* renamed from: androidx.camera.core.b */
/* loaded from: classes2.dex */
public final class C1219b implements InterfaceC1241a<C1218a> {

    /* renamed from: d */
    static final InterfaceC1227f.AbstractC1228a<InterfaceC1225d> f3686d = InterfaceC1227f.AbstractC1228a.m36725a("camerax.core.appConfig.cameraFactoryProvider", InterfaceC1225d.class);

    /* renamed from: e */
    static final InterfaceC1227f.AbstractC1228a<InterfaceC1224c> f3687e = InterfaceC1227f.AbstractC1228a.m36725a("camerax.core.appConfig.deviceSurfaceManagerProvider", InterfaceC1224c.class);

    /* renamed from: f */
    static final InterfaceC1227f.AbstractC1228a<InterfaceC1235l> f3688f = InterfaceC1227f.AbstractC1228a.m36725a("camerax.core.appConfig.useCaseConfigFactoryProvider", InterfaceC1235l.class);

    /* renamed from: c */
    private final C1232i f3689c;

    /* compiled from: CameraXConfig.java */
    /* renamed from: androidx.camera.core.b$a */
    /* loaded from: classes2.dex */
    public static final class C1220a {

        /* renamed from: a */
        private final C1231h f3690a;

        public C1220a() {
            this(C1231h.m36719j());
        }

        /* renamed from: b */
        private InterfaceC1230g m36732b() {
            return this.f3690a;
        }

        /* renamed from: a */
        public C1219b m36733a() {
            return new C1219b(C1232i.m36713g(this.f3690a));
        }

        /* renamed from: c */
        public C1220a m36731c(InterfaceC1225d interfaceC1225d) {
            m36732b().mo36720d(C1219b.f3686d, interfaceC1225d);
            return this;
        }

        /* renamed from: d */
        public C1220a m36730d(InterfaceC1224c interfaceC1224c) {
            m36732b().mo36720d(C1219b.f3687e, interfaceC1224c);
            return this;
        }

        /* renamed from: e */
        public C1220a m36729e(Class<C1218a> cls) {
            m36732b().mo36720d(InterfaceC1241a.f3710b, cls);
            if (m36732b().mo36715e(InterfaceC1241a.f3709a, null) == null) {
                m36728f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: f */
        public C1220a m36728f(String str) {
            m36732b().mo36720d(InterfaceC1241a.f3709a, str);
            return this;
        }

        /* renamed from: g */
        public C1220a m36727g(InterfaceC1235l interfaceC1235l) {
            m36732b().mo36720d(C1219b.f3688f, interfaceC1235l);
            return this;
        }

        private C1220a(C1231h c1231h) {
            this.f3690a = c1231h;
            Class cls = (Class) c1231h.mo36715e(InterfaceC1241a.f3710b, null);
            if (cls != null && !cls.equals(C1218a.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m36729e(C1218a.class);
        }
    }

    static {
        InterfaceC1227f.AbstractC1228a.m36725a("camerax.core.appConfig.cameraExecutor", Executor.class);
        InterfaceC1227f.AbstractC1228a.m36725a("camerax.core.appConfig.schedulerHandler", Handler.class);
    }

    C1219b(C1232i c1232i) {
        this.f3689c = c1232i;
    }

    @Override // androidx.camera.core.impl.InterfaceC1234k
    /* renamed from: a */
    public InterfaceC1227f mo36706a() {
        return this.f3689c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1227f
    /* renamed from: b */
    public /* synthetic */ <ValueT> ValueT mo36717b(InterfaceC1227f.AbstractC1228a<ValueT> abstractC1228a, InterfaceC1227f.EnumC1229b enumC1229b) {
        return (ValueT) C1233j.m36707d(this, abstractC1228a, enumC1229b);
    }

    @Override // androidx.camera.core.impl.InterfaceC1227f
    /* renamed from: c */
    public /* synthetic */ Set<InterfaceC1227f.AbstractC1228a<?>> mo36716c() {
        return C1233j.m36709b(this);
    }

    @Override // androidx.camera.core.impl.InterfaceC1227f
    /* renamed from: e */
    public /* synthetic */ <ValueT> ValueT mo36715e(InterfaceC1227f.AbstractC1228a<ValueT> abstractC1228a, ValueT valuet) {
        return (ValueT) C1233j.m36708c(this, abstractC1228a, valuet);
    }

    @Override // androidx.camera.core.impl.InterfaceC1227f
    /* renamed from: f */
    public /* synthetic */ Set<InterfaceC1227f.EnumC1229b> mo36714f(InterfaceC1227f.AbstractC1228a<?> abstractC1228a) {
        return C1233j.m36710a(this, abstractC1228a);
    }
}
