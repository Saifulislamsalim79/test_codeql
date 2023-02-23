package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.Service;
import androidx.lifecycle.n;
import com.uber.autodispose.p195q.p196b.C7426c;
import com.uber.autodispose.p195q.p196b.DataProvider;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p471k0.C11678a;
/* loaded from: classes2.dex */
class LifecycleEventsObservable extends AbstractC11688p<AbstractC1565i.b> {

    /* renamed from: c */
    private final AbstractC1565i f17543c;

    /* renamed from: d */
    private final C11678a<AbstractC1565i.b> f17544d = C11678a.m10575v0();

    /* loaded from: classes.dex */
    static final class ArchLifecycleObserver extends DataProvider implements Service {

        /* renamed from: b */
        private final C11678a<AbstractC1565i.b> f17545b;

        /* renamed from: l */
        private final AbstractC1565i f17546l;

        /* renamed from: o */
        private final InterfaceC11695u<? super AbstractC1565i.b> f17547o;

        ArchLifecycleObserver(AbstractC1565i abstractC1565i, InterfaceC11695u interfaceC11695u, C11678a c11678a) {
            this.f17546l = abstractC1565i;
            this.f17547o = interfaceC11695u;
            this.f17545b = c11678a;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // com.uber.autodispose.p195q.p196b.DataProvider
        /* renamed from: e */
        protected void mo18760e() {
            AbstractC1565i $r1 = this.f17546l;
            $r1.c(this);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
            if (r3 != r7) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void onStateChange(androidx.lifecycle.PreferenceActivity r6, androidx.lifecycle.Scope r7) {
            /*
                r5 = this;
                boolean r0 = r5.close()
                if (r0 != 0) goto L1c
                androidx.lifecycle.Scope r1 = androidx.lifecycle.Scope.ON_CREATE
                if (r7 != r1) goto L12
                j.e.k0.a<androidx.lifecycle.i$b> r2 = r5.f17545b
                java.lang.Object r3 = r2.m10574w0()
                if (r3 == r7) goto L17
            L12:
                j.e.k0.a<androidx.lifecycle.i$b> r2 = r5.f17545b
                r2.mo331f(r7)
            L17:
                j.e.u<? super androidx.lifecycle.i$b> r4 = r5.f17547o
                r4.mo331f(r7)
            L1c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uber.autodispose.android.lifecycle.LifecycleEventsObservable.ArchLifecycleObserver.onStateChange(androidx.lifecycle.PreferenceActivity, androidx.lifecycle.Scope):void");
        }
    }

    /* renamed from: com.uber.autodispose.android.lifecycle.LifecycleEventsObservable$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C7394a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17548a;

        static {
            int[] iArr = new int[AbstractC1565i.c.values().length];
            f17548a = iArr;
            try {
                iArr[AbstractC1565i.c.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17548a[AbstractC1565i.c.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17548a[AbstractC1565i.c.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17548a[AbstractC1565i.c.w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17548a[AbstractC1565i.c.c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleEventsObservable(AbstractC1565i abstractC1565i) {
        this.f17543c = abstractC1565i;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super AbstractC1565i.b> interfaceC11695u) {
        n archLifecycleObserver = new ArchLifecycleObserver(this.f17543c, interfaceC11695u, this.f17544d);
        interfaceC11695u.mo332d(archLifecycleObserver);
        if (!C7426c.m18759a()) {
            interfaceC11695u.mo334b(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.f17543c.mo35506a(archLifecycleObserver);
        if (archLifecycleObserver.j()) {
            this.f17543c.mo35504c(archLifecycleObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void m18814t0() {
        AbstractC1565i.b bVar;
        int i = C7394a.f17548a[this.f17543c.mo35505b().ordinal()];
        if (i == 1) {
            bVar = AbstractC1565i.b.ON_CREATE;
        } else if (i == 2) {
            bVar = AbstractC1565i.b.ON_START;
        } else if (i != 3 && i != 4) {
            bVar = AbstractC1565i.b.ON_DESTROY;
        } else {
            bVar = AbstractC1565i.b.ON_RESUME;
        }
        this.f17544d.mo331f(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public AbstractC1565i.b m18813u0() {
        return this.f17544d.m10574w0();
    }
}
