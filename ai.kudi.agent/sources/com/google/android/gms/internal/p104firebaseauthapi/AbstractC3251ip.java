package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.internal.p104firebaseauthapi.AbstractC3251ip;
import com.google.android.gms.internal.p104firebaseauthapi.C3170fp;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ip */
/* loaded from: classes2.dex */
public abstract class AbstractC3251ip<MessageType extends AbstractC3251ip<MessageType, BuilderType>, BuilderType extends C3170fp<MessageType, BuilderType>> extends AbstractC3564un<MessageType, BuilderType> {
    private static final Map<Object, AbstractC3251ip<?, ?>> zzb = new ConcurrentHashMap();
    protected C3011a1 zzc = C3011a1.m31462c();
    protected int zzd = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static <E> InterfaceC3090d<E> m30954d(InterfaceC3090d<E> interfaceC3090d) {
        int size = interfaceC3090d.size();
        return interfaceC3090d.mo29876i(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Object m30953e(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static Object m30952f(InterfaceC3644y interfaceC3644y, String str, Object[] objArr) {
        return new C3253j0(interfaceC3644y, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public static <T extends AbstractC3251ip> void m30951g(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: i */
    private static <T extends AbstractC3251ip<T, ?>> T m30949i(T t) throws zzaae {
        if (t == null || t.m30950h()) {
            return t;
        }
        zzaae zzaaeVar = new zzaae(new zzaby(t).getMessage());
        zzaaeVar.m29866h(t);
        throw zzaaeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static <T extends AbstractC3251ip> T m30946o(Class<T> cls) {
        AbstractC3251ip<?, ?> abstractC3251ip = zzb.get(cls);
        if (abstractC3251ip == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3251ip = zzb.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC3251ip == null) {
            abstractC3251ip = (AbstractC3251ip) ((AbstractC3251ip) C3254j1.m30924j(cls)).mo29964j(6, null, null);
            if (abstractC3251ip != null) {
                zzb.put(cls, abstractC3251ip);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC3251ip;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public static <T extends AbstractC3251ip<T, ?>> T m30945r(T t, AbstractC3223ho abstractC3223ho, C3617wo c3617wo) throws zzaae {
        try {
            AbstractC3304ko mo31010m = abstractC3223ho.mo31010m();
            T t2 = (T) t.mo29964j(4, null, null);
            try {
                try {
                    try {
                        InterfaceC3307l0 m31086b = C3199h0.m31087a().m31086b(t2.getClass());
                        m31086b.mo30809h(t2, C3331lo.m30748R(mo31010m), c3617wo);
                        m31086b.mo30814c(t2);
                        try {
                            mo31010m.mo30823g(0);
                            m30949i(t2);
                            return t2;
                        } catch (zzaae e) {
                            e.m29866h(t2);
                            throw e;
                        }
                    } catch (zzaae e2) {
                        e2.m29866h(t2);
                        throw e2;
                    }
                } catch (IOException e3) {
                    if (e3.getCause() instanceof zzaae) {
                        throw ((zzaae) e3.getCause());
                    }
                    zzaae zzaaeVar = new zzaae(e3);
                    zzaaeVar.m29866h(t2);
                    throw zzaaeVar;
                }
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof zzaae) {
                    throw ((zzaae) e4.getCause());
                }
                throw e4;
            }
        } catch (zzaae e5) {
            throw e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public static <T extends AbstractC3251ip<T, ?>> T m30943w(T t, byte[] bArr, C3617wo c3617wo) throws zzaae {
        T t2 = (T) m30942x(t, bArr, 0, bArr.length, c3617wo);
        m30949i(t2);
        return t2;
    }

    /* renamed from: x */
    static <T extends AbstractC3251ip<T, ?>> T m30942x(T t, byte[] bArr, int i, int i2, C3617wo c3617wo) throws zzaae {
        T t2 = (T) t.mo29964j(4, null, null);
        try {
            InterfaceC3307l0 m31086b = C3199h0.m31087a().m31086b(t2.getClass());
            m31086b.mo30808i(t2, bArr, 0, i2, new C3642xn(c3617wo));
            m31086b.mo30814c(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zzaae e) {
            e.m29866h(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzaae) {
                throw ((zzaae) e2.getCause());
            }
            zzaae zzaaeVar = new zzaae(e2);
            zzaaeVar.m29866h(t2);
            throw zzaaeVar;
        } catch (IndexOutOfBoundsException unused) {
            zzaae m29865i = zzaae.m29865i();
            m29865i.m29866h(t2);
            throw m29865i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public static <E> InterfaceC3090d<E> m30941y() {
        return C3226i0.m31003e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3564un
    /* renamed from: a */
    public final int mo30163a() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3564un
    /* renamed from: b */
    public final void mo30162b(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C3199h0.m31087a().m31086b(getClass()).mo30807j(this, (AbstractC3251ip) obj);
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m30950h() {
        byte byteValue = ((Byte) mo29964j(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo30810g = C3199h0.m31087a().m31086b(getClass()).mo30810g(this);
        mo29964j(2, true != mo30810g ? null : this, null);
        return mo30810g;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int mo30815b = C3199h0.m31087a().m31086b(getClass()).mo30815b(this);
        this.zza = mo30815b;
        return mo30815b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Object mo29964j(int i, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final <MessageType extends AbstractC3251ip<MessageType, BuilderType>, BuilderType extends C3170fp<MessageType, BuilderType>> BuilderType m30948l() {
        return (BuilderType) mo29964j(5, null, null);
    }

    /* renamed from: n */
    public final BuilderType m30947n() {
        BuilderType buildertype = (BuilderType) mo29964j(5, null, null);
        buildertype.m31127d(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ InterfaceC3618x mo29999q() {
        return (C3170fp) mo29964j(5, null, null);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ InterfaceC3618x mo29998s() {
        C3170fp c3170fp = (C3170fp) mo29964j(5, null, null);
        c3170fp.m31127d(this);
        return c3170fp;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y
    /* renamed from: t */
    public final int mo29997t() {
        int i = this.zzd;
        if (i == -1) {
            int mo30813d = C3199h0.m31087a().m31086b(getClass()).mo30813d(this);
            this.zzd = mo30813d;
            return mo30813d;
        }
        return i;
    }

    public final String toString() {
        return C3037b0.m31413a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3010a0
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ InterfaceC3644y mo30944u() {
        return (AbstractC3251ip) mo29964j(6, null, null);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y
    /* renamed from: v */
    public final void mo29996v(AbstractC3487ro abstractC3487ro) throws IOException {
        C3199h0.m31087a().m31086b(getClass()).mo30811f(this, C3513so.m30241l(abstractC3487ro));
    }
}
