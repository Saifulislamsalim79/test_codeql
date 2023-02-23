package p201g.p227h.p234i;

import android.graphics.Typeface;
import android.os.Handler;
import p201g.p227h.p234i.C7636e;
import p201g.p227h.p234i.C7642f;
/* compiled from: CallbackWithHandler.java */
/* renamed from: g.h.i.a */
/* loaded from: classes2.dex */
class C7629a {

    /* renamed from: a */
    private final C7642f.C7645c f18307a;

    /* renamed from: b */
    private final Handler f18308b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* renamed from: g.h.i.a$a */
    /* loaded from: classes2.dex */
    public class RunnableC7630a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C7642f.C7645c f18309c;

        /* renamed from: d */
        final /* synthetic */ Typeface f18310d;

        RunnableC7630a(C7629a c7629a, C7642f.C7645c c7645c, Typeface typeface) {
            this.f18309c = c7645c;
            this.f18310d = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18309c.mo17931b(this.f18310d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* renamed from: g.h.i.a$b */
    /* loaded from: classes2.dex */
    public class RunnableC7631b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C7642f.C7645c f18311c;

        /* renamed from: d */
        final /* synthetic */ int f18312d;

        RunnableC7631b(C7629a c7629a, C7642f.C7645c c7645c, int i) {
            this.f18311c = c7645c;
            this.f18312d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18311c.mo17932a(this.f18312d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7629a(C7642f.C7645c c7645c, Handler handler) {
        this.f18307a = c7645c;
        this.f18308b = handler;
    }

    /* renamed from: a */
    private void m17970a(int i) {
        this.f18308b.post(new RunnableC7631b(this, this.f18307a, i));
    }

    /* renamed from: c */
    private void m17968c(Typeface typeface) {
        this.f18308b.post(new RunnableC7630a(this, this.f18307a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m17969b(C7636e.C7641e c7641e) {
        if (c7641e.m17943a()) {
            m17968c(c7641e.f18334a);
        } else {
            m17970a(c7641e.f18335b);
        }
    }
}
