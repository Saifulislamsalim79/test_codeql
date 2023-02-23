package androidx.activity;

import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.InterfaceC1572l;
import androidx.lifecycle.o;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f2377a;

    /* renamed from: b */
    final ArrayDeque<AbstractC0893b> f2378b = new ArrayDeque<>();

    /* loaded from: classes2.dex */
    private class LifecycleOnBackPressedCancellable implements InterfaceC1572l, InterfaceC0892a {

        /* renamed from: c */
        private final AbstractC1565i f2379c;

        /* renamed from: d */
        private final AbstractC0893b f2380d;

        /* renamed from: e */
        private InterfaceC0892a f2381e;

        LifecycleOnBackPressedCancellable(AbstractC1565i abstractC1565i, AbstractC0893b abstractC0893b) {
            this.f2379c = abstractC1565i;
            this.f2380d = abstractC0893b;
            abstractC1565i.mo35506a(this);
        }

        @Override // androidx.activity.InterfaceC0892a
        public void cancel() {
            this.f2379c.mo35504c(this);
            this.f2380d.removeCancellable(this);
            InterfaceC0892a interfaceC0892a = this.f2381e;
            if (interfaceC0892a != null) {
                interfaceC0892a.cancel();
                this.f2381e = null;
            }
        }

        @Override // androidx.lifecycle.InterfaceC1572l
        /* renamed from: m */
        public void mo34271m(o oVar, AbstractC1565i.b bVar) {
            if (bVar == AbstractC1565i.b.ON_START) {
                this.f2381e = OnBackPressedDispatcher.this.m37879b(this.f2380d);
            } else if (bVar == AbstractC1565i.b.ON_STOP) {
                InterfaceC0892a interfaceC0892a = this.f2381e;
                if (interfaceC0892a != null) {
                    interfaceC0892a.cancel();
                }
            } else if (bVar == AbstractC1565i.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: classes2.dex */
    public class C0891a implements InterfaceC0892a {

        /* renamed from: c */
        private final AbstractC0893b f2383c;

        C0891a(AbstractC0893b abstractC0893b) {
            this.f2383c = abstractC0893b;
        }

        @Override // androidx.activity.InterfaceC0892a
        public void cancel() {
            OnBackPressedDispatcher.this.f2378b.remove(this.f2383c);
            this.f2383c.removeCancellable(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f2377a = runnable;
    }

    /* renamed from: a */
    public void m37880a(o oVar, AbstractC0893b abstractC0893b) {
        AbstractC1565i lifecycle = oVar.getLifecycle();
        if (lifecycle.mo35505b() == AbstractC1565i.c.c) {
            return;
        }
        abstractC0893b.addCancellable(new LifecycleOnBackPressedCancellable(lifecycle, abstractC0893b));
    }

    /* renamed from: b */
    InterfaceC0892a m37879b(AbstractC0893b abstractC0893b) {
        this.f2378b.add(abstractC0893b);
        C0891a c0891a = new C0891a(abstractC0893b);
        abstractC0893b.addCancellable(c0891a);
        return c0891a;
    }

    /* renamed from: c */
    public void m37878c() {
        Iterator<AbstractC0893b> descendingIterator = this.f2378b.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC0893b next = descendingIterator.next();
            if (next.isEnabled()) {
                next.handleOnBackPressed();
                return;
            }
        }
        Runnable runnable = this.f2377a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
