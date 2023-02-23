package com.google.protobuf;

import com.google.protobuf.AbstractC7039i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NioByteString.java */
/* renamed from: com.google.protobuf.z0 */
/* loaded from: classes2.dex */
public final class C7150z0 extends AbstractC7039i.AbstractC7047h {

    /* renamed from: f */
    private final ByteBuffer f17105f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7150z0(ByteBuffer byteBuffer) {
        C6997a0.m20234b(byteBuffer, "buffer");
        this.f17105f = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    /* renamed from: j0 */
    private ByteBuffer m19316j0(int i, int i2) {
        if (i >= this.f17105f.position() && i2 <= this.f17105f.limit() && i <= i2) {
            ByteBuffer slice = this.f17105f.slice();
            slice.position(i - this.f17105f.position());
            slice.limit(i2 - this.f17105f.position());
            return slice;
        }
        throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // com.google.protobuf.AbstractC7039i
    /* renamed from: E */
    public boolean mo19324E() {
        return C7110s1.m19613r(this.f17105f);
    }

    @Override // com.google.protobuf.AbstractC7039i
    /* renamed from: J */
    public AbstractC7052j mo19323J() {
        return AbstractC7052j.m20064i(this.f17105f, true);
    }

    @Override // com.google.protobuf.AbstractC7039i
    /* renamed from: O */
    protected int mo19322O(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f17105f.get(i4);
        }
        return i;
    }

    @Override // com.google.protobuf.AbstractC7039i
    /* renamed from: V */
    public AbstractC7039i mo19321V(int i, int i2) {
        try {
            return new C7150z0(m19316j0(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC7039i
    /* renamed from: b0 */
    protected String mo19320b0(Charset charset) {
        byte[] m20100X;
        int i;
        int length;
        if (this.f17105f.hasArray()) {
            m20100X = this.f17105f.array();
            i = this.f17105f.arrayOffset() + this.f17105f.position();
            length = this.f17105f.remaining();
        } else {
            m20100X = m20100X();
            i = 0;
            length = m20100X.length;
        }
        return new String(m20100X, i, length, charset);
    }

    @Override // com.google.protobuf.AbstractC7039i
    /* renamed from: d */
    public ByteBuffer mo19319d() {
        return this.f17105f.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC7039i
    /* renamed from: e */
    public byte mo19318e(int i) {
        try {
            return this.f17105f.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC7039i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7039i) {
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            if (size() != abstractC7039i.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof C7150z0) {
                return this.f17105f.equals(((C7150z0) obj).f17105f);
            }
            return this.f17105f.equals(abstractC7039i.mo19319d());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7039i
    /* renamed from: i0 */
    public void mo19317i0(AbstractC7033h abstractC7033h) throws IOException {
        abstractC7033h.mo20113a(this.f17105f.slice());
    }

    @Override // com.google.protobuf.AbstractC7039i
    /* renamed from: s */
    protected void mo19315s(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.f17105f.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    @Override // com.google.protobuf.AbstractC7039i
    public int size() {
        return this.f17105f.remaining();
    }

    @Override // com.google.protobuf.AbstractC7039i
    /* renamed from: u */
    public byte mo19314u(int i) {
        return mo19318e(i);
    }
}
