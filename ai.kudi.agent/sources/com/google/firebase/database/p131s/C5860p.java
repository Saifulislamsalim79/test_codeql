package com.google.firebase.database.p131s;

import com.google.firebase.database.C5615f;
import com.google.firebase.database.DatabaseException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: RepoManager.java */
/* renamed from: com.google.firebase.database.s.p */
/* loaded from: classes2.dex */
public class C5860p {

    /* renamed from: b */
    private static final C5860p f14402b = new C5860p();

    /* renamed from: a */
    private final Map<C5743g, Map<String, C5833n>> f14403a = new HashMap();

    /* renamed from: a */
    private C5833n m23494a(C5743g c5743g, C5859o c5859o, C5615f c5615f) throws DatabaseException {
        C5833n c5833n;
        c5743g.m23930j();
        String str = "https://" + c5859o.f14399a + "/" + c5859o.f14401c;
        synchronized (this.f14403a) {
            if (!this.f14403a.containsKey(c5743g)) {
                this.f14403a.put(c5743g, new HashMap());
            }
            Map<String, C5833n> map = this.f14403a.get(c5743g);
            if (!map.containsKey(str)) {
                c5833n = new C5833n(c5859o, c5743g, c5615f);
                map.put(str, c5833n);
            } else {
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
            }
        }
        return c5833n;
    }

    /* renamed from: b */
    public static C5833n m23493b(C5743g c5743g, C5859o c5859o, C5615f c5615f) throws DatabaseException {
        return f14402b.m23494a(c5743g, c5859o, c5615f);
    }
}
