package com.trello.lifecycle2.android.lifecycle;

import androidx.lifecycle.AbstractC1565i;
import com.trello.rxlifecycle2.C7386c;
import com.trello.rxlifecycle2.C7387d;
import com.trello.rxlifecycle2.OutsideLifecycleException;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: RxLifecycleAndroidLifecycle.java */
/* renamed from: com.trello.lifecycle2.android.lifecycle.a */
/* loaded from: classes2.dex */
public final class C7380a {

    /* renamed from: a */
    private static final InterfaceC11291f<AbstractC1565i.b, AbstractC1565i.b> f17536a = new C7381a();

    /* compiled from: RxLifecycleAndroidLifecycle.java */
    /* renamed from: com.trello.lifecycle2.android.lifecycle.a$a */
    /* loaded from: classes2.dex */
    static class C7381a implements InterfaceC11291f<AbstractC1565i.b, AbstractC1565i.b> {
        C7381a() {
        }

        @Override // p425j.p444e.p450e0.InterfaceC11291f
        /* renamed from: b */
        public AbstractC1565i.b mo10663a(AbstractC1565i.b bVar) throws Exception {
            switch (C7382b.f17537a[bVar.ordinal()]) {
                case 1:
                    return AbstractC1565i.b.ON_DESTROY;
                case 2:
                    return AbstractC1565i.b.ON_STOP;
                case 3:
                    return AbstractC1565i.b.ON_PAUSE;
                case 4:
                    return AbstractC1565i.b.ON_STOP;
                case 5:
                    return AbstractC1565i.b.ON_DESTROY;
                case 6:
                    throw new OutsideLifecycleException("Cannot bind to Activity lifecycle when outside of it.");
                default:
                    throw new UnsupportedOperationException("Binding to " + bVar + " not yet implemented");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxLifecycleAndroidLifecycle.java */
    /* renamed from: com.trello.lifecycle2.android.lifecycle.a$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C7382b {

        /* renamed from: a */
        static final /* synthetic */ int[] f17537a;

        static {
            int[] iArr = new int[AbstractC1565i.b.values().length];
            f17537a = iArr;
            try {
                iArr[AbstractC1565i.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17537a[AbstractC1565i.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17537a[AbstractC1565i.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17537a[AbstractC1565i.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17537a[AbstractC1565i.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17537a[AbstractC1565i.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: a */
    public static <T> C7386c<T> m18827a(AbstractC11688p<AbstractC1565i.b> abstractC11688p) {
        return C7387d.m18822b(abstractC11688p, f17536a);
    }
}
