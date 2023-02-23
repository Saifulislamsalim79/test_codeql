package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.C13288p;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlinx.coroutines.flow.internal.AbstractC13819c;
import kotlinx.coroutines.p559q2.C13978g0;
import kotlinx.coroutines.p559q2.InterfaceC13970e0;
import kotlinx.coroutines.p559q2.InterfaceC14022s;
/* compiled from: AbstractSharedFlow.kt */
/* renamed from: kotlinx.coroutines.flow.internal.a */
/* loaded from: classes3.dex */
public abstract class AbstractC13817a<S extends AbstractC13819c<?>> {

    /* renamed from: c */
    private S[] f30267c;

    /* renamed from: d */
    private int f30268d;

    /* renamed from: e */
    private int f30269e;

    /* renamed from: f */
    private InterfaceC14022s<Integer> f30270f;

    /* renamed from: g */
    public final InterfaceC13970e0<Integer> m3611g() {
        InterfaceC14022s<Integer> interfaceC14022s;
        synchronized (this) {
            interfaceC14022s = this.f30270f;
            if (interfaceC14022s == null) {
                interfaceC14022s = C13978g0.m3302a(Integer.valueOf(m3607m()));
                this.f30270f = interfaceC14022s;
            }
        }
        return interfaceC14022s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final S m3609i() {
        S s;
        InterfaceC14022s<Integer> interfaceC14022s;
        synchronized (this) {
            S[] m3606n = m3606n();
            if (m3606n == null) {
                m3606n = mo3229k(2);
                this.f30267c = m3606n;
            } else if (m3607m() >= m3606n.length) {
                Object[] copyOf = Arrays.copyOf(m3606n, m3606n.length * 2);
                kotlin.e0.d.l.e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                this.f30267c = (S[]) ((AbstractC13819c[]) copyOf);
                m3606n = (S[]) ((AbstractC13819c[]) copyOf);
            }
            int i = this.f30269e;
            do {
                s = m3606n[i];
                if (s == null) {
                    s = mo3230j();
                    m3606n[i] = s;
                }
                i++;
                if (i >= m3606n.length) {
                    i = 0;
                }
            } while (!s.mo3209a(this));
            this.f30269e = i;
            this.f30268d = m3607m() + 1;
            interfaceC14022s = this.f30270f;
        }
        if (interfaceC14022s != null) {
            C13978g0.m3298e(interfaceC14022s, 1);
        }
        return s;
    }

    /* renamed from: j */
    protected abstract S mo3230j();

    /* renamed from: k */
    protected abstract S[] mo3229k(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final void m3608l(S s) {
        InterfaceC14022s<Integer> interfaceC14022s;
        int i;
        InterfaceC11714d<C13666w>[] mo3208b;
        synchronized (this) {
            this.f30268d = m3607m() - 1;
            interfaceC14022s = this.f30270f;
            i = 0;
            if (m3607m() == 0) {
                this.f30269e = 0;
            }
            mo3208b = s.mo3208b(this);
        }
        int length = mo3208b.length;
        while (i < length) {
            InterfaceC11714d<C13666w> interfaceC11714d = mo3208b[i];
            i++;
            if (interfaceC11714d != null) {
                C13666w c13666w = C13666w.f30112a;
                C13288p.C13289a c13289a = C13288p.f29444c;
                C13288p.m5362a(c13666w);
                interfaceC11714d.resumeWith(c13666w);
            }
        }
        if (interfaceC14022s == null) {
            return;
        }
        C13978g0.m3298e(interfaceC14022s, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final int m3607m() {
        return this.f30268d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final S[] m3606n() {
        return this.f30267c;
    }
}
