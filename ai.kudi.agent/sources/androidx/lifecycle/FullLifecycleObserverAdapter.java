package androidx.lifecycle;

import androidx.lifecycle.AbstractC1565i;
/* loaded from: classes2.dex */
class FullLifecycleObserverAdapter implements InterfaceC1572l {

    /* renamed from: c */
    private final InterfaceC1553f f4695c;

    /* renamed from: d */
    private final InterfaceC1572l f4696d;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C1530a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4697a;

        static {
            int[] iArr = new int[AbstractC1565i.b.values().length];
            f4697a = iArr;
            try {
                iArr[AbstractC1565i.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4697a[AbstractC1565i.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4697a[AbstractC1565i.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4697a[AbstractC1565i.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4697a[AbstractC1565i.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4697a[AbstractC1565i.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4697a[AbstractC1565i.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(InterfaceC1553f interfaceC1553f, InterfaceC1572l interfaceC1572l) {
        this.f4695c = interfaceC1553f;
        this.f4696d = interfaceC1572l;
    }

    @Override // androidx.lifecycle.InterfaceC1572l
    /* renamed from: m */
    public void mo34271m(o oVar, AbstractC1565i.b bVar) {
        switch (C1530a.f4697a[bVar.ordinal()]) {
            case 1:
                this.f4695c.m35535g(oVar);
                break;
            case 2:
                this.f4695c.onStart(oVar);
                break;
            case 3:
                this.f4695c.m35536c(oVar);
                break;
            case 4:
                this.f4695c.m35537F(oVar);
                break;
            case 5:
                this.f4695c.onStop(oVar);
                break;
            case 6:
                this.f4695c.onDestroy(oVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1572l interfaceC1572l = this.f4696d;
        if (interfaceC1572l != null) {
            interfaceC1572l.mo34271m(oVar, bVar);
        }
    }
}
