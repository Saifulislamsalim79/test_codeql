package p272h.p286c.p287a.p300b.p307d.p317j;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.w8 */
/* loaded from: classes2.dex */
public enum EnumC9157w8 implements InterfaceC9122u1 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);
    

    /* renamed from: c */
    private final int f21530c;

    EnumC9157w8(int i) {
        this.f21530c = i;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC9122u1
    public final int zza() {
        return this.f21530c;
    }
}
