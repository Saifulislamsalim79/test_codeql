package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ha */
/* loaded from: classes2.dex */
final class C3817ha implements Iterator<Map.Entry> {

    /* renamed from: c */
    private int f9389c = -1;

    /* renamed from: d */
    private boolean f9390d;

    /* renamed from: e */
    private Iterator<Map.Entry> f9391e;

    /* renamed from: f */
    final /* synthetic */ C3849ja f9392f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3817ha(C3849ja c3849ja, C3740ca c3740ca) {
        this.f9392f = c3849ja;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry> m29547a() {
        Map map;
        if (this.f9391e == null) {
            map = this.f9392f.f9441e;
            this.f9391e = map.entrySet().iterator();
        }
        return this.f9391e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f9389c + 1;
        list = this.f9392f.f9440d;
        if (i >= list.size()) {
            map = this.f9392f.f9441e;
            return !map.isEmpty() && m29547a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        List list;
        List list2;
        this.f9390d = true;
        int i = this.f9389c + 1;
        this.f9389c = i;
        list = this.f9392f.f9440d;
        if (i < list.size()) {
            list2 = this.f9392f.f9440d;
            return (Map.Entry) list2.get(this.f9389c);
        }
        return m29547a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f9390d) {
            this.f9390d = false;
            this.f9392f.m29435p();
            int i = this.f9389c;
            list = this.f9392f.f9440d;
            if (i < list.size()) {
                C3849ja c3849ja = this.f9392f;
                int i2 = this.f9389c;
                this.f9389c = i2 - 1;
                c3849ja.m29437n(i2);
                return;
            }
            m29547a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
