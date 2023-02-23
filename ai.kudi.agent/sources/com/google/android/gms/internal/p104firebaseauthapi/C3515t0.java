package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t0 */
/* loaded from: classes2.dex */
final class C3515t0 implements Iterator<Map.Entry> {

    /* renamed from: c */
    private int f8965c = -1;

    /* renamed from: d */
    private boolean f8966d;

    /* renamed from: e */
    private Iterator<Map.Entry> f8967e;

    /* renamed from: f */
    final /* synthetic */ C3567v0 f8968f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3515t0(C3567v0 c3567v0, C3385o0 c3385o0) {
        this.f8968f = c3567v0;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry> m30223a() {
        Map map;
        if (this.f8967e == null) {
            map = this.f8968f.f9011e;
            this.f8967e = map.entrySet().iterator();
        }
        return this.f8967e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f8965c + 1;
        list = this.f8968f.f9010d;
        if (i >= list.size()) {
            map = this.f8968f.f9011e;
            return !map.isEmpty() && m30223a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        List list;
        List list2;
        this.f8966d = true;
        int i = this.f8965c + 1;
        this.f8965c = i;
        list = this.f8968f.f9010d;
        if (i < list.size()) {
            list2 = this.f8968f.f9010d;
            return (Map.Entry) list2.get(this.f8965c);
        }
        return m30223a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f8966d) {
            this.f8966d = false;
            this.f8968f.m30147p();
            int i = this.f8965c;
            list = this.f8968f.f9010d;
            if (i < list.size()) {
                C3567v0 c3567v0 = this.f8968f;
                int i2 = this.f8965c;
                this.f8965c = i2 - 1;
                c3567v0.m30149n(i2);
                return;
            }
            m30223a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
