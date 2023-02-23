package com.google.firebase.database.p127p;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.google.firebase.C5988g;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.p129r.C5684i;
import com.google.firebase.database.p129r.C5688l;
import com.google.firebase.database.p129r.C5692o;
import com.google.firebase.database.p129r.InterfaceC5690n;
import com.google.firebase.database.p131s.C5743g;
import com.google.firebase.database.p131s.InterfaceC5829k;
import com.google.firebase.database.p131s.InterfaceC5832m;
import com.google.firebase.database.p131s.InterfaceC5861q;
import com.google.firebase.database.p131s.p133h0.C5755b;
import com.google.firebase.database.p131s.p133h0.C5756c;
import com.google.firebase.database.p131s.p133h0.InterfaceC5758e;
import com.google.firebase.database.p131s.p134i0.AbstractC5775c;
import com.google.firebase.database.p138t.C5896a;
import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p138t.InterfaceC5900d;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: AndroidPlatform.java */
/* renamed from: com.google.firebase.database.p.o */
/* loaded from: classes2.dex */
public class C5642o implements InterfaceC5832m {

    /* renamed from: a */
    private final Context f13875a;

    /* renamed from: b */
    private final Set<String> f13876b = new HashSet();

    /* renamed from: c */
    private final C5988g f13877c;

    /* compiled from: AndroidPlatform.java */
    /* renamed from: com.google.firebase.database.p.o$a */
    /* loaded from: classes2.dex */
    class C5643a extends AbstractC5775c {

        /* renamed from: b */
        final /* synthetic */ C5899c f13878b;

        /* compiled from: AndroidPlatform.java */
        /* renamed from: com.google.firebase.database.p.o$a$a */
        /* loaded from: classes2.dex */
        class RunnableC5644a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ String f13880c;

            /* renamed from: d */
            final /* synthetic */ Throwable f13881d;

            RunnableC5644a(C5643a c5643a, String str, Throwable th) {
                this.f13880c = str;
                this.f13881d = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f13880c, this.f13881d);
            }
        }

        C5643a(C5899c c5899c) {
            this.f13878b = c5899c;
        }

        @Override // com.google.firebase.database.p131s.p134i0.AbstractC5775c
        /* renamed from: f */
        public void mo23797f(Throwable th) {
            String m23796g = AbstractC5775c.m23796g(th);
            this.f13878b.m23365c(m23796g, th);
            new Handler(C5642o.this.f13875a.getMainLooper()).post(new RunnableC5644a(this, m23796g, th));
            m23800c().shutdownNow();
        }
    }

    /* compiled from: AndroidPlatform.java */
    /* renamed from: com.google.firebase.database.p.o$b */
    /* loaded from: classes2.dex */
    class C5645b implements C5988g.InterfaceC5990b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5690n f13882a;

        C5645b(C5642o c5642o, InterfaceC5690n interfaceC5690n) {
            this.f13882a = interfaceC5690n;
        }

        @Override // com.google.firebase.C5988g.InterfaceC5990b
        /* renamed from: a */
        public void mo23078a(boolean z) {
            if (z) {
                this.f13882a.mo24121d("app_in_background");
            } else {
                this.f13882a.mo24117f("app_in_background");
            }
        }
    }

    public C5642o(C5988g c5988g) {
        this.f13877c = c5988g;
        if (c5988g != null) {
            this.f13875a = c5988g.m23093i();
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5832m
    /* renamed from: a */
    public String mo23578a(C5743g c5743g) {
        return Build.VERSION.SDK_INT + "/Android";
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5832m
    /* renamed from: b */
    public InterfaceC5829k mo23577b(C5743g c5743g) {
        return new C5641n();
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5832m
    /* renamed from: c */
    public File mo23576c() {
        return this.f13875a.getApplicationContext().getDir("sslcache", 0);
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5832m
    /* renamed from: d */
    public InterfaceC5900d mo23575d(C5743g c5743g, InterfaceC5900d.EnumC5901a enumC5901a, List<String> list) {
        return new C5896a(enumC5901a, list);
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5832m
    /* renamed from: e */
    public InterfaceC5758e mo23574e(C5743g c5743g, String str) {
        String m23917w = c5743g.m23917w();
        String str2 = str + "_" + m23917w;
        if (!this.f13876b.contains(str2)) {
            this.f13876b.add(str2);
            return new C5755b(c5743g, new C5646p(this.f13875a, c5743g, str2), new C5756c(c5743g.m23922r()));
        }
        throw new DatabaseException("SessionPersistenceKey '" + m23917w + "' has already been used.");
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5832m
    /* renamed from: f */
    public InterfaceC5690n mo23573f(C5743g c5743g, C5684i c5684i, C5688l c5688l, InterfaceC5690n.InterfaceC5691a interfaceC5691a) {
        C5692o c5692o = new C5692o(c5684i, c5688l, interfaceC5691a);
        this.f13877c.m23097e(new C5645b(this, c5692o));
        return c5692o;
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5832m
    /* renamed from: g */
    public InterfaceC5861q mo23572g(C5743g c5743g) {
        return new C5643a(c5743g.m23924p("RunLoop"));
    }
}
