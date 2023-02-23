package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
/* compiled from: Internal.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i */
/* loaded from: classes3.dex */
public class C13588i {

    /* renamed from: a */
    public static final byte[] f29976a;

    /* compiled from: Internal.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC13589a {
        /* renamed from: d */
        int mo4405d();
    }

    /* compiled from: Internal.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC13590b<T extends InterfaceC13589a> {
        /* renamed from: a */
        T m4404a(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f29976a = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public static boolean m4407a(byte[] bArr) {
        return C13623v.m4306e(bArr);
    }

    /* renamed from: b */
    public static String m4406b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
