package pl.droidsonroids.relinker.p604f;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: Dynamic32Structure.java */
/* renamed from: pl.droidsonroids.relinker.f.a */
/* loaded from: classes3.dex */
public class C14771a extends AbstractC14773c {
    public C14771a(C14779i c14779i, AbstractC14774d abstractC14774d, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(abstractC14774d.f33034a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + (i * 8);
        this.f33032a = c14779i.m356V(allocate, j2);
        this.f33033b = c14779i.m356V(allocate, j2 + 4);
    }
}
