package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC3894m8;
import com.google.android.gms.internal.measurement.C3847j8;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.m8 */
/* loaded from: classes2.dex */
public abstract class AbstractC3894m8<MessageType extends AbstractC3894m8<MessageType, BuilderType>, BuilderType extends C3847j8<MessageType, BuilderType>> extends AbstractC3704a7<MessageType, BuilderType> {
    private static final Map<Object, AbstractC3894m8<?, ?>> zza = new ConcurrentHashMap();
    protected C3928oa zzc = C3928oa.m29243c();
    protected int zzd = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public static <E> InterfaceC3988s8<E> m29393k() {
        return C4069x9.m28656e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static <E> InterfaceC3988s8<E> m29392l(InterfaceC3988s8<E> interfaceC3988s8) {
        int size = interfaceC3988s8.size();
        return interfaceC3988s8.mo28653i(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static Object m29391m(Method method, Object obj, Object... objArr) {
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
    /* renamed from: n */
    public static Object m29390n(InterfaceC3927o9 interfaceC3927o9, String str, Object[] objArr) {
        return new C4085y9(interfaceC3927o9, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public static <T extends AbstractC3894m8> void m29389o(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static <T extends AbstractC3894m8> T m29386r(Class<T> cls) {
        AbstractC3894m8<?, ?> abstractC3894m8 = zza.get(cls);
        if (abstractC3894m8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3894m8 = zza.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC3894m8 == null) {
            abstractC3894m8 = (AbstractC3894m8) ((AbstractC3894m8) C4070xa.m28638j(cls)).mo28554v(6, null, null);
            if (abstractC3894m8 != null) {
                zza.put(cls, abstractC3894m8);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC3894m8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public static InterfaceC3956q8 m29385s() {
        return C3910n8.m29332f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public static InterfaceC3972r8 m29384t() {
        return C3739c9.m29712e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public static InterfaceC3972r8 m29383u(InterfaceC3972r8 interfaceC3972r8) {
        int size = interfaceC3972r8.size();
        return interfaceC3972r8.mo29027z(size == 0 ? 10 : size + size);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3927o9
    /* renamed from: a */
    public final void mo29250a(AbstractC4019u7 abstractC4019u7) throws IOException {
        C4053w9.m28691a().m28690b(getClass()).mo28525i(this, C4035v7.m28754l(abstractC4019u7));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3927o9
    /* renamed from: b */
    public final int mo29249b() {
        int i = this.zzd;
        if (i == -1) {
            int mo28530d = C4053w9.m28691a().m28690b(getClass()).mo28530d(this);
            this.zzd = mo28530d;
            return mo28530d;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3927o9
    /* renamed from: c */
    public final /* synthetic */ InterfaceC3911n9 mo29248c() {
        C3847j8 c3847j8 = (C3847j8) mo28554v(5, null, null);
        c3847j8.m29452p(this);
        return c3847j8;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3942p9
    /* renamed from: e */
    public final /* synthetic */ InterfaceC3927o9 mo29102e() {
        return (AbstractC3894m8) mo28554v(6, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C4053w9.m28691a().m28690b(getClass()).mo28526h(this, (AbstractC3894m8) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3927o9
    /* renamed from: f */
    public final /* synthetic */ InterfaceC3911n9 mo29246f() {
        return (C3847j8) mo28554v(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC3704a7
    /* renamed from: g */
    public final int mo29395g() {
        return this.zzd;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int mo28532b = C4053w9.m28691a().m28690b(getClass()).mo28532b(this);
        this.zzb = mo28532b;
        return mo28532b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC3704a7
    /* renamed from: i */
    public final void mo29394i(int i) {
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final <MessageType extends AbstractC3894m8<MessageType, BuilderType>, BuilderType extends C3847j8<MessageType, BuilderType>> BuilderType m29388p() {
        return (BuilderType) mo28554v(5, null, null);
    }

    /* renamed from: q */
    public final BuilderType m29387q() {
        BuilderType buildertype = (BuilderType) mo28554v(5, null, null);
        buildertype.m29452p(this);
        return buildertype;
    }

    public final String toString() {
        return C3957q9.m29081a(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public abstract Object mo28554v(int i, Object obj, Object obj2);
}
