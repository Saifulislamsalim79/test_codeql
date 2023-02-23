package com.bumptech.glide.p086q.p087l;
/* compiled from: StateVerifier.java */
/* renamed from: com.bumptech.glide.q.l.c */
/* loaded from: classes2.dex */
public abstract class AbstractC2392c {

    /* compiled from: StateVerifier.java */
    /* renamed from: com.bumptech.glide.q.l.c$b */
    /* loaded from: classes2.dex */
    private static class C2394b extends AbstractC2392c {

        /* renamed from: a */
        private volatile boolean f6882a;

        C2394b() {
            super();
        }

        @Override // com.bumptech.glide.p086q.p087l.AbstractC2392c
        /* renamed from: b */
        public void mo33093b(boolean z) {
            this.f6882a = z;
        }

        @Override // com.bumptech.glide.p086q.p087l.AbstractC2392c
        /* renamed from: c */
        public void mo33092c() {
            if (this.f6882a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* renamed from: a */
    public static AbstractC2392c m33094a() {
        return new C2394b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo33093b(boolean z);

    /* renamed from: c */
    public abstract void mo33092c();

    private AbstractC2392c() {
    }
}
