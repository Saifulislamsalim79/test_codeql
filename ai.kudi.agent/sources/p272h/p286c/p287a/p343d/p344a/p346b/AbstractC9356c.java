package p272h.p286c.p287a.p343d.p344a.p346b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.internal.C4957a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p272h.p286c.p287a.p343d.p344a.p347c.C9357a;
/* renamed from: h.c.a.d.a.b.c */
/* loaded from: classes2.dex */
public abstract class AbstractC9356c<StateT> {

    /* renamed from: a */
    protected final C4957a f21982a;

    /* renamed from: b */
    private final IntentFilter f21983b;

    /* renamed from: c */
    private final Context f21984c;

    /* renamed from: d */
    protected final Set<InterfaceC9354a<StateT>> f21985d = new HashSet();

    /* renamed from: e */
    private C9355b f21986e = null;

    /* renamed from: f */
    private volatile boolean f21987f = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9356c(C4957a c4957a, IntentFilter intentFilter, Context context) {
        this.f21982a = c4957a;
        this.f21983b = intentFilter;
        this.f21984c = C9357a.m14970a(context);
    }

    /* renamed from: e */
    private final void m14971e() {
        C9355b c9355b;
        if ((this.f21987f || !this.f21985d.isEmpty()) && this.f21986e == null) {
            C9355b c9355b2 = new C9355b(this);
            this.f21986e = c9355b2;
            this.f21984c.registerReceiver(c9355b2, this.f21983b);
        }
        if (this.f21987f || !this.f21985d.isEmpty() || (c9355b = this.f21986e) == null) {
            return;
        }
        this.f21984c.unregisterReceiver(c9355b);
        this.f21986e = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14975a(Context context, Intent intent);

    /* renamed from: b */
    public final synchronized void m14974b(StateT statet) {
        Iterator it = new HashSet(this.f21985d).iterator();
        while (it.hasNext()) {
            ((InterfaceC9354a) it.next()).m14976a(statet);
        }
    }

    /* renamed from: c */
    public final synchronized void m14973c(boolean z) {
        this.f21987f = z;
        m14971e();
    }

    /* renamed from: d */
    public final synchronized boolean m14972d() {
        return this.f21986e != null;
    }
}
