package pl.droidsonroids.relinker.p604f;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Section64Header.java */
/* renamed from: pl.droidsonroids.relinker.f.m */
/* loaded from: classes3.dex */
public class C14783m extends AbstractC14776f {
    public C14783m(C14779i c14779i, AbstractC14774d abstractC14774d, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(abstractC14774d.f33034a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f33044a = c14779i.m356V(allocate, abstractC14774d.f33036c + (i * abstractC14774d.f33039f) + 44);
    }
}
