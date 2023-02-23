package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManifestSchemaFactory.java */
/* renamed from: com.google.protobuf.j0 */
/* loaded from: classes2.dex */
public final class C7058j0 implements InterfaceC7051i1 {

    /* renamed from: b */
    private static final InterfaceC7094q0 f16861b = new C7059a();

    /* renamed from: a */
    private final InterfaceC7094q0 f16862a;

    /* compiled from: ManifestSchemaFactory.java */
    /* renamed from: com.google.protobuf.j0$a */
    /* loaded from: classes2.dex */
    static class C7059a implements InterfaceC7094q0 {
        C7059a() {
        }

        @Override // com.google.protobuf.InterfaceC7094q0
        /* renamed from: a */
        public InterfaceC7091p0 mo19398a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.InterfaceC7094q0
        /* renamed from: b */
        public boolean mo19397b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManifestSchemaFactory.java */
    /* renamed from: com.google.protobuf.j0$b */
    /* loaded from: classes2.dex */
    public static class C7060b implements InterfaceC7094q0 {

        /* renamed from: a */
        private InterfaceC7094q0[] f16863a;

        C7060b(InterfaceC7094q0... interfaceC7094q0Arr) {
            this.f16863a = interfaceC7094q0Arr;
        }

        @Override // com.google.protobuf.InterfaceC7094q0
        /* renamed from: a */
        public InterfaceC7091p0 mo19398a(Class<?> cls) {
            InterfaceC7094q0[] interfaceC7094q0Arr;
            for (InterfaceC7094q0 interfaceC7094q0 : this.f16863a) {
                if (interfaceC7094q0.mo19397b(cls)) {
                    return interfaceC7094q0.mo19398a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.InterfaceC7094q0
        /* renamed from: b */
        public boolean mo19397b(Class<?> cls) {
            for (InterfaceC7094q0 interfaceC7094q0 : this.f16863a) {
                if (interfaceC7094q0.mo19397b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C7058j0() {
        this(m19982b());
    }

    /* renamed from: b */
    private static InterfaceC7094q0 m19982b() {
        return new C7060b(C7139x.m19396c(), m19981c());
    }

    /* renamed from: c */
    private static InterfaceC7094q0 m19981c() {
        try {
            return (InterfaceC7094q0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f16861b;
        }
    }

    /* renamed from: d */
    private static boolean m19980d(InterfaceC7091p0 interfaceC7091p0) {
        return interfaceC7091p0.mo19766c() == EnumC7013c1.PROTO2;
    }

    /* renamed from: e */
    private static <T> InterfaceC7038h1<T> m19979e(Class<T> cls, InterfaceC7091p0 interfaceC7091p0) {
        if (AbstractC7141y.class.isAssignableFrom(cls)) {
            if (m19980d(interfaceC7091p0)) {
                return C7129u0.m19516R(cls, interfaceC7091p0, C7148y0.m19338b(), AbstractC7034h0.m20110b(), C7061j1.m19966M(), C7108s.m19632b(), C7087o0.m19789b());
            }
            return C7129u0.m19516R(cls, interfaceC7091p0, C7148y0.m19338b(), AbstractC7034h0.m20110b(), C7061j1.m19966M(), null, C7087o0.m19789b());
        } else if (m19980d(interfaceC7091p0)) {
            return C7129u0.m19516R(cls, interfaceC7091p0, C7148y0.m19339a(), AbstractC7034h0.m20111a(), C7061j1.m19971H(), C7108s.m19633a(), C7087o0.m19790a());
        } else {
            return C7129u0.m19516R(cls, interfaceC7091p0, C7148y0.m19339a(), AbstractC7034h0.m20111a(), C7061j1.m19970I(), null, C7087o0.m19790a());
        }
    }

    @Override // com.google.protobuf.InterfaceC7051i1
    /* renamed from: a */
    public <T> InterfaceC7038h1<T> mo19983a(Class<T> cls) {
        C7061j1.m19969J(cls);
        InterfaceC7091p0 mo19398a = this.f16862a.mo19398a(cls);
        if (mo19398a.mo19768a()) {
            if (AbstractC7141y.class.isAssignableFrom(cls)) {
                return C7136v0.m19413m(C7061j1.m19966M(), C7108s.m19632b(), mo19398a.mo19767b());
            }
            return C7136v0.m19413m(C7061j1.m19971H(), C7108s.m19633a(), mo19398a.mo19767b());
        }
        return m19979e(cls, mo19398a);
    }

    private C7058j0(InterfaceC7094q0 interfaceC7094q0) {
        C6997a0.m20234b(interfaceC7094q0, "messageInfoFactory");
        this.f16862a = interfaceC7094q0;
    }
}
