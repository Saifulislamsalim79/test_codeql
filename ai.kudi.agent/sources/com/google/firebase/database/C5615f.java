package com.google.firebase.database;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.firebase.C5988g;
import com.google.firebase.database.p131s.C5753h;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.C5833n;
import com.google.firebase.database.p131s.C5859o;
import com.google.firebase.database.p131s.C5860p;
import com.google.firebase.database.p131s.p134i0.C5786h;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p134i0.C5797n;
import com.google.firebase.p166l.C6469a;
/* compiled from: FirebaseDatabase.java */
/* renamed from: com.google.firebase.database.f */
/* loaded from: classes2.dex */
public class C5615f {

    /* renamed from: a */
    private final C5859o f13833a;

    /* renamed from: b */
    private final C5753h f13834b;

    /* renamed from: c */
    private C6469a f13835c;

    /* renamed from: d */
    private C5833n f13836d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5615f(C5988g c5988g, C5859o c5859o, C5753h c5753h) {
        this.f13833a = c5859o;
        this.f13834b = c5753h;
    }

    /* renamed from: a */
    private synchronized void m24321a() {
        if (this.f13836d == null) {
            this.f13833a.m23495a(this.f13835c);
            this.f13836d = C5860p.m23493b(this.f13834b, this.f13833a, this);
        }
    }

    /* renamed from: b */
    public static C5615f m24320b() {
        C5988g m23092j = C5988g.m23092j();
        if (m23092j != null) {
            return m24319c(m23092j);
        }
        throw new DatabaseException("You must call FirebaseApp.initialize() first.");
    }

    /* renamed from: c */
    public static C5615f m24319c(C5988g c5988g) {
        String m23067d = c5988g.m23089m().m23067d();
        if (m23067d == null) {
            if (c5988g.m23089m().m23065f() != null) {
                m23067d = "https://" + c5988g.m23089m().m23065f() + "-default-rtdb.firebaseio.com";
            } else {
                throw new DatabaseException("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
        }
        return m24318d(c5988g, m23067d);
    }

    /* renamed from: d */
    public static synchronized C5615f m24318d(C5988g c5988g, String str) {
        C5615f m24314a;
        synchronized (C5615f.class) {
            if (!TextUtils.isEmpty(str)) {
                s.k(c5988g, "Provided FirebaseApp must not be null.");
                C5616g c5616g = (C5616g) c5988g.m23095g(C5616g.class);
                s.k(c5616g, "Firebase Database component is not present.");
                C5786h m23743h = C5795m.m23743h(str);
                if (m23743h.f14218b.isEmpty()) {
                    m24314a = c5616g.m24314a(m23743h.f14217a);
                } else {
                    throw new DatabaseException("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + m23743h.f14218b.toString());
                }
            } else {
                throw new DatabaseException("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
            }
        }
        return m24314a;
    }

    /* renamed from: g */
    public static String m24315g() {
        return "20.0.2";
    }

    /* renamed from: e */
    public C5612d m24317e() {
        m24321a();
        return new C5612d(this.f13836d, C5830l.m23588X());
    }

    /* renamed from: f */
    public C5612d m24316f(String str) {
        m24321a();
        if (str != null) {
            C5797n.m23732f(str);
            return new C5612d(this.f13836d, new C5830l(str));
        }
        throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
    }
}
