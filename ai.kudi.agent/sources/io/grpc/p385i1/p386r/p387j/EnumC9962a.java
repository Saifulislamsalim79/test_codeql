package io.grpc.p385i1.p386r.p387j;
/* compiled from: ErrorCode.java */
/* renamed from: io.grpc.i1.r.j.a */
/* loaded from: classes2.dex */
public enum EnumC9962a {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);
    

    /* renamed from: c */
    public final int f23627c;

    EnumC9962a(int i, int i2, int i3) {
        this.f23627c = i;
    }

    /* renamed from: a */
    public static EnumC9962a m13468a(int i) {
        EnumC9962a[] values;
        for (EnumC9962a enumC9962a : values()) {
            if (enumC9962a.f23627c == i) {
                return enumC9962a;
            }
        }
        return null;
    }
}
