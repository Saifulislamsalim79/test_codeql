package p272h.p286c.p287a.p300b.p307d.p316i;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.s5 */
/* loaded from: classes2.dex */
public enum EnumC8739s5 implements InterfaceC8603g {
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
    private final int f20613c;

    EnumC8739s5(int i) {
        this.f20613c = i;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.InterfaceC8603g
    public final int zza() {
        return this.f20613c;
    }
}
