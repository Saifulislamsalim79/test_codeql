package io.intercom.com.bumptech.glide.load;

import io.intercom.com.bumptech.glide.load.InterfaceC10511e;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10765q;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: ImageHeaderParserUtils.java */
/* renamed from: io.intercom.com.bumptech.glide.load.f */
/* loaded from: classes3.dex */
public final class C10621f {
    /* renamed from: a */
    public static int m12603a(List<InterfaceC10511e> list, InputStream inputStream, InterfaceC10576b interfaceC10576b) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C10765q(inputStream, interfaceC10576b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int mo12442c = list.get(i).mo12442c(inputStream, interfaceC10576b);
                if (mo12442c != -1) {
                    return mo12442c;
                }
                inputStream.reset();
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static InterfaceC10511e.EnumC10512a m12602b(List<InterfaceC10511e> list, InputStream inputStream, InterfaceC10576b interfaceC10576b) throws IOException {
        if (inputStream == null) {
            return InterfaceC10511e.EnumC10512a.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C10765q(inputStream, interfaceC10576b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC10511e.EnumC10512a mo12443b = list.get(i).mo12443b(inputStream);
                if (mo12443b != InterfaceC10511e.EnumC10512a.UNKNOWN) {
                    return mo12443b;
                }
                inputStream.reset();
            } finally {
                inputStream.reset();
            }
        }
        return InterfaceC10511e.EnumC10512a.UNKNOWN;
    }

    /* renamed from: c */
    public static InterfaceC10511e.EnumC10512a m12601c(List<InterfaceC10511e> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return InterfaceC10511e.EnumC10512a.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC10511e.EnumC10512a mo12444a = list.get(i).mo12444a(byteBuffer);
            if (mo12444a != InterfaceC10511e.EnumC10512a.UNKNOWN) {
                return mo12444a;
            }
        }
        return InterfaceC10511e.EnumC10512a.UNKNOWN;
    }
}
