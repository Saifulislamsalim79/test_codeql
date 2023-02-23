package okhttp3.internal.http2;
/* compiled from: ErrorCode.java */
/* renamed from: okhttp3.internal.http2.a */
/* loaded from: classes3.dex */
public enum EnumC14481a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: c */
    public final int f31903c;

    EnumC14481a(int i) {
        this.f31903c = i;
    }

    /* renamed from: a */
    public static EnumC14481a m1560a(int i) {
        EnumC14481a[] values;
        for (EnumC14481a enumC14481a : values()) {
            if (enumC14481a.f31903c == i) {
                return enumC14481a;
            }
        }
        return null;
    }
}
