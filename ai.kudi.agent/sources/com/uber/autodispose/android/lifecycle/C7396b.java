package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.o;
import com.uber.autodispose.OutsideScopeException;
import com.uber.autodispose.lifecycle.C7417f;
import com.uber.autodispose.lifecycle.InterfaceC7415d;
import com.uber.autodispose.lifecycle.InterfaceC7416e;
import com.uber.autodispose.lifecycle.LifecycleEndedException;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11284d;
/* compiled from: AndroidLifecycleScopeProvider.java */
/* renamed from: com.uber.autodispose.android.lifecycle.b */
/* loaded from: classes2.dex */
public final class C7396b implements InterfaceC7416e<AbstractC1565i.b> {

    /* renamed from: c */
    private static final InterfaceC7415d<AbstractC1565i.b> f17551c = C7395a.f17550c;

    /* renamed from: a */
    private final InterfaceC7415d<AbstractC1565i.b> f17552a;

    /* renamed from: b */
    private final LifecycleEventsObservable f17553b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidLifecycleScopeProvider.java */
    /* renamed from: com.uber.autodispose.android.lifecycle.b$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C7397a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17554a;

        static {
            int[] iArr = new int[AbstractC1565i.b.values().length];
            f17554a = iArr;
            try {
                iArr[AbstractC1565i.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17554a[AbstractC1565i.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17554a[AbstractC1565i.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17554a[AbstractC1565i.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17554a[AbstractC1565i.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17554a[AbstractC1565i.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private C7396b(AbstractC1565i abstractC1565i, InterfaceC7415d<AbstractC1565i.b> interfaceC7415d) {
        this.f17553b = new LifecycleEventsObservable(abstractC1565i);
        this.f17552a = interfaceC7415d;
    }

    /* renamed from: e */
    public static C7396b m18812e(AbstractC1565i abstractC1565i) {
        return m18811f(abstractC1565i, f17551c);
    }

    /* renamed from: f */
    public static C7396b m18811f(AbstractC1565i abstractC1565i, InterfaceC7415d<AbstractC1565i.b> interfaceC7415d) {
        return new C7396b(abstractC1565i, interfaceC7415d);
    }

    /* renamed from: g */
    public static C7396b m18810g(o oVar) {
        return m18812e(oVar.getLifecycle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ AbstractC1565i.b m18809h(AbstractC1565i.b bVar) throws OutsideScopeException {
        int i = C7397a.f17554a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return AbstractC1565i.b.ON_STOP;
                    }
                    throw new LifecycleEndedException("Lifecycle has ended! Last event was " + bVar);
                }
                return AbstractC1565i.b.ON_PAUSE;
            }
            return AbstractC1565i.b.ON_STOP;
        }
        return AbstractC1565i.b.ON_DESTROY;
    }

    @Override // com.uber.autodispose.lifecycle.InterfaceC7416e
    /* renamed from: b */
    public AbstractC11688p<AbstractC1565i.b> mo18776b() {
        return this.f17553b;
    }

    @Override // com.uber.autodispose.lifecycle.InterfaceC7416e
    /* renamed from: c */
    public InterfaceC7415d<AbstractC1565i.b> mo18775c() {
        return this.f17552a;
    }

    @Override // com.uber.autodispose.InterfaceC7422p
    /* renamed from: d */
    public InterfaceC11284d mo18762d() {
        return C7417f.m18772c(this);
    }

    @Override // com.uber.autodispose.lifecycle.InterfaceC7416e
    /* renamed from: i */
    public AbstractC1565i.b mo18777a() {
        this.f17553b.m18814t0();
        return this.f17553b.m18813u0();
    }
}
