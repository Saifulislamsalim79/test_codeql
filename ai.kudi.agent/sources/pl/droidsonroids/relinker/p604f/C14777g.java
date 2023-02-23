package pl.droidsonroids.relinker.p604f;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Elf32Header.java */
/* renamed from: pl.droidsonroids.relinker.f.g */
/* loaded from: classes3.dex */
public class C14777g extends AbstractC14774d {

    /* renamed from: g */
    private final C14779i f33045g;

    public C14777g(boolean z, C14779i c14779i) throws IOException {
        this.f33034a = z;
        this.f33045g = c14779i;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        c14779i.m359J(allocate, 16L);
        this.f33035b = c14779i.m356V(allocate, 28L);
        this.f33036c = c14779i.m356V(allocate, 32L);
        this.f33037d = c14779i.m359J(allocate, 42L);
        this.f33038e = c14779i.m359J(allocate, 44L);
        this.f33039f = c14779i.m359J(allocate, 46L);
        c14779i.m359J(allocate, 48L);
        c14779i.m359J(allocate, 50L);
    }

    @Override // pl.droidsonroids.relinker.p604f.AbstractC14774d
    /* renamed from: a */
    public AbstractC14773c mo364a(long j, int i) throws IOException {
        return new C14771a(this.f33045g, this, j, i);
    }

    @Override // pl.droidsonroids.relinker.p604f.AbstractC14774d
    /* renamed from: b */
    public AbstractC14775e mo363b(long j) throws IOException {
        return new C14780j(this.f33045g, this, j);
    }

    @Override // pl.droidsonroids.relinker.p604f.AbstractC14774d
    /* renamed from: c */
    public AbstractC14776f mo362c(int i) throws IOException {
        return new C14782l(this.f33045g, this, i);
    }
}
