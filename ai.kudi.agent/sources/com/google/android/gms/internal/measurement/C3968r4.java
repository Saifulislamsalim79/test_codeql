package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.r4 */
/* loaded from: classes2.dex */
public final class C3968r4 {

    /* renamed from: a */
    public final C3968r4 f9646a;

    /* renamed from: b */
    final C4075y f9647b;

    /* renamed from: c */
    final Map<String, q> f9648c = new HashMap();

    /* renamed from: d */
    final Map<String, Boolean> f9649d = new HashMap();

    public C3968r4(C3968r4 c3968r4, C4075y c4075y) {
        this.f9646a = c3968r4;
        this.f9647b = c4075y;
    }

    /* renamed from: a */
    public final C3968r4 m29052a() {
        return new C3968r4(this, this.f9647b);
    }

    /* renamed from: b */
    public final q m29051b(q qVar) {
        return this.f9647b.m28619a(this, qVar);
    }

    /* renamed from: c */
    public final q m29050c(f fVar) {
        q qVar = q.i;
        Iterator J = fVar.J();
        while (J.hasNext()) {
            qVar = this.f9647b.m28619a(this, fVar.F(((Integer) J.next()).intValue()));
            if (qVar instanceof C3806h) {
                break;
            }
        }
        return qVar;
    }

    /* renamed from: d */
    public final q m29049d(String str) {
        if (this.f9648c.containsKey(str)) {
            return this.f9648c.get(str);
        }
        C3968r4 c3968r4 = this.f9646a;
        if (c3968r4 != null) {
            return c3968r4.m29049d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    /* renamed from: e */
    public final void m29048e(String str, q qVar) {
        if (this.f9649d.containsKey(str)) {
            return;
        }
        if (qVar == null) {
            this.f9648c.remove(str);
        } else {
            this.f9648c.put(str, qVar);
        }
    }

    /* renamed from: f */
    public final void m29047f(String str, q qVar) {
        m29048e(str, qVar);
        this.f9649d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void m29046g(String str, q qVar) {
        C3968r4 c3968r4;
        if (!this.f9648c.containsKey(str) && (c3968r4 = this.f9646a) != null && c3968r4.m29045h(str)) {
            this.f9646a.m29046g(str, qVar);
        } else if (this.f9649d.containsKey(str)) {
        } else {
            if (qVar == null) {
                this.f9648c.remove(str);
            } else {
                this.f9648c.put(str, qVar);
            }
        }
    }

    /* renamed from: h */
    public final boolean m29045h(String str) {
        if (this.f9648c.containsKey(str)) {
            return true;
        }
        C3968r4 c3968r4 = this.f9646a;
        if (c3968r4 != null) {
            return c3968r4.m29045h(str);
        }
        return false;
    }
}
