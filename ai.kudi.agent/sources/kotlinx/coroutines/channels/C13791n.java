package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlinx.coroutines.C13939o;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.internal.C13908t;
import kotlinx.coroutines.internal.C13914y;
import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: ConflatedChannel.kt */
/* renamed from: kotlinx.coroutines.channels.n */
/* loaded from: classes3.dex */
public class C13791n<E> extends AbstractC13764a<E> {

    /* renamed from: f */
    private final ReentrantLock f30254f;

    /* renamed from: w */
    private Object f30255w;

    public C13791n(InterfaceC11767l<? super E, C13666w> interfaceC11767l) {
        super(interfaceC11767l);
        this.f30254f = new ReentrantLock();
        this.f30255w = C13772b.f30224a;
    }

    /* renamed from: R */
    private final UndeliveredElementException m3662R(Object obj) {
        InterfaceC11767l<E, C13666w> interfaceC11767l;
        Object obj2 = this.f30255w;
        UndeliveredElementException undeliveredElementException = null;
        if (obj2 != C13772b.f30224a && (interfaceC11767l = this.f30231c) != null) {
            undeliveredElementException = C13908t.m3439d(interfaceC11767l, obj2, null, 2, null);
        }
        this.f30255w = obj;
        return undeliveredElementException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: F */
    public boolean mo3665F(AbstractC13796s<? super E> abstractC13796s) {
        ReentrantLock reentrantLock = this.f30254f;
        reentrantLock.lock();
        try {
            return super.mo3665F(abstractC13796s);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: G */
    protected final boolean mo3645G() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: H */
    protected final boolean mo3644H() {
        return this.f30255w == C13772b.f30224a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: K */
    public void mo3664K(boolean z) {
        ReentrantLock reentrantLock = this.f30254f;
        reentrantLock.lock();
        try {
            UndeliveredElementException m3662R = m3662R(C13772b.f30224a);
            C13666w c13666w = C13666w.f30112a;
            reentrantLock.unlock();
            super.mo3664K(z);
            if (m3662R != null) {
                throw m3662R;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: O */
    protected Object mo3663O() {
        ReentrantLock reentrantLock = this.f30254f;
        reentrantLock.lock();
        try {
            if (this.f30255w == C13772b.f30224a) {
                Object m3710i = m3710i();
                if (m3710i == null) {
                    m3710i = C13772b.f30227d;
                }
                return m3710i;
            }
            Object obj = this.f30255w;
            this.f30255w = C13772b.f30224a;
            C13666w c13666w = C13666w.f30112a;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: g */
    protected String mo3661g() {
        return "(value=" + this.f30255w + ')';
    }

    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: s */
    protected final boolean mo3643s() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: t */
    protected final boolean mo3642t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: v */
    public Object mo3659v(E e) {
        InterfaceC13798u<E> mo3699z;
        C13914y mo3646f;
        ReentrantLock reentrantLock = this.f30254f;
        reentrantLock.lock();
        try {
            C13790m<?> m3710i = m3710i();
            if (m3710i == null) {
                if (this.f30255w == C13772b.f30224a) {
                    do {
                        mo3699z = mo3699z();
                        if (mo3699z != null) {
                            if (mo3699z instanceof C13790m) {
                                return mo3699z;
                            }
                            mo3646f = mo3699z.mo3646f(e, null);
                        }
                    } while (mo3646f == null);
                    if (C13952q0.m3345a()) {
                        if (!(mo3646f == C13939o.f30425a)) {
                            throw new AssertionError();
                        }
                    }
                    C13666w c13666w = C13666w.f30112a;
                    reentrantLock.unlock();
                    mo3699z.mo3647e(e);
                    return mo3699z.mo3648a();
                }
                UndeliveredElementException m3662R = m3662R(e);
                if (m3662R == null) {
                    return C13772b.f30225b;
                }
                throw m3662R;
            }
            return m3710i;
        } finally {
            reentrantLock.unlock();
        }
    }
}
