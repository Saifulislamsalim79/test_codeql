package io.intercom.com.bumptech.glide.p416r.p417j;
/* compiled from: StateVerifier.java */
/* renamed from: io.intercom.com.bumptech.glide.r.j.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10903b {

    /* compiled from: StateVerifier.java */
    /* renamed from: io.intercom.com.bumptech.glide.r.j.b$b */
    /* loaded from: classes3.dex */
    private static class C10905b extends AbstractC10903b {

        /* renamed from: a */
        private volatile boolean f24869a;

        C10905b() {
            super();
        }

        @Override // io.intercom.com.bumptech.glide.p416r.p417j.AbstractC10903b
        /* renamed from: b */
        public void mo11978b(boolean z) {
            this.f24869a = z;
        }

        @Override // io.intercom.com.bumptech.glide.p416r.p417j.AbstractC10903b
        /* renamed from: c */
        public void mo11977c() {
            if (this.f24869a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* renamed from: a */
    public static AbstractC10903b m11979a() {
        return new C10905b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo11978b(boolean z);

    /* renamed from: c */
    public abstract void mo11977c();

    private AbstractC10903b() {
    }
}
