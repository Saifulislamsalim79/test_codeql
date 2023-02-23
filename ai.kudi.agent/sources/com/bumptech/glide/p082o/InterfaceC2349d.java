package com.bumptech.glide.p082o;
/* compiled from: RequestCoordinator.java */
/* renamed from: com.bumptech.glide.o.d */
/* loaded from: classes2.dex */
public interface InterfaceC2349d {

    /* compiled from: RequestCoordinator.java */
    /* renamed from: com.bumptech.glide.o.d$a */
    /* loaded from: classes2.dex */
    public enum EnumC2350a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        

        /* renamed from: c */
        private final boolean f6800c;

        EnumC2350a(boolean z) {
            this.f6800c = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m33206a() {
            return this.f6800c;
        }
    }

    /* renamed from: a */
    boolean mo33181a();

    /* renamed from: b */
    void mo33180b(InterfaceC2348c interfaceC2348c);

    /* renamed from: c */
    boolean mo33179c(InterfaceC2348c interfaceC2348c);

    /* renamed from: d */
    boolean mo33178d(InterfaceC2348c interfaceC2348c);

    InterfaceC2349d getRoot();

    /* renamed from: i */
    void mo33173i(InterfaceC2348c interfaceC2348c);

    /* renamed from: j */
    boolean mo33172j(InterfaceC2348c interfaceC2348c);
}
