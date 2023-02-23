package com.bumptech.glide.load.p074o.p078g;

import android.util.Log;
import com.bumptech.glide.load.C1997e;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: StreamGifDecoder.java */
/* renamed from: com.bumptech.glide.load.o.g.j */
/* loaded from: classes2.dex */
public class C2277j implements InterfaceC2124j<InputStream, C2265c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f6645a;

    /* renamed from: b */
    private final InterfaceC2124j<ByteBuffer, C2265c> f6646b;

    /* renamed from: c */
    private final InterfaceC2095b f6647c;

    public C2277j(List<ImageHeaderParser> list, InterfaceC2124j<ByteBuffer, C2265c> interfaceC2124j, InterfaceC2095b interfaceC2095b) {
        this.f6645a = list;
        this.f6646b = interfaceC2124j;
        this.f6647c = interfaceC2095b;
    }

    /* renamed from: e */
    private static byte[] m33413e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
                return null;
            }
            return null;
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: c */
    public InterfaceC2087u<C2265c> mo33300b(InputStream inputStream, int i, int i2, C2122h c2122h) throws IOException {
        byte[] m33413e = m33413e(inputStream);
        if (m33413e == null) {
            return null;
        }
        return this.f6646b.mo33300b(ByteBuffer.wrap(m33413e), i, i2, c2122h);
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: d */
    public boolean mo33301a(InputStream inputStream, C2122h c2122h) throws IOException {
        return !((Boolean) c2122h.m33661b(C2276i.f6644b)).booleanValue() && C1997e.m33947e(this.f6645a, inputStream, this.f6647c) == ImageHeaderParser.ImageType.GIF;
    }
}
