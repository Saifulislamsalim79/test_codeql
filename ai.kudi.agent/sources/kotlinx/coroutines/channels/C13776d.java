package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.C13666w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p557z.C13712m;
import kotlinx.coroutines.C13939o;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.internal.C13908t;
import kotlinx.coroutines.internal.C13914y;
import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: ArrayChannel.kt */
/* renamed from: kotlinx.coroutines.channels.d */
/* loaded from: classes3.dex */
public class C13776d<E> extends AbstractC13764a<E> {

    /* renamed from: f */
    private final int f30235f;
    private volatile /* synthetic */ int size;

    /* renamed from: w */
    private final EnumC13778e f30236w;

    /* renamed from: x */
    private final ReentrantLock f30237x;

    /* renamed from: y */
    private Object[] f30238y;

    /* renamed from: z */
    private int f30239z;

    /* compiled from: ArrayChannel.kt */
    /* renamed from: kotlinx.coroutines.channels.d$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13777a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30240a;

        static {
            int[] iArr = new int[EnumC13778e.values().length];
            iArr[EnumC13778e.SUSPEND.ordinal()] = 1;
            iArr[EnumC13778e.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC13778e.DROP_OLDEST.ordinal()] = 3;
            f30240a = iArr;
        }
    }

    public C13776d(int i, EnumC13778e enumC13778e, InterfaceC11767l<? super E, C13666w> interfaceC11767l) {
        super(interfaceC11767l);
        this.f30235f = i;
        this.f30236w = enumC13778e;
        if (i >= 1) {
            this.f30237x = new ReentrantLock();
            Object[] objArr = new Object[Math.min(this.f30235f, 8)];
            C13712m.m4060k(objArr, C13772b.f30224a, 0, 0, 6, null);
            C13666w c13666w = C13666w.f30112a;
            this.f30238y = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + this.f30235f + " was specified").toString());
    }

    /* renamed from: R */
    private final void m3696R(int i, E e) {
        if (i < this.f30235f) {
            m3695S(i);
            Object[] objArr = this.f30238y;
            objArr[(this.f30239z + i) % objArr.length] = e;
            return;
        }
        if (C13952q0.m3345a()) {
            if (!(this.f30236w == EnumC13778e.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f30238y;
        int i2 = this.f30239z;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f30239z = (i2 + 1) % objArr2.length;
    }

    /* renamed from: S */
    private final void m3695S(int i) {
        Object[] objArr = this.f30238y;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f30235f);
            Object[] objArr2 = new Object[min];
            if (i > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    Object[] objArr3 = this.f30238y;
                    objArr2[i2] = objArr3[(this.f30239z + i2) % objArr3.length];
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            C13712m.m4061j(objArr2, C13772b.f30224a, i, min);
            this.f30238y = objArr2;
            this.f30239z = 0;
        }
    }

    /* renamed from: T */
    private final C13914y m3694T(int i) {
        if (i < this.f30235f) {
            this.size = i + 1;
            return null;
        }
        int i2 = C13777a.f30240a[this.f30236w.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C13772b.f30225b;
        }
        return C13772b.f30226c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: F */
    public boolean mo3665F(AbstractC13796s<? super E> abstractC13796s) {
        ReentrantLock reentrantLock = this.f30237x;
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
        return this.size == 0;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: J */
    public boolean mo3697J() {
        ReentrantLock reentrantLock = this.f30237x;
        reentrantLock.lock();
        try {
            return super.mo3697J();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: K */
    public void mo3664K(boolean z) {
        InterfaceC11767l<E, C13666w> interfaceC11767l = this.f30231c;
        ReentrantLock reentrantLock = this.f30237x;
        reentrantLock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f30238y[this.f30239z];
                if (interfaceC11767l != null && obj != C13772b.f30224a) {
                    undeliveredElementException = C13908t.m3440c(interfaceC11767l, obj, undeliveredElementException);
                }
                this.f30238y[this.f30239z] = C13772b.f30224a;
                this.f30239z = (this.f30239z + 1) % this.f30238y.length;
            }
            this.size = 0;
            C13666w c13666w = C13666w.f30112a;
            reentrantLock.unlock();
            super.mo3664K(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC13764a
    /* renamed from: O */
    protected Object mo3663O() {
        ReentrantLock reentrantLock = this.f30237x;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object m3710i = m3710i();
                if (m3710i == null) {
                    m3710i = C13772b.f30227d;
                }
                return m3710i;
            }
            Object obj = this.f30238y[this.f30239z];
            AbstractC13800w abstractC13800w = null;
            this.f30238y[this.f30239z] = null;
            this.size = i - 1;
            Object obj2 = C13772b.f30227d;
            if (i == this.f30235f) {
                AbstractC13800w abstractC13800w2 = null;
                while (true) {
                    AbstractC13800w m3715A = m3715A();
                    if (m3715A == null) {
                        abstractC13800w = abstractC13800w2;
                        break;
                    }
                    C13914y mo3634E = m3715A.mo3634E(null);
                    if (mo3634E != null) {
                        if (C13952q0.m3345a()) {
                            if (!(mo3634E == C13939o.f30425a)) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = m3715A.mo3636C();
                        abstractC13800w = m3715A;
                        r6 = true;
                    } else {
                        m3715A.mo3633F();
                        abstractC13800w2 = m3715A;
                    }
                }
            }
            if (obj2 != C13772b.f30227d && !(obj2 instanceof C13790m)) {
                this.size = i;
                this.f30238y[(this.f30239z + i) % this.f30238y.length] = obj2;
            }
            this.f30239z = (this.f30239z + 1) % this.f30238y.length;
            C13666w c13666w = C13666w.f30112a;
            if (r6) {
                kotlin.e0.d.l.d(abstractC13800w);
                abstractC13800w.mo3637B();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: e */
    public Object mo3693e(AbstractC13800w abstractC13800w) {
        ReentrantLock reentrantLock = this.f30237x;
        reentrantLock.lock();
        try {
            return super.mo3693e(abstractC13800w);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: g */
    protected String mo3661g() {
        return "(buffer:capacity=" + this.f30235f + ",size=" + this.size + ')';
    }

    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: s */
    protected final boolean mo3643s() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: t */
    protected final boolean mo3642t() {
        return this.size == this.f30235f && this.f30236w == EnumC13778e.SUSPEND;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC13773c
    /* renamed from: v */
    public Object mo3659v(E e) {
        InterfaceC13798u<E> mo3699z;
        C13914y mo3646f;
        ReentrantLock reentrantLock = this.f30237x;
        reentrantLock.lock();
        try {
            int i = this.size;
            C13790m<?> m3710i = m3710i();
            if (m3710i == null) {
                C13914y m3694T = m3694T(i);
                if (m3694T == null) {
                    if (i == 0) {
                        do {
                            mo3699z = mo3699z();
                            if (mo3699z != null) {
                                if (mo3699z instanceof C13790m) {
                                    this.size = i;
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
                        this.size = i;
                        C13666w c13666w = C13666w.f30112a;
                        reentrantLock.unlock();
                        mo3699z.mo3647e(e);
                        return mo3699z.mo3648a();
                    }
                    m3696R(i, e);
                    return C13772b.f30225b;
                }
                return m3694T;
            }
            return m3710i;
        } finally {
            reentrantLock.unlock();
        }
    }
}
