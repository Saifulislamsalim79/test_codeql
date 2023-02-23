package io.intercom.com.bumptech.glide.load.p402o.p407g;

import android.util.Log;
import io.intercom.com.bumptech.glide.load.C10621f;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10511e;
import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: StreamGifDecoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.g.j */
/* loaded from: classes3.dex */
public class C10805j implements InterfaceC10627j<InputStream, C10793c> {

    /* renamed from: a */
    private final List<InterfaceC10511e> f24677a;

    /* renamed from: b */
    private final InterfaceC10627j<ByteBuffer, C10793c> f24678b;

    /* renamed from: c */
    private final InterfaceC10576b f24679c;

    public C10805j(List<InterfaceC10511e> list, InterfaceC10627j<ByteBuffer, C10793c> interfaceC10627j, InterfaceC10576b interfaceC10576b) {
        this.f24677a = list;
        this.f24678b = interfaceC10627j;
        this.f24679c = interfaceC10576b;
    }

    /* renamed from: e */
    private static byte[] m12272e(InputStream inputStream) {
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

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: c */
    public InterfaceC10569t<C10793c> mo12276a(InputStream inputStream, int i, int i2, C10626i c10626i) throws IOException {
        byte[] m12272e = m12272e(inputStream);
        if (m12272e == null) {
            return null;
        }
        return this.f24678b.mo12276a(ByteBuffer.wrap(m12272e), i, i2, c10626i);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: d */
    public boolean mo12275b(InputStream inputStream, C10626i c10626i) throws IOException {
        return !((Boolean) c10626i.m12593a(C10804i.f24676b)).booleanValue() && C10621f.m12602b(this.f24677a, inputStream, this.f24679c) == InterfaceC10511e.EnumC10512a.GIF;
    }
}
