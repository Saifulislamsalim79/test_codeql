package pl.droidsonroids.relinker.p604f;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Elf64Header.java */
/* renamed from: pl.droidsonroids.relinker.f.h */
/* loaded from: classes3.dex */
public class C14778h extends AbstractC14774d {

    /* renamed from: g */
    private final C14779i f33046g;

    public C14778h(boolean z, C14779i c14779i) throws IOException {
        this.f33034a = z;
        this.f33046g = c14779i;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        c14779i.m359J(allocate, 16L);
        this.f33035b = c14779i.m358O(allocate, 32L);
        this.f33036c = c14779i.m358O(allocate, 40L);
        this.f33037d = c14779i.m359J(allocate, 54L);
        this.f33038e = c14779i.m359J(allocate, 56L);
        this.f33039f = c14779i.m359J(allocate, 58L);
        c14779i.m359J(allocate, 60L);
        c14779i.m359J(allocate, 62L);
    }

    @Override // pl.droidsonroids.relinker.p604f.AbstractC14774d
    /* renamed from: a */
    public AbstractC14773c mo364a(long j, int i) throws IOException {
        return new C14772b(this.f33046g, this, j, i);
    }

    @Override // pl.droidsonroids.relinker.p604f.AbstractC14774d
    /* renamed from: b */
    public AbstractC14775e mo363b(long j) throws IOException {
        return new C14781k(this.f33046g, this, j);
    }

    @Override // pl.droidsonroids.relinker.p604f.AbstractC14774d
    /* renamed from: c */
    public AbstractC14776f mo362c(int i) throws IOException {
        return new C14783m(this.f33046g, this, i);
    }
}
